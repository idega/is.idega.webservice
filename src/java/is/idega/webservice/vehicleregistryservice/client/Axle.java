/**
 * Axle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class Axle  implements java.io.Serializable {
    private java.lang.String axleNo;

    private java.lang.String wheelsNo;

    private boolean[] axlepow;

    private java.lang.String wheelbase;

    private java.lang.String[] axletrack;

    private java.lang.String[] wheelaxle;

    public Axle() {
    }

    public Axle(
           java.lang.String axleNo,
           java.lang.String wheelsNo,
           boolean[] axlepow,
           java.lang.String wheelbase,
           java.lang.String[] axletrack,
           java.lang.String[] wheelaxle) {
           this.axleNo = axleNo;
           this.wheelsNo = wheelsNo;
           this.axlepow = axlepow;
           this.wheelbase = wheelbase;
           this.axletrack = axletrack;
           this.wheelaxle = wheelaxle;
    }


    /**
     * Gets the axleNo value for this Axle.
     * 
     * @return axleNo
     */
    public java.lang.String getAxleNo() {
        return axleNo;
    }


    /**
     * Sets the axleNo value for this Axle.
     * 
     * @param axleNo
     */
    public void setAxleNo(java.lang.String axleNo) {
        this.axleNo = axleNo;
    }


    /**
     * Gets the wheelsNo value for this Axle.
     * 
     * @return wheelsNo
     */
    public java.lang.String getWheelsNo() {
        return wheelsNo;
    }


    /**
     * Sets the wheelsNo value for this Axle.
     * 
     * @param wheelsNo
     */
    public void setWheelsNo(java.lang.String wheelsNo) {
        this.wheelsNo = wheelsNo;
    }


    /**
     * Gets the axlepow value for this Axle.
     * 
     * @return axlepow
     */
    public boolean[] getAxlepow() {
        return axlepow;
    }


    /**
     * Sets the axlepow value for this Axle.
     * 
     * @param axlepow
     */
    public void setAxlepow(boolean[] axlepow) {
        this.axlepow = axlepow;
    }


    /**
     * Gets the wheelbase value for this Axle.
     * 
     * @return wheelbase
     */
    public java.lang.String getWheelbase() {
        return wheelbase;
    }


    /**
     * Sets the wheelbase value for this Axle.
     * 
     * @param wheelbase
     */
    public void setWheelbase(java.lang.String wheelbase) {
        this.wheelbase = wheelbase;
    }


    /**
     * Gets the axletrack value for this Axle.
     * 
     * @return axletrack
     */
    public java.lang.String[] getAxletrack() {
        return axletrack;
    }


    /**
     * Sets the axletrack value for this Axle.
     * 
     * @param axletrack
     */
    public void setAxletrack(java.lang.String[] axletrack) {
        this.axletrack = axletrack;
    }


    /**
     * Gets the wheelaxle value for this Axle.
     * 
     * @return wheelaxle
     */
    public java.lang.String[] getWheelaxle() {
        return wheelaxle;
    }


    /**
     * Sets the wheelaxle value for this Axle.
     * 
     * @param wheelaxle
     */
    public void setWheelaxle(java.lang.String[] wheelaxle) {
        this.wheelaxle = wheelaxle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Axle)) return false;
        Axle other = (Axle) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.axleNo==null && other.getAxleNo()==null) || 
             (this.axleNo!=null &&
              this.axleNo.equals(other.getAxleNo()))) &&
            ((this.wheelsNo==null && other.getWheelsNo()==null) || 
             (this.wheelsNo!=null &&
              this.wheelsNo.equals(other.getWheelsNo()))) &&
            ((this.axlepow==null && other.getAxlepow()==null) || 
             (this.axlepow!=null &&
              java.util.Arrays.equals(this.axlepow, other.getAxlepow()))) &&
            ((this.wheelbase==null && other.getWheelbase()==null) || 
             (this.wheelbase!=null &&
              this.wheelbase.equals(other.getWheelbase()))) &&
            ((this.axletrack==null && other.getAxletrack()==null) || 
             (this.axletrack!=null &&
              java.util.Arrays.equals(this.axletrack, other.getAxletrack()))) &&
            ((this.wheelaxle==null && other.getWheelaxle()==null) || 
             (this.wheelaxle!=null &&
              java.util.Arrays.equals(this.wheelaxle, other.getWheelaxle())));
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
        if (getAxleNo() != null) {
            _hashCode += getAxleNo().hashCode();
        }
        if (getWheelsNo() != null) {
            _hashCode += getWheelsNo().hashCode();
        }
        if (getAxlepow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAxlepow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAxlepow(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWheelbase() != null) {
            _hashCode += getWheelbase().hashCode();
        }
        if (getAxletrack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAxletrack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAxletrack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWheelaxle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWheelaxle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWheelaxle(), i);
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
        new org.apache.axis.description.TypeDesc(Axle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Axle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("axleNo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AxleNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wheelsNo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "WheelsNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("axlepow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Axlepow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wheelbase");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Wheelbase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("axletrack");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Axletrack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wheelaxle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Wheelaxle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "string"));
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
