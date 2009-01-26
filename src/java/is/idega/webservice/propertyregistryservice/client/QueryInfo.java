/**
 * QueryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class QueryInfo  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.ParamInfo[] paramList;

    private is.idega.webservice.propertyregistryservice.client.FieldInfo[] fieldList;

    public QueryInfo() {
    }

    public QueryInfo(
           is.idega.webservice.propertyregistryservice.client.ParamInfo[] paramList,
           is.idega.webservice.propertyregistryservice.client.FieldInfo[] fieldList) {
           this.paramList = paramList;
           this.fieldList = fieldList;
    }


    /**
     * Gets the paramList value for this QueryInfo.
     * 
     * @return paramList
     */
    public is.idega.webservice.propertyregistryservice.client.ParamInfo[] getParamList() {
        return paramList;
    }


    /**
     * Sets the paramList value for this QueryInfo.
     * 
     * @param paramList
     */
    public void setParamList(is.idega.webservice.propertyregistryservice.client.ParamInfo[] paramList) {
        this.paramList = paramList;
    }


    /**
     * Gets the fieldList value for this QueryInfo.
     * 
     * @return fieldList
     */
    public is.idega.webservice.propertyregistryservice.client.FieldInfo[] getFieldList() {
        return fieldList;
    }


    /**
     * Sets the fieldList value for this QueryInfo.
     * 
     * @param fieldList
     */
    public void setFieldList(is.idega.webservice.propertyregistryservice.client.FieldInfo[] fieldList) {
        this.fieldList = fieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInfo)) return false;
        QueryInfo other = (QueryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paramList==null && other.getParamList()==null) || 
             (this.paramList!=null &&
              java.util.Arrays.equals(this.paramList, other.getParamList()))) &&
            ((this.fieldList==null && other.getFieldList()==null) || 
             (this.fieldList!=null &&
              java.util.Arrays.equals(this.fieldList, other.getFieldList())));
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
        if (getParamList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParamList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParamList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "QueryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "paramList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ParamInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ParamInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "FieldInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "FieldInfo"));
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
