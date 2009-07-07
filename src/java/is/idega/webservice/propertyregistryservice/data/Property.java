package is.idega.webservice.propertyregistryservice.data;

public class Property {
	private String apartmentNumber = null;
	private String nameNumber = null;
	private String fnr = null;
	private String type = null;
		
	public Property() {
	}

	public Property(String fnr, String nameNumber, String apartmentNumber, String type) {
		this.nameNumber = nameNumber;
		this.fnr = fnr;
		this.apartmentNumber = apartmentNumber;
		this.type = type;
	}

	// getters
	public String getFNR() {
		return this.fnr;
	}

	public String getNameNumber() {
		return this.nameNumber;
	}

	public String getApartmentNumber() {
		return this.apartmentNumber;
	}

	public String getType() {
		return this.type;
	}
	
	//setters
	public void setFNR(String fnr) {
		this.fnr = fnr;
	}

	public void setNameNumber(String nameNumber) {
		this.nameNumber = nameNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
