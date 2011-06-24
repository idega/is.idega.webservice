/**
 * Tyre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class Tyre  implements java.io.Serializable {
    private is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject extensionData;

    private java.lang.String[] tyreaxle;

    public Tyre() {
    }

    public Tyre(
           is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject extensionData,
           java.lang.String[] tyreaxle) {
           this.extensionData = extensionData;
           this.tyreaxle = tyreaxle;
    }


    /**
     * Gets the extensionData value for this Tyre.
     * 
     * @return extensionData
     */
    public is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Tyre.
     * 
     * @param extensionData
     */
    public void setExtensionData(is.idega.webservice.vehicleregistryservice.client.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the tyreaxle value for this Tyre.
     * 
     * @return tyreaxle
     */
    public java.lang.String[] getTyreaxle() {
        return tyreaxle;
    }


    /**
     * Sets the tyreaxle value for this Tyre.
     * 
     * @param tyreaxle
     */
    public void setTyreaxle(java.lang.String[] tyreaxle) {
        this.tyreaxle = tyreaxle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tyre)) return false;
        Tyre other = (Tyre) obj;
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
            ((this.tyreaxle==null && other.getTyreaxle()==null) || 
             (this.tyreaxle!=null &&
              java.util.Arrays.equals(this.tyreaxle, other.getTyreaxle())));
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
        if (getTyreaxle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTyreaxle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTyreaxle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tyre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Tyre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tyreaxle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Tyreaxle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "string"));
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
