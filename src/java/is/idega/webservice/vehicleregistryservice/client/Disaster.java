/**
 * Disaster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class Disaster  implements java.io.Serializable {
    private is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject extensionData;

    private java.lang.String date;

    private java.lang.String invalidDate;

    private java.lang.String type;

    public Disaster() {
    }

    public Disaster(
           is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject extensionData,
           java.lang.String date,
           java.lang.String invalidDate,
           java.lang.String type) {
           this.extensionData = extensionData;
           this.date = date;
           this.invalidDate = invalidDate;
           this.type = type;
    }


    /**
     * Gets the extensionData value for this Disaster.
     * 
     * @return extensionData
     */
    public is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Disaster.
     * 
     * @param extensionData
     */
    public void setExtensionData(is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the date value for this Disaster.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Disaster.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the invalidDate value for this Disaster.
     * 
     * @return invalidDate
     */
    public java.lang.String getInvalidDate() {
        return invalidDate;
    }


    /**
     * Sets the invalidDate value for this Disaster.
     * 
     * @param invalidDate
     */
    public void setInvalidDate(java.lang.String invalidDate) {
        this.invalidDate = invalidDate;
    }


    /**
     * Gets the type value for this Disaster.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Disaster.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Disaster)) return false;
        Disaster other = (Disaster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionData==null && other.getExtensionData()==null) || 
             (this.extensionData!=null &&
              this.extensionData.equals(other.getExtensionData()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.invalidDate==null && other.getInvalidDate()==null) || 
             (this.invalidDate!=null &&
              this.invalidDate.equals(other.getInvalidDate()))) &&
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
        if (getExtensionData() != null) {
            _hashCode += getExtensionData().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getInvalidDate() != null) {
            _hashCode += getInvalidDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Disaster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disaster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InvalidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
