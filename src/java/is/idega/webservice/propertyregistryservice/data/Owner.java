package is.idega.webservice.propertyregistryservice.data;

public class Owner {

	private String id = null;
	private String lastChanged = null;
	private String changedBy = null;
	private String status = null;
	private String code = null;
	private String assessmentYear = null;
	private String fnr = null;
	private String ownerNumber = null;
	private String ssn = null;
	private String name = null;
	private String ownerPercentage = null;
	private String paymentPercentage = null;
	private String dateBought = null;
	private String dateDelivered = null;

	public Owner() {
	}

	public Owner(String id, String lastChanged, String changedBy, String status, String code, String assessmentYear, String fnr, String ownerNumber, String ssn, String name, String ownerPercentage, String paymentPercentage, String dateBought, String dateDelivered) {
		this.id = id;
		this.lastChanged = lastChanged;
		this.changedBy = changedBy;
		this.status = status;
		this.code = code;
		this.assessmentYear = assessmentYear;
		this.fnr = fnr;
		this.ownerNumber = ownerNumber;
		this.ssn = ssn;
		this.name = name;
		this.ownerPercentage = ownerPercentage;
		this.paymentPercentage = paymentPercentage;
		this.dateBought = dateBought;
		this.dateDelivered = dateDelivered;
	}

	//getters
	public String getID() {
		return this.id;
	}

	public String getLastChanged() {
		return this.lastChanged;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public String getStatus() {
		return this.status;
	}

	public String getCode() {
		return this.code;
	}

	public String getAssessmentYear() {
		return this.assessmentYear;
	}

	public String getFNR() {
		return this.fnr;
	}

	public String getOwnerNumber() {
		return this.ownerNumber;
	}

	public String getSSN() {
		return this.ssn;
	}

	public String getName() {
		return this.name;
	}

	public String getOwnerPercentage() {
		return this.ownerPercentage;
	}

	public String getPaymentPercentage() {
		return this.paymentPercentage;
	}

	public String getDateBought() {
		return this.dateBought;
	}

	public String getDateDelivered() {
		return this.dateDelivered;
	}

	//Setters
	public void setID(String id) {
		this.id = id;
	}

	public void setLastChanged(String lastChanged) {
		this.lastChanged = lastChanged;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setAssessmentYear(String year) {
		this.assessmentYear = year;
	}

	public void setFNR(String fnr) {
		this.fnr = fnr;
	}

	public void setOwnerNumber(String ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerPercentage(String ownerPercentage) {
		this.ownerPercentage = ownerPercentage;
	}

	public void setPaymentPercentage(String paymentPercentage) {
		this.paymentPercentage = paymentPercentage;
	}

	public void setDateBought(String dateBought) {
		this.dateBought = dateBought;
	}

	public void setDateDelivered(String dateDelivered) {
		this.dateDelivered = dateDelivered;
	}
}