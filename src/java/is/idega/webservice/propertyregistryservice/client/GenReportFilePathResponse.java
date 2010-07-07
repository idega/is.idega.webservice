/**
 * GenReportFilePathResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class GenReportFilePathResponse  implements java.io.Serializable {
    private java.lang.String genReportFilePathResult;

    public GenReportFilePathResponse() {
    }

    public GenReportFilePathResponse(
           java.lang.String genReportFilePathResult) {
           this.genReportFilePathResult = genReportFilePathResult;
    }


    /**
     * Gets the genReportFilePathResult value for this GenReportFilePathResponse.
     * 
     * @return genReportFilePathResult
     */
    public java.lang.String getGenReportFilePathResult() {
        return genReportFilePathResult;
    }


    /**
     * Sets the genReportFilePathResult value for this GenReportFilePathResponse.
     * 
     * @param genReportFilePathResult
     */
    public void setGenReportFilePathResult(java.lang.String genReportFilePathResult) {
        this.genReportFilePathResult = genReportFilePathResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenReportFilePathResponse)) return false;
        GenReportFilePathResponse other = (GenReportFilePathResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.genReportFilePathResult==null && other.getGenReportFilePathResult()==null) || 
             (this.genReportFilePathResult!=null &&
              this.genReportFilePathResult.equals(other.getGenReportFilePathResult())));
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
        if (getGenReportFilePathResult() != null) {
            _hashCode += getGenReportFilePathResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenReportFilePathResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GenReportFilePathResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genReportFilePathResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GenReportFilePathResult"));
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
