package is.idega.webservice.propertyregistryservice.data;

public class AssessmentEntry {
	/*<ALAG_AR>2009</ALAG_AR>
	<ALAG_TEGUND>0</ALAG_TEGUND>
	<ALAG_SKYRING>Upphafs&#xE1;lagning</ALAG_SKYRING>
	<NAFN_KENNITALA>2109595809</NAFN_KENNITALA>
	<NAFN_NAFN>Gu&#xF0;bjartur K Ingibergsson</NAFN_NAFN>
	<INNH_HLUTURGREIDANDA>100</INNH_HLUTURGREIDANDA>
	<INNH_ALAGCODE>2009001</INNH_ALAGCODE>
	<INNH_MEINIFASTANR>2022847</INNH_MEINIFASTANR>
	<EIGHEI_HEIMILISFANG>Bar&#xF0;avogur 19</EIGHEI_HEIMILISFANG>*/
	private String assessmentYear = null;
	private String assessmentType = null;
	private String assessmentInfo = null;
	private String ssn = null;
	private String name = null;
	private String ownerPercentage = null;
	private String assessmentCode = null;
	private String propertyCode = null;
	private String address = null;
	
	public AssessmentEntry() {
	}
	
	public AssessmentEntry(String assessmentYear, String assessmentType, String assessmentInfo, String ssn, String name, String ownerPercentage, String assessmentCode, String propertyCode, String address) {
		this.assessmentYear = assessmentYear;
		this.assessmentType = assessmentType;
		this.assessmentInfo = assessmentInfo;
		this.ssn = ssn;
		this.name = name;
		this.ownerPercentage = ownerPercentage;
		this.assessmentCode = assessmentCode;
		this.propertyCode = propertyCode;
		this.address = address;
	}

	public String getAssessmentYear() {
		return assessmentYear;
	}

	public String getAssessmentType() {
		return assessmentType;
	}

	public String getAssessmentInfo() {
		return assessmentInfo;
	}

	public String getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getOwnerPercentage() {
		return ownerPercentage;
	}

	public String getAssessmentCode() {
		return assessmentCode;
	}

	public String getPropertyCode() {
		return propertyCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAssessmentYear(String assessmentYear) {
		this.assessmentYear = assessmentYear;
	}

	public void setAssessmentType(String assessmentType) {
		this.assessmentType = assessmentType;
	}

	public void setAssessmentInfo(String assessmentInfo) {
		this.assessmentInfo = assessmentInfo;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerPercentage(String ownerPercentage) {
		this.ownerPercentage = ownerPercentage;
	}

	public void setAssessmentCode(String assessmentCode) {
		this.assessmentCode = assessmentCode;
	}

	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}