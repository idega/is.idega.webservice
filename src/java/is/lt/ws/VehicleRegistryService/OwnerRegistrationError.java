/**
 * OwnerRegistrationError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OwnerRegistrationError  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String purchaseDate;

    private java.lang.String persidno;

    private java.lang.String ownerinsurancecode;

    public OwnerRegistrationError() {
    }

    public OwnerRegistrationError(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String purchaseDate,
           java.lang.String persidno,
           java.lang.String ownerinsurancecode) {
           this.extensionData = extensionData;
           this.purchaseDate = purchaseDate;
           this.persidno = persidno;
           this.ownerinsurancecode = ownerinsurancecode;
    }


    /**
     * Gets the extensionData value for this OwnerRegistrationError.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this OwnerRegistrationError.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the purchaseDate value for this OwnerRegistrationError.
     *
     * @return purchaseDate
     */
    public java.lang.String getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this OwnerRegistrationError.
     *
     * @param purchaseDate
     */
    public void setPurchaseDate(java.lang.String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the persidno value for this OwnerRegistrationError.
     *
     * @return persidno
     */
    public java.lang.String getPersidno() {
        return persidno;
    }


    /**
     * Sets the persidno value for this OwnerRegistrationError.
     *
     * @param persidno
     */
    public void setPersidno(java.lang.String persidno) {
        this.persidno = persidno;
    }


    /**
     * Gets the ownerinsurancecode value for this OwnerRegistrationError.
     *
     * @return ownerinsurancecode
     */
    public java.lang.String getOwnerinsurancecode() {
        return ownerinsurancecode;
    }


    /**
     * Sets the ownerinsurancecode value for this OwnerRegistrationError.
     *
     * @param ownerinsurancecode
     */
    public void setOwnerinsurancecode(java.lang.String ownerinsurancecode) {
        this.ownerinsurancecode = ownerinsurancecode;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OwnerRegistrationError)) return false;
        OwnerRegistrationError other = (OwnerRegistrationError) obj;
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
            ((this.purchaseDate==null && other.getPurchaseDate()==null) ||
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate()))) &&
            ((this.persidno==null && other.getPersidno()==null) ||
             (this.persidno!=null &&
              this.persidno.equals(other.getPersidno()))) &&
            ((this.ownerinsurancecode==null && other.getOwnerinsurancecode()==null) ||
             (this.ownerinsurancecode!=null &&
              this.ownerinsurancecode.equals(other.getOwnerinsurancecode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExtensionData() != null) {
            _hashCode += getExtensionData().hashCode();
        }
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        if (getPersidno() != null) {
            _hashCode += getPersidno().hashCode();
        }
        if (getOwnerinsurancecode() != null) {
            _hashCode += getOwnerinsurancecode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OwnerRegistrationError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnerRegistrationError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PurchaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persidno");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Persidno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerinsurancecode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Ownerinsurancecode"));
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
