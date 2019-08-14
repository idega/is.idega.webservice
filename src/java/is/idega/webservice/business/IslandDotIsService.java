package is.idega.webservice.business;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

import javax.ejb.FinderException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.XMLConstants;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;

import org.joda.time.DateTime;
import org.opensaml.DefaultBootstrap;
import org.opensaml.common.SAMLObject;
import org.opensaml.common.SignableSAMLObject;
import org.opensaml.saml2.core.Assertion;
import org.opensaml.saml2.core.Attribute;
import org.opensaml.saml2.core.AttributeStatement;
import org.opensaml.saml2.core.Audience;
import org.opensaml.saml2.core.AudienceRestriction;
import org.opensaml.saml2.core.Conditions;
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
import org.opensaml.xml.signature.Signature;
import org.opensaml.xml.signature.SignatureValidator;
import org.opensaml.xml.validation.ValidationException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.idega.business.IBOLookup;
import com.idega.business.IBORuntimeException;
import com.idega.core.accesscontrol.business.LoginBusinessBean;
import com.idega.core.accesscontrol.dao.UserLoginDAO;
import com.idega.core.accesscontrol.data.LoginTable;
import com.idega.core.accesscontrol.data.LoginTableHome;
import com.idega.core.accesscontrol.data.bean.UserLogin;
import com.idega.core.business.DefaultSpringBean;
import com.idega.data.IDOLookup;
import com.idega.data.IDOLookupException;
import com.idega.idegaweb.IWApplicationContext;
import com.idega.idegaweb.IWMainApplication;
import com.idega.presentation.IWContext;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.IOUtil;
import com.idega.util.ListUtil;
import com.idega.util.RequestUtil;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

import eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerAccessPointLocator;
import eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerType;
import is.idega.idegaweb.egov.accounting.business.CitizenBusiness;
import is.skra.kosingar.kodun.KodunLocator;
import is.skra.kosingar.kodun.Kodun_PortType;
import is.skra.kosingar.kodun.Status;
import localhost.eGovSAMLGenerator.webServices.generateSAMLFromToken.holders.__StatusHolder;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service(IslandDotIsService.BEAN_NAME)
public class IslandDotIsService extends DefaultSpringBean {

	public static final String BEAN_NAME = "islandDotIsService";

	private static final String ELECTION_SERVICE_ENDPOINT = "island.is_election_service_endpoint";
	private static final String ELECTION_SERVICE_USER = "island.is_election_service_user";
	private static final String ELECTION_SERVICE_PASSWORD = "island.is_election_service_password";

	private static final String LOGIN_SERVICE_ENDPOINT = "island.is_login_service_endpoint";
	private static final String LOGIN_SERVICE_USER = "island.is_login_service_user";
	private static final String LOGIN_SERVICE_PASSWORD = "island.is_login_service_password";

