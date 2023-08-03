package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;

import com.idega.util.StringUtil;

public class Operator implements Serializable {

	private static final long serialVersionUID = 9104175368081717183L;

	public ExtensionData ExtensionData;
	public String Current;
	public String Mainoperator;
	public String Serial;
	public String StartDate;
	public String EndDate;
	public String Persidno;
	public String Fullname;
	public String Address;
	public String Postalcode;
	public String City;

	public Operator() {
		super();
	}

	public Operator(String current, String persIdNo, String fullName) {
		this();

		Current = current;
		Persidno = persIdNo;
		Fullname = fullName;
	}

	public Operator(
			Object extensionData,
			boolean current,
			String mainoperator,
			String serial,
			String startDate,
			String endDate,
			String persidno,
			String fullname,
			String address,
			String postalcode,
			String city
	) {
		this();

		Current = String.valueOf(current);
		Mainoperator = mainoperator;
		Serial = serial;
		StartDate = startDate;
		EndDate = endDate;
		Persidno = persidno;
		Fullname = fullname;
		Address = address;
		Postalcode = postalcode;
		City = city;
	}

	public ExtensionData getExtensionData() {
		return ExtensionData;
	}
	public void setExtensionData(ExtensionData extensionData) {
		ExtensionData = extensionData;
	}
	public String getCurrent() {
		return Current;
	}
	public boolean isCurrent() {
		return StringUtil.isEmpty(Current) ? Boolean.FALSE : Boolean.valueOf(Current) || "1".equals(Current);
	}
	public void setCurrent(Boolean current) {
		if (current != null) {
			Current = String.valueOf(current);
		}
	}
	public void setCurrent(String current) {
		Current = current;
	}
	public String getMainoperator() {
		return Mainoperator;
	}
	public void setMainoperator(String mainoperator) {
		Mainoperator = mainoperator;
	}
	public String getSerial() {
		return Serial;
	}
	public void setSerial(String serial) {
		Serial = serial;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getPersidno() {
		return Persidno;
	}
	public void setPersidno(String persidno) {
		Persidno = persidno;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPostalcode() {
		return Postalcode;
	}
	public void setPostalcode(String postalcode) {
		Postalcode = postalcode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

}