package is.idega.webservice.propertyregistryservice;

import is.idega.webservice.propertyregistryservice.client.GetDataResponseGetDataResult;
import is.idega.webservice.propertyregistryservice.client.MainLocator;
import is.idega.webservice.propertyregistryservice.client.MainSoap_PortType;
import is.idega.webservice.propertyregistryservice.data.Property;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.axis.message.MessageElement;

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
		test.doStuff();
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

			String session = port.login(company, "idegapalli", "58Rfv");

			GetDataResponseGetDataResult result = port.getData(session,
					"meini", "meini_alagar = '2009' and meini_heimilisfang='"
							+ "Ljósavík 24" + "'", false);

			
			MessageElement properties[] = result.get_any();

			int length = properties.length;
			for (int i = 0; i < length; i++) {
				System.out.println(properties[i].getAsString());
				List <Property>propertyList = parseProperty(properties[i]);
				if (propertyList != null && !propertyList.isEmpty()) {
					for (Property property : propertyList) {
						System.out.println("apartmentNumber = " + property.getApartmentNumber());
						System.out.println("fnr = " + property.getFNR());
						System.out.println("nameNumber = " + property.getNameNumber());
					}
				}
			}
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