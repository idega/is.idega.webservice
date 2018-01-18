/**
 * Mass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

public class Mass  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String massinro;

    private java.lang.String massofveh;

    private java.lang.String[] massdaxle;

    private java.lang.String[] massmaxle;

    private java.lang.String massladen;

    private java.lang.String massoftrbr;

    private java.lang.String massoftrunbr;

    private java.lang.String massofcomb;

    private java.lang.String massatcoup;

    private java.lang.String masscapacity;

    public Mass() {
    }

    public Mass(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String massinro,
           java.lang.String massofveh,
           java.lang.String[] massdaxle,
           java.lang.String[] massmaxle,
           java.lang.String massladen,
           java.lang.String massoftrbr,
           java.lang.String massoftrunbr,
           java.lang.String massofcomb,
           java.lang.String massatcoup,
           java.lang.String masscapacity) {
           this.extensionData = extensionData;
           this.massinro = massinro;
           this.massofveh = massofveh;
           this.massdaxle = massdaxle;
           this.massmaxle = massmaxle;
           this.massladen = massladen;
           this.massoftrbr = massoftrbr;
           this.massoftrunbr = massoftrunbr;
           this.massofcomb = massofcomb;
           this.massatcoup = massatcoup;
           this.masscapacity = masscapacity;
    }


    /**
     * Gets the extensionData value for this Mass.
     * 
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Mass.
     * 
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the massinro value for this Mass.
     * 
     * @return massinro
     */
    public java.lang.String getMassinro() {
        return massinro;
    }


    /**
     * Sets the massinro value for this Mass.
     * 
     * @param massinro
     */
    public void setMassinro(java.lang.String massinro) {
        this.massinro = massinro;
    }


    /**
     * Gets the massofveh value for this Mass.
     * 
     * @return massofveh
     */
    public java.lang.String getMassofveh() {
        return massofveh;
    }


    /**
     * Sets the massofveh value for this Mass.
     * 
     * @param massofveh
     */
    public void setMassofveh(java.lang.String massofveh) {
        this.massofveh = massofveh;
    }


    /**
     * Gets the massdaxle value for this Mass.
     * 
     * @return massdaxle
     */
    public java.lang.String[] getMassdaxle() {
        return massdaxle;
    }


    /**
     * Sets the massdaxle value for this Mass.
     * 
     * @param massdaxle
     */
    public void setMassdaxle(java.lang.String[] massdaxle) {
        this.massdaxle = massdaxle;
    }


    /**
     * Gets the massmaxle value for this Mass.
     * 
     * @return massmaxle
     */
    public java.lang.String[] getMassmaxle() {
        return massmaxle;
    }


    /**
     * Sets the massmaxle value for this Mass.
     * 
     * @param massmaxle
     */
    public void setMassmaxle(java.lang.String[] massmaxle) {
        this.massmaxle = massmaxle;
    }


    /**
     * Gets the massladen value for this Mass.
     * 
     * @return massladen
     */
    public java.lang.String getMassladen() {
        return massladen;
    }


    /**
     * Sets the massladen value for this Mass.
     * 
     * @param massladen
     */
    public void setMassladen(java.lang.String massladen) {
        this.massladen = massladen;
    }


    /**
     * Gets the massoftrbr value for this Mass.
     * 
     * @return massoftrbr
     */
    public java.lang.String getMassoftrbr() {
        return massoftrbr;
    }


    /**
     * Sets the massoftrbr value for this Mass.
     * 
     * @param massoftrbr
     */
    public void setMassoftrbr(java.lang.String massoftrbr) {
        this.massoftrbr = massoftrbr;
    }


    /**
     * Gets the massoftrunbr value for this Mass.
     * 
     * @return massoftrunbr
     */
    public java.lang.String getMassoftrunbr() {
        return massoftrunbr;
    }


    /**
     * Sets the massoftrunbr value for this Mass.
     * 
     * @param massoftrunbr
     */
    public void setMassoftrunbr(java.lang.String massoftrunbr) {
        this.massoftrunbr = massoftrunbr;
    }


    /**
     * Gets the massofcomb value for this Mass.
     * 
     * @return massofcomb
     */
    public java.lang.String getMassofcomb() {
        return massofcomb;
    }


    /**
     * Sets the massofcomb value for this Mass.
     * 
     * @param massofcomb
     */
    public void setMassofcomb(java.lang.String massofcomb) {
        this.massofcomb = massofcomb;
    }


    /**
     * Gets the massatcoup value for this Mass.
     * 
     * @return massatcoup
     */
    public java.lang.String getMassatcoup() {
        return massatcoup;
    }


    /**
     * Sets the massatcoup value for this Mass.
     * 
     * @param massatcoup
     */
    public void setMassatcoup(java.lang.String massatcoup) {
        this.massatcoup = massatcoup;
    }


    /**
     * Gets the masscapacity value for this Mass.
     * 
     * @return masscapacity
     */
    public java.lang.String getMasscapacity() {
        return masscapacity;
    }


    /**
     * Sets the masscapacity value for this Mass.
     * 
     * @param masscapacity
     */
    public void setMasscapacity(java.lang.String masscapacity) {
        this.masscapacity = masscapacity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mass)) return false;
        Mass other = (Mass) obj;
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
            ((this.massinro==null && other.getMassinro()==null) || 
             (this.massinro!=null &&
              this.massinro.equals(other.getMassinro()))) &&
            ((this.massofveh==null && other.getMassofveh()==null) || 
             (this.massofveh!=null &&
              this.massofveh.equals(other.getMassofveh()))) &&
            ((this.massdaxle==null && other.getMassdaxle()==null) || 
             (this.massdaxle!=null &&
              java.util.Arrays.equals(this.massdaxle, other.getMassdaxle()))) &&
            ((this.massmaxle==null && other.getMassmaxle()==null) || 
             (this.massmaxle!=null &&
              java.util.Arrays.equals(this.massmaxle, other.getMassmaxle()))) &&
            ((this.massladen==null && other.getMassladen()==null) || 
             (this.massladen!=null &&
              this.massladen.equals(other.getMassladen()))) &&
            ((this.massoftrbr==null && other.getMassoftrbr()==null) || 
             (this.massoftrbr!=null &&
              this.massoftrbr.equals(other.getMassoftrbr()))) &&
            ((this.massoftrunbr==null && other.getMassoftrunbr()==null) || 
             (this.massoftrunbr!=null &&
              this.massoftrunbr.equals(other.getMassoftrunbr()))) &&
            ((this.massofcomb==null && other.getMassofcomb()==null) || 
             (this.massofcomb!=null &&
              this.massofcomb.equals(other.getMassofcomb()))) &&
            ((this.massatcoup==null && other.getMassatcoup()==null) || 
             (this.massatcoup!=null &&
              this.massatcoup.equals(other.getMassatcoup()))) &&
            ((this.masscapacity==null && other.getMasscapacity()==null) || 
             (this.masscapacity!=null &&
              this.masscapacity.equals(other.getMasscapacity())));
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
        if (getMassinro() != null) {
            _hashCode += getMassinro().hashCode();
        }
        if (getMassofveh() != null) {
            _hashCode += getMassofveh().hashCode();
        }
        if (getMassdaxle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMassdaxle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMassdaxle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMassmaxle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMassmaxle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMassmaxle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMassladen() != null) {
            _hashCode += getMassladen().hashCode();
        }
        if (getMassoftrbr() != null) {
            _hashCode += getMassoftrbr().hashCode();
        }
        if (getMassoftrunbr() != null) {
            _hashCode += getMassoftrunbr().hashCode();
        }
        if (getMassofcomb() != null) {
            _hashCode += getMassofcomb().hashCode();
        }
        if (getMassatcoup() != null) {
            _hashCode += getMassatcoup().hashCode();
        }
        if (getMasscapacity() != null) {
            _hashCode += getMasscapacity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Mass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massinro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massinro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massofveh");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massofveh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massdaxle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massdaxle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massmaxle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massmaxle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massladen");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massladen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massoftrbr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massoftrbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massoftrunbr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massoftrunbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massofcomb");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massofcomb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massatcoup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Massatcoup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masscapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Masscapacity"));
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
