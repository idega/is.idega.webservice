package is.idega.webservice.propertyregistryservice.business;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis.message.MessageElement;
import org.apache.axis2.AxisFault;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.util.ListUtil;

import is.idega.webservice.fasteignaskra.is.MainStub;
import is.idega.webservice.fasteignaskra.is.MainStub.GetData;
import is.idega.webservice.fasteignaskra.is.MainStub.GetDataResponse;
import is.idega.webservice.fasteignaskra.is.MainStub.GetDataResult_type0;
import is.idega.webservice.fasteignaskra.is.MainStub.Login;
import is.idega.webservice.fasteignaskra.is.MainStub.LoginResponse;
import is.idega.webservice.propertyregistryservice.client.GetDataResponseGetDataResult;
import is.idega.webservice.propertyregistryservice.client.MainLocator;
import is.idega.webservice.propertyregistryservice.client.MainSoap_PortType;
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
		address = address.trim();
		return getApartmentNumberList(address, assessmentYear, false);
	}

	public static void main(String[] args) {
		String address = "Bláskógum 12      ".trim();
		System.out.println(address + ": " + address.length());

		PropertyRegistryWebServiceBean bean = new PropertyRegistryWebServiceBean();
		List<Property> properties = bean.getApartmentNumberList(address, String.valueOf(2022));
		System.out.println("Properties " + properties);
	}

	private List<Property> getApartmentNumberList(String address, String assessmentYear, boolean altered) {
		List<Property> apartmentNumbers = new ArrayList<>();

//		IWMainApplicationSettings settings = getSettings();
		String endpoint = "https://webservices.fasteignaskra.is/main.asmx";//settings.getProperty(TAX_ENDPOINT, "");
		String userid = "wsreykjavik";//settings.getProperty(TAX_USER, "");
		String password = "99Ert";//settings.getProperty(TAX_PASSWORD, "");
		String company = "Reykjavíkurborg";//settings.getProperty(TAX_COMPANY, "");

		try {
			MainStub stub = getStub(endpoint);
			Login login = new Login();
			login.setCompany(company);
			login.setUserName(userid);
			login.setPassword(password);
			LoginResponse loginResponse = stub.login(login);
			String session = loginResponse.getLoginResult();

//			MainLocator locator = new MainLocator();
//			MainSoap_PortType port = locator.getMainSoap(new URL(endpoint));
//			String session = port.login(company, userid, password);

			StringBuffer filter = new StringBuffer("meini_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and meini_heimilisfang='");
			filter.append(address);
			filter.append("'");

			GetData data = new GetData();
			data.setSessionId(session);
			data.setTableName("meini");
			data.setFilter(filter.toString());
			data.setReturnTree(false);
			GetDataResponse dataResponse = stub.getData(data);
//			GetDataResponseGetDataResult result = port.getData(session,
//					"meini", filter.toString(), false);

			GetDataResult_type0 result = dataResponse.getGetDataResult();
			OMFactory factory = OMAbstractFactory.getOMFactory();
			OMElement el = result.getOMElement(QName.valueOf("diffgr:diffgram"), factory);
			if (el == null) {
				return null;
			}

			System.out.println("Element: " + el);
			for (Iterator<?> iter = el.getChildren(); iter.hasNext();) {
				Object child = iter.next();
				if (child instanceof OMElement) {
					List<Property> propertyList = parseProperty((OMElement) child);
					if (!ListUtil.isEmpty(propertyList)) {
						for (Property property : propertyList) {
							apartmentNumbers.add(property);
						}
					}
				}
			}

//			MessageElement properties[] = result.get_any();
//
//			int length = properties.length;
//			for (int i = 0; i < length; i++) {
//				List <Property>propertyList = parseProperty(properties[i]);
//				if (propertyList != null && !propertyList.isEmpty()) {
//					for (Property property : propertyList) {
//						apartmentNumbers.add(property);
//					}
//				}
//			}
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (ServiceException e) {
//			e.printStackTrace();
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting appartments for address " + address + " and year " + assessmentYear, e);
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

	private List<Property> parseProperty(OMElement element) {
		List<Property> returnProperty = new ArrayList<>();
		if (element == null) {
			return returnProperty;
		}

		Property propety = null;

//		if (element.getLocalName().equals("diffgr:diffgram")) {
			List<OMElement> properties = new ArrayList<>();
			getPropertyElements(element, properties);
			if (!ListUtil.isEmpty(properties)) {
				for (Iterator<OMElement> i = properties.iterator(); i.hasNext();) {
					OMElement vweigandi = i.next();
					propety = new Property();
					Iterator<?> it = vweigandi.getChildElements();
					while (it.hasNext()) {
						OMElement child = (OMElement) it.next();
						String nodeName = child.getLocalName();
						String value = child.getText();
						if (nodeName.equals(PROPERTY_APARTMENTNUMBER)) {
							propety.setApartmentNumber(value);
						}
						else if (nodeName.equals(PROPERTY_FNR)) {
							propety.setFNR(value);
						}
						else if (nodeName.equals(PROPERTY_NAME)) {
							propety.setNameNumber(value);
						}
						else if (nodeName.equals(PROPERTY_TYPE)) {
							propety.setType(value);
						}

					}

					returnProperty.add(propety);
				}
			}
//		}

		return returnProperty;
	}

	private void getPropertyElements(OMElement element, List<OMElement> propertyElements) {
		if (element.getLocalName().equals(PROPERTY_ROOT)) {
			propertyElements.add(element);
			return;
		}

		Iterator<?> it = element.getChildElements();

		while (it.hasNext()) {
			OMElement el = (OMElement) it.next();
			if (el.getLocalName().equals(PROPERTY_ROOT)) {
				propertyElements.add(el);
			}
			else if (el.getChildren() != null) {
				getPropertyElements(el, propertyElements);
			}
		}

		return;
	}

	@Override
	public List<Owner> getOwnersByPropertyIdentifier(String identifier, String assessmentYear) {
		List <Owner>owners = new ArrayList<>();

		String endpoint = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_ENDPOINT, "");
		String userid = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_USER, "");
		String password = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_PASSWORD, "");
		String company = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_COMPANY, "");

		int timeout = Integer.parseInt(IWMainApplication.getDefaultIWApplicationContext().getApplicationSettings().getProperty("egov.propertytax.timeout", "60000"));

		try {
			MainLocator locator = new MainLocator();
			MainSoap_PortType port = locator.getMainSoap(new URL(endpoint));
			((org.apache.axis.client.Stub) port).setTimeout(timeout); //Setting timeout to stop the load if the service is not answering
			String session = port.login(company, userid, password);

			StringBuffer filter = new StringBuffer("vweigandi_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and vweigandi_meinifastanr='");
			filter.append(identifier);
			filter.append("'");

			GetDataResponseGetDataResult result = port.getData(session,
					"vweigandi", filter.toString(), false);

			MessageElement properties[] = result.get_any();

			int length = properties.length;
			for (int i = 0; i < length; i++) {
				List<Owner> o = parseOwner(properties[i]);
				owners.addAll(o);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return owners;
	}

	@Override
	public Property getApartmentByPropertyIdentifier(String identifier, String assessmentYear) {
		String endpoint = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_ENDPOINT, "");
		String userid = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_USER, "");
		String password = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_PASSWORD, "");
		String company = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(TAX_COMPANY, "");

		try {
			MainLocator locator = new MainLocator();
			MainSoap_PortType port = locator.getMainSoap(new URL(endpoint));
			String session = port.login(company, userid, password);

			StringBuffer filter = new StringBuffer("meini_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and meini_fastanr='");
			filter.append(identifier);
			filter.append("'");

			GetDataResponseGetDataResult result = port.getData(session,
					"meini", filter.toString(), false);

			MessageElement properties[] = result.get_any();

			int length = properties.length;
			if (length > 0) {
//				List <Property>propertyList = parseProperty(properties[0]);
//				if (propertyList != null && !propertyList.isEmpty()) {
//					for (Property property : propertyList) {
//						return property;
//					}
//				}
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

	private List<Owner> parseOwner(MessageElement element) {
		List<Owner> returnOwners = new ArrayList<>();
		Owner owner = null;

		if (element.getNodeName().equals("diffgr:diffgram")) {
			List<MessageElement> owners = new ArrayList<>();
			getVWEigandiElements(element, owners);
			if (owners != null && !owners.isEmpty()) {
				Iterator i = owners.iterator();
				while (i.hasNext()) {
					MessageElement vweigandi = (MessageElement) i.next();
					owner = new Owner();
					Iterator it = vweigandi.getChildElements();
					while (it.hasNext()) {
						MessageElement child = (MessageElement) it.next();
						String nodeName = child.getNodeName();
						String value = child.getValue();
						if (nodeName.equals(OWNER_ID)) {
							owner.setID(child.getValue());
						}
						else if (nodeName.equals(OWNER_CHANGED_BY)) {
							owner.setChangedBy(value);
						}
						else if (nodeName.equals(OWNER_CHANGED_DATE)) {
							owner.setLastChanged(value);
						}
						else if (nodeName.equals(OWNER_CODE)) {
							owner.setCode(value);
						}
						else if (nodeName.equals(OWNER_STATUS)) {
							owner.setStatus(value);
						}
						else if (nodeName.equals(OWNER_NAME)) {
							owner.setName(value);
						}
						else if (nodeName.equals(OWNER_SSN)) {
							owner.setSSN(value);
						}
						else if (nodeName.equals(OWNER_FNR)) {
							owner.setFNR(value);
						}
						else if (nodeName.equals(OWNER_DATE_BOUGHT)) {
							owner.setDateBought(value);
						}
						else if (nodeName.equals(OWNER_DATE_DELIVERED)) {
							owner.setDateDelivered(value);
						}
						else if (nodeName.equals(OWNER_OWNER_PERCENTAGE)) {
							owner.setOwnerPercentage(value);
						}
						else if (nodeName.equals(OWNER_OWNER_NUMBER)) {
							owner.setOwnerNumber(value);
						}
						else if (nodeName.equals(OWNER_PAY_PERCENTAGE)) {
							owner.setPaymentPercentage(value);
						}
						else if (nodeName.equals(OWNER_ASSESSMENT_YEAR)) {
							owner.setAssessmentYear(value);
						}
					}

					returnOwners.add(owner);
				}
			}
		}

		return returnOwners;
	}

	private void getVWEigandiElements(MessageElement element, List<MessageElement> ownerElements) {
		if (element.getNodeName().equals("VWEIGANDI")) {
			ownerElements.add(element);
			return;
		}

		Iterator it = element.getChildElements();

		while (it.hasNext()) {
			MessageElement el = (MessageElement) it.next();
			if (el.getNodeName().equals("VWEIGANDI")) {
				ownerElements.add(el);
			}
			else if (el.hasChildNodes()) {
				getVWEigandiElements(el, ownerElements);
			}
		}

		return;
	}

}