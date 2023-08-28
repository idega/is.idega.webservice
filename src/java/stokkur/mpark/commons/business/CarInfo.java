package stokkur.mpark.commons.business;

import java.io.Serializable;

public class CarInfo implements Serializable {

	private static final long serialVersionUID = -4231559855532699095L;

	private java.lang.String color;

    private java.lang.String firstRegistered;

    private java.lang.String fixedNumber;

    private java.lang.String number;

    private java.lang.String subType;

    private java.lang.String type;

    public CarInfo() {
    }

    public CarInfo(
           java.lang.String color,
           java.lang.String firstRegistered,
           java.lang.String fixedNumber,
           java.lang.String number,
           java.lang.String subType,
           java.lang.String type) {
           this.color = color;
           this.firstRegistered = firstRegistered;
           this.fixedNumber = fixedNumber;
           this.number = number;
           this.subType = subType;
           this.type = type;
    }

	public java.lang.String getColor() {
		return color;
	}

	public void setColor(java.lang.String color) {
		this.color = color;
	}

	public java.lang.String getFirstRegistered() {
		return firstRegistered;
	}

	public void setFirstRegistered(java.lang.String firstRegistered) {
		this.firstRegistered = firstRegistered;
	}

	public java.lang.String getFixedNumber() {
		return fixedNumber;
	}

	public void setFixedNumber(java.lang.String fixedNumber) {
		this.fixedNumber = fixedNumber;
	}

	public java.lang.String getNumber() {
		return number;
	}

	public void setNumber(java.lang.String number) {
		this.number = number;
	}

	public java.lang.String getSubType() {
		return subType;
	}

	public void setSubType(java.lang.String subType) {
		this.subType = subType;
	}

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

}