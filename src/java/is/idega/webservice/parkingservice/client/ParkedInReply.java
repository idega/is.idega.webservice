/**
 * ParkedInReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.parkingservice.client;

public class ParkedInReply  implements java.io.Serializable {
    private is.idega.webservice.parkingservice.client.CarInfo carInfo;

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
           is.idega.webservice.parkingservice.client.CarInfo carInfo,
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


    /**
     * Gets the carInfo value for this ParkedInReply.
     * 
     * @return carInfo
     */
    public is.idega.webservice.parkingservice.client.CarInfo getCarInfo() {
        return carInfo;
    }


    /**
     * Sets the carInfo value for this ParkedInReply.
     * 
     * @param carInfo
     */
    public void setCarInfo(is.idega.webservice.parkingservice.client.CarInfo carInfo) {
        this.carInfo = carInfo;
    }


    /**
     * Gets the carNumber value for this ParkedInReply.
     * 
     * @return carNumber
     */
    public java.lang.String getCarNumber() {
        return carNumber;
    }


    /**
     * Sets the carNumber value for this ParkedInReply.
     * 
     * @param carNumber
     */
    public void setCarNumber(java.lang.String carNumber) {
        this.carNumber = carNumber;
    }


    /**
     * Gets the code value for this ParkedInReply.
     * 
     * @return code
     */
    public java.lang.Integer getCode() {
        return code;
    }


    /**
     * Sets the code value for this ParkedInReply.
     * 
     * @param code
     */
    public void setCode(java.lang.Integer code) {
        this.code = code;
    }


    /**
     * Gets the inDate value for this ParkedInReply.
     * 
     * @return inDate
     */
    public java.lang.String getInDate() {
        return inDate;
    }


    /**
     * Sets the inDate value for this ParkedInReply.
     * 
     * @param inDate
     */
    public void setInDate(java.lang.String inDate) {
        this.inDate = inDate;
    }


    /**
     * Gets the message value for this ParkedInReply.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ParkedInReply.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the msisdn value for this ParkedInReply.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ParkedInReply.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the parkedIn value for this ParkedInReply.
     * 
     * @return parkedIn
     */
    public java.lang.Boolean getParkedIn() {
        return parkedIn;
    }


    /**
     * Sets the parkedIn value for this ParkedInReply.
     * 
     * @param parkedIn
     */
    public void setParkedIn(java.lang.Boolean parkedIn) {
        this.parkedIn = parkedIn;
    }


    /**
     * Gets the zoneNumber value for this ParkedInReply.
     * 
     * @return zoneNumber
     */
    public java.lang.Integer getZoneNumber() {
        return zoneNumber;
    }


    /**
     * Sets the zoneNumber value for this ParkedInReply.
     * 
     * @param zoneNumber
     */
    public void setZoneNumber(java.lang.Integer zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParkedInReply)) return false;
        ParkedInReply other = (ParkedInReply) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carInfo==null && other.getCarInfo()==null) || 
             (this.carInfo!=null &&
              this.carInfo.equals(other.getCarInfo()))) &&
            ((this.carNumber==null && other.getCarNumber()==null) || 
             (this.carNumber!=null &&
              this.carNumber.equals(other.getCarNumber()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.inDate==null && other.getInDate()==null) || 
             (this.inDate!=null &&
              this.inDate.equals(other.getInDate()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.parkedIn==null && other.getParkedIn()==null) || 
             (this.parkedIn!=null &&
              this.parkedIn.equals(other.getParkedIn()))) &&
            ((this.zoneNumber==null && other.getZoneNumber()==null) || 
             (this.zoneNumber!=null &&
              this.zoneNumber.equals(other.getZoneNumber())));
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
        if (getCarInfo() != null) {
            _hashCode += getCarInfo().hashCode();
        }
        if (getCarNumber() != null) {
            _hashCode += getCarNumber().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getInDate() != null) {
            _hashCode += getInDate().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getParkedIn() != null) {
            _hashCode += getParkedIn().hashCode();
        }
        if (getZoneNumber() != null) {
            _hashCode += getZoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParkedInReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "ParkedInReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "carInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://business.commons.mpark.stokkur", "CarInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "carNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "inDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parkedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "parkedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "zoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
