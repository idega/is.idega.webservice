/**
 * GetCubeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class GetCubeResponse  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.GetCubeResponseGetCubeResult getCubeResult;

    public GetCubeResponse() {
    }

    public GetCubeResponse(
           is.idega.webservice.propertyregistryservice.client.GetCubeResponseGetCubeResult getCubeResult) {
           this.getCubeResult = getCubeResult;
    }


    /**
     * Gets the getCubeResult value for this GetCubeResponse.
     * 
     * @return getCubeResult
     */
    public is.idega.webservice.propertyregistryservice.client.GetCubeResponseGetCubeResult getGetCubeResult() {
        return getCubeResult;
    }


    /**
     * Sets the getCubeResult value for this GetCubeResponse.
     * 
     * @param getCubeResult
     */
    public void setGetCubeResult(is.idega.webservice.propertyregistryservice.client.GetCubeResponseGetCubeResult getCubeResult) {
        this.getCubeResult = getCubeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCubeResponse)) return false;
        GetCubeResponse other = (GetCubeResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCubeResult==null && other.getGetCubeResult()==null) || 
             (this.getCubeResult!=null &&
              this.getCubeResult.equals(other.getGetCubeResult())));
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
        if (getGetCubeResult() != null) {
            _hashCode += getGetCubeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCubeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCubeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCubeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCubeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCubeResponse>GetCubeResult"));
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
