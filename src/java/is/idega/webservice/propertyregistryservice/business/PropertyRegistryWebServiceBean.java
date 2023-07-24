package is.idega.webservice.propertyregistryservice.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.util.IWTimestamp;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;

import is.idega.webservice.property.registry.MainStub;
import is.idega.webservice.property.registry.MainStub.GetData;
import is.idega.webservice.property.registry.MainStub.GetDataResponse;
import is.idega.webservice.property.registry.MainStub.GetDataResult_type0;
import is.idega.webservice.property.registry.MainStub.Login;
import is.idega.webservice.property.registry.MainStub.LoginResponse;
import is.idega.webservice.propertyregistryservice.data.Owner;
import is.idega.webservice.propertyregistryservice.data.Property;
import is.idega.webservice.util.Axis2Util;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service("propertyRegistryWebService")
public class PropertyRegistryWebServiceBean extends DefaultSpringBean implements PropertyRegistryWebService {

	private static final String TAX_PASSWORD = "property_tax_password";
	private static final String TAX_USER = "property_tax_user";
	private static final String TAX_ENDPOINT = "property_tax_endpoint";
	private static final String TAX_COMPANY = "property_tax_company";

	private static final String PROPERTY_ROOT = "MEINI";

	private static final String PROPERTY_APARTMENTNUMBER = "MEINI_FEPILOG";
	private static final String PROPERTY_FNR = "MEINI_FASTANR";
	private static final String PROPERTY_NAME = "MEINI_HEIMILISFANG";
	private static final String PROPERTY_TYPE = "MEINI_NOTKTXTEINING";

	private static final String OWNER_ID = "VWEIGANDI_ID";
	private static final String OWNER_CHANGED_DATE = "VWEIGANDI_CHANGEDAT";
	private static final String OWNER_CHANGED_BY = "VWEIGANDI_CHANGEDBY";
	private static final String OWNER_STATUS = "VWEIGANDI_CHANGESTATUS";
	private static final String OWNER_CODE = "VWEIGANDI_CODE";
	private static final String OWNER_ASSESSMENT_YEAR = "VWEIGANDI_ALAGAR";
	private static final String OWNER_FNR = "VWEIGANDI_MEINIFASTANR";
	private static final String OWNER_OWNER_NUMBER = "VWEIGANDI_NR";
	private static final String OWNER_SSN = "VWEIGANDI_NAFNCODE";
	private static final String OWNER_NAME = "VWEIGANDI_NAFNNAFN";
	private static final String OWNER_OWNER_PERCENTAGE = "VWEIGANDI_EIGNAHLF";
	private static final String OWNER_PAY_PERCENTAGE = "VWEIGANDI_SKATTHLF";
	private static final String OWNER_DATE_BOUGHT = "VWEIGANDI_KDAGUR";
	private static final String OWNER_DATE_DELIVERED = "VWEIGANDI_FDAGUR";

	private MainStub stub = null;

	private MainStub getStub(String endpoint) {
		if (this.stub == null) {
			try {
				this.stub = new MainStub();
			} catch (AxisFault e) {
				getLogger().log(
						Level.WARNING,
						"Unable to create " + MainStub.class.getName() + " service stub",
						e
				);
			}
		}

		if (stub != null) {
			if (!Axis2Util.isServiceEndpoint(stub, endpoint)) {
				getLogger().info("WRONG ENDPOINT. "
						+ "You are using enpoint: '" + Axis2Util.getEndpoint(stub) +
						"' instead of: '" + endpoint +
						"' . Endpoint will be changed to: " + endpoint);
				Axis2Util.changeEndpoint(stub, endpoint);
			}
		}

		return this.stub;
	}

	@Override
	public List<Property> getApartmentNumberList(String address, String assessmentYear) {
		if (StringUtil.isEmpty(address)) {
			return null;
		}

		address = address.trim();
		return getApartmentNumberList(address, assessmentYear, false);
	}

	public static void main(String[] args) {
		String address = "Skúlagata 10a      ".trim();
		String year = String.valueOf(IWTimestamp.RightNow().getYear());
		PropertyRegistryWebServiceBean service = new PropertyRegistryWebServiceBean();
		List<Property> properties = service.getApartmentNumberList(address, year);
		System.out.println("Properties: " + properties);

		List<Owner> owners = service.getOwnersByPropertyIdentifier("", year);
		System.out.println("Owners: " + owners);

		Property property = service.getApartmentByPropertyIdentifier("", year);
		System.out.println("Property: " + property);
	}

