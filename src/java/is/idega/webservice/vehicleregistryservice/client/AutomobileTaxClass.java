/**
 * AutomobileTaxClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class AutomobileTaxClass  implements java.io.Serializable {
    private java.lang.String automobileTax;

    private java.lang.String insurance;

    private java.lang.String weightTax;

    private java.lang.String interest;

    private java.lang.String expenses;

    private java.lang.String notOverdue;

    private java.lang.String movementDate;

    private java.lang.String gjaldfl;

    private java.lang.String kennitala;

    public AutomobileTaxClass() {
    }

    public AutomobileTaxClass(
           java.lang.String automobileTax,
           java.lang.String insurance,
           java.lang.String weightTax,
           java.lang.String interest,
           java.lang.String expenses,
           java.lang.String notOverdue,
           java.lang.String movementDate,
           java.lang.String gjaldfl,
           java.lang.String kennitala) {
           this.automobileTax = automobileTax;
           this.insurance = insurance;
           this.weightTax = weightTax;
           this.interest = interest;
           this.expenses = expenses;
           this.notOverdue = notOverdue;
           this.movementDate = movementDate;
           this.gjaldfl = gjaldfl;
           this.kennitala = kennitala;
    }


    /**
     * Gets the automobileTax value for this AutomobileTaxClass.
     * 
     * @return automobileTax
     */
    public java.lang.String getAutomobileTax() {
        return automobileTax;
    }


    /**
     * Sets the automobileTax value for this AutomobileTaxClass.
     * 
     * @param automobileTax
     */
    public void setAutomobileTax(java.lang.String automobileTax) {
        this.automobileTax = automobileTax;
    }


    /**
     * Gets the insurance value for this AutomobileTaxClass.
     * 
     * @return insurance
     */
    public java.lang.String getInsurance() {
        return insurance;
    }


    /**
     * Sets the insurance value for this AutomobileTaxClass.
     * 
     * @param insurance
     */
    public void setInsurance(java.lang.String insurance) {
        this.insurance = insurance;
    }


    /**
     * Gets the weightTax value for this AutomobileTaxClass.
     * 
     * @return weightTax
     */
    public java.lang.String getWeightTax() {
        return weightTax;
    }


    /**
     * Sets the weightTax value for this AutomobileTaxClass.
     * 
     * @param weightTax
     */
    public void setWeightTax(java.lang.String weightTax) {
        this.weightTax = weightTax;
    }


    /**
     * Gets the interest value for this AutomobileTaxClass.
     * 
     * @return interest
     */
    public java.lang.String getInterest() {
        return interest;
    }


    /**
     * Sets the interest value for this AutomobileTaxClass.
     * 
     * @param interest
     */
    public void setInterest(java.lang.String interest) {
        this.interest = interest;
    }


    /**
     * Gets the expenses value for this AutomobileTaxClass.
     * 
     * @return expenses
     */
    public java.lang.String getExpenses() {
        return expenses;
    }


    /**
     * Sets the expenses value for this AutomobileTaxClass.
     * 
     * @param expenses
     */
    public void setExpenses(java.lang.String expenses) {
        this.expenses = expenses;
    }


    /**
     * Gets the notOverdue value for this AutomobileTaxClass.
     * 
     * @return notOverdue
     */
    public java.lang.String getNotOverdue() {
        return notOverdue;
    }


    /**
     * Sets the notOverdue value for this AutomobileTaxClass.
     * 
     * @param notOverdue
     */
    public void setNotOverdue(java.lang.String notOverdue) {
        this.notOverdue = notOverdue;
    }


    /**
     * Gets the movementDate value for this AutomobileTaxClass.
     * 
     * @return movementDate
     */
    public java.lang.String getMovementDate() {
        return movementDate;
    }


    /**
     * Sets the movementDate value for this AutomobileTaxClass.
     * 
     * @param movementDate
     */
    public void setMovementDate(java.lang.String movementDate) {
        this.movementDate = movementDate;
    }


    /**
     * Gets the gjaldfl value for this AutomobileTaxClass.
     * 
     * @return gjaldfl
     */
    public java.lang.String getGjaldfl() {
        return gjaldfl;
    }


    /**
     * Sets the gjaldfl value for this AutomobileTaxClass.
     * 
     * @param gjaldfl
     */
    public void setGjaldfl(java.lang.String gjaldfl) {
        this.gjaldfl = gjaldfl;
    }


    /**
     * Gets the kennitala value for this AutomobileTaxClass.
     * 
     * @return kennitala
     */
    public java.lang.String getKennitala() {
        return kennitala;
    }


    /**
     * Sets the kennitala value for this AutomobileTaxClass.
     * 
     * @param kennitala
     */
    public void setKennitala(java.lang.String kennitala) {
        this.kennitala = kennitala;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutomobileTaxClass)) return false;
        AutomobileTaxClass other = (AutomobileTaxClass) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.automobileTax==null && other.getAutomobileTax()==null) || 
             (this.automobileTax!=null &&
              this.automobileTax.equals(other.getAutomobileTax()))) &&
            ((this.insurance==null && other.getInsurance()==null) || 
             (this.insurance!=null &&
              this.insurance.equals(other.getInsurance()))) &&
            ((this.weightTax==null && other.getWeightTax()==null) || 
             (this.weightTax!=null &&
              this.weightTax.equals(other.getWeightTax()))) &&
            ((this.interest==null && other.getInterest()==null) || 
             (this.interest!=null &&
              this.interest.equals(other.getInterest()))) &&
            ((this.expenses==null && other.getExpenses()==null) || 
             (this.expenses!=null &&
              this.expenses.equals(other.getExpenses()))) &&
            ((this.notOverdue==null && other.getNotOverdue()==null) || 
             (this.notOverdue!=null &&
              this.notOverdue.equals(other.getNotOverdue()))) &&
            ((this.movementDate==null && other.getMovementDate()==null) || 
             (this.movementDate!=null &&
              this.movementDate.equals(other.getMovementDate()))) &&
            ((this.gjaldfl==null && other.getGjaldfl()==null) || 
             (this.gjaldfl!=null &&
              this.gjaldfl.equals(other.getGjaldfl()))) &&
            ((this.kennitala==null && other.getKennitala()==null) || 
             (this.kennitala!=null &&
              this.kennitala.equals(other.getKennitala())));
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
        if (getAutomobileTax() != null) {
            _hashCode += getAutomobileTax().hashCode();
        }
        if (getInsurance() != null) {
            _hashCode += getInsurance().hashCode();
        }
        if (getWeightTax() != null) {
            _hashCode += getWeightTax().hashCode();
        }
        if (getInterest() != null) {
            _hashCode += getInterest().hashCode();
        }
        if (getExpenses() != null) {
            _hashCode += getExpenses().hashCode();
        }
        if (getNotOverdue() != null) {
            _hashCode += getNotOverdue().hashCode();
        }
        if (getMovementDate() != null) {
            _hashCode += getMovementDate().hashCode();
        }
        if (getGjaldfl() != null) {
            _hashCode += getGjaldfl().hashCode();
        }
        if (getKennitala() != null) {
            _hashCode += getKennitala().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutomobileTaxClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AutomobileTaxClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automobileTax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AutomobileTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurance");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Insurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightTax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "WeightTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Interest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Expenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "NotOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "MovementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjaldfl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Gjaldfl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kennitala");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Kennitala"));
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
