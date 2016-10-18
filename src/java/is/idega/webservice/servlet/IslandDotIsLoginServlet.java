package is.idega.webservice.servlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.IWBase64;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.XMLConstants;

import org.joda.time.DateTime;
import org.opensaml.common.SAMLObject;
import org.opensaml.common.SignableSAMLObject;
import org.opensaml.saml2.core.Assertion;
import org.opensaml.saml2.core.Attribute;
import org.opensaml.saml2.core.AttributeStatement;
import org.opensaml.saml2.core.Response;
import org.opensaml.saml2.core.SubjectConfirmation;
import org.opensaml.security.SAMLSignatureProfileValidator;
import org.opensaml.xml.Configuration;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.Unmarshaller;
import org.opensaml.xml.io.UnmarshallerFactory;
import org.opensaml.xml.io.UnmarshallingException;
import org.opensaml.xml.parse.BasicParserPool;
import org.opensaml.xml.parse.XMLParserException;
import org.opensaml.xml.schema.impl.XSStringImpl;
import org.opensaml.xml.security.x509.BasicX509Credential;
import org.opensaml.xml.signature.KeyInfo;
import org.opensaml.xml.signature.SignatureValidator;
import org.opensaml.xml.validation.ValidationException;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.idega.presentation.IWContext;
import com.idega.util.CoreConstants;
import com.idega.util.CoreUtil;
import com.idega.util.IOUtil;
import com.idega.util.RequestUtil;
import com.idega.util.StringHandler;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

import is.idega.webservice.business.IslandDotIsService;

