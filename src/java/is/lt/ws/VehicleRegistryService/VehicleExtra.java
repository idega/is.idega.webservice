/**
 * VehicleExtra.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VehicleExtra  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String permNo;

    private java.lang.String regNo;

    private java.lang.String vin;

    private is.lt.ws.VehicleRegistryService.Wage wage;

    private is.lt.ws.VehicleRegistryService.ExciseTax[] exciseTax;

    private java.lang.String exciseTaxes;

    private is.lt.ws.VehicleRegistryService.TotalStatus totalStatus;

    private is.lt.ws.VehicleRegistryService.Reading[] alestrar;

    private is.lt.ws.VehicleRegistryService.EstimatedAutomobileTax estimatedAutomobileTaxes;

    private boolean hasEncumbrances;

    private int encumbrancesStatus;

    private java.lang.String inspectionFine;

    private java.util.Calendar queryTimeStamp;

    public VehicleExtra() {
    }

    public VehicleExtra(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String permNo,
           java.lang.String regNo,
           java.lang.String vin,
           is.lt.ws.VehicleRegistryService.Wage wage,
           is.lt.ws.VehicleRegistryService.ExciseTax[] exciseTax,
           java.lang.String exciseTaxes,
           is.lt.ws.VehicleRegistryService.TotalStatus totalStatus,
           is.lt.ws.VehicleRegistryService.Reading[] alestrar,
           is.lt.ws.VehicleRegistryService.EstimatedAutomobileTax estimatedAutomobileTaxes,
           boolean hasEncumbrances,
           int encumbrancesStatus,
           java.lang.String inspectionFine,
           java.util.Calendar queryTimeStamp) {
           this.extensionData = extensionData;
           this.permNo = permNo;
           this.regNo = regNo;
           this.vin = vin;
           this.wage = wage;
           this.exciseTax = exciseTax;
           this.exciseTaxes = exciseTaxes;
           this.totalStatus = totalStatus;
           this.alestrar = alestrar;
           this.estimatedAutomobileTaxes = estimatedAutomobileTaxes;
           this.hasEncumbrances = hasEncumbrances;
           this.encumbrancesStatus = encumbrancesStatus;
           this.inspectionFine = inspectionFine;
           this.queryTimeStamp = queryTimeStamp;
    }


    /**
     * Gets the extensionData value for this VehicleExtra.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this VehicleExtra.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the permNo value for this VehicleExtra.
     *
     * @return permNo
     */
    public java.lang.String getPermNo() {
        return permNo;
    }


    /**
     * Sets the permNo value for this VehicleExtra.
     *
     * @param permNo
     */
    public void setPermNo(java.lang.String permNo) {
        this.permNo = permNo;
    }


    /**
     * Gets the regNo value for this VehicleExtra.
     *
     * @return regNo
     */
    public java.lang.String getRegNo() {
        return regNo;
    }


    /**
     * Sets the regNo value for this VehicleExtra.
     *
     * @param regNo
     */
    public void setRegNo(java.lang.String regNo) {
        this.regNo = regNo;
    }


    /**
     * Gets the vin value for this VehicleExtra.
     *
     * @return vin
     */
    public java.lang.String getVin() {
        return vin;
    }


    /**
     * Sets the vin value for this VehicleExtra.
     *
     * @param vin
     */
    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }


    /**
     * Gets the wage value for this VehicleExtra.
     *
     * @return wage
     */
    public is.lt.ws.VehicleRegistryService.Wage getWage() {
        return wage;
    }


    /**
     * Sets the wage value for this VehicleExtra.
     *
     * @param wage
     */
    public void setWage(is.lt.ws.VehicleRegistryService.Wage wage) {
        this.wage = wage;
    }


    /**
     * Gets the exciseTax value for this VehicleExtra.
     *
     * @return exciseTax
     */
    public is.lt.ws.VehicleRegistryService.ExciseTax[] getExciseTax() {
        return exciseTax;
    }


    /**
     * Sets the exciseTax value for this VehicleExtra.
     *
     * @param exciseTax
     */
    public void setExciseTax(is.lt.ws.VehicleRegistryService.ExciseTax[] exciseTax) {
        this.exciseTax = exciseTax;
    }


    /**
     * Gets the exciseTaxes value for this VehicleExtra.
     *
     * @return exciseTaxes
     */
    public java.lang.String getExciseTaxes() {
        return exciseTaxes;
    }


    /**
     * Sets the exciseTaxes value for this VehicleExtra.
     *
     * @param exciseTaxes
     */
    public void setExciseTaxes(java.lang.String exciseTaxes) {
        this.exciseTaxes = exciseTaxes;
    }


    /**
     * Gets the totalStatus value for this VehicleExtra.
     *
     * @return totalStatus
     */
    public is.lt.ws.VehicleRegistryService.TotalStatus getTotalStatus() {
        return totalStatus;
    }


    /**
     * Sets the totalStatus value for this VehicleExtra.
     *
     * @param totalStatus
     */
    public void setTotalStatus(is.lt.ws.VehicleRegistryService.TotalStatus totalStatus) {
        this.totalStatus = totalStatus;
    }


    /**
     * Gets the alestrar value for this VehicleExtra.
     *
     * @return alestrar
     */
    public is.lt.ws.VehicleRegistryService.Reading[] getAlestrar() {
        return alestrar;
    }


    /**
     * Sets the alestrar value for this VehicleExtra.
     *
     * @param alestrar
     */
    public void setAlestrar(is.lt.ws.VehicleRegistryService.Reading[] alestrar) {
        this.alestrar = alestrar;
    }


    /**
     * Gets the estimatedAutomobileTaxes value for this VehicleExtra.
     *
     * @return estimatedAutomobileTaxes
     */
    public is.lt.ws.VehicleRegistryService.EstimatedAutomobileTax getEstimatedAutomobileTaxes() {
        return estimatedAutomobileTaxes;
    }


    /**
     * Sets the estimatedAutomobileTaxes value for this VehicleExtra.
     *
     * @param estimatedAutomobileTaxes
     */
    public void setEstimatedAutomobileTaxes(is.lt.ws.VehicleRegistryService.EstimatedAutomobileTax estimatedAutomobileTaxes) {
        this.estimatedAutomobileTaxes = estimatedAutomobileTaxes;
    }


    /**
     * Gets the hasEncumbrances value for this VehicleExtra.
     *
     * @return hasEncumbrances
     */
    public boolean isHasEncumbrances() {
        return hasEncumbrances;
    }


    /**
     * Sets the hasEncumbrances value for this VehicleExtra.
     *
     * @param hasEncumbrances
     */
    public void setHasEncumbrances(boolean hasEncumbrances) {
        this.hasEncumbrances = hasEncumbrances;
    }


    /**
     * Gets the encumbrancesStatus value for this VehicleExtra.
     *
     * @return encumbrancesStatus
     */
    public int getEncumbrancesStatus() {
        return encumbrancesStatus;
    }


    /**
     * Sets the encumbrancesStatus value for this VehicleExtra.
     *
     * @param encumbrancesStatus
     */
    public void setEncumbrancesStatus(int encumbrancesStatus) {
        this.encumbrancesStatus = encumbrancesStatus;
    }


    /**
     * Gets the inspectionFine value for this VehicleExtra.
     *
     * @return inspectionFine
     */
    public java.lang.String getInspectionFine() {
        return inspectionFine;
    }


    /**
     * Sets the inspectionFine value for this VehicleExtra.
     *
     * @param inspectionFine
     */
    public void setInspectionFine(java.lang.String inspectionFine) {
        this.inspectionFine = inspectionFine;
    }


    /**
     * Gets the queryTimeStamp value for this VehicleExtra.
     *
     * @return queryTimeStamp
     */
    public java.util.Calendar getQueryTimeStamp() {
        return queryTimeStamp;
    }


    /**
     * Sets the queryTimeStamp value for this VehicleExtra.
     *
     * @param queryTimeStamp
     */
    public void setQueryTimeStamp(java.util.Calendar queryTimeStamp) {
        this.queryTimeStamp = queryTimeStamp;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleExtra)) {
			return false;
		}
        VehicleExtra other = (VehicleExtra) obj;
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
            ((this.permNo==null && other.getPermNo()==null) ||
             (this.permNo!=null &&
              this.permNo.equals(other.getPermNo()))) &&
            ((this.regNo==null && other.getRegNo()==null) ||
             (this.regNo!=null &&
              this.regNo.equals(other.getRegNo()))) &&
            ((this.vin==null && other.getVin()==null) ||
             (this.vin!=null &&
              this.vin.equals(other.getVin()))) &&
            ((this.wage==null && other.getWage()==null) ||
             (this.wage!=null &&
              this.wage.equals(other.getWage()))) &&
            ((this.exciseTax==null && other.getExciseTax()==null) ||
             (this.exciseTax!=null &&
              java.util.Arrays.equals(this.exciseTax, other.getExciseTax()))) &&
            ((this.exciseTaxes==null && other.getExciseTaxes()==null) ||
             (this.exciseTaxes!=null &&
              this.exciseTaxes.equals(other.getExciseTaxes()))) &&
            ((this.totalStatus==null && other.getTotalStatus()==null) ||
             (this.totalStatus!=null &&
              this.totalStatus.equals(other.getTotalStatus()))) &&
            ((this.alestrar==null && other.getAlestrar()==null) ||
             (this.alestrar!=null &&
              java.util.Arrays.equals(this.alestrar, other.getAlestrar()))) &&
            ((this.estimatedAutomobileTaxes==null && other.getEstimatedAutomobileTaxes()==null) ||
             (this.estimatedAutomobileTaxes!=null &&
              this.estimatedAutomobileTaxes.equals(other.getEstimatedAutomobileTaxes()))) &&
            this.hasEncumbrances == other.isHasEncumbrances() &&
            this.encumbrancesStatus == other.getEncumbrancesStatus() &&
            ((this.inspectionFine==null && other.getInspectionFine()==null) ||
             (this.inspectionFine!=null &&
              this.inspectionFine.equals(other.getInspectionFine()))) &&
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
        if (getPermNo() != null) {
            _hashCode += getPermNo().hashCode();
        }
        if (getRegNo() != null) {
            _hashCode += getRegNo().hashCode();
        }
        if (getVin() != null) {
            _hashCode += getVin().hashCode();
        }
        if (getWage() != null) {
            _hashCode += getWage().hashCode();
        }
        if (getExciseTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExciseTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExciseTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExciseTaxes() != null) {
            _hashCode += getExciseTaxes().hashCode();
        }
        if (getTotalStatus() != null) {
            _hashCode += getTotalStatus().hashCode();
        }
        if (getAlestrar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlestrar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlestrar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedAutomobileTaxes() != null) {
            _hashCode += getEstimatedAutomobileTaxes().hashCode();
        }
        _hashCode += (isHasEncumbrances() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getEncumbrancesStatus();
        if (getInspectionFine() != null) {
            _hashCode += getInspectionFine().hashCode();
        }
        if (getQueryTimeStamp() != null) {
            _hashCode += getQueryTimeStamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleExtra.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleExtra"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permNo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PermNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regNo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "RegNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Wage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Wage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exciseTax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTax"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exciseTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TotalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TotalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alestrar");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Alestrar"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reading"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reading"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedAutomobileTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EstimatedAutomobileTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EstimatedAutomobileTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasEncumbrances");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "HasEncumbrances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encumbrancesStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EncumbrancesStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspectionFine");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InspectionFine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
