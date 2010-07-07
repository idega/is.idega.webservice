/**
 * InspectionRemark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class InspectionRemark  implements java.io.Serializable {
    private java.lang.String itemcode;

    private java.lang.String itemname;

    private java.lang.String resultcode;

    private java.lang.String resultname;

    public InspectionRemark() {
    }

    public InspectionRemark(
           java.lang.String itemcode,
           java.lang.String itemname,
           java.lang.String resultcode,
           java.lang.String resultname) {
           this.itemcode = itemcode;
           this.itemname = itemname;
           this.resultcode = resultcode;
           this.resultname = resultname;
    }


    /**
     * Gets the itemcode value for this InspectionRemark.
     * 
     * @return itemcode
     */
    public java.lang.String getItemcode() {
        return itemcode;
    }


    /**
     * Sets the itemcode value for this InspectionRemark.
     * 
     * @param itemcode
     */
    public void setItemcode(java.lang.String itemcode) {
        this.itemcode = itemcode;
    }


    /**
     * Gets the itemname value for this InspectionRemark.
     * 
     * @return itemname
     */
    public java.lang.String getItemname() {
        return itemname;
    }


    /**
     * Sets the itemname value for this InspectionRemark.
     * 
     * @param itemname
     */
    public void setItemname(java.lang.String itemname) {
        this.itemname = itemname;
    }


    /**
     * Gets the resultcode value for this InspectionRemark.
     * 
     * @return resultcode
     */
    public java.lang.String getResultcode() {
        return resultcode;
    }


    /**
     * Sets the resultcode value for this InspectionRemark.
     * 
     * @param resultcode
     */
    public void setResultcode(java.lang.String resultcode) {
        this.resultcode = resultcode;
    }


    /**
     * Gets the resultname value for this InspectionRemark.
     * 
     * @return resultname
     */
    public java.lang.String getResultname() {
        return resultname;
    }


    /**
     * Sets the resultname value for this InspectionRemark.
     * 
     * @param resultname
     */
    public void setResultname(java.lang.String resultname) {
        this.resultname = resultname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InspectionRemark)) return false;
        InspectionRemark other = (InspectionRemark) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemcode==null && other.getItemcode()==null) || 
             (this.itemcode!=null &&
              this.itemcode.equals(other.getItemcode()))) &&
            ((this.itemname==null && other.getItemname()==null) || 
             (this.itemname!=null &&
              this.itemname.equals(other.getItemname()))) &&
            ((this.resultcode==null && other.getResultcode()==null) || 
             (this.resultcode!=null &&
              this.resultcode.equals(other.getResultcode()))) &&
            ((this.resultname==null && other.getResultname()==null) || 
             (this.resultname!=null &&
              this.resultname.equals(other.getResultname())));
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
        if (getItemcode() != null) {
            _hashCode += getItemcode().hashCode();
        }
        if (getItemname() != null) {
            _hashCode += getItemname().hashCode();
        }
        if (getResultcode() != null) {
            _hashCode += getResultcode().hashCode();
        }
        if (getResultname() != null) {
            _hashCode += getResultname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InspectionRemark.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InspectionRemark"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemcode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Itemcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemname");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Itemname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultcode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Resultcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultname");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Resultname"));
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