public class IslandDotIsLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 4577682631949782354L;

	private static final Logger LOGGER = Logger.getLogger(IslandDotIsLoginServlet.class.getName());

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String samlString = null;
		try {
			samlString = StringHandler.getContentFromReader(request.getReader());
		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Error getting SAML message from request " + request.getRequestURI(), e);
		}
		String userIP = request.getHeader("X-FORWARDED-FOR");
		if (StringUtil.isEmpty(userIP)) {
			userIP = request.getRemoteAddr();
		}
		String userAgent = request.getHeader(RequestUtil.HEADER_USER_AGENT.toLowerCase());
		String authId = request.getParameter("authid");

		String personalID = getPesonalIDFromValidatedSaml(samlString, userIP, userAgent, authId);
		if (StringUtil.isEmpty(personalID)) {
			LOGGER.warning("Unknown personal ID from SAML message: " + samlString + ", user IP: " + userIP);
			response.sendRedirect(CoreConstants.PAGES_URI_PREFIX);
			return;
		}

		IslandDotIsService service = ELUtil.getInstance().getBean(IslandDotIsService.BEAN_NAME);
		IWContext iwc = CoreUtil.getIWContext();
		iwc = iwc == null ? new IWContext(request, response, getServletContext()) : iwc;
		String responsePage = service.getHomePageForCitizen(personalID, iwc);
		response.sendRedirect(StringUtil.isEmpty(responsePage) ? CoreConstants.PAGES_URI_PREFIX : responsePage);
	}

	private KeyStore getTrustStore() throws Exception {
		KeyStore keyStore = KeyStore.getInstance("JKS");
		keyStore.load(null, CoreConstants.EMPTY.toCharArray());
		CertificateFactory certFactory = CertificateFactory.getInstance("X509");
		keyStore.setCertificateEntry("Audkennisrot", getCertificate(certFactory, "Audkennisrot.cer"));
		keyStore.setCertificateEntry("Traust_audkenni", getCertificate(certFactory, "Traust_audkenni.cer"));
		keyStore.setCertificateEntry("Traustur_bunadur", getCertificate(certFactory, "Traustur_bunadur.cer"));
		return keyStore;
	}

	private Certificate getCertificate(CertificateFactory certFactory, String certFile) throws Exception {
		Certificate certificate = certFactory.generateCertificate(IOUtil.getStreamFromJar("is.idega.webservice", "resources/certificates/".concat(certFile)));
		return certificate;
	}

	private String getPesonalIDFromValidatedSaml(final String samlString, final String userIP, final String userAgent, final String authId) {
		boolean ok = false;
		if (StringUtil.isEmpty(samlString)) {
			LOGGER.warning("SAML message not provided");
			return null;
		}

		String personalID = null;
		try {
			SignableSAMLObject signedObject = (SignableSAMLObject) unmarshall(samlString);
			if (signedObject != null) {
				SignableSAMLObject samlObject = (SignableSAMLObject) validateSignature(signedObject, getTrustStore());
				if (samlObject != null) {
					Assertion assertion = this.getAssertion((Response) samlObject, userIP, false);
					if (assertion != null) {
						final DateTime serverDate = new DateTime();
						if (assertion.getConditions().getNotBefore().isAfter(serverDate)) {
							throw new Exception("Token date valid yet (getNotBefore = " + assertion.getConditions().getNotBefore() + " ), server_date: " + serverDate);
						}

						if (assertion.getConditions().getNotOnOrAfter().isBefore(serverDate)) {
							throw new Exception("Token date expired (getNotOnOrAfter = " + assertion.getConditions().getNotOnOrAfter() + " ), server_date: " + serverDate);
						}

						// Validate the assertions for IP, useragent and authId.
						personalID = getPersonalIDFromValidatedAssertion(assertion, userIP, userAgent, authId);
						ok = true;
					}
				}
			}
		} catch (Exception e) {
			//SAML not verified
			LOGGER.log(Level.WARNING, "Error verifying SAML message", e);
		}

		if (!ok) {
			LOGGER.warning("Failed to validated SAML message. User IP: " + userIP + ", user agent: " + userAgent + ", auth. ID: " + authId + ", message:\n" + samlString);
			return null;
		}

		return personalID;
	}

	//	Unmarshall SAML string
	private final XMLObject unmarshall(final String samlString) throws Exception {
		try {
			byte[] samlToken = IWBase64.base64ToByteArray(samlString);
			final BasicParserPool ppMgr = new BasicParserPool();
			final HashMap<String, Boolean> features = new HashMap<String, Boolean>();
			features.put(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
			ppMgr.setBuilderFeatures(features);
			ppMgr.setNamespaceAware(true);

			Document document = ppMgr.parse(new ByteArrayInputStream(samlToken));
			if (document != null){
				final Element root = document.getDocumentElement();
				final UnmarshallerFactory unmarshallerFact =
				Configuration.getUnmarshallerFactory();
				if (unmarshallerFact != null && root != null) {
					final Unmarshaller unmarshaller = unmarshallerFact.getUnmarshaller(root);
					try {
						return unmarshaller.unmarshall(root);
					} catch (NullPointerException e) {
						throw new Exception("NullPointerException", e);
					}
				} else {
					throw new Exception("NullPointerException : unmarshallerFact or root is null");
				}
			} else {
				throw new Exception("NullPointerException : document is null");
			}
		} catch (XMLParserException e) {
			throw new Exception(e);
		} catch (UnmarshallingException e) {
			throw new Exception(e);
		} catch (NullPointerException e) {
			throw new Exception(e);
		}
	}

	private final SAMLObject validateSignature(final SignableSAMLObject tokenSaml, KeyStore keyStore) throws Exception {
		try {
			// Validate structure signature
			final SAMLSignatureProfileValidator sigProfValidator = new SAMLSignatureProfileValidator();
			try {
				// Indicates signature id conform to SAML Signature profile
				sigProfValidator.validate(tokenSaml.getSignature());
			} catch (ValidationException e) {
				//ValidationException: signature isn't conform to SAML Signature profile.
				throw new Exception(e);
			}

			String aliasCert = null;
			X509Certificate certificate;
			final KeyInfo keyInfo = tokenSaml.getSignature().getKeyInfo();
			final org.opensaml.xml.signature.X509Certificate xmlCert = keyInfo.getX509Datas().get(0).getX509Certificates().get(0);
			final CertificateFactory certFact = CertificateFactory.getInstance("X.509");
			final ByteArrayInputStream bis = new ByteArrayInputStream(IWBase64.base64ToByteArray(xmlCert.getValue()));
			final X509Certificate cert = (X509Certificate) certFact.generateCertificate(bis);

			// Exist only one certificate
			final BasicX509Credential entityX509Cred = new BasicX509Credential();
			entityX509Cred.setEntityCertificate(cert);
			try {
				cert.checkValidity();
			} catch (CertificateExpiredException exp) {
				throw new Exception("Certificate expired.");
			} catch (CertificateNotYetValidException exp) {
				throw new Exception("Certificate not yet valid.");
			}

			boolean trusted = false;
			for (final Enumeration<String> e = keyStore.aliases(); e.hasMoreElements();) {
				aliasCert = e.nextElement();
				certificate = (X509Certificate) keyStore.getCertificate(aliasCert);
				try {
					cert.verify(certificate.getPublicKey());
					trusted = true;
					break;
				} catch (Exception ex) {
					//Do nothing - cert not trusted yet
					LOGGER.warning("Certificate " + (certificate == null ? CoreConstants.EMPTY : ("with public key " + certificate.getPublicKey())) + " is not trusted.");
				}
			}
			if (!trusted)
				throw new Exception("Certificate is not trusted.");
			else {
				if (cert.getSubjectDN().toString().contains("SERIALNUMBER=6503760649") && cert.getIssuerDN().toString().startsWith("CN=Traustur	bunadur"))
					trusted = true;
				else {
					throw new Exception("Certificate is not trusted.");
				}
			}

			// Validate signature
			final SignatureValidator sigValidator = new SignatureValidator(entityX509Cred);
			sigValidator.validate(tokenSaml.getSignature());
		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Error validating signature", e);
		}
		return tokenSaml;
	}

	private Assertion getAssertion(final Response samlResponse, final String userIP, final boolean ipValidate) throws Exception {
		if (samlResponse.getAssertions() == null || samlResponse.getAssertions().isEmpty()) {
			//Assertion is null or empty
			return null;
		}

		final Assertion assertion = samlResponse.getAssertions().get(0);
		for (final Iterator<SubjectConfirmation> iter = assertion.getSubject().getSubjectConfirmations().iterator(); iter.hasNext();) {
			final SubjectConfirmation element = iter.next();
			final boolean isBearer = SubjectConfirmation.METHOD_BEARER.equals(element.getMethod());
			if (ipValidate) {
				if (isBearer) {
					if (StringUtils.isEmpty(userIP)) {
						throw new Exception("browser_ip is null or empty.");
					} else if (StringUtils.isEmpty(element.getSubjectConfirmationData().getAddress())) {
						throw new Exception("token_ip attribute is null or empty.");
					}
				}

				final boolean ipEqual = element.getSubjectConfirmationData().getAddress().equals(userIP);
				// Validation ipUser
				if (!ipEqual && ipValidate) {
					throw new Exception("IPs doesn't match : token_ip (" + element.getSubjectConfirmationData().getAddress() + ") browser_ip ("+ userIP + ")");
				}
			}
		}
		return assertion;
	}

	/**
	* Validate assertions for IP, user agent and auth ID
	* @param assertion The assertion to validate
	* @param ip The user IP
	* @param ua The users user agent
	* @param authId The auth ID
	* @throws Exception
	*/
	private String getPersonalIDFromValidatedAssertion(final Assertion assertion, String ip, String ua, String authId) throws Exception {
		final List<XMLObject> listExtensions = assertion.getOrderedChildren();
		boolean find = false;
		AttributeStatement requestedAttr = null;
		// Search the attribute statement.
		for (int i = 0; i < listExtensions.size() && !find; i++) {
			final XMLObject xml = listExtensions.get(i);
			if (xml instanceof AttributeStatement) {
				requestedAttr = (AttributeStatement) xml;
				find = true;
			}
		}

		if (!find) {
			throw new Exception("AttributeStatement it's not present.");
		}

		final List<Attribute> reqAttrs = requestedAttr.getAttributes();
		String attributeName, tempValue;
		XMLObject xmlObj;
		boolean ipOk = false, uaOk = false, authIdOk = false;
		// Process the attributes.
		String personalID = null;
		for (int nextAttribute = 0; nextAttribute < reqAttrs.size(); nextAttribute++) {
			final Attribute attribute = reqAttrs.get(nextAttribute);
			attributeName = attribute.getName();
			if (attributeName.equals("IPAddress")) {
				xmlObj = attribute.getOrderedChildren().get(0);
				tempValue = ((XSStringImpl) xmlObj).getValue();
				ipOk = tempValue.equals(ip);
			}
			if (attributeName.equals("UserAgent")) {
				xmlObj = attribute.getOrderedChildren().get(0);
				tempValue = ((XSStringImpl) xmlObj).getValue();
				uaOk = tempValue.equals(ua);
			}
			if (attributeName.equals("AuthID")) {
				xmlObj = attribute.getOrderedChildren().get(0);
				tempValue = ((XSStringImpl) xmlObj).getValue();
				authIdOk = tempValue.equals(authId);
			}
			if (attributeName.equals("UserSSN")) {
				xmlObj = attribute.getOrderedChildren().get(0);
				personalID = ((XSStringImpl) xmlObj).getValue();
			}
		}
		if (ipOk || authIdOk || uaOk) {
			LOGGER.info("Assertion valid.");
			return personalID;
		}

		throw new Exception(String.format("Assertions not valid. IP valid: %b, user agent valid: %b, auth ID valid: %b", ipOk, uaOk, authIdOk));
	}

}