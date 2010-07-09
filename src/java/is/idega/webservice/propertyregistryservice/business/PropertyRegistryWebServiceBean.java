package is.idega.webservice.propertyregistryservice.business;

import is.idega.webservice.propertyregistryservice.client.GetDataResponseGetDataResult;
import is.idega.webservice.propertyregistryservice.client.MainLocator;
import is.idega.webservice.propertyregistryservice.client.MainSoap_PortType;
import is.idega.webservice.propertyregistryservice.data.Owner;
import is.idega.webservice.propertyregistryservice.data.Property;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;

@Scope("singleton")
@Service("propertyRegistryWebService")
public class PropertyRegistryWebServiceBean implements
		PropertyRegistryWebService {

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


	public List<Property> getApartmentNumberList(String address, String assessmentYear) {
		return getApartmentNumberList(address, assessmentYear, false);
	}
	
	public List<Property> getApartmentNumberList(String address, String assessmentYear, boolean altered) {
		List <Property>apartmentNumbers = new ArrayList<Property>();

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
			filter.append("' and meini_heimilisfang='");
			filter.append(address);
			filter.append("'");
			
			GetDataResponseGetDataResult result = port.getData(session,
					"meini", filter.toString(), false);
			
			MessageElement properties[] = result.get_any();

			int length = properties.length;
			for (int i = 0; i < length; i++) {
				List <Property>propertyList = parseProperty(properties[i]);
				if (propertyList != null && !propertyList.isEmpty()) {
					for (Property property : propertyList) {
						apartmentNumbers.add(property);
					}
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
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
	
	private List<Property> parseProperty(MessageElement element) {
		List <Property>returnProperty = new ArrayList<Property>();
		Property propety = null;

		if (element.getNodeName().equals("diffgr:diffgram")) {
			List <MessageElement>properties = new ArrayList<MessageElement>();
			getPropertyElements(element, properties);
			if (properties != null && !properties.isEmpty()) {
				Iterator i = properties.iterator();
				while (i.hasNext()) {
					MessageElement vweigandi = (MessageElement) i.next();
					propety = new Property();
					Iterator it = vweigandi.getChildElements();
					while (it.hasNext()) {
						MessageElement child = (MessageElement) it.next();
						String nodeName = child.getNodeName();
						String value = child.getValue();
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
		}

		return returnProperty;
	}

	private void getPropertyElements(MessageElement element, List <MessageElement>propertyElements) {
		if (element.getNodeName().equals(PROPERTY_ROOT)) {
			propertyElements.add(element);
			return;
		}

		Iterator it = element.getChildElements();

		while (it.hasNext()) {
			MessageElement el = (MessageElement) it.next();
			if (el.getNodeName().equals(PROPERTY_ROOT)) {
				propertyElements.add(el);
			}
			else if (el.hasChildNodes()) {
				getPropertyElements(el, propertyElements);
			}
		}

		return;
	} 

	public List<Owner> getOwnersByPropertyIdentifier(String identifier, String assessmentYear) {
		List <Owner>owners = new ArrayList<Owner>();

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
				List <Property>propertyList = parseProperty(properties[0]);
				if (propertyList != null && !propertyList.isEmpty()) {
					for (Property property : propertyList) {
						return property;
					}
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
	
	private List<Owner> parseOwner(MessageElement element) {
		List<Owner> returnOwners = new ArrayList<Owner>();
		Owner owner = null;

		if (element.getNodeName().equals("diffgr:diffgram")) {
			List<MessageElement> owners = new ArrayList<MessageElement>();
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