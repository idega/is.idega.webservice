package is.idega.webservice.propertyregistryservice;

import is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult;
import is.idega.webservice.propertyregistryservice.client.MainLocator;
import is.idega.webservice.propertyregistryservice.client.MainSoap_PortType;
import is.idega.webservice.propertyregistryservice.client.ParamInfo;
import is.idega.webservice.propertyregistryservice.client.QueryInfo;
import is.idega.webservice.propertyregistryservice.data.AssessmentEntry;

import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.axis.message.MessageElement;

public class TestClient {
	private static final String ASSESSMENT_YEAR = "ALAG_AR";
	private static final String ASSESSMENT_TYPE = "ALAG_TEGUND";
	private static final String ASSESSMENT_INFO = "ALAG_SKYRING";
	private static final String SSN = "NAFN_KENNITALA";
	private static final String NAME = "NAFN_NAFN";
	private static final String OWNER_PERCENTAGE = "INNH_HLUTURGREIDANDA";
	private static final String ASSESSMENT_CODE = "INNH_ALAGCODE";
	private static final String PROPERTY_CODE = "INNH_MEINIFASTANR";
	private static final String ADDRESS = "EIGHEI_HEIMILISFANG";

	public static void main(String[] args) {
		TestClient test = new TestClient();
		test.doStuff();
	}
	
