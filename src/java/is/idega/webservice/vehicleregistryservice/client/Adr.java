/**
 * Adr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class Adr  implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String expires;

    private boolean EXII;

    private boolean EXIII;

    private boolean FL;

    private boolean OX;

    private boolean AT;

    private java.lang.String pressExpires;

    private java.lang.String invalidDate;

    public Adr() {
    }

    public Adr(
           java.lang.String date,
           java.lang.String expires,
           boolean EXII,
           boolean EXIII,
           boolean FL,
           boolean OX,
           boolean AT,
           java.lang.String pressExpires,
           java.lang.String invalidDate) {
           this.date = date;
           this.expires = expires;
           this.EXII = EXII;
           this.EXIII = EXIII;
           this.FL = FL;
           this.OX = OX;
           this.AT = AT;
           this.pressExpires = pressExpires;
           this.invalidDate = invalidDate;
    }


    /**
     * Gets the date value for this Adr.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Adr.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the expires value for this Adr.
     * 
     * @return expires
     */
    public java.lang.String getExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this Adr.
     * 
     * @param expires
     */
    public void setExpires(java.lang.String expires) {
        this.expires = expires;
    }


    /**
     * Gets the EXII value for this Adr.
     * 
     * @return EXII
     */
    public boolean isEXII() {
        return EXII;
    }


    /**
     * Sets the EXII value for this Adr.
     * 
     * @param EXII
     */
    public void setEXII(boolean EXII) {
        this.EXII = EXII;
    }


    /**
     * Gets the EXIII value for this Adr.
     * 
     * @return EXIII
     */
    public boolean isEXIII() {
        return EXIII;
    }


    /**
     * Sets the EXIII value for this Adr.
     * 
     * @param EXIII
     */
    public void setEXIII(boolean EXIII) {
        this.EXIII = EXIII;
    }


    /**
     * Gets the FL value for this Adr.
     * 
     * @return FL
     */
    public boolean isFL() {
        return FL;
    }


    /**
     * Sets the FL value for this Adr.
     * 
     * @param FL
     */
    public void setFL(boolean FL) {
        this.FL = FL;
    }


    /**
     * Gets the OX value for this Adr.
     * 
     * @return OX
     */
    public boolean isOX() {
        return OX;
    }


    /**
     * Sets the OX value for this Adr.
     * 
     * @param OX
     */
    public void setOX(boolean OX) {
        this.OX = OX;
    }


    /**
     * Gets the AT value for this Adr.
     * 
     * @return AT
     */
    public boolean isAT() {
        return AT;
    }


    /**
     * Sets the AT value for this Adr.
     * 
     * @param AT
     */
    public void setAT(boolean AT) {
        this.AT = AT;
    }


    /**
     * Gets the pressExpires value for this Adr.
     * 
     * @return pressExpires
     */
    public java.lang.String getPressExpires() {
        return pressExpires;
    }


    /**
     * Sets the pressExpires value for this Adr.
     * 
     * @param pressExpires
     */
    public void setPressExpires(java.lang.String pressExpires) {
        this.pressExpires = pressExpires;
    }


    /**
     * Gets the invalidDate value for this Adr.
     * 
     * @return invalidDate
     */
    public java.lang.String getInvalidDate() {
        return invalidDate;
    }


    /**
     * Sets the invalidDate value for this Adr.
     * 
     * @param invalidDate
     */
    public void setInvalidDate(java.lang.String invalidDate) {
        this.invalidDate = invalidDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Adr)) return false;
        Adr other = (Adr) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.expires==null && other.getExpires()==null) || 
             (this.expires!=null &&
              this.expires.equals(other.getExpires()))) &&
            this.EXII == other.isEXII() &&
            this.EXIII == other.isEXIII() &&
            this.FL == other.isFL() &&
            this.OX == other.isOX() &&
            this.AT == other.isAT() &&
            ((this.pressExpires==null && other.getPressExpires()==null) || 
             (this.pressExpires!=null &&
              this.pressExpires.equals(other.getPressExpires()))) &&
            ((this.invalidDate==null && other.getInvalidDate()==null) || 
             (this.invalidDate!=null &&
              this.invalidDate.equals(other.getInvalidDate())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getExpires() != null) {
            _hashCode += getExpires().hashCode();
        }
        _hashCode += (isEXII() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEXIII() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOX() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAT() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPressExpires() != null) {
            _hashCode += getPressExpires().hashCode();
        }
        if (getInvalidDate() != null) {
            _hashCode += getInvalidDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Adr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Adr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXII");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EXII"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXIII");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EXIII"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "FL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OX");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AT");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pressExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PressExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InvalidDate"));
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
