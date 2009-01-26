/**
 * Query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class Query  implements java.io.Serializable {
    private java.lang.String queryId;

    private java.lang.String text;

    private java.lang.String groupText;

    private java.lang.String groupCode;

    private java.lang.String subGroupText;

    private java.lang.String subGroupCode;

    private java.lang.String type;

    private java.lang.String line1;

    private java.lang.String line2;

    public Query() {
    }

    public Query(
           java.lang.String queryId,
           java.lang.String text,
           java.lang.String groupText,
           java.lang.String groupCode,
           java.lang.String subGroupText,
           java.lang.String subGroupCode,
           java.lang.String type,
           java.lang.String line1,
           java.lang.String line2) {
           this.queryId = queryId;
           this.text = text;
           this.groupText = groupText;
           this.groupCode = groupCode;
           this.subGroupText = subGroupText;
           this.subGroupCode = subGroupCode;
           this.type = type;
           this.line1 = line1;
           this.line2 = line2;
    }


    /**
     * Gets the queryId value for this Query.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this Query.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the text value for this Query.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Query.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the groupText value for this Query.
     * 
     * @return groupText
     */
    public java.lang.String getGroupText() {
        return groupText;
    }


    /**
     * Sets the groupText value for this Query.
     * 
     * @param groupText
     */
    public void setGroupText(java.lang.String groupText) {
        this.groupText = groupText;
    }


    /**
     * Gets the groupCode value for this Query.
     * 
     * @return groupCode
     */
    public java.lang.String getGroupCode() {
        return groupCode;
    }


    /**
     * Sets the groupCode value for this Query.
     * 
     * @param groupCode
     */
    public void setGroupCode(java.lang.String groupCode) {
        this.groupCode = groupCode;
    }


    /**
     * Gets the subGroupText value for this Query.
     * 
     * @return subGroupText
     */
    public java.lang.String getSubGroupText() {
        return subGroupText;
    }


    /**
     * Sets the subGroupText value for this Query.
     * 
     * @param subGroupText
     */
    public void setSubGroupText(java.lang.String subGroupText) {
        this.subGroupText = subGroupText;
    }


    /**
     * Gets the subGroupCode value for this Query.
     * 
     * @return subGroupCode
     */
    public java.lang.String getSubGroupCode() {
        return subGroupCode;
    }


    /**
     * Sets the subGroupCode value for this Query.
     * 
     * @param subGroupCode
     */
    public void setSubGroupCode(java.lang.String subGroupCode) {
        this.subGroupCode = subGroupCode;
    }


    /**
     * Gets the type value for this Query.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Query.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the line1 value for this Query.
     * 
     * @return line1
     */
    public java.lang.String getLine1() {
        return line1;
    }


    /**
     * Sets the line1 value for this Query.
     * 
     * @param line1
     */
    public void setLine1(java.lang.String line1) {
        this.line1 = line1;
    }


    /**
     * Gets the line2 value for this Query.
     * 
     * @return line2
     */
    public java.lang.String getLine2() {
        return line2;
    }


    /**
     * Sets the line2 value for this Query.
     * 
     * @param line2
     */
    public void setLine2(java.lang.String line2) {
        this.line2 = line2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query)) return false;
        Query other = (Query) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.groupText==null && other.getGroupText()==null) || 
             (this.groupText!=null &&
              this.groupText.equals(other.getGroupText()))) &&
            ((this.groupCode==null && other.getGroupCode()==null) || 
             (this.groupCode!=null &&
              this.groupCode.equals(other.getGroupCode()))) &&
            ((this.subGroupText==null && other.getSubGroupText()==null) || 
             (this.subGroupText!=null &&
              this.subGroupText.equals(other.getSubGroupText()))) &&
            ((this.subGroupCode==null && other.getSubGroupCode()==null) || 
             (this.subGroupCode!=null &&
              this.subGroupCode.equals(other.getSubGroupCode()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.line1==null && other.getLine1()==null) || 
             (this.line1!=null &&
              this.line1.equals(other.getLine1()))) &&
            ((this.line2==null && other.getLine2()==null) || 
             (this.line2!=null &&
              this.line2.equals(other.getLine2())));
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
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getGroupText() != null) {
            _hashCode += getGroupText().hashCode();
        }
        if (getGroupCode() != null) {
            _hashCode += getGroupCode().hashCode();
        }
        if (getSubGroupText() != null) {
            _hashCode += getSubGroupText().hashCode();
        }
        if (getSubGroupCode() != null) {
            _hashCode += getSubGroupCode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLine1() != null) {
            _hashCode += getLine1().hashCode();
        }
        if (getLine2() != null) {
            _hashCode += getLine2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Query"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GroupText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SubGroupText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SubGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Line2"));
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
