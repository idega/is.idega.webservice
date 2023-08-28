package stokkur.mpark.services.types;

import java.io.Serializable;

public class ParkedInReply implements Serializable {

	private static final long serialVersionUID = 7321254161691211950L;

	private stokkur.mpark.commons.business.CarInfo carInfo;

    private java.lang.String carNumber;

    private java.lang.Integer code;

    private java.lang.String inDate;

    private java.lang.String message;

    private java.lang.String msisdn;

    private java.lang.Boolean parkedIn;

    private java.lang.Integer zoneNumber;

    public ParkedInReply() {
    }

    public ParkedInReply(
           stokkur.mpark.commons.business.CarInfo carInfo,
           java.lang.String carNumber,
           java.lang.Integer code,
           java.lang.String inDate,
           java.lang.String message,
           java.lang.String msisdn,
           java.lang.Boolean parkedIn,
           java.lang.Integer zoneNumber) {
           this.carInfo = carInfo;
           this.carNumber = carNumber;
           this.code = code;
           this.inDate = inDate;
           this.message = message;
           this.msisdn = msisdn;
           this.parkedIn = parkedIn;
           this.zoneNumber = zoneNumber;
    }

    public stokkur.mpark.commons.business.CarInfo getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(stokkur.mpark.commons.business.CarInfo carInfo) {
		this.carInfo = carInfo;
	}

	public java.lang.String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(java.lang.String carNumber) {
		this.carNumber = carNumber;
	}

	public java.lang.Integer getCode() {
		return code;
	}

	public void setCode(java.lang.Integer code) {
		this.code = code;
	}

	public java.lang.String getInDate() {
		return inDate;
	}

	public void setInDate(java.lang.String inDate) {
		this.inDate = inDate;
	}

	public java.lang.String getMessage() {
		return message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(java.lang.String msisdn) {
		this.msisdn = msisdn;
	}

	public java.lang.Boolean getParkedIn() {
		return parkedIn;
	}

	public void setParkedIn(java.lang.Boolean parkedIn) {
		this.parkedIn = parkedIn;
	}

	public java.lang.Integer getZoneNumber() {
		return zoneNumber;
	}

	public void setZoneNumber(java.lang.Integer zoneNumber) {
		this.zoneNumber = zoneNumber;
	}

	@Override
	public String toString() {
    	return "Parking info: car info: " + getCarInfo() + ", car number: " + getCarNumber() + " code: " + getCode() + ", in date: " + getInDate() +
    			", message: " + getMessage() + ", msisdn: " + getMsisdn() + ", parked in: " + getParkedIn() + ", zone number: " + getZoneNumber();
    }

}