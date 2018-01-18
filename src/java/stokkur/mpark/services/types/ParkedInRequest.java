/**
 * ParkedInRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package stokkur.mpark.services.types;

public class ParkedInRequest  implements java.io.Serializable {
    private java.lang.String carNumber;

    private java.lang.String enquirer;

    public ParkedInRequest() {
    }

    public ParkedInRequest(
           java.lang.String carNumber,
           java.lang.String enquirer) {
           this.carNumber = carNumber;
           this.enquirer = enquirer;
    }


    /**
     * Gets the carNumber value for this ParkedInRequest.
     * 
     * @return carNumber
     */
    public java.lang.String getCarNumber() {
        return carNumber;
    }


    /**
     * Sets the carNumber value for this ParkedInRequest.
     * 
     * @param carNumber
     */
    public void setCarNumber(java.lang.String carNumber) {
        this.carNumber = carNumber;
    }


    /**
     * Gets the enquirer value for this ParkedInRequest.
     * 
     * @return enquirer
     */
    public java.lang.String getEnquirer() {
        return enquirer;
    }


    /**
     * Sets the enquirer value for this ParkedInRequest.
     * 
     * @param enquirer
     */
    public void setEnquirer(java.lang.String enquirer) {
        this.enquirer = enquirer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParkedInRequest)) return false;
        ParkedInRequest other = (ParkedInRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carNumber==null && other.getCarNumber()==null) || 
             (this.carNumber!=null &&
              this.carNumber.equals(other.getCarNumber()))) &&
            ((this.enquirer==null && other.getEnquirer()==null) || 
             (this.enquirer!=null &&
              this.enquirer.equals(other.getEnquirer())));
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
        if (getCarNumber() != null) {
            _hashCode += getCarNumber().hashCode();
        }
        if (getEnquirer() != null) {
            _hashCode += getEnquirer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParkedInRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "ParkedInRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "carNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquirer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "enquirer"));
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
