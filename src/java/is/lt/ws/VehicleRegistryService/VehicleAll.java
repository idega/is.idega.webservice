/**
 * VehicleAll.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VehicleAll  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private is.lt.ws.VehicleRegistryService.Vehicle vehicle;

    private is.lt.ws.VehicleRegistryService.VehicleExtra vehicleExtra;

    private java.util.Calendar queryTimeStamp;

    public VehicleAll() {
    }

    public VehicleAll(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           is.lt.ws.VehicleRegistryService.Vehicle vehicle,
           is.lt.ws.VehicleRegistryService.VehicleExtra vehicleExtra,
           java.util.Calendar queryTimeStamp) {
           this.extensionData = extensionData;
           this.vehicle = vehicle;
           this.vehicleExtra = vehicleExtra;
           this.queryTimeStamp = queryTimeStamp;
    }


    /**
     * Gets the extensionData value for this VehicleAll.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this VehicleAll.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the vehicle value for this VehicleAll.
     *
     * @return vehicle
     */
    public is.lt.ws.VehicleRegistryService.Vehicle getVehicle() {
        return vehicle;
    }


    /**
     * Sets the vehicle value for this VehicleAll.
     *
     * @param vehicle
     */
    public void setVehicle(is.lt.ws.VehicleRegistryService.Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    /**
     * Gets the vehicleExtra value for this VehicleAll.
     *
     * @return vehicleExtra
     */
    public is.lt.ws.VehicleRegistryService.VehicleExtra getVehicleExtra() {
        return vehicleExtra;
    }


    /**
     * Sets the vehicleExtra value for this VehicleAll.
     *
     * @param vehicleExtra
     */
    public void setVehicleExtra(is.lt.ws.VehicleRegistryService.VehicleExtra vehicleExtra) {
        this.vehicleExtra = vehicleExtra;
    }


    /**
     * Gets the queryTimeStamp value for this VehicleAll.
     *
     * @return queryTimeStamp
     */
    public java.util.Calendar getQueryTimeStamp() {
        return queryTimeStamp;
    }


    /**
     * Sets the queryTimeStamp value for this VehicleAll.
     *
     * @param queryTimeStamp
     */
    public void setQueryTimeStamp(java.util.Calendar queryTimeStamp) {
        this.queryTimeStamp = queryTimeStamp;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleAll)) {
			return false;
		}
        VehicleAll other = (VehicleAll) obj;
        if (obj == null) {
			return false;
		}
        if (this == obj) {
			return true;
		}
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.extensionData==null && other.getExtensionData()==null) ||
             (this.extensionData!=null &&
              this.extensionData.equals(other.getExtensionData()))) &&
            ((this.vehicle==null && other.getVehicle()==null) ||
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            ((this.vehicleExtra==null && other.getVehicleExtra()==null) ||
             (this.vehicleExtra!=null &&
              this.vehicleExtra.equals(other.getVehicleExtra()))) &&
            ((this.queryTimeStamp==null && other.getQueryTimeStamp()==null) ||
             (this.queryTimeStamp!=null &&
              this.queryTimeStamp.equals(other.getQueryTimeStamp())));
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
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        if (getVehicleExtra() != null) {
            _hashCode += getVehicleExtra().hashCode();
        }
        if (getQueryTimeStamp() != null) {
            _hashCode += getQueryTimeStamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleAll.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleAll"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehicle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleExtra");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleExtra"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleExtra"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "QueryTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
