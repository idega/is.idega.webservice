/**
 * Accident.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Accident  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String nextInspectionDate;

    private boolean airbag;

    private java.lang.String damage;

    private java.lang.String direction;

    private java.lang.String maxspeed;

    private java.lang.String comments;

    private java.lang.String location;

    private java.lang.String region;

    private java.lang.String speed;

    private java.lang.String accidentType;

    private is.lt.ws.VehicleRegistryService.Impacts[] impacts;

    private is.lt.ws.VehicleRegistryService.AccidentVehicle[] otherVehiclesInAccident;

    public Accident() {
    }

    public Accident(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String nextInspectionDate,
           boolean airbag,
           java.lang.String damage,
           java.lang.String direction,
           java.lang.String maxspeed,
           java.lang.String comments,
           java.lang.String location,
           java.lang.String region,
           java.lang.String speed,
           java.lang.String accidentType,
           is.lt.ws.VehicleRegistryService.Impacts[] impacts,
           is.lt.ws.VehicleRegistryService.AccidentVehicle[] otherVehiclesInAccident) {
           this.extensionData = extensionData;
           this.nextInspectionDate = nextInspectionDate;
           this.airbag = airbag;
           this.damage = damage;
           this.direction = direction;
           this.maxspeed = maxspeed;
           this.comments = comments;
           this.location = location;
           this.region = region;
           this.speed = speed;
           this.accidentType = accidentType;
           this.impacts = impacts;
           this.otherVehiclesInAccident = otherVehiclesInAccident;
    }


    /**
     * Gets the extensionData value for this Accident.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Accident.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the nextInspectionDate value for this Accident.
     *
     * @return nextInspectionDate
     */
    public java.lang.String getNextInspectionDate() {
        return nextInspectionDate;
    }


    /**
     * Sets the nextInspectionDate value for this Accident.
     *
     * @param nextInspectionDate
     */
    public void setNextInspectionDate(java.lang.String nextInspectionDate) {
        this.nextInspectionDate = nextInspectionDate;
    }


    /**
     * Gets the airbag value for this Accident.
     *
     * @return airbag
     */
    public boolean isAirbag() {
        return airbag;
    }


    /**
     * Sets the airbag value for this Accident.
     *
     * @param airbag
     */
    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }


    /**
     * Gets the damage value for this Accident.
     *
     * @return damage
     */
    public java.lang.String getDamage() {
        return damage;
    }


    /**
     * Sets the damage value for this Accident.
     *
     * @param damage
     */
    public void setDamage(java.lang.String damage) {
        this.damage = damage;
    }


    /**
     * Gets the direction value for this Accident.
     *
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this Accident.
     *
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the maxspeed value for this Accident.
     *
     * @return maxspeed
     */
    public java.lang.String getMaxspeed() {
        return maxspeed;
    }


    /**
     * Sets the maxspeed value for this Accident.
     *
     * @param maxspeed
     */
    public void setMaxspeed(java.lang.String maxspeed) {
        this.maxspeed = maxspeed;
    }


    /**
     * Gets the comments value for this Accident.
     *
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Accident.
     *
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the location value for this Accident.
     *
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Accident.
     *
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the region value for this Accident.
     *
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Accident.
     *
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the speed value for this Accident.
     *
     * @return speed
     */
    public java.lang.String getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this Accident.
     *
     * @param speed
     */
    public void setSpeed(java.lang.String speed) {
        this.speed = speed;
    }


    /**
     * Gets the accidentType value for this Accident.
     *
     * @return accidentType
     */
    public java.lang.String getAccidentType() {
        return accidentType;
    }


    /**
     * Sets the accidentType value for this Accident.
     *
     * @param accidentType
     */
    public void setAccidentType(java.lang.String accidentType) {
        this.accidentType = accidentType;
    }


    /**
     * Gets the impacts value for this Accident.
     *
     * @return impacts
     */
    public is.lt.ws.VehicleRegistryService.Impacts[] getImpacts() {
        return impacts;
    }


    /**
     * Sets the impacts value for this Accident.
     *
     * @param impacts
     */
    public void setImpacts(is.lt.ws.VehicleRegistryService.Impacts[] impacts) {
        this.impacts = impacts;
    }


    /**
     * Gets the otherVehiclesInAccident value for this Accident.
     *
     * @return otherVehiclesInAccident
     */
    public is.lt.ws.VehicleRegistryService.AccidentVehicle[] getOtherVehiclesInAccident() {
        return otherVehiclesInAccident;
    }


    /**
     * Sets the otherVehiclesInAccident value for this Accident.
     *
     * @param otherVehiclesInAccident
     */
    public void setOtherVehiclesInAccident(is.lt.ws.VehicleRegistryService.AccidentVehicle[] otherVehiclesInAccident) {
        this.otherVehiclesInAccident = otherVehiclesInAccident;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Accident)) {
			return false;
		}
        Accident other = (Accident) obj;
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
            ((this.nextInspectionDate==null && other.getNextInspectionDate()==null) ||
             (this.nextInspectionDate!=null &&
              this.nextInspectionDate.equals(other.getNextInspectionDate()))) &&
            this.airbag == other.isAirbag() &&
            ((this.damage==null && other.getDamage()==null) ||
             (this.damage!=null &&
              this.damage.equals(other.getDamage()))) &&
            ((this.direction==null && other.getDirection()==null) ||
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.maxspeed==null && other.getMaxspeed()==null) ||
             (this.maxspeed!=null &&
              this.maxspeed.equals(other.getMaxspeed()))) &&
            ((this.comments==null && other.getComments()==null) ||
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.location==null && other.getLocation()==null) ||
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.region==null && other.getRegion()==null) ||
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.speed==null && other.getSpeed()==null) ||
             (this.speed!=null &&
              this.speed.equals(other.getSpeed()))) &&
            ((this.accidentType==null && other.getAccidentType()==null) ||
             (this.accidentType!=null &&
              this.accidentType.equals(other.getAccidentType()))) &&
            ((this.impacts==null && other.getImpacts()==null) ||
             (this.impacts!=null &&
              java.util.Arrays.equals(this.impacts, other.getImpacts()))) &&
            ((this.otherVehiclesInAccident==null && other.getOtherVehiclesInAccident()==null) ||
             (this.otherVehiclesInAccident!=null &&
              java.util.Arrays.equals(this.otherVehiclesInAccident, other.getOtherVehiclesInAccident())));
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
        if (getNextInspectionDate() != null) {
            _hashCode += getNextInspectionDate().hashCode();
        }
        _hashCode += (isAirbag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDamage() != null) {
            _hashCode += getDamage().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getMaxspeed() != null) {
            _hashCode += getMaxspeed().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getSpeed() != null) {
            _hashCode += getSpeed().hashCode();
        }
        if (getAccidentType() != null) {
            _hashCode += getAccidentType().hashCode();
        }
        if (getImpacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImpacts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImpacts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherVehiclesInAccident() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherVehiclesInAccident());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherVehiclesInAccident(), i);
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
        new org.apache.axis.description.TypeDesc(Accident.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accident"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextInspectionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "NextInspectionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airbag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Airbag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Damage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxspeed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Maxspeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accidentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impacts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Impacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Impacts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Impacts"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherVehiclesInAccident");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OtherVehiclesInAccident"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentVehicle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentVehicle"));
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
