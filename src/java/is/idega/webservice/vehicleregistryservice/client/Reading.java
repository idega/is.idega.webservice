/**
 * Reading.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class Reading  implements java.io.Serializable {
    private java.lang.String readingDate;

    private java.lang.String gaugeStatus;

    private java.lang.String rateClass;

    private java.lang.String carriageWeight;

    private java.lang.String multipleCarriageWeight;

    private java.lang.String origin;

    private java.lang.String readingType;

    private java.lang.String brst;

    private java.lang.String gaugeNumber;

    private java.lang.String usageGroup;

    private java.lang.String taxGroup;

    public Reading() {
    }

    public Reading(
           java.lang.String readingDate,
           java.lang.String gaugeStatus,
           java.lang.String rateClass,
           java.lang.String carriageWeight,
           java.lang.String multipleCarriageWeight,
           java.lang.String origin,
           java.lang.String readingType,
           java.lang.String brst,
           java.lang.String gaugeNumber,
           java.lang.String usageGroup,
           java.lang.String taxGroup) {
           this.readingDate = readingDate;
           this.gaugeStatus = gaugeStatus;
           this.rateClass = rateClass;
           this.carriageWeight = carriageWeight;
           this.multipleCarriageWeight = multipleCarriageWeight;
           this.origin = origin;
           this.readingType = readingType;
           this.brst = brst;
           this.gaugeNumber = gaugeNumber;
           this.usageGroup = usageGroup;
           this.taxGroup = taxGroup;
    }


    /**
     * Gets the readingDate value for this Reading.
     * 
     * @return readingDate
     */
    public java.lang.String getReadingDate() {
        return readingDate;
    }


    /**
     * Sets the readingDate value for this Reading.
     * 
     * @param readingDate
     */
    public void setReadingDate(java.lang.String readingDate) {
        this.readingDate = readingDate;
    }


    /**
     * Gets the gaugeStatus value for this Reading.
     * 
     * @return gaugeStatus
     */
    public java.lang.String getGaugeStatus() {
        return gaugeStatus;
    }


    /**
     * Sets the gaugeStatus value for this Reading.
     * 
     * @param gaugeStatus
     */
    public void setGaugeStatus(java.lang.String gaugeStatus) {
        this.gaugeStatus = gaugeStatus;
    }


    /**
     * Gets the rateClass value for this Reading.
     * 
     * @return rateClass
     */
    public java.lang.String getRateClass() {
        return rateClass;
    }


    /**
     * Sets the rateClass value for this Reading.
     * 
     * @param rateClass
     */
    public void setRateClass(java.lang.String rateClass) {
        this.rateClass = rateClass;
    }


    /**
     * Gets the carriageWeight value for this Reading.
     * 
     * @return carriageWeight
     */
    public java.lang.String getCarriageWeight() {
        return carriageWeight;
    }


    /**
     * Sets the carriageWeight value for this Reading.
     * 
     * @param carriageWeight
     */
    public void setCarriageWeight(java.lang.String carriageWeight) {
        this.carriageWeight = carriageWeight;
    }


    /**
     * Gets the multipleCarriageWeight value for this Reading.
     * 
     * @return multipleCarriageWeight
     */
    public java.lang.String getMultipleCarriageWeight() {
        return multipleCarriageWeight;
    }


    /**
     * Sets the multipleCarriageWeight value for this Reading.
     * 
     * @param multipleCarriageWeight
     */
    public void setMultipleCarriageWeight(java.lang.String multipleCarriageWeight) {
        this.multipleCarriageWeight = multipleCarriageWeight;
    }


    /**
     * Gets the origin value for this Reading.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this Reading.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the readingType value for this Reading.
     * 
     * @return readingType
     */
    public java.lang.String getReadingType() {
        return readingType;
    }


    /**
     * Sets the readingType value for this Reading.
     * 
     * @param readingType
     */
    public void setReadingType(java.lang.String readingType) {
        this.readingType = readingType;
    }


    /**
     * Gets the brst value for this Reading.
     * 
     * @return brst
     */
    public java.lang.String getBrst() {
        return brst;
    }


    /**
     * Sets the brst value for this Reading.
     * 
     * @param brst
     */
    public void setBrst(java.lang.String brst) {
        this.brst = brst;
    }


    /**
     * Gets the gaugeNumber value for this Reading.
     * 
     * @return gaugeNumber
     */
    public java.lang.String getGaugeNumber() {
        return gaugeNumber;
    }


    /**
     * Sets the gaugeNumber value for this Reading.
     * 
     * @param gaugeNumber
     */
    public void setGaugeNumber(java.lang.String gaugeNumber) {
        this.gaugeNumber = gaugeNumber;
    }


    /**
     * Gets the usageGroup value for this Reading.
     * 
     * @return usageGroup
     */
    public java.lang.String getUsageGroup() {
        return usageGroup;
    }


    /**
     * Sets the usageGroup value for this Reading.
     * 
     * @param usageGroup
     */
    public void setUsageGroup(java.lang.String usageGroup) {
        this.usageGroup = usageGroup;
    }


    /**
     * Gets the taxGroup value for this Reading.
     * 
     * @return taxGroup
     */
    public java.lang.String getTaxGroup() {
        return taxGroup;
    }


    /**
     * Sets the taxGroup value for this Reading.
     * 
     * @param taxGroup
     */
    public void setTaxGroup(java.lang.String taxGroup) {
        this.taxGroup = taxGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reading)) return false;
        Reading other = (Reading) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readingDate==null && other.getReadingDate()==null) || 
             (this.readingDate!=null &&
              this.readingDate.equals(other.getReadingDate()))) &&
            ((this.gaugeStatus==null && other.getGaugeStatus()==null) || 
             (this.gaugeStatus!=null &&
              this.gaugeStatus.equals(other.getGaugeStatus()))) &&
            ((this.rateClass==null && other.getRateClass()==null) || 
             (this.rateClass!=null &&
              this.rateClass.equals(other.getRateClass()))) &&
            ((this.carriageWeight==null && other.getCarriageWeight()==null) || 
             (this.carriageWeight!=null &&
              this.carriageWeight.equals(other.getCarriageWeight()))) &&
            ((this.multipleCarriageWeight==null && other.getMultipleCarriageWeight()==null) || 
             (this.multipleCarriageWeight!=null &&
              this.multipleCarriageWeight.equals(other.getMultipleCarriageWeight()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.readingType==null && other.getReadingType()==null) || 
             (this.readingType!=null &&
              this.readingType.equals(other.getReadingType()))) &&
            ((this.brst==null && other.getBrst()==null) || 
             (this.brst!=null &&
              this.brst.equals(other.getBrst()))) &&
            ((this.gaugeNumber==null && other.getGaugeNumber()==null) || 
             (this.gaugeNumber!=null &&
              this.gaugeNumber.equals(other.getGaugeNumber()))) &&
            ((this.usageGroup==null && other.getUsageGroup()==null) || 
             (this.usageGroup!=null &&
              this.usageGroup.equals(other.getUsageGroup()))) &&
            ((this.taxGroup==null && other.getTaxGroup()==null) || 
             (this.taxGroup!=null &&
              this.taxGroup.equals(other.getTaxGroup())));
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
        if (getReadingDate() != null) {
            _hashCode += getReadingDate().hashCode();
        }
        if (getGaugeStatus() != null) {
            _hashCode += getGaugeStatus().hashCode();
        }
        if (getRateClass() != null) {
            _hashCode += getRateClass().hashCode();
        }
        if (getCarriageWeight() != null) {
            _hashCode += getCarriageWeight().hashCode();
        }
        if (getMultipleCarriageWeight() != null) {
            _hashCode += getMultipleCarriageWeight().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getReadingType() != null) {
            _hashCode += getReadingType().hashCode();
        }
        if (getBrst() != null) {
            _hashCode += getBrst().hashCode();
        }
        if (getGaugeNumber() != null) {
            _hashCode += getGaugeNumber().hashCode();
        }
        if (getUsageGroup() != null) {
            _hashCode += getUsageGroup().hashCode();
        }
        if (getTaxGroup() != null) {
            _hashCode += getTaxGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reading.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reading"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ReadingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gaugeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "GaugeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateClass");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "RateClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carriageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CarriageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleCarriageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "MultipleCarriageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ReadingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brst");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Brst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gaugeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "GaugeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "UsageGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TaxGroup"));
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
