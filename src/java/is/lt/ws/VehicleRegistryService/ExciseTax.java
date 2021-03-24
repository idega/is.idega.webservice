/**
 * ExciseTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExciseTax  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String importFee;

    private java.lang.String processCost;

    private java.lang.String interest;

    private java.lang.String expenses;

    private java.lang.String notOverdue;

    private java.lang.String lastMovementDate;

    private java.lang.String comment;

    private java.lang.String SSN;

    public ExciseTax() {
    }

    public ExciseTax(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String importFee,
           java.lang.String processCost,
           java.lang.String interest,
           java.lang.String expenses,
           java.lang.String notOverdue,
           java.lang.String lastMovementDate,
           java.lang.String comment,
           java.lang.String SSN) {
           this.extensionData = extensionData;
           this.importFee = importFee;
           this.processCost = processCost;
           this.interest = interest;
           this.expenses = expenses;
           this.notOverdue = notOverdue;
           this.lastMovementDate = lastMovementDate;
           this.comment = comment;
           this.SSN = SSN;
    }


    /**
     * Gets the extensionData value for this ExciseTax.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this ExciseTax.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the importFee value for this ExciseTax.
     *
     * @return importFee
     */
    public java.lang.String getImportFee() {
        return importFee;
    }


    /**
     * Sets the importFee value for this ExciseTax.
     *
     * @param importFee
     */
    public void setImportFee(java.lang.String importFee) {
        this.importFee = importFee;
    }


    /**
     * Gets the processCost value for this ExciseTax.
     *
     * @return processCost
     */
    public java.lang.String getProcessCost() {
        return processCost;
    }


    /**
     * Sets the processCost value for this ExciseTax.
     *
     * @param processCost
     */
    public void setProcessCost(java.lang.String processCost) {
        this.processCost = processCost;
    }


    /**
     * Gets the interest value for this ExciseTax.
     *
     * @return interest
     */
    public java.lang.String getInterest() {
        return interest;
    }


    /**
     * Sets the interest value for this ExciseTax.
     *
     * @param interest
     */
    public void setInterest(java.lang.String interest) {
        this.interest = interest;
    }


    /**
     * Gets the expenses value for this ExciseTax.
     *
     * @return expenses
     */
    public java.lang.String getExpenses() {
        return expenses;
    }


    /**
     * Sets the expenses value for this ExciseTax.
     *
     * @param expenses
     */
    public void setExpenses(java.lang.String expenses) {
        this.expenses = expenses;
    }


    /**
     * Gets the notOverdue value for this ExciseTax.
     *
     * @return notOverdue
     */
    public java.lang.String getNotOverdue() {
        return notOverdue;
    }


    /**
     * Sets the notOverdue value for this ExciseTax.
     *
     * @param notOverdue
     */
    public void setNotOverdue(java.lang.String notOverdue) {
        this.notOverdue = notOverdue;
    }


    /**
     * Gets the lastMovementDate value for this ExciseTax.
     *
     * @return lastMovementDate
     */
    public java.lang.String getLastMovementDate() {
        return lastMovementDate;
    }


    /**
     * Sets the lastMovementDate value for this ExciseTax.
     *
     * @param lastMovementDate
     */
    public void setLastMovementDate(java.lang.String lastMovementDate) {
        this.lastMovementDate = lastMovementDate;
    }


    /**
     * Gets the comment value for this ExciseTax.
     *
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ExciseTax.
     *
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the SSN value for this ExciseTax.
     *
     * @return SSN
     */
    public java.lang.String getSSN() {
        return SSN;
    }


    /**
     * Sets the SSN value for this ExciseTax.
     *
     * @param SSN
     */
    public void setSSN(java.lang.String SSN) {
        this.SSN = SSN;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExciseTax)) return false;
        ExciseTax other = (ExciseTax) obj;
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
            ((this.importFee==null && other.getImportFee()==null) ||
             (this.importFee!=null &&
              this.importFee.equals(other.getImportFee()))) &&
            ((this.processCost==null && other.getProcessCost()==null) ||
             (this.processCost!=null &&
              this.processCost.equals(other.getProcessCost()))) &&
            ((this.interest==null && other.getInterest()==null) ||
             (this.interest!=null &&
              this.interest.equals(other.getInterest()))) &&
            ((this.expenses==null && other.getExpenses()==null) ||
             (this.expenses!=null &&
              this.expenses.equals(other.getExpenses()))) &&
            ((this.notOverdue==null && other.getNotOverdue()==null) ||
             (this.notOverdue!=null &&
              this.notOverdue.equals(other.getNotOverdue()))) &&
            ((this.lastMovementDate==null && other.getLastMovementDate()==null) ||
             (this.lastMovementDate!=null &&
              this.lastMovementDate.equals(other.getLastMovementDate()))) &&
            ((this.comment==null && other.getComment()==null) ||
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.SSN==null && other.getSSN()==null) ||
             (this.SSN!=null &&
              this.SSN.equals(other.getSSN())));
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
        if (getImportFee() != null) {
            _hashCode += getImportFee().hashCode();
        }
        if (getProcessCost() != null) {
            _hashCode += getProcessCost().hashCode();
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
        if (getLastMovementDate() != null) {
            _hashCode += getLastMovementDate().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getSSN() != null) {
            _hashCode += getSSN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExciseTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importFee");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ImportFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processCost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ProcessCost"));
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
        elemField.setFieldName("lastMovementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "LastMovementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SSN"));
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
