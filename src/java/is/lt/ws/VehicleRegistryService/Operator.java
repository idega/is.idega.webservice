/**
 * Operator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Operator  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private boolean current;

    private java.lang.String mainoperator;

    private java.lang.String serial;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String persidno;

    private java.lang.String fullname;

    private java.lang.String address;

    private java.lang.String postalcode;

    private java.lang.String city;

    public Operator() {
    }

    public Operator(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           boolean current,
           java.lang.String mainoperator,
           java.lang.String serial,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String persidno,
           java.lang.String fullname,
           java.lang.String address,
           java.lang.String postalcode,
           java.lang.String city) {
           this.extensionData = extensionData;
           this.current = current;
           this.mainoperator = mainoperator;
           this.serial = serial;
           this.startDate = startDate;
           this.endDate = endDate;
           this.persidno = persidno;
           this.fullname = fullname;
           this.address = address;
           this.postalcode = postalcode;
           this.city = city;
    }


    /**
     * Gets the extensionData value for this Operator.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Operator.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the current value for this Operator.
     *
     * @return current
     */
    public boolean isCurrent() {
        return current;
    }


    /**
     * Sets the current value for this Operator.
     *
     * @param current
     */
    public void setCurrent(boolean current) {
        this.current = current;
    }


    /**
     * Gets the mainoperator value for this Operator.
     *
     * @return mainoperator
     */
    public java.lang.String getMainoperator() {
        return mainoperator;
    }


    /**
     * Sets the mainoperator value for this Operator.
     *
     * @param mainoperator
     */
    public void setMainoperator(java.lang.String mainoperator) {
        this.mainoperator = mainoperator;
    }


    /**
     * Gets the serial value for this Operator.
     *
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this Operator.
     *
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the startDate value for this Operator.
     *
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Operator.
     *
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Operator.
     *
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Operator.
     *
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the persidno value for this Operator.
     *
     * @return persidno
     */
    public java.lang.String getPersidno() {
        return persidno;
    }


    /**
     * Sets the persidno value for this Operator.
     *
     * @param persidno
     */
    public void setPersidno(java.lang.String persidno) {
        this.persidno = persidno;
    }


    /**
     * Gets the fullname value for this Operator.
     *
     * @return fullname
     */
    public java.lang.String getFullname() {
        return fullname;
    }


    /**
     * Sets the fullname value for this Operator.
     *
     * @param fullname
     */
    public void setFullname(java.lang.String fullname) {
        this.fullname = fullname;
    }


    /**
     * Gets the address value for this Operator.
     *
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Operator.
     *
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the postalcode value for this Operator.
     *
     * @return postalcode
     */
    public java.lang.String getPostalcode() {
        return postalcode;
    }


    /**
     * Sets the postalcode value for this Operator.
     *
     * @param postalcode
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }


    /**
     * Gets the city value for this Operator.
     *
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Operator.
     *
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operator)) return false;
        Operator other = (Operator) obj;
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
            this.current == other.isCurrent() &&
            ((this.mainoperator==null && other.getMainoperator()==null) ||
             (this.mainoperator!=null &&
              this.mainoperator.equals(other.getMainoperator()))) &&
            ((this.serial==null && other.getSerial()==null) ||
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.startDate==null && other.getStartDate()==null) ||
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) ||
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.persidno==null && other.getPersidno()==null) ||
             (this.persidno!=null &&
              this.persidno.equals(other.getPersidno()))) &&
            ((this.fullname==null && other.getFullname()==null) ||
             (this.fullname!=null &&
              this.fullname.equals(other.getFullname()))) &&
            ((this.address==null && other.getAddress()==null) ||
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.postalcode==null && other.getPostalcode()==null) ||
             (this.postalcode!=null &&
              this.postalcode.equals(other.getPostalcode()))) &&
            ((this.city==null && other.getCity()==null) ||
             (this.city!=null &&
              this.city.equals(other.getCity())));
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
        _hashCode += (isCurrent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMainoperator() != null) {
            _hashCode += getMainoperator().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPersidno() != null) {
            _hashCode += getPersidno().hashCode();
        }
        if (getFullname() != null) {
            _hashCode += getFullname().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPostalcode() != null) {
            _hashCode += getPostalcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Operator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainoperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Mainoperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EndDate"));
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
        elemField.setFieldName("fullname");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Fullname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalcode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Postalcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "City"));
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
