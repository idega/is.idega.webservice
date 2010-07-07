/**
 * GetQueriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class GetQueriesResponse  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.Query[] getQueriesResult;

    public GetQueriesResponse() {
    }

    public GetQueriesResponse(
           is.idega.webservice.propertyregistryservice.client.Query[] getQueriesResult) {
           this.getQueriesResult = getQueriesResult;
    }


    /**
     * Gets the getQueriesResult value for this GetQueriesResponse.
     * 
     * @return getQueriesResult
     */
    public is.idega.webservice.propertyregistryservice.client.Query[] getGetQueriesResult() {
        return getQueriesResult;
    }


    /**
     * Sets the getQueriesResult value for this GetQueriesResponse.
     * 
     * @param getQueriesResult
     */
    public void setGetQueriesResult(is.idega.webservice.propertyregistryservice.client.Query[] getQueriesResult) {
        this.getQueriesResult = getQueriesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQueriesResponse)) return false;
        GetQueriesResponse other = (GetQueriesResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getQueriesResult==null && other.getGetQueriesResult()==null) || 
             (this.getQueriesResult!=null &&
              java.util.Arrays.equals(this.getQueriesResult, other.getGetQueriesResult())));
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
        if (getGetQueriesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetQueriesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetQueriesResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetQueriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetQueriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQueriesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetQueriesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Query"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query"));
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
