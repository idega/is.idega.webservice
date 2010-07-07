/**
 * TotalStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class TotalStatus  implements java.io.Serializable {
    private is.idega.webservice.vehicleregistryservice.client.AutomobileTaxClass automobileTaxes;

    public TotalStatus() {
    }

    public TotalStatus(
           is.idega.webservice.vehicleregistryservice.client.AutomobileTaxClass automobileTaxes) {
           this.automobileTaxes = automobileTaxes;
    }


    /**
     * Gets the automobileTaxes value for this TotalStatus.
     * 
     * @return automobileTaxes
     */
    public is.idega.webservice.vehicleregistryservice.client.AutomobileTaxClass getAutomobileTaxes() {
        return automobileTaxes;
    }


    /**
     * Sets the automobileTaxes value for this TotalStatus.
     * 
     * @param automobileTaxes
     */
    public void setAutomobileTaxes(is.idega.webservice.vehicleregistryservice.client.AutomobileTaxClass automobileTaxes) {
        this.automobileTaxes = automobileTaxes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TotalStatus)) return false;
        TotalStatus other = (TotalStatus) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.automobileTaxes==null && other.getAutomobileTaxes()==null) || 
             (this.automobileTaxes!=null &&
              this.automobileTaxes.equals(other.getAutomobileTaxes())));
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
        if (getAutomobileTaxes() != null) {
            _hashCode += getAutomobileTaxes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TotalStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TotalStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automobileTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AutomobileTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AutomobileTaxClass"));
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