	private void doStuff2(AssessmentEntry entry) {
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

			//String session = port.login(company, "wsreykjavik", "99Ert");
			//String session = port.login(company, "wsrvk", "rvk5762");
			String session = port.login(company, "idegapalli", "58Rfv");
			
			String query = "lfafg220";
			if (Integer.parseInt(entry.getAssessmentType()) > 1) {
				query = "lfafg025";
			}
			
			QueryInfo info = port.getQueryInfo(session, query, false);
			
			ParamInfo pInfo[] = info.getParamList();
			int length = pInfo.length;
			for (int i = 0; i < length; i++) {
                if (pInfo[i].getFromField().equals("fra_alag")) {
                	pInfo[i].setFromValue(entry.getAssessmentCode());                    
                }

                if (pInfo[i].getFromField().equals("fra_kteiganda")) {
                	pInfo[i].setFromValue(entry.getSsn());
                }

                if (pInfo[i].getToField().equals("til_kteiganda")) {
                	pInfo[i].setToValue(entry.getSsn());
                }

                if (pInfo[i].getFromField().equals("fra_fastanr")) {
                	pInfo[i].setFromValue(entry.getPropertyCode());
                }

                if (pInfo[i].getToField().equals("til_fastanr")) {
                	pInfo[i].setToValue(entry.getPropertyCode());
                }

                if (pInfo[i].getFromField().equals("reportsortingfield1")) {
                	pInfo[i].setFromValue("Kennitala,Nafn,Heimilisfang");
                }

                if (pInfo[i].getToField().equals("reportsortingfield2")) {
                	pInfo[i].setToValue("");
                }

                if (pInfo[i].getFromField().equals("uttakalagsedils")) {
                	pInfo[i].setFromValue("Allir"); //lfafg220
                }

                if (pInfo[i].getFromField().equals("uttakssedill")) {
                	pInfo[i].setFromValue("Allir");      //lfafg025
                }

                if (pInfo[i].getFromField().equals("specifictext")) {
                	pInfo[i].setFromValue("1");  //lfafg220 (ekki lfafg025)
                }
			}

			String fileName = entry.getPropertyCode() + ".pdf";
			
			byte[] byteobject = port.genReport(session, query, "2", info.getParamList());	
			FileOutputStream stream = new FileOutputStream("/Users/palli/" + fileName);
			stream.write(byteobject);
			stream.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
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

			//String session = port.login(company, "wsreykjavik", "99Ert");
			//String session = port.login(company, "wsrvk", "rvk5762");
			String session = port.login(company, "idegapalli", "58Rfv");
			
			QueryInfo info = port.getQueryInfo(session, "SEDLAR01", false);
			
			ParamInfo pInfo[] = info.getParamList();
			int length = pInfo.length;
			for (int i = 0; i < length; i++) {
				if (pInfo[i].getFromField().equals("fra_ar")) {
					pInfo[i].setFromValue("2009");
				}
				else if (pInfo[i].getFromField().equals("fra_kt")) {
					pInfo[i].setFromValue("2109595809");					
				}
			}
									
			GenDataSetResponseGenDataSetResult result = port.genDataSet(session, "SEDLAR01", "", info.getParamList(), null);
			MessageElement elements[] = result.get_any();

			length = elements.length;
			for (int i = 0; i < length; i++) {
				//MessageElement element = elements[i];
				List<AssessmentEntry> entries = parseEntries(elements[i]);
				if (entries != null && !entries.isEmpty()) {
					Iterator it = entries.iterator();
					while (it.hasNext()) {
						AssessmentEntry entry = (AssessmentEntry) it.next();
						System.out.println("name = " + entry.getName());
						System.out.println("owner percentage = " + entry.getOwnerPercentage());
						System.out.println("property code = " + entry.getPropertyCode());
						System.out.println("address = " + entry.getAddress());
						System.out.println("ass. code = " + entry.getAssessmentCode());
						System.out.println("ass. info = " + entry.getAssessmentInfo());
						System.out.println("ass. type = " + entry.getAssessmentType());
						System.out.println("ass. year = " + entry.getAssessmentYear());
						System.out.println("ssn = " + entry.getSsn());
						
						if (entry.getPropertyCode().equals("2022847")) {
							doStuff2(entry);
						}
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*private byte[] getAssessmentPDF() {
		return null;
	}*/
	
	private List<AssessmentEntry> parseEntries(MessageElement element) {
		List<AssessmentEntry> returnEntries = new ArrayList<AssessmentEntry>();
		AssessmentEntry entry = null;

		if (element.getNodeName().equals("diffgr:diffgram")) {
			List<MessageElement> tables = new ArrayList<MessageElement>();
			getTableElements(element, tables);
			if (tables != null && !tables.isEmpty()) {
				Iterator i = tables.iterator();
				while (i.hasNext()) {
					MessageElement table = (MessageElement) i.next();
					entry = new AssessmentEntry();
					Iterator it = table.getChildElements();
					while (it.hasNext()) {
						MessageElement child = (MessageElement) it.next();
						String nodeName = child.getNodeName();
						String value = child.getValue();
						if (nodeName.equals(ADDRESS)) {
							entry.setAddress(child.getValue());
						}
						else if (nodeName.equals(ASSESSMENT_CODE)) {
							entry.setAssessmentCode(value);
						}
						else if (nodeName.equals(ASSESSMENT_INFO)) {
							entry.setAssessmentInfo(value);
						}
						else if (nodeName.equals(ASSESSMENT_TYPE)) {
							entry.setAssessmentType(value);
						}
						else if (nodeName.equals(ASSESSMENT_YEAR)) {
							entry.setAssessmentYear(value);
						}
						else if (nodeName.equals(SSN)) {
							entry.setSsn(value);
						}
						else if (nodeName.equals(NAME)) {
							entry.setName(value);
						}
						else if (nodeName.equals(PROPERTY_CODE)) {
							entry.setPropertyCode(value);
						}
						else if (nodeName.equals(OWNER_PERCENTAGE)) {
							entry.setOwnerPercentage(value);
						}
					}

					returnEntries.add(entry);
				}
			}
		}

		return returnEntries;
	}

	private void getTableElements(MessageElement element, List<MessageElement> tableElements) {
		if (element.getNodeName().equals("Table")) {
			tableElements.add(element);
			return;
		}

		Iterator it = element.getChildElements();

		while (it.hasNext()) {
			MessageElement el = (MessageElement) it.next();
			if (el.getNodeName().equals("Table")) {
				tableElements.add(el);
			}
			else if (el.hasChildNodes()) {
				getTableElements(el, tableElements);
			}
		}

		return;
	}	
}