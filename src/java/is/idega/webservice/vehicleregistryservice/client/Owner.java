/**
 * Owner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class Owner  implements java.io.Serializable {
    private boolean current;

    private boolean anonymous;

    private java.lang.String purchaseDate;

    private java.lang.String ownregDate;

    private java.lang.String receptionDate;

    private java.lang.String persidno;

    private java.lang.String fullname;

    private java.lang.String address;

    private java.lang.String postalcode;

    private java.lang.String city;

    private java.lang.String ownerinsurancecode;

    private is.idega.webservice.vehicleregistryservice.client.CoOwner[] coOwners;

    public Owner() {
    }

    public Owner(
           boolean current,
           boolean anonymous,
           java.lang.String purchaseDate,
           java.lang.String ownregDate,
           java.lang.String receptionDate,
           java.lang.String persidno,
           java.lang.String fullname,
           java.lang.String address,
           java.lang.String postalcode,
           java.lang.String city,
           java.lang.String ownerinsurancecode,
           is.idega.webservice.vehicleregistryservice.client.CoOwner[] coOwners) {
           this.current = current;
           this.anonymous = anonymous;
           this.purchaseDate = purchaseDate;
           this.ownregDate = ownregDate;
           this.receptionDate = receptionDate;
           this.persidno = persidno;
           this.fullname = fullname;
           this.address = address;
           this.postalcode = postalcode;
           this.city = city;
           this.ownerinsurancecode = ownerinsurancecode;
           this.coOwners = coOwners;
    }


    /**
     * Gets the current value for this Owner.
     * 
     * @return current
     */
    public boolean isCurrent() {
        return current;
    }


    /**
     * Sets the current value for this Owner.
     * 
     * @param current
     */
    public void setCurrent(boolean current) {
        this.current = current;
    }


    /**
     * Gets the anonymous value for this Owner.
     * 
     * @return anonymous
     */
    public boolean isAnonymous() {
        return anonymous;
    }


    /**
     * Sets the anonymous value for this Owner.
     * 
     * @param anonymous
     */
    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }


    /**
     * Gets the purchaseDate value for this Owner.
     * 
     * @return purchaseDate
     */
    public java.lang.String getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this Owner.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(java.lang.String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the ownregDate value for this Owner.
     * 
     * @return ownregDate
     */
    public java.lang.String getOwnregDate() {
        return ownregDate;
    }


    /**
     * Sets the ownregDate value for this Owner.
     * 
     * @param ownregDate
     */
    public void setOwnregDate(java.lang.String ownregDate) {
        this.ownregDate = ownregDate;
    }


    /**
     * Gets the receptionDate value for this Owner.
     * 
     * @return receptionDate
     */
    public java.lang.String getReceptionDate() {
        return receptionDate;
    }


    /**
     * Sets the receptionDate value for this Owner.
     * 
     * @param receptionDate
     */
    public void setReceptionDate(java.lang.String receptionDate) {
        this.receptionDate = receptionDate;
    }


    /**
     * Gets the persidno value for this Owner.
     * 
     * @return persidno
     */
    public java.lang.String getPersidno() {
        return persidno;
    }


    /**
     * Sets the persidno value for this Owner.
     * 
     * @param persidno
     */
    public void setPersidno(java.lang.String persidno) {
        this.persidno = persidno;
    }


    /**
     * Gets the fullname value for this Owner.
     * 
     * @return fullname
     */
    public java.lang.String getFullname() {
        return fullname;
    }


    /**
     * Sets the fullname value for this Owner.
     * 
     * @param fullname
     */
    public void setFullname(java.lang.String fullname) {
        this.fullname = fullname;
    }


    /**
     * Gets the address value for this Owner.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Owner.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the postalcode value for this Owner.
     * 
     * @return postalcode
     */
    public java.lang.String getPostalcode() {
        return postalcode;
    }


    /**
     * Sets the postalcode value for this Owner.
     * 
     * @param postalcode
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }


    /**
     * Gets the city value for this Owner.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Owner.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the ownerinsurancecode value for this Owner.
     * 
     * @return ownerinsurancecode
     */
    public java.lang.String getOwnerinsurancecode() {
        return ownerinsurancecode;
    }


    /**
     * Sets the ownerinsurancecode value for this Owner.
     * 
     * @param ownerinsurancecode
     */
    public void setOwnerinsurancecode(java.lang.String ownerinsurancecode) {
        this.ownerinsurancecode = ownerinsurancecode;
    }


    /**
     * Gets the coOwners value for this Owner.
     * 
     * @return coOwners
     */
    public is.idega.webservice.vehicleregistryservice.client.CoOwner[] getCoOwners() {
        return coOwners;
    }


    /**
     * Sets the coOwners value for this Owner.
     * 
     * @param coOwners
     */
    public void setCoOwners(is.idega.webservice.vehicleregistryservice.client.CoOwner[] coOwners) {
        this.coOwners = coOwners;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Owner)) return false;
        Owner other = (Owner) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.current == other.isCurrent() &&
            this.anonymous == other.isAnonymous() &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate()))) &&
            ((this.ownregDate==null && other.getOwnregDate()==null) || 
             (this.ownregDate!=null &&
              this.ownregDate.equals(other.getOwnregDate()))) &&
            ((this.receptionDate==null && other.getReceptionDate()==null) || 
             (this.receptionDate!=null &&
              this.receptionDate.equals(other.getReceptionDate()))) &&
            ((this.persidno==null && other.getPersidno()==null) || 
             (this.persidno!=null &&
              this.persidno.equals(other.getPersidno()))) &&
            ((this.fullname==null && other.getFullname()==null) || 
             (this.fullname!=null &&
              this.fullname.equals(other.getFullname()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.postalcode==null && other.getPostalcode()==null) || 
             (this.postalcode!=null &&
              this.postalcode.equals(other.getPostalcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.ownerinsurancecode==null && other.getOwnerinsurancecode()==null) || 
             (this.ownerinsurancecode!=null &&
              this.ownerinsurancecode.equals(other.getOwnerinsurancecode()))) &&
            ((this.coOwners==null && other.getCoOwners()==null) || 
             (this.coOwners!=null &&
              java.util.Arrays.equals(this.coOwners, other.getCoOwners())));
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
        _hashCode += (isCurrent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAnonymous() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        if (getOwnregDate() != null) {
            _hashCode += getOwnregDate().hashCode();
        }
        if (getReceptionDate() != null) {
            _hashCode += getReceptionDate().hashCode();
        }
        if (getPersidno() != null) {
            _hashCode += getPersidno().hashCode();
        }
        if (getFullname() != null) {
            _hashCode += getFullname().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPostalcode() != null) {
            _hashCode += getPostalcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getOwnerinsurancecode() != null) {
            _hashCode += getOwnerinsurancecode().hashCode();
        }
        if (getCoOwners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoOwners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoOwners(), i);
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
        new org.apache.axis.description.TypeDesc(Owner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Owner"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymous");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Anonymous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PurchaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownregDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnregDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ReceptionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fullname");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Fullname"));
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
        elemField.setFieldName("postalcode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Postalcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerinsurancecode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Ownerinsurancecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coOwners");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CoOwners"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CoOwner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CoOwner"));
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
