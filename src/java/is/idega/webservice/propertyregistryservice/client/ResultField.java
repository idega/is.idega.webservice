/**
 * ResultField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class ResultField  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.EnumResultFieldType resultType;

    private is.idega.webservice.propertyregistryservice.client.EnumAggrType aggregateType;

    private java.lang.String fieldName;

    private java.lang.String crossTabField;

    private java.lang.String crossTabValue;

    private java.lang.String crossTabResultField;

    public ResultField() {
    }

    public ResultField(
           is.idega.webservice.propertyregistryservice.client.EnumResultFieldType resultType,
           is.idega.webservice.propertyregistryservice.client.EnumAggrType aggregateType,
           java.lang.String fieldName,
           java.lang.String crossTabField,
           java.lang.String crossTabValue,
           java.lang.String crossTabResultField) {
           this.resultType = resultType;
           this.aggregateType = aggregateType;
           this.fieldName = fieldName;
           this.crossTabField = crossTabField;
           this.crossTabValue = crossTabValue;
           this.crossTabResultField = crossTabResultField;
    }


    /**
     * Gets the resultType value for this ResultField.
     * 
     * @return resultType
     */
    public is.idega.webservice.propertyregistryservice.client.EnumResultFieldType getResultType() {
        return resultType;
    }


    /**
     * Sets the resultType value for this ResultField.
     * 
     * @param resultType
     */
    public void setResultType(is.idega.webservice.propertyregistryservice.client.EnumResultFieldType resultType) {
        this.resultType = resultType;
    }


    /**
     * Gets the aggregateType value for this ResultField.
     * 
     * @return aggregateType
     */
    public is.idega.webservice.propertyregistryservice.client.EnumAggrType getAggregateType() {
        return aggregateType;
    }


    /**
     * Sets the aggregateType value for this ResultField.
     * 
     * @param aggregateType
     */
    public void setAggregateType(is.idega.webservice.propertyregistryservice.client.EnumAggrType aggregateType) {
        this.aggregateType = aggregateType;
    }


    /**
     * Gets the fieldName value for this ResultField.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this ResultField.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the crossTabField value for this ResultField.
     * 
     * @return crossTabField
     */
    public java.lang.String getCrossTabField() {
        return crossTabField;
    }


    /**
     * Sets the crossTabField value for this ResultField.
     * 
     * @param crossTabField
     */
    public void setCrossTabField(java.lang.String crossTabField) {
        this.crossTabField = crossTabField;
    }


    /**
     * Gets the crossTabValue value for this ResultField.
     * 
     * @return crossTabValue
     */
    public java.lang.String getCrossTabValue() {
        return crossTabValue;
    }


    /**
     * Sets the crossTabValue value for this ResultField.
     * 
     * @param crossTabValue
     */
    public void setCrossTabValue(java.lang.String crossTabValue) {
        this.crossTabValue = crossTabValue;
    }


    /**
     * Gets the crossTabResultField value for this ResultField.
     * 
     * @return crossTabResultField
     */
    public java.lang.String getCrossTabResultField() {
        return crossTabResultField;
    }


    /**
     * Sets the crossTabResultField value for this ResultField.
     * 
     * @param crossTabResultField
     */
    public void setCrossTabResultField(java.lang.String crossTabResultField) {
        this.crossTabResultField = crossTabResultField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultField)) return false;
        ResultField other = (ResultField) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultType==null && other.getResultType()==null) || 
             (this.resultType!=null &&
              this.resultType.equals(other.getResultType()))) &&
            ((this.aggregateType==null && other.getAggregateType()==null) || 
             (this.aggregateType!=null &&
              this.aggregateType.equals(other.getAggregateType()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.crossTabField==null && other.getCrossTabField()==null) || 
             (this.crossTabField!=null &&
              this.crossTabField.equals(other.getCrossTabField()))) &&
            ((this.crossTabValue==null && other.getCrossTabValue()==null) || 
             (this.crossTabValue!=null &&
              this.crossTabValue.equals(other.getCrossTabValue()))) &&
            ((this.crossTabResultField==null && other.getCrossTabResultField()==null) || 
             (this.crossTabResultField!=null &&
              this.crossTabResultField.equals(other.getCrossTabResultField())));
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
        if (getResultType() != null) {
            _hashCode += getResultType().hashCode();
        }
        if (getAggregateType() != null) {
            _hashCode += getAggregateType().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getCrossTabField() != null) {
            _hashCode += getCrossTabField().hashCode();
        }
        if (getCrossTabValue() != null) {
            _hashCode += getCrossTabValue().hashCode();
        }
        if (getCrossTabResultField() != null) {
            _hashCode += getCrossTabResultField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResultField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "enumResultFieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AggregateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "enumAggrType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossTabField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CrossTabField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossTabValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CrossTabValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossTabResultField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CrossTabResultField"));
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