	@Override
	public StubAndSession getStubAndSession() {
		return new StubAndSession();
	}

	public class StubAndSession {

		private MainStub stub;

		private String session;

		private StubAndSession() {
			this(null);
		}

		private StubAndSession(Integer timeout) {
			IWMainApplicationSettings settings = getSettings();
			String endpoint = settings.getProperty(TAX_ENDPOINT, "");
			String userid = settings.getProperty(TAX_USER, "");
			String password = settings.getProperty(TAX_PASSWORD, "");
			String company = settings.getProperty(TAX_COMPANY, "");

			stub = getStub(endpoint);
			if (timeout != null && timeout > 0) {
				stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, timeout);
				stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, timeout);
			}

			try {
				Login login = new Login();
				login.setCompany(company);
				login.setUserName(userid);
				login.setPassword(password);
				LoginResponse loginResponse = stub.login(login);
				session = loginResponse == null ? null : loginResponse.getLoginResult();
			} catch (Exception e) {
				getLogger().log(Level.WARNING, "Error getting session ID for " + endpoint, e);
			}
		}

		public MainStub getMainStub() {
			return stub;
		}

		public String getSession() {
			return session;
		}

	}

	private List<Property> getApartmentNumberList(String address, String assessmentYear, boolean altered) {
		if (StringUtil.isEmpty(address) || StringUtil.isEmpty(assessmentYear)) {
			return Collections.emptyList();
		}

		List<Property> apartmentNumbers = new ArrayList<>();

		try {
			StubAndSession stubAndSession = new StubAndSession();
			MainStub stub = stubAndSession.stub;

			StringBuffer filter = new StringBuffer("meini_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and meini_heimilisfang='");
			filter.append(address);
			filter.append("'");

			GetData data = new GetData();
			data.setSessionId(stubAndSession.session);
			data.setTableName(PROPERTY_ROOT.toLowerCase());
			data.setFilter(filter.toString());
			data.setReturnTree(false);
			GetDataResponse dataResponse = stub.getData(data);
			GetDataResult_type0 result = dataResponse == null ? null : dataResponse.getGetDataResult();
			OMElement extraElement = result == null ? null : result.getExtraElement();
			if (extraElement == null) {
				return null;
			}

			for (
					@SuppressWarnings("unchecked")
					Iterator<OMElement> iter = extraElement.getChildren();
					iter.hasNext();
			) {
				List<Property> propertyList = getParsedProperties(iter.next());
				if (ListUtil.isEmpty(propertyList)) {
					continue;
				}

				apartmentNumbers.addAll(propertyList);
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting properties for address " + address, e);
		}

		if (apartmentNumbers.isEmpty() && !altered) {
			String allButLast = address.substring(0, address.length() - 1);
			String last = address.substring(address.length() - 1);

			if (!last.matches("[0-9]")) {
				StringBuffer newAddress = new StringBuffer();
				newAddress.append(allButLast);
				newAddress.append(last.toUpperCase());

				return getApartmentNumberList(newAddress.toString(), assessmentYear, true);
			}
		}

		return apartmentNumbers;
	}

	private List<Property> getParsedProperties(OMElement element) {
		@SuppressWarnings("unchecked")
		Iterator<OMElement> properties = element == null ? null : element.getChildrenWithLocalName(PROPERTY_ROOT);
		if (properties == null) {
			return Collections.emptyList();
		}

		List<Property> results = new ArrayList<>();
		while (properties.hasNext()) {
			OMElement propertyEl = properties.next();
			if (propertyEl == null) {
				continue;
			}

			results.add(
					new Property(
							getValue(propertyEl, PROPERTY_FNR),
							getValue(propertyEl, PROPERTY_NAME),
							getValue(propertyEl, PROPERTY_APARTMENTNUMBER),
							getValue(propertyEl, PROPERTY_TYPE)
					)
			);
		}
		return results;
	}

	@Override
	public String getValue(OMElement element, String name) {
		if (element == null || StringUtil.isEmpty(name)) {
			return null;
		}

		OMElement childElement = element.getFirstChildWithName(new QName(name));
		return childElement == null ? null : childElement.getText();
	}

	@Override
	public List<Owner> getOwnersByPropertyIdentifier(String identifier, String assessmentYear) {
		if (StringUtil.isEmpty(identifier) || StringUtil.isEmpty(assessmentYear)) {
			return Collections.emptyList();
		}

		List<Owner>owners = new ArrayList<>();

		int timeout = getSettings().getInt("egov.propertytax.timeout", 60000);

		try {
			StubAndSession stubAndSession = new StubAndSession(timeout);
			MainStub stub = stubAndSession.stub;

			StringBuffer filter = new StringBuffer("vweigandi_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and vweigandi_meinifastanr='");
			filter.append(identifier);
			filter.append("'");

			GetData data = new GetData();
			data.setSessionId(stubAndSession.session);
			data.setTableName("vweigandi");
			data.setFilter(filter.toString());
			data.setReturnTree(false);
			GetDataResponse dataResponse = stub.getData(data);
			GetDataResult_type0 result = dataResponse == null ? null : dataResponse.getGetDataResult();
			OMElement extraElement = result == null ? null : result.getExtraElement();
			if (extraElement == null) {
				return null;
			}

			for (
					@SuppressWarnings("unchecked")
					Iterator<OMElement> iter = extraElement.getChildren();
					iter.hasNext();
			) {
				List<Owner> o = getParsedOwners(iter.next());
				if (ListUtil.isEmpty(o)) {
					continue;
				}

				owners.addAll(o);
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting owners for prop. identifier " + identifier + " and year " + assessmentYear, e);
		}

		return owners;
	}

	@Override
	public Property getApartmentByPropertyIdentifier(String identifier, String assessmentYear) {
		if (StringUtil.isEmpty(identifier) || StringUtil.isEmpty(assessmentYear)) {
			return null;
		}

		try {
			StubAndSession stubAndSession = new StubAndSession();

			StringBuffer filter = new StringBuffer("meini_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and meini_fastanr='");
			filter.append(identifier);
			filter.append("'");

			GetData data = new GetData();
			data.setSessionId(stubAndSession.session);
			data.setTableName(PROPERTY_ROOT.toLowerCase());
			data.setFilter(filter.toString());
			data.setReturnTree(false);
			GetDataResponse dataResponse = stub.getData(data);
			GetDataResult_type0 result = dataResponse == null ? null : dataResponse.getGetDataResult();
			OMElement extraElement = result == null ? null : result.getExtraElement();
			if (extraElement == null) {
				return null;
			}

			for (
					@SuppressWarnings("unchecked")
					Iterator<OMElement> iter = extraElement.getChildren();
					iter.hasNext();
			) {
				List<Property> properties = getParsedProperties(iter.next());
				if (ListUtil.isEmpty(properties)) {
					continue;
				}

				return properties.iterator().next();
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting apartments by prop. identifier " + identifier + " and year " + assessmentYear, e);
		}

		return null;
	}

	private List<Owner> getParsedOwners(OMElement element) {
		@SuppressWarnings("unchecked")
		Iterator<OMElement> owners = element == null ? null : element.getChildrenWithLocalName("VWEIGANDI");
		if (owners == null) {
			return Collections.emptyList();
		}

		List<Owner> results = new ArrayList<>();
		while (owners.hasNext()) {
			OMElement ownerEl = owners.next();
			if (ownerEl == null) {
				continue;
			}

			results.add(
					new Owner(
							getValue(ownerEl, OWNER_ID),
							getValue(ownerEl, OWNER_CHANGED_DATE),
							getValue(ownerEl, OWNER_CHANGED_BY),
							getValue(ownerEl, OWNER_STATUS),
							getValue(ownerEl, OWNER_CODE),
							getValue(ownerEl, OWNER_ASSESSMENT_YEAR),
							getValue(ownerEl, OWNER_FNR),
							getValue(ownerEl, OWNER_OWNER_NUMBER),
							getValue(ownerEl, OWNER_SSN),
							getValue(ownerEl, OWNER_NAME),
							getValue(ownerEl, OWNER_OWNER_PERCENTAGE),
							getValue(ownerEl, OWNER_PAY_PERCENTAGE),
							getValue(ownerEl, OWNER_DATE_BOUGHT),
							getValue(ownerEl, OWNER_DATE_DELIVERED)
					)
			);
		}
		return results;
	}

}