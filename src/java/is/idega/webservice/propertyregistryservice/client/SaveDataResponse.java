/**
 * SaveDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class SaveDataResponse  implements java.io.Serializable {
    private is.idega.webservice.propertyregistryservice.client.SaveDataResponseSaveDataResult saveDataResult;

    public SaveDataResponse() {
    }

    public SaveDataResponse(
           is.idega.webservice.propertyregistryservice.client.SaveDataResponseSaveDataResult saveDataResult) {
           this.saveDataResult = saveDataResult;
    }


    /**
     * Gets the saveDataResult value for this SaveDataResponse.
     * 
     * @return saveDataResult
     */
    public is.idega.webservice.propertyregistryservice.client.SaveDataResponseSaveDataResult getSaveDataResult() {
        return saveDataResult;
    }


    /**
     * Sets the saveDataResult value for this SaveDataResponse.
     * 
     * @param saveDataResult
     */
    public void setSaveDataResult(is.idega.webservice.propertyregistryservice.client.SaveDataResponseSaveDataResult saveDataResult) {
        this.saveDataResult = saveDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveDataResponse)) return false;
        SaveDataResponse other = (SaveDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saveDataResult==null && other.getSaveDataResult()==null) || 
             (this.saveDataResult!=null &&
              this.saveDataResult.equals(other.getSaveDataResult())));
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
        if (getSaveDataResult() != null) {
            _hashCode += getSaveDataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SaveDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SaveDataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SaveDataResponse>SaveDataResult"));
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
