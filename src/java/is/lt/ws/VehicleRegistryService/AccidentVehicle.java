/**
 * AccidentVehicle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AccidentVehicle  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String make;

    private java.lang.String vehcom;

    private java.lang.String vehgroup;

    private java.lang.String damage;

    public AccidentVehicle() {
    }

    public AccidentVehicle(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String make,
           java.lang.String vehcom,
           java.lang.String vehgroup,
           java.lang.String damage) {
           this.extensionData = extensionData;
           this.make = make;
           this.vehcom = vehcom;
           this.vehgroup = vehgroup;
           this.damage = damage;
    }


    /**
     * Gets the extensionData value for this AccidentVehicle.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this AccidentVehicle.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the make value for this AccidentVehicle.
     *
     * @return make
     */
    public java.lang.String getMake() {
        return make;
    }


    /**
     * Sets the make value for this AccidentVehicle.
     *
     * @param make
     */
    public void setMake(java.lang.String make) {
        this.make = make;
    }


    /**
     * Gets the vehcom value for this AccidentVehicle.
     *
     * @return vehcom
     */
    public java.lang.String getVehcom() {
        return vehcom;
    }


    /**
     * Sets the vehcom value for this AccidentVehicle.
     *
     * @param vehcom
     */
    public void setVehcom(java.lang.String vehcom) {
        this.vehcom = vehcom;
    }


    /**
     * Gets the vehgroup value for this AccidentVehicle.
     *
     * @return vehgroup
     */
    public java.lang.String getVehgroup() {
        return vehgroup;
    }


    /**
     * Sets the vehgroup value for this AccidentVehicle.
     *
     * @param vehgroup
     */
    public void setVehgroup(java.lang.String vehgroup) {
        this.vehgroup = vehgroup;
    }


    /**
     * Gets the damage value for this AccidentVehicle.
     *
     * @return damage
     */
    public java.lang.String getDamage() {
        return damage;
    }


    /**
     * Sets the damage value for this AccidentVehicle.
     *
     * @param damage
     */
    public void setDamage(java.lang.String damage) {
        this.damage = damage;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccidentVehicle)) return false;
        AccidentVehicle other = (AccidentVehicle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.extensionData==null && other.getExtensionData()==null) ||
             (this.extensionData!=null &&
              this.extensionData.equals(other.getExtensionData()))) &&
            ((this.make==null && other.getMake()==null) ||
             (this.make!=null &&
              this.make.equals(other.getMake()))) &&
            ((this.vehcom==null && other.getVehcom()==null) ||
             (this.vehcom!=null &&
              this.vehcom.equals(other.getVehcom()))) &&
            ((this.vehgroup==null && other.getVehgroup()==null) ||
             (this.vehgroup!=null &&
              this.vehgroup.equals(other.getVehgroup()))) &&
            ((this.damage==null && other.getDamage()==null) ||
             (this.damage!=null &&
              this.damage.equals(other.getDamage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExtensionData() != null) {
            _hashCode += getExtensionData().hashCode();
        }
        if (getMake() != null) {
            _hashCode += getMake().hashCode();
        }
        if (getVehcom() != null) {
            _hashCode += getVehcom().hashCode();
        }
        if (getVehgroup() != null) {
            _hashCode += getVehgroup().hashCode();
        }
        if (getDamage() != null) {
            _hashCode += getDamage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccidentVehicle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentVehicle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("make");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Make"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehcom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehcom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Damage"));
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
