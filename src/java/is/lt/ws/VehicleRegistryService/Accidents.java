/**
 * Accidents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

public class Accidents  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String accidentsFromDate;

    private java.lang.String accidentsToDate;

    private java.lang.String permno;

    private is.lt.ws.VehicleRegistryService.Accident[] accident;

    public Accidents() {
    }

    public Accidents(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String accidentsFromDate,
           java.lang.String accidentsToDate,
           java.lang.String permno,
           is.lt.ws.VehicleRegistryService.Accident[] accident) {
           this.extensionData = extensionData;
           this.accidentsFromDate = accidentsFromDate;
           this.accidentsToDate = accidentsToDate;
           this.permno = permno;
           this.accident = accident;
    }


    /**
     * Gets the extensionData value for this Accidents.
     * 
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Accidents.
     * 
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the accidentsFromDate value for this Accidents.
     * 
     * @return accidentsFromDate
     */
    public java.lang.String getAccidentsFromDate() {
        return accidentsFromDate;
    }


    /**
     * Sets the accidentsFromDate value for this Accidents.
     * 
     * @param accidentsFromDate
     */
    public void setAccidentsFromDate(java.lang.String accidentsFromDate) {
        this.accidentsFromDate = accidentsFromDate;
    }


    /**
     * Gets the accidentsToDate value for this Accidents.
     * 
     * @return accidentsToDate
     */
    public java.lang.String getAccidentsToDate() {
        return accidentsToDate;
    }


    /**
     * Sets the accidentsToDate value for this Accidents.
     * 
     * @param accidentsToDate
     */
    public void setAccidentsToDate(java.lang.String accidentsToDate) {
        this.accidentsToDate = accidentsToDate;
    }


    /**
     * Gets the permno value for this Accidents.
     * 
     * @return permno
     */
    public java.lang.String getPermno() {
        return permno;
    }


    /**
     * Sets the permno value for this Accidents.
     * 
     * @param permno
     */
    public void setPermno(java.lang.String permno) {
        this.permno = permno;
    }


    /**
     * Gets the accident value for this Accidents.
     * 
     * @return accident
     */
    public is.lt.ws.VehicleRegistryService.Accident[] getAccident() {
        return accident;
    }


    /**
     * Sets the accident value for this Accidents.
     * 
     * @param accident
     */
    public void setAccident(is.lt.ws.VehicleRegistryService.Accident[] accident) {
        this.accident = accident;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Accidents)) return false;
        Accidents other = (Accidents) obj;
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
            ((this.accidentsFromDate==null && other.getAccidentsFromDate()==null) || 
             (this.accidentsFromDate!=null &&
              this.accidentsFromDate.equals(other.getAccidentsFromDate()))) &&
            ((this.accidentsToDate==null && other.getAccidentsToDate()==null) || 
             (this.accidentsToDate!=null &&
              this.accidentsToDate.equals(other.getAccidentsToDate()))) &&
            ((this.permno==null && other.getPermno()==null) || 
             (this.permno!=null &&
              this.permno.equals(other.getPermno()))) &&
            ((this.accident==null && other.getAccident()==null) || 
             (this.accident!=null &&
              java.util.Arrays.equals(this.accident, other.getAccident())));
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
        if (getAccidentsFromDate() != null) {
            _hashCode += getAccidentsFromDate().hashCode();
        }
        if (getAccidentsToDate() != null) {
            _hashCode += getAccidentsToDate().hashCode();
        }
        if (getPermno() != null) {
            _hashCode += getPermno().hashCode();
        }
        if (getAccident() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccident());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccident(), i);
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
        new org.apache.axis.description.TypeDesc(Accidents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accidents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accidentsFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentsFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accidentsToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentsToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permno");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Permno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accident");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accident"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accident"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accident"));
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
