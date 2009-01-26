/**
 * OpenQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class OpenQueryResponse  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.OpenQueryResponseOpenQueryResult openQueryResult;

    public OpenQueryResponse() {
    }

    public OpenQueryResponse(
           is.idega.webservice.propertyregistryservice.client.OpenQueryResponseOpenQueryResult openQueryResult) {
           this.openQueryResult = openQueryResult;
    }


    /**
     * Gets the openQueryResult value for this OpenQueryResponse.
     * 
     * @return openQueryResult
     */
    public is.idega.webservice.propertyregistryservice.client.OpenQueryResponseOpenQueryResult getOpenQueryResult() {
        return openQueryResult;
    }


    /**
     * Sets the openQueryResult value for this OpenQueryResponse.
     * 
     * @param openQueryResult
     */
    public void setOpenQueryResult(is.idega.webservice.propertyregistryservice.client.OpenQueryResponseOpenQueryResult openQueryResult) {
        this.openQueryResult = openQueryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpenQueryResponse)) return false;
        OpenQueryResponse other = (OpenQueryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.openQueryResult==null && other.getOpenQueryResult()==null) || 
             (this.openQueryResult!=null &&
              this.openQueryResult.equals(other.getOpenQueryResult())));
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
        if (getOpenQueryResult() != null) {
            _hashCode += getOpenQueryResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpenQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">OpenQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openQueryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OpenQueryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>OpenQueryResponse>OpenQueryResult"));
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
