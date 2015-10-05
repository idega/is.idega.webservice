package is.idega.webservice.business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ejb.FinderException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.business.IBORuntimeException;
import com.idega.core.accesscontrol.business.LoginBusinessBean;
import com.idega.core.accesscontrol.dao.UserLoginDAO;
import com.idega.core.accesscontrol.data.LoginTable;
import com.idega.core.accesscontrol.data.LoginTableHome;
import com.idega.core.accesscontrol.data.bean.UserLogin;
import com.idega.data.IDOLookup;
import com.idega.data.IDOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.user.data.User;
import com.idega.util.expression.ELUtil;

import eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerAccessPointLocator;
import eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerType;
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
public class IslandDotIsService {

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
		try {
			String line = null;
			StringBuilder saml = new StringBuilder();
			BufferedReader input = new BufferedReader(new FileReader("/Users/palli/response.txt"));
			while ((line = input.readLine()) != null) {
				saml.append(line);
			}
			Map<String, String> resp = test.samlInfo(saml.toString());
			Set<String> keys = resp.keySet();
			for (String key : keys) {
				String value = resp.get(key);
				System.out.println(key + " = " + value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
}
