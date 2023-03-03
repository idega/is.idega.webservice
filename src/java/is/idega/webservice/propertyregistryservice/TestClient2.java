package is.idega.webservice.propertyregistryservice;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.axis.message.MessageElement;

import com.idega.util.IWTimestamp;

import is.idega.webservice.propertyregistryservice.client.GetDataResponseGetDataResult;
import is.idega.webservice.propertyregistryservice.client.MainLocator;
import is.idega.webservice.propertyregistryservice.client.MainSoap_PortType;
import is.idega.webservice.propertyregistryservice.data.Property;

public class TestClient2 {

	private static final String PROPERTY_ROOT = "MEINI";

	private static final String PROPERTY_APARTMENTNUMBER = "MEINI_FEPILOG";
	private static final String PROPERTY_FNR = "MEINI_FASTANR";
	private static final String PROPERTY_NAME = "MEINI_HEIMILISFANG";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestClient2 test = new TestClient2();
//		test.doStuff();
		String year = String.valueOf(IWTimestamp.RightNow().getYear());
										//	2503562939		2112775219			2106533259
		String[] addresses = new String[] {"Goðheimar 9",	"Laufásvegur 22A", "Skólavörðustígur 16A"};
		for (String address: addresses) {
			List<Property> properties = test.getAppartmentNumbers(address, year, false);
			System.out.println("Properties for " + address + ": " + properties);
		}
	}

	private List<Property> getAppartmentNumbers(String address, String assessmentYear, boolean altered) {
		try {
			String endpoint = "https://webservices.fasteignaskra.is/main.asmx";

			MainLocator locator = new MainLocator();
			MainSoap_PortType port = locator.getMainSoap(new URL(endpoint));

			String companies = port.getCompanies();

			StringTokenizer tok = new StringTokenizer(companies, ";");
			String company = "";
			while (tok.hasMoreElements()) {
				company = (String) tok.nextElement();
				if (company.length() > 10) {
					if (company.substring(0, 7).equals("Reykjav")) {
						break;
					}
				}
			}

			String session = port.login(company, "wsreykjavik", "99Ert");

			StringBuffer filter = new StringBuffer("meini_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and meini_heimilisfang='");
			filter.append(address);
			filter.append("'");

			GetDataResponseGetDataResult result = port.getData(session,
					"meini", filter.toString(), false);

			MessageElement properties[] = result.get_any();

			List<Property>apartmentNumbers = new ArrayList<Property>();

			int length = properties.length;
			for (int i = 0; i < length; i++) {
				List <Property>propertyList = parseProperty(properties[i]);
				if (propertyList != null && !propertyList.isEmpty()) {
					for (Property property : propertyList) {
						apartmentNumbers.add(property);
					}
				}
			}

			if (apartmentNumbers.isEmpty() && !altered) {
				String allButLast = address.substring(0, address.length() - 1);
				String last = address.substring(address.length() - 1);

				if (!last.matches("[0-9]") ) {
					StringBuffer newAddress = new StringBuffer();
					newAddress.append(allButLast);
					newAddress.append(last.toUpperCase());

					return getAppartmentNumbers(newAddress.toString(), assessmentYear, true);
				}
			}

			System.out.println("Numbers: " + apartmentNumbers);
			return apartmentNumbers;
		} catch (Exception e) {
			Logger.getLogger(TestClient2.class.getName()).log(Level.WARNING, "Error getting ap. number for " + address, e);
		}

		return null;
	}

	private void doStuff() {
		try {
			String endpoint = "https://webservices.fasteignaskra.is/main.asmx";

			MainLocator locator = new MainLocator();
			MainSoap_PortType port = locator.getMainSoap(new URL(endpoint));

			String companies = port.getCompanies();

			StringTokenizer tok = new StringTokenizer(companies, ";");
			String company = "";
			while (tok.hasMoreElements()) {
				company = (String) tok.nextElement();
				if (company.length() > 10) {
					if (company.substring(0, 7).equals("Reykjav")) {
						break;
					}
				}
			}

			String address = "Laufásvegur 22A";
			String assessmentYear = String.valueOf(IWTimestamp.RightNow().getYear());

			String session = port.login(company, "wsreykjavik", "99Ert");

			StringBuffer filter = new StringBuffer("meini_alagar = '");
			filter.append(assessmentYear);
			filter.append("' and meini_heimilisfang='");
			filter.append(address);
			filter.append("'");

			GetDataResponseGetDataResult result = port.getData(session,
					"meini", filter.toString(), false);

			MessageElement properties[] = result.get_any();

			List<Property>apartmentNumbers = new ArrayList<Property>();

			int length = properties.length;
			for (int i = 0; i < length; i++) {
				List <Property>propertyList = parseProperty(properties[i]);
				if (propertyList != null && !propertyList.isEmpty()) {
					for (Property property : propertyList) {
						apartmentNumbers.add(property);
					}
				}
			}

		if (apartmentNumbers.isEmpty()) {
			String allButLast = address.substring(0, address.length() - 1);
			String last = address.substring(address.length() - 1);

			if (!last.matches("[0-9]")) {
				StringBuffer newAddress = new StringBuffer();
				newAddress.append(allButLast);
				newAddress.append(last.toUpperCase());

//				return getApartmentNumberList(newAddress.toString(), assessmentYear, true);
			}
		}

		System.out.println("Numbers: " + apartmentNumbers);
//
//
//
//			GetDataResponseGetDataResult result = port.getData(session,
//					"meini", "meini_alagar = '2009' and meini_heimilisfang='"
//							+ "Laufásvegur 18A" + "'", false);
//
//
//			MessageElement properties[] = result.get_any();
//
//			int length = properties.length;
//			for (int i = 0; i < length; i++) {
//				System.out.println(properties[i].getAsString());
//				List <Property>propertyList = parseProperty(properties[i]);
//				if (propertyList != null && !propertyList.isEmpty()) {
//					for (Property property : propertyList) {
//						System.out.println("apartmentNumber = " + property.getApartmentNumber());
//						System.out.println("fnr = " + property.getFNR());
//						System.out.println("nameNumber = " + property.getNameNumber());
//					}
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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
}