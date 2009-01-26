/**
 * GenDataSetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class GenDataSetResponse  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult genDataSetResult;

    public GenDataSetResponse() {
    }

    public GenDataSetResponse(
           is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult genDataSetResult) {
           this.genDataSetResult = genDataSetResult;
    }


    /**
     * Gets the genDataSetResult value for this GenDataSetResponse.
     * 
     * @return genDataSetResult
     */
    public is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult getGenDataSetResult() {
        return genDataSetResult;
    }


    /**
     * Sets the genDataSetResult value for this GenDataSetResponse.
     * 
     * @param genDataSetResult
     */
    public void setGenDataSetResult(is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult genDataSetResult) {
        this.genDataSetResult = genDataSetResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenDataSetResponse)) return false;
        GenDataSetResponse other = (GenDataSetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.genDataSetResult==null && other.getGenDataSetResult()==null) || 
             (this.genDataSetResult!=null &&
              this.genDataSetResult.equals(other.getGenDataSetResult())));
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
        if (getGenDataSetResult() != null) {
            _hashCode += getGenDataSetResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenDataSetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GenDataSetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genDataSetResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GenDataSetResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GenDataSetResponse>GenDataSetResult"));
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