	public boolean createHash(String personalId, String token, String ipAddress) {
		String endpoint = IWMainApplication
				.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(
						ELECTION_SERVICE_ENDPOINT,
						"https://egov.webservice.is/sst/runtime.asvc/com.actional.soapstation.eGOV_SKRA_KosningKodun");
		String user = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(ELECTION_SERVICE_USER, "");

		String password = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(ELECTION_SERVICE_PASSWORD, "");

		try {
			KodunLocator locator = new KodunLocator();
			Kodun_PortType port = locator
					.geteGovElection_wsd_kodun_Port(new URL(endpoint));
			((org.apache.axis.client.Stub) port).setUsername(user);
			((org.apache.axis.client.Stub) port).setPassword(password);
			Status status = port.hashSSNForElection(token, personalId,
					ipAddress);

			if (status.getCode() == 0) {
				return true;
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	public String getPersonalIDFromToken(String token, String ipAddress) {
		String endpoint = IWMainApplication
				.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(
						LOGIN_SERVICE_ENDPOINT,
						"https://egov.webservice.is/sst/runtime.asvc/com.actional.soapstation.eGOVDKM_AuthConsumer.AccessPoint?WSDL");
		String user = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(LOGIN_SERVICE_USER, "");

		String password = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(LOGIN_SERVICE_PASSWORD, "");

		try {
			EGOVDKM_AuthConsumerAccessPointLocator locator = new EGOVDKM_AuthConsumerAccessPointLocator();
			EGOVDKM_AuthConsumerType port = locator
					.geteGOVDKM_AuthConsumerAccessPointPort(new URL(endpoint));
			((org.apache.axis.client.Stub) port).setUsername(user);
			((org.apache.axis.client.Stub) port).setPassword(password);

			__StatusHolder status = new __StatusHolder();
			StringHolder saml = new StringHolder();

			port.generateSAMLFromToken(token, ipAddress, status, saml);

			if (status.value.getCode() == 0) {
				Map<String, String> resp = samlInfo(saml.value);
				String personalId = resp.get("SSN");
				if (personalId != null) {
					return personalId;
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String args[]) {
		IslandDotIsService test = new IslandDotIsService();
		BufferedReader input = null;
		try {
			String line = null;
			StringBuilder saml = new StringBuilder();
			input = new BufferedReader(new FileReader("/Users/palli/response.txt"));
			while ((line = input.readLine()) != null) {
				saml.append(line);
			}
			Map<String, String> resp = test.samlInfo(saml.toString());
			Set<String> keys = resp.keySet();
			for (String key : keys) {
				String value = resp.get(key);
				getLogger(IslandDotIsService.class).info(key + " = " + value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtil.close(input);
		}
	}

	private Map<String, String> samlInfo(String response) {
		Map<String, String> info = new HashMap<String, String>();
		Builder parser = new Builder();
		Document docXML = null;

		try {
			docXML = parser.build( response, "" );
			insertAttributesInMap( info, docXML.getRootElement() );
		}
		catch( ValidityException e ) {
			e.printStackTrace();
		}
		catch( ParsingException e ) {
			e.printStackTrace();
		}
		catch( IOException e ) {
			e.printStackTrace();
		}

		return info;
	}

	private Element firstChild( Element parent, String name, String namespace ) {
		Element childElement = parent.getFirstChildElement( name );

		if( (childElement == null) && (namespace != null) ) {
			childElement = parent.getFirstChildElement( name, namespace );
		}

		return childElement;
	}
	private void insertAttributesInMap( Map<String, String> info, Element assertion ) {
		Element AttributeStatement = firstChild( assertion, "AttributeStatement", "urn:oasis:names:tc:SAML:1.0:assertion" );
		Elements attributes = AttributeStatement.getChildElements();

		// Insert all the attributes, from the Attributestatement tag, into the info dictionary
		for( int i = 0; i < attributes.size(); i++ ) {
			Element child = attributes.get( i );

			if( child.getLocalName().equals( "Attribute" ) ) {
				String key = child.getAttribute( "AttributeName" ).getValue();
				String val = child.getChildElements().get( 0 ).getValue();
				info.put( key, val );
			}
		}
	}
	public User authenticateUser(String username, String password)
			throws java.rmi.RemoteException {
		try {
			LoginBusinessBean loginBean = LoginBusinessBean
					.getDefaultLoginBusinessBean();
			LoginTable loginTable = getLoginTableHome().findByLogin(username);
			if (loginTable != null) {
				// verify password
				UserLoginDAO userLoginDAO = ELUtil.getInstance().getBean(UserLoginDAO.class);
				UserLogin login = userLoginDAO.findLogin(Integer.valueOf(loginTable.getUserLogin()));
				if (loginBean.verifyPassword(login, password)) {
					return loginTable.getUser();
				}
			}
		} catch (FinderException e) {
			e.printStackTrace();
		}

		return null;
	}

	private LoginTableHome getLoginTableHome() {
		try {
			return (LoginTableHome) IDOLookup.getHome(LoginTable.class);
		} catch (IDOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	public String getHomePageForCitizen(String personalID, IWContext iwc) {
		return getHomePageForCitizen(iwc, personalID, null, "login_via_island.is_homepage", getApplicationProperty("island_is.oauth_client", "felix_auth_gateway_client"));
	}

	public String getHomePageForCitizen(IWContext iwc, String personalID, String fullName, String appProperty, String cookie) {
		try {
			IWApplicationContext iwac = iwc == null ?
					IWMainApplication.getDefaultIWApplicationContext() :
					iwc;
			CitizenBusiness citizenBusiness = IBOLookup.getServiceInstance(iwac, CitizenBusiness.class);
			return citizenBusiness.getHomePageForCitizen(iwc, personalID, fullName, appProperty, cookie, null);
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting home page for citizen with personal ID: " + personalID, e);
		}
		return null;
	}

	/* SAML 2.0 */
	public String getPersonalIDFromSAMLMessage(HttpServletRequest request, HttpServletResponse response, String saml) {
		String userIP = request.getHeader("X-FORWARDED-FOR");
		if (StringUtil.isEmpty(userIP)) {
			userIP = request.getRemoteAddr();
		}
		String userAgent = request.getHeader(RequestUtil.HEADER_USER_AGENT.toLowerCase());
		String authId = request.getParameter("authid");

		String personalID = getPesonalIDFromValidatedSaml(saml, userIP, userAgent, authId);
		if (StringUtil.isEmpty(personalID)) {
			getLogger().warning("Unknown personal ID from SAML message: '" + saml + "', user IP: " + userIP + ", user agent: " + userAgent + ", auth. ID: " + authId + ", request: " + request.getRequestURI());
			return null;
		}

		return personalID;
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
		InputStream stream = null;
		try {
			stream = IOUtil.getStreamFromJar("is.idega.webservice", "resources/certificates/".concat(certFile));
			Certificate certificate = certFactory.generateCertificate(stream);
			return certificate;
		} finally {
			IOUtil.close(stream);
		}
	}

	private String getPesonalIDFromValidatedSaml(final String samlString, final String userIP, final String userAgent, final String authId) {
		boolean ok = false;
		if (StringUtil.isEmpty(samlString)) {
			getLogger().warning("SAML message not provided");
			return null;
		}

		String personalID = null;
		try {
			boolean debug = getSettings().getBoolean("island.is.debug", false);

			SignableSAMLObject signedObject = (SignableSAMLObject) unmarshall(samlString, debug);
			if (signedObject == null) {
				getLogger().warning("Signed object is unknown (" + signedObject + ") from SAML message: " + samlString);
				return null;
			}

			if (debug) {
				getLogger().info("Unmarshalled SAML:\n" + signedObject);
			}

			SignableSAMLObject samlObject = (SignableSAMLObject) validateSignature(signedObject, getTrustStore());
			if (samlObject == null) {
				getLogger().warning("SAML object is unknown (" + samlObject + ") from signed object: " + signedObject);
				return null;
			}

			Assertion assertion = this.getAssertion((Response) samlObject, userIP, false);
			if (assertion == null) {
				getLogger().warning("Assertion is unknown (" + assertion + ") from SAML object: " + samlObject);
				return null;
			}

			final DateTime serverDate = new DateTime();
			if (assertion.getConditions().getNotBefore().isAfter(serverDate)) {
				throw new Exception("Token date valid yet (getNotBefore = " + assertion.getConditions().getNotBefore() + " ), server_date: " + serverDate);
			}

			if (assertion.getConditions().getNotOnOrAfter().isBefore(serverDate)) {
				throw new Exception("Token date expired (getNotOnOrAfter = " + assertion.getConditions().getNotOnOrAfter() + " ), server_date: " + serverDate);
			}

			//	Validate audience
			String correctAudience = getSettings().getProperty("island.is.correct_audience");
			if (!StringUtil.isEmpty(correctAudience) && getSettings().getBoolean("island.is.validate_audience", true)) {
				Conditions conditions = assertion.getConditions();
				List<AudienceRestriction> audienceRestrictions = conditions == null ? null : conditions.getAudienceRestrictions();
				if (ListUtil.isEmpty(audienceRestrictions)) {
					throw new Exception("No audience(s) at assertion's (" + assertion + ") conditions: " + conditions);
				}

				boolean validAudience = false;
				for (Iterator<AudienceRestriction> iter = audienceRestrictions.iterator(); (!validAudience && iter.hasNext());) {
					AudienceRestriction audienceRestriction = iter.next();
					List<Audience> audiences = audienceRestriction.getAudiences();
					if (ListUtil.isEmpty(audiences)) {
						continue;
					}

					for (Iterator<Audience> iter2 = audiences.iterator(); (!validAudience && iter2.hasNext());) {
						Audience audience = iter2.next();
						if (audience == null) {
							continue;
						}

						String audienceURI = audience.getAudienceURI();
						if (StringUtil.isEmpty(audienceURI)) {
							continue;
						}

						if (audienceURI.toLowerCase().indexOf(correctAudience) != -1) {
							validAudience = true;
						} else {
							getLogger().warning("Audience " + audienceURI + " is not correct for " + correctAudience);
						}
					}
				}
				if (!validAudience) {
					throw new Exception("Correct audience (" + correctAudience + ") not found at audience restrictions (" + audienceRestrictions +
							") of assertion's (" + assertion + ") conditions (" + conditions + ")");
				}
			}

			// Validate the assertions for IP, useragent and authId.
			personalID = getPersonalIDFromValidatedAssertion(assertion, userIP, userAgent, authId);
			ok = true;
		} catch (Exception e) {
			//SAML not verified
			getLogger().log(Level.WARNING, "Error verifying SAML message '" + samlString + "'", e);
		} finally {
			if (!ok) {
				getLogger().warning("Failed to validate SAML message. User IP: " + userIP + ", user agent: " + userAgent + ", auth. ID: " + authId + ", message:\n'" + samlString + "'");
			}
		}

		return personalID;
	}

	//	Unmarshall SAML string
	private final XMLObject unmarshall(final String samlString, boolean debug) throws Exception {
		InputStream stream = null;
		try {
			byte[] samlToken = Base64.getDecoder().decode(samlString);

			if (debug) {
				getLogger().info("SAML response:\n" + new String(samlToken));
			}

			//	Initialize the library
			DefaultBootstrap.bootstrap();

			//	Get parser pool manager
			final BasicParserPool ppMgr = new BasicParserPool();
			final HashMap<String, Boolean> features = new HashMap<String, Boolean>();
			features.put(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
			ppMgr.setBuilderFeatures(features);
			ppMgr.setNamespaceAware(true);

			stream = new ByteArrayInputStream(samlToken);
			org.w3c.dom.Document document = ppMgr.parse(stream);
			if (document != null) {
				final org.w3c.dom.Element root = document.getDocumentElement();
				final UnmarshallerFactory unmarshallerFact = Configuration.getUnmarshallerFactory();
				if (unmarshallerFact != null && root != null) {
					final Unmarshaller unmarshaller = unmarshallerFact.getUnmarshaller(root);
					try {
						return unmarshaller.unmarshall(root);
					} catch (NullPointerException e) {
						getLogger().log(Level.WARNING, "Error while unmarshalling " + root + " with " + unmarshaller, e);
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
		} finally {
			IOUtil.close(stream);
		}
	}

	private final SAMLObject validateSignature(final SignableSAMLObject tokenSaml, KeyStore keyStore) throws Exception {
		ByteArrayInputStream bis = null;
		try {
			Signature signature = tokenSaml.getSignature();
			if (signature == null) {
				throw new Exception("Siganture is not provided for " + tokenSaml);
			}

			// Validate structure signature
			final SAMLSignatureProfileValidator sigProfValidator = new SAMLSignatureProfileValidator();
			try {
				// Indicates signature id conform to SAML Signature profile
				sigProfValidator.validate(signature);
			} catch (ValidationException e) {
				//ValidationException: signature isn't conform to SAML Signature profile.
				throw new Exception(e);
			}

			String aliasCert = null;
			X509Certificate certificate;
			final KeyInfo keyInfo = signature.getKeyInfo();
			final org.opensaml.xml.signature.X509Certificate xmlCert = keyInfo.getX509Datas().get(0).getX509Certificates().get(0);
			final CertificateFactory certFact = CertificateFactory.getInstance("X.509");
			bis = new ByteArrayInputStream(Base64.getDecoder().decode(xmlCert.getValue()));
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
				}
			}
			if (!trusted) {
				throw new Exception("Certificate is not trusted.");
			} else if (getSettings().getBoolean("island.is_check_serial_on_validate", false)) {
				if (cert.getSubjectDN().toString().contains("SERIALNUMBER=6503760649") && cert.getIssuerDN().toString().startsWith("CN=Traustur	bunadur")) {
					trusted = true;
				} else {
					throw new Exception("Certificate is not trusted, does not contain serial number.");
				}
			}

			// Validate signature
			final SignatureValidator sigValidator = new SignatureValidator(entityX509Cred);
			sigValidator.validate(signature);

			return tokenSaml;
		} catch (Throwable e) {
			String error = "Error validating signature for " + tokenSaml;
			getLogger().log(Level.WARNING, error + ": " + e.getMessage(), e);
			throw new Exception(error);
		} finally {
			IOUtil.close(bis);
		}
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
			return personalID;
		}

		throw new Exception(String.format("Assertions not valid. IP valid: %b, user agent valid: %b, auth ID valid: %b", ipOk, uaOk, authIdOk));
	}
}