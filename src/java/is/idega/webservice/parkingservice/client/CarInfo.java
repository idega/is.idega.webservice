/**
 * CarInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.parkingservice.client;

public class CarInfo  implements java.io.Serializable {
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


    /**
     * Gets the color value for this CarInfo.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this CarInfo.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the firstRegistered value for this CarInfo.
     * 
     * @return firstRegistered
     */
    public java.lang.String getFirstRegistered() {
        return firstRegistered;
    }


    /**
     * Sets the firstRegistered value for this CarInfo.
     * 
     * @param firstRegistered
     */
    public void setFirstRegistered(java.lang.String firstRegistered) {
        this.firstRegistered = firstRegistered;
    }


    /**
     * Gets the fixedNumber value for this CarInfo.
     * 
     * @return fixedNumber
     */
    public java.lang.String getFixedNumber() {
        return fixedNumber;
    }


    /**
     * Sets the fixedNumber value for this CarInfo.
     * 
     * @param fixedNumber
     */
    public void setFixedNumber(java.lang.String fixedNumber) {
        this.fixedNumber = fixedNumber;
    }


    /**
     * Gets the number value for this CarInfo.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CarInfo.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the subType value for this CarInfo.
     * 
     * @return subType
     */
    public java.lang.String getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this CarInfo.
     * 
     * @param subType
     */
    public void setSubType(java.lang.String subType) {
        this.subType = subType;
    }


    /**
     * Gets the type value for this CarInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CarInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarInfo)) return false;
        CarInfo other = (CarInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.firstRegistered==null && other.getFirstRegistered()==null) || 
             (this.firstRegistered!=null &&
              this.firstRegistered.equals(other.getFirstRegistered()))) &&
            ((this.fixedNumber==null && other.getFixedNumber()==null) || 
             (this.fixedNumber!=null &&
              this.fixedNumber.equals(other.getFixedNumber()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getFirstRegistered() != null) {
            _hashCode += getFirstRegistered().hashCode();
        }
        if (getFixedNumber() != null) {
            _hashCode += getFixedNumber().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "CarInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstRegistered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "firstRegistered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "fixedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "subType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
