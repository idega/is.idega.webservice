/**
 * GetQueries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class GetQueries  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String queryType;

    private java.lang.String yfirFlokkur;

    private java.lang.String undirFlokkur;

    public GetQueries() {
    }

    public GetQueries(
           java.lang.String sessionId,
           java.lang.String queryType,
           java.lang.String yfirFlokkur,
           java.lang.String undirFlokkur) {
           this.sessionId = sessionId;
           this.queryType = queryType;
           this.yfirFlokkur = yfirFlokkur;
           this.undirFlokkur = undirFlokkur;
    }


    /**
     * Gets the sessionId value for this GetQueries.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this GetQueries.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the queryType value for this GetQueries.
     * 
     * @return queryType
     */
    public java.lang.String getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this GetQueries.
     * 
     * @param queryType
     */
    public void setQueryType(java.lang.String queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the yfirFlokkur value for this GetQueries.
     * 
     * @return yfirFlokkur
     */
    public java.lang.String getYfirFlokkur() {
        return yfirFlokkur;
    }


    /**
     * Sets the yfirFlokkur value for this GetQueries.
     * 
     * @param yfirFlokkur
     */
    public void setYfirFlokkur(java.lang.String yfirFlokkur) {
        this.yfirFlokkur = yfirFlokkur;
    }


    /**
     * Gets the undirFlokkur value for this GetQueries.
     * 
     * @return undirFlokkur
     */
    public java.lang.String getUndirFlokkur() {
        return undirFlokkur;
    }


    /**
     * Sets the undirFlokkur value for this GetQueries.
     * 
     * @param undirFlokkur
     */
    public void setUndirFlokkur(java.lang.String undirFlokkur) {
        this.undirFlokkur = undirFlokkur;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQueries)) return false;
        GetQueries other = (GetQueries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType()))) &&
            ((this.yfirFlokkur==null && other.getYfirFlokkur()==null) || 
             (this.yfirFlokkur!=null &&
              this.yfirFlokkur.equals(other.getYfirFlokkur()))) &&
            ((this.undirFlokkur==null && other.getUndirFlokkur()==null) || 
             (this.undirFlokkur!=null &&
              this.undirFlokkur.equals(other.getUndirFlokkur())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        if (getYfirFlokkur() != null) {
            _hashCode += getYfirFlokkur().hashCode();
        }
        if (getUndirFlokkur() != null) {
            _hashCode += getUndirFlokkur().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQueries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetQueries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yfirFlokkur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YfirFlokkur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undirFlokkur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UndirFlokkur"));
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
