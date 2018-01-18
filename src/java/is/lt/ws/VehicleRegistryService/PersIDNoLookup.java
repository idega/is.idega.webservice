/**
 * PersIDNoLookup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

public class PersIDNoLookup  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String persidno;

    private java.lang.String name;

    private java.lang.String address;

    private java.lang.String poststation;

    private is.lt.ws.VehicleRegistryService.VehiclePersidno[] vehicleList;

    public PersIDNoLookup() {
    }

    public PersIDNoLookup(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String persidno,
           java.lang.String name,
           java.lang.String address,
           java.lang.String poststation,
           is.lt.ws.VehicleRegistryService.VehiclePersidno[] vehicleList) {
           this.extensionData = extensionData;
           this.persidno = persidno;
           this.name = name;
           this.address = address;
           this.poststation = poststation;
           this.vehicleList = vehicleList;
    }


    /**
     * Gets the extensionData value for this PersIDNoLookup.
     * 
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this PersIDNoLookup.
     * 
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the persidno value for this PersIDNoLookup.
     * 
     * @return persidno
     */
    public java.lang.String getPersidno() {
        return persidno;
    }


    /**
     * Sets the persidno value for this PersIDNoLookup.
     * 
     * @param persidno
     */
    public void setPersidno(java.lang.String persidno) {
        this.persidno = persidno;
    }


    /**
     * Gets the name value for this PersIDNoLookup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PersIDNoLookup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the address value for this PersIDNoLookup.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PersIDNoLookup.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the poststation value for this PersIDNoLookup.
     * 
     * @return poststation
     */
    public java.lang.String getPoststation() {
        return poststation;
    }


    /**
     * Sets the poststation value for this PersIDNoLookup.
     * 
     * @param poststation
     */
    public void setPoststation(java.lang.String poststation) {
        this.poststation = poststation;
    }


    /**
     * Gets the vehicleList value for this PersIDNoLookup.
     * 
     * @return vehicleList
     */
    public is.lt.ws.VehicleRegistryService.VehiclePersidno[] getVehicleList() {
        return vehicleList;
    }


    /**
     * Sets the vehicleList value for this PersIDNoLookup.
     * 
     * @param vehicleList
     */
    public void setVehicleList(is.lt.ws.VehicleRegistryService.VehiclePersidno[] vehicleList) {
        this.vehicleList = vehicleList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersIDNoLookup)) return false;
        PersIDNoLookup other = (PersIDNoLookup) obj;
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
            ((this.persidno==null && other.getPersidno()==null) || 
             (this.persidno!=null &&
              this.persidno.equals(other.getPersidno()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.poststation==null && other.getPoststation()==null) || 
             (this.poststation!=null &&
              this.poststation.equals(other.getPoststation()))) &&
            ((this.vehicleList==null && other.getVehicleList()==null) || 
             (this.vehicleList!=null &&
              java.util.Arrays.equals(this.vehicleList, other.getVehicleList())));
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
        if (getExtensionData() != null) {
            _hashCode += getExtensionData().hashCode();
        }
        if (getPersidno() != null) {
            _hashCode += getPersidno().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPoststation() != null) {
            _hashCode += getPoststation().hashCode();
        }
        if (getVehicleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicleList(), i);
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
        new org.apache.axis.description.TypeDesc(PersIDNoLookup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PersIDNoLookup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persidno");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Persidno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poststation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Poststation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehiclePersidno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehiclePersidno"));
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
