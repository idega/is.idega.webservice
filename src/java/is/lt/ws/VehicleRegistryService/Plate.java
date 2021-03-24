/**
 * Plate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Plate  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String date;

    private java.lang.String regno;

    private java.lang.String reggroup;

    private java.lang.String reggroupname;

    public Plate() {
    }

    public Plate(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String date,
           java.lang.String regno,
           java.lang.String reggroup,
           java.lang.String reggroupname) {
           this.extensionData = extensionData;
           this.date = date;
           this.regno = regno;
           this.reggroup = reggroup;
           this.reggroupname = reggroupname;
    }


    /**
     * Gets the extensionData value for this Plate.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Plate.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the date value for this Plate.
     *
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Plate.
     *
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the regno value for this Plate.
     *
     * @return regno
     */
    public java.lang.String getRegno() {
        return regno;
    }


    /**
     * Sets the regno value for this Plate.
     *
     * @param regno
     */
    public void setRegno(java.lang.String regno) {
        this.regno = regno;
    }


    /**
     * Gets the reggroup value for this Plate.
     *
     * @return reggroup
     */
    public java.lang.String getReggroup() {
        return reggroup;
    }


    /**
     * Sets the reggroup value for this Plate.
     *
     * @param reggroup
     */
    public void setReggroup(java.lang.String reggroup) {
        this.reggroup = reggroup;
    }


    /**
     * Gets the reggroupname value for this Plate.
     *
     * @return reggroupname
     */
    public java.lang.String getReggroupname() {
        return reggroupname;
    }


    /**
     * Sets the reggroupname value for this Plate.
     *
     * @param reggroupname
     */
    public void setReggroupname(java.lang.String reggroupname) {
        this.reggroupname = reggroupname;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Plate)) return false;
        Plate other = (Plate) obj;
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
            ((this.regno==null && other.getRegno()==null) ||
             (this.regno!=null &&
              this.regno.equals(other.getRegno()))) &&
            ((this.reggroup==null && other.getReggroup()==null) ||
             (this.reggroup!=null &&
              this.reggroup.equals(other.getReggroup()))) &&
            ((this.reggroupname==null && other.getReggroupname()==null) ||
             (this.reggroupname!=null &&
              this.reggroupname.equals(other.getReggroupname())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getRegno() != null) {
            _hashCode += getRegno().hashCode();
        }
        if (getReggroup() != null) {
            _hashCode += getReggroup().hashCode();
        }
        if (getReggroupname() != null) {
            _hashCode += getReggroupname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Plate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Plate"));
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
        elemField.setFieldName("regno");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Regno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reggroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reggroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reggroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reggroupname"));
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
