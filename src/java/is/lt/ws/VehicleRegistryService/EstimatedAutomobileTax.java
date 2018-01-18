/**
 * EstimatedAutomobileTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

public class EstimatedAutomobileTax  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String term_1;

    private java.lang.String automobileTax_1;

    private java.lang.String weightTax_1;

    private java.lang.String term_2;

    private java.lang.String automobileTax_2;

    private java.lang.String weightTax_2;

    public EstimatedAutomobileTax() {
    }

    public EstimatedAutomobileTax(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String term_1,
           java.lang.String automobileTax_1,
           java.lang.String weightTax_1,
           java.lang.String term_2,
           java.lang.String automobileTax_2,
           java.lang.String weightTax_2) {
           this.extensionData = extensionData;
           this.term_1 = term_1;
           this.automobileTax_1 = automobileTax_1;
           this.weightTax_1 = weightTax_1;
           this.term_2 = term_2;
           this.automobileTax_2 = automobileTax_2;
           this.weightTax_2 = weightTax_2;
    }


    /**
     * Gets the extensionData value for this EstimatedAutomobileTax.
     * 
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this EstimatedAutomobileTax.
     * 
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the term_1 value for this EstimatedAutomobileTax.
     * 
     * @return term_1
     */
    public java.lang.String getTerm_1() {
        return term_1;
    }


    /**
     * Sets the term_1 value for this EstimatedAutomobileTax.
     * 
     * @param term_1
     */
    public void setTerm_1(java.lang.String term_1) {
        this.term_1 = term_1;
    }


    /**
     * Gets the automobileTax_1 value for this EstimatedAutomobileTax.
     * 
     * @return automobileTax_1
     */
    public java.lang.String getAutomobileTax_1() {
        return automobileTax_1;
    }


    /**
     * Sets the automobileTax_1 value for this EstimatedAutomobileTax.
     * 
     * @param automobileTax_1
     */
    public void setAutomobileTax_1(java.lang.String automobileTax_1) {
        this.automobileTax_1 = automobileTax_1;
    }


    /**
     * Gets the weightTax_1 value for this EstimatedAutomobileTax.
     * 
     * @return weightTax_1
     */
    public java.lang.String getWeightTax_1() {
        return weightTax_1;
    }


    /**
     * Sets the weightTax_1 value for this EstimatedAutomobileTax.
     * 
     * @param weightTax_1
     */
    public void setWeightTax_1(java.lang.String weightTax_1) {
        this.weightTax_1 = weightTax_1;
    }


    /**
     * Gets the term_2 value for this EstimatedAutomobileTax.
     * 
     * @return term_2
     */
    public java.lang.String getTerm_2() {
        return term_2;
    }


    /**
     * Sets the term_2 value for this EstimatedAutomobileTax.
     * 
     * @param term_2
     */
    public void setTerm_2(java.lang.String term_2) {
        this.term_2 = term_2;
    }


    /**
     * Gets the automobileTax_2 value for this EstimatedAutomobileTax.
     * 
     * @return automobileTax_2
     */
    public java.lang.String getAutomobileTax_2() {
        return automobileTax_2;
    }


    /**
     * Sets the automobileTax_2 value for this EstimatedAutomobileTax.
     * 
     * @param automobileTax_2
     */
    public void setAutomobileTax_2(java.lang.String automobileTax_2) {
        this.automobileTax_2 = automobileTax_2;
    }


    /**
     * Gets the weightTax_2 value for this EstimatedAutomobileTax.
     * 
     * @return weightTax_2
     */
    public java.lang.String getWeightTax_2() {
        return weightTax_2;
    }


    /**
     * Sets the weightTax_2 value for this EstimatedAutomobileTax.
     * 
     * @param weightTax_2
     */
    public void setWeightTax_2(java.lang.String weightTax_2) {
        this.weightTax_2 = weightTax_2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstimatedAutomobileTax)) return false;
        EstimatedAutomobileTax other = (EstimatedAutomobileTax) obj;
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
            ((this.term_1==null && other.getTerm_1()==null) || 
             (this.term_1!=null &&
              this.term_1.equals(other.getTerm_1()))) &&
            ((this.automobileTax_1==null && other.getAutomobileTax_1()==null) || 
             (this.automobileTax_1!=null &&
              this.automobileTax_1.equals(other.getAutomobileTax_1()))) &&
            ((this.weightTax_1==null && other.getWeightTax_1()==null) || 
             (this.weightTax_1!=null &&
              this.weightTax_1.equals(other.getWeightTax_1()))) &&
            ((this.term_2==null && other.getTerm_2()==null) || 
             (this.term_2!=null &&
              this.term_2.equals(other.getTerm_2()))) &&
            ((this.automobileTax_2==null && other.getAutomobileTax_2()==null) || 
             (this.automobileTax_2!=null &&
              this.automobileTax_2.equals(other.getAutomobileTax_2()))) &&
            ((this.weightTax_2==null && other.getWeightTax_2()==null) || 
             (this.weightTax_2!=null &&
              this.weightTax_2.equals(other.getWeightTax_2())));
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
        if (getTerm_1() != null) {
            _hashCode += getTerm_1().hashCode();
        }
        if (getAutomobileTax_1() != null) {
            _hashCode += getAutomobileTax_1().hashCode();
        }
        if (getWeightTax_1() != null) {
            _hashCode += getWeightTax_1().hashCode();
        }
        if (getTerm_2() != null) {
            _hashCode += getTerm_2().hashCode();
        }
        if (getAutomobileTax_2() != null) {
            _hashCode += getAutomobileTax_2().hashCode();
        }
        if (getWeightTax_2() != null) {
            _hashCode += getWeightTax_2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstimatedAutomobileTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EstimatedAutomobileTax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term_1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Term_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automobileTax_1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AutomobileTax_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightTax_1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "WeightTax_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term_2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Term_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automobileTax_2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AutomobileTax_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightTax_2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "WeightTax_2"));
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
