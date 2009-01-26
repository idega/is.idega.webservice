/**
 * GetQueryInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class GetQueryInfoResponse  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.QueryInfo getQueryInfoResult;

    public GetQueryInfoResponse() {
    }

    public GetQueryInfoResponse(
           is.idega.webservice.propertyregistryservice.client.QueryInfo getQueryInfoResult) {
           this.getQueryInfoResult = getQueryInfoResult;
    }


    /**
     * Gets the getQueryInfoResult value for this GetQueryInfoResponse.
     * 
     * @return getQueryInfoResult
     */
    public is.idega.webservice.propertyregistryservice.client.QueryInfo getGetQueryInfoResult() {
        return getQueryInfoResult;
    }


    /**
     * Sets the getQueryInfoResult value for this GetQueryInfoResponse.
     * 
     * @param getQueryInfoResult
     */
    public void setGetQueryInfoResult(is.idega.webservice.propertyregistryservice.client.QueryInfo getQueryInfoResult) {
        this.getQueryInfoResult = getQueryInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQueryInfoResponse)) return false;
        GetQueryInfoResponse other = (GetQueryInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getQueryInfoResult==null && other.getGetQueryInfoResult()==null) || 
             (this.getQueryInfoResult!=null &&
              this.getQueryInfoResult.equals(other.getGetQueryInfoResult())));
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
        if (getGetQueryInfoResult() != null) {
            _hashCode += getGetQueryInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQueryInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetQueryInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQueryInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetQueryInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "QueryInfo"));
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
