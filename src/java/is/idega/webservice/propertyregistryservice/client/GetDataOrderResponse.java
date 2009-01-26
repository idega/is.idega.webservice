/**
 * GetDataOrderResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class GetDataOrderResponse  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.GetDataOrderResponseGetDataOrderResult getDataOrderResult;

    public GetDataOrderResponse() {
    }

    public GetDataOrderResponse(
           is.idega.webservice.propertyregistryservice.client.GetDataOrderResponseGetDataOrderResult getDataOrderResult) {
           this.getDataOrderResult = getDataOrderResult;
    }


    /**
     * Gets the getDataOrderResult value for this GetDataOrderResponse.
     * 
     * @return getDataOrderResult
     */
    public is.idega.webservice.propertyregistryservice.client.GetDataOrderResponseGetDataOrderResult getGetDataOrderResult() {
        return getDataOrderResult;
    }


    /**
     * Sets the getDataOrderResult value for this GetDataOrderResponse.
     * 
     * @param getDataOrderResult
     */
    public void setGetDataOrderResult(is.idega.webservice.propertyregistryservice.client.GetDataOrderResponseGetDataOrderResult getDataOrderResult) {
        this.getDataOrderResult = getDataOrderResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDataOrderResponse)) return false;
        GetDataOrderResponse other = (GetDataOrderResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDataOrderResult==null && other.getGetDataOrderResult()==null) || 
             (this.getDataOrderResult!=null &&
              this.getDataOrderResult.equals(other.getGetDataOrderResult())));
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
        if (getGetDataOrderResult() != null) {
            _hashCode += getGetDataOrderResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDataOrderResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDataOrderResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDataOrderResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDataOrderResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDataOrderResponse>GetDataOrderResult"));
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
