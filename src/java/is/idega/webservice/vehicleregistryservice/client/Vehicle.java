/**
 * Vehicle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class Vehicle  implements java.io.Serializable {
    private java.lang.String permNo;

    private java.lang.String regNo;

    private java.lang.String vin;

    private java.lang.String typeNo;

    private java.lang.String type;

    private java.lang.String typeApproval;

    private java.lang.String typeapprovalextension;

    private java.lang.String eutypeapproval;

    private java.lang.String variant;

    private java.lang.String version;

    private java.lang.String modelcode;

    private java.lang.String make;

    private java.lang.String vehcom;

    private java.lang.String speccom;

    private java.lang.String color;

    private java.lang.String productYear;

    private java.lang.String modelYear;

    private java.lang.String preregDate;

    private java.lang.String reregdate;

    private java.lang.String customsDate;

    private java.lang.String firstregDate;

    private java.lang.String newregDate;

    private java.lang.String deregDate;

    private java.lang.String ownregDate;

    private java.lang.String manufacturer;

    private java.lang.String country;

    private java.lang.String importerpersidno;

    private java.lang.String importername;

    private java.lang.String _import;

    private java.lang.String vehiclestatus;

    private java.lang.String disastertype;

    private boolean hasdisasters;

    private boolean fixed;

    private boolean hasaccidents;

    private java.lang.String usegroup;

    private java.lang.String regType;

    private java.lang.String plateTypefront;

    private java.lang.String plateTyperear;

    private java.lang.String plateStatus;

    private java.lang.String plateStorageLocation;

    private java.lang.String insuranceCompany;

    private boolean insuranceStatus;

    private java.lang.String nextInspectionDate;

    private boolean rebuilt;

    private boolean offroad;

    private is.idega.webservice.vehicleregistryservice.client.Technical technical;

    private is.idega.webservice.vehicleregistryservice.client.Owner[] owners;

    private is.idega.webservice.vehicleregistryservice.client.Operator[] operators;

    private is.idega.webservice.vehicleregistryservice.client.Plate[] plates;

    private is.idega.webservice.vehicleregistryservice.client.Disaster[] disasters;

    private is.idega.webservice.vehicleregistryservice.client.Registration[] registrations;

    private is.idega.webservice.vehicleregistryservice.client.OutOfUse[] outofuses;

    private is.idega.webservice.vehicleregistryservice.client.Updatelock[] updatelocks;

    private is.idega.webservice.vehicleregistryservice.client.Stolen[] stolens;

    private is.idega.webservice.vehicleregistryservice.client.Remark[] remarks;

    private is.idega.webservice.vehicleregistryservice.client.Inspection[] inspections;

    private is.idega.webservice.vehicleregistryservice.client.OwnerRegistrationError[] ownerRegistrationErrors;

    private is.idega.webservice.vehicleregistryservice.client.VehicleChange[] vehicleChanges;

    private is.idega.webservice.vehicleregistryservice.client.TypeChange[] typeChanges;

    private is.idega.webservice.vehicleregistryservice.client.SpecialEquipmentChange[] specialEquipmentChanges;

    private is.idega.webservice.vehicleregistryservice.client.AddonsChange[] addonsChanges;

    private is.idega.webservice.vehicleregistryservice.client.SuperstructureChange[] superstructureChanges;

    private is.idega.webservice.vehicleregistryservice.client.Adr[] adrs;

    private java.lang.String latestRegistration;

    private java.util.Calendar queryTimeStamp;

    public Vehicle() {
    }

    public Vehicle(
           java.lang.String permNo,
           java.lang.String regNo,
           java.lang.String vin,
           java.lang.String typeNo,
           java.lang.String type,
           java.lang.String typeApproval,
           java.lang.String typeapprovalextension,
           java.lang.String eutypeapproval,
           java.lang.String variant,
           java.lang.String version,
           java.lang.String modelcode,
           java.lang.String make,
           java.lang.String vehcom,
           java.lang.String speccom,
           java.lang.String color,
           java.lang.String productYear,
           java.lang.String modelYear,
           java.lang.String preregDate,
           java.lang.String reregdate,
           java.lang.String customsDate,
           java.lang.String firstregDate,
           java.lang.String newregDate,
           java.lang.String deregDate,
           java.lang.String ownregDate,
           java.lang.String manufacturer,
           java.lang.String country,
           java.lang.String importerpersidno,
           java.lang.String importername,
           java.lang.String _import,
           java.lang.String vehiclestatus,
           java.lang.String disastertype,
           boolean hasdisasters,
           boolean fixed,
           boolean hasaccidents,
           java.lang.String usegroup,
           java.lang.String regType,
           java.lang.String plateTypefront,
           java.lang.String plateTyperear,
           java.lang.String plateStatus,
           java.lang.String plateStorageLocation,
           java.lang.String insuranceCompany,
           boolean insuranceStatus,
           java.lang.String nextInspectionDate,
           boolean rebuilt,
           boolean offroad,
           is.idega.webservice.vehicleregistryservice.client.Technical technical,
           is.idega.webservice.vehicleregistryservice.client.Owner[] owners,
           is.idega.webservice.vehicleregistryservice.client.Operator[] operators,
           is.idega.webservice.vehicleregistryservice.client.Plate[] plates,
           is.idega.webservice.vehicleregistryservice.client.Disaster[] disasters,
           is.idega.webservice.vehicleregistryservice.client.Registration[] registrations,
           is.idega.webservice.vehicleregistryservice.client.OutOfUse[] outofuses,
           is.idega.webservice.vehicleregistryservice.client.Updatelock[] updatelocks,
           is.idega.webservice.vehicleregistryservice.client.Stolen[] stolens,
           is.idega.webservice.vehicleregistryservice.client.Remark[] remarks,
           is.idega.webservice.vehicleregistryservice.client.Inspection[] inspections,
           is.idega.webservice.vehicleregistryservice.client.OwnerRegistrationError[] ownerRegistrationErrors,
           is.idega.webservice.vehicleregistryservice.client.VehicleChange[] vehicleChanges,
           is.idega.webservice.vehicleregistryservice.client.TypeChange[] typeChanges,
           is.idega.webservice.vehicleregistryservice.client.SpecialEquipmentChange[] specialEquipmentChanges,
           is.idega.webservice.vehicleregistryservice.client.AddonsChange[] addonsChanges,
           is.idega.webservice.vehicleregistryservice.client.SuperstructureChange[] superstructureChanges,
           is.idega.webservice.vehicleregistryservice.client.Adr[] adrs,
           java.lang.String latestRegistration,
           java.util.Calendar queryTimeStamp) {
           this.permNo = permNo;
           this.regNo = regNo;
           this.vin = vin;
           this.typeNo = typeNo;
           this.type = type;
           this.typeApproval = typeApproval;
           this.typeapprovalextension = typeapprovalextension;
           this.eutypeapproval = eutypeapproval;
           this.variant = variant;
           this.version = version;
           this.modelcode = modelcode;
           this.make = make;
           this.vehcom = vehcom;
           this.speccom = speccom;
           this.color = color;
           this.productYear = productYear;
           this.modelYear = modelYear;
           this.preregDate = preregDate;
           this.reregdate = reregdate;
           this.customsDate = customsDate;
           this.firstregDate = firstregDate;
           this.newregDate = newregDate;
           this.deregDate = deregDate;
           this.ownregDate = ownregDate;
           this.manufacturer = manufacturer;
           this.country = country;
           this.importerpersidno = importerpersidno;
           this.importername = importername;
           this._import = _import;
           this.vehiclestatus = vehiclestatus;
           this.disastertype = disastertype;
           this.hasdisasters = hasdisasters;
           this.fixed = fixed;
           this.hasaccidents = hasaccidents;
           this.usegroup = usegroup;
           this.regType = regType;
           this.plateTypefront = plateTypefront;
           this.plateTyperear = plateTyperear;
           this.plateStatus = plateStatus;
           this.plateStorageLocation = plateStorageLocation;
           this.insuranceCompany = insuranceCompany;
           this.insuranceStatus = insuranceStatus;
           this.nextInspectionDate = nextInspectionDate;
           this.rebuilt = rebuilt;
           this.offroad = offroad;
           this.technical = technical;
           this.owners = owners;
           this.operators = operators;
           this.plates = plates;
           this.disasters = disasters;
           this.registrations = registrations;
           this.outofuses = outofuses;
           this.updatelocks = updatelocks;
           this.stolens = stolens;
           this.remarks = remarks;
           this.inspections = inspections;
           this.ownerRegistrationErrors = ownerRegistrationErrors;
           this.vehicleChanges = vehicleChanges;
           this.typeChanges = typeChanges;
           this.specialEquipmentChanges = specialEquipmentChanges;
           this.addonsChanges = addonsChanges;
           this.superstructureChanges = superstructureChanges;
           this.adrs = adrs;
           this.latestRegistration = latestRegistration;
           this.queryTimeStamp = queryTimeStamp;
    }


    /**
     * Gets the permNo value for this Vehicle.
     * 
     * @return permNo
     */
    public java.lang.String getPermNo() {
        return permNo;
    }


    /**
     * Sets the permNo value for this Vehicle.
     * 
     * @param permNo
     */
    public void setPermNo(java.lang.String permNo) {
        this.permNo = permNo;
    }


    /**
     * Gets the regNo value for this Vehicle.
     * 
     * @return regNo
     */
    public java.lang.String getRegNo() {
        return regNo;
    }


    /**
     * Sets the regNo value for this Vehicle.
     * 
     * @param regNo
     */
    public void setRegNo(java.lang.String regNo) {
        this.regNo = regNo;
    }


    /**
     * Gets the vin value for this Vehicle.
     * 
     * @return vin
     */
    public java.lang.String getVin() {
        return vin;
    }


    /**
     * Sets the vin value for this Vehicle.
     * 
     * @param vin
     */
    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }


    /**
     * Gets the typeNo value for this Vehicle.
     * 
     * @return typeNo
     */
    public java.lang.String getTypeNo() {
        return typeNo;
    }


    /**
     * Sets the typeNo value for this Vehicle.
     * 
     * @param typeNo
     */
    public void setTypeNo(java.lang.String typeNo) {
        this.typeNo = typeNo;
    }


    /**
     * Gets the type value for this Vehicle.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Vehicle.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the typeApproval value for this Vehicle.
     * 
     * @return typeApproval
     */
    public java.lang.String getTypeApproval() {
        return typeApproval;
    }


    /**
     * Sets the typeApproval value for this Vehicle.
     * 
     * @param typeApproval
     */
    public void setTypeApproval(java.lang.String typeApproval) {
        this.typeApproval = typeApproval;
    }


    /**
     * Gets the typeapprovalextension value for this Vehicle.
     * 
     * @return typeapprovalextension
     */
    public java.lang.String getTypeapprovalextension() {
        return typeapprovalextension;
    }


    /**
     * Sets the typeapprovalextension value for this Vehicle.
     * 
     * @param typeapprovalextension
     */
    public void setTypeapprovalextension(java.lang.String typeapprovalextension) {
        this.typeapprovalextension = typeapprovalextension;
    }


    /**
     * Gets the eutypeapproval value for this Vehicle.
     * 
     * @return eutypeapproval
     */
    public java.lang.String getEutypeapproval() {
        return eutypeapproval;
    }


    /**
     * Sets the eutypeapproval value for this Vehicle.
     * 
     * @param eutypeapproval
     */
    public void setEutypeapproval(java.lang.String eutypeapproval) {
        this.eutypeapproval = eutypeapproval;
    }


    /**
     * Gets the variant value for this Vehicle.
     * 
     * @return variant
     */
    public java.lang.String getVariant() {
        return variant;
    }


    /**
     * Sets the variant value for this Vehicle.
     * 
     * @param variant
     */
    public void setVariant(java.lang.String variant) {
        this.variant = variant;
    }


    /**
     * Gets the version value for this Vehicle.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Vehicle.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the modelcode value for this Vehicle.
     * 
     * @return modelcode
     */
    public java.lang.String getModelcode() {
        return modelcode;
    }


    /**
     * Sets the modelcode value for this Vehicle.
     * 
     * @param modelcode
     */
    public void setModelcode(java.lang.String modelcode) {
        this.modelcode = modelcode;
    }


    /**
     * Gets the make value for this Vehicle.
     * 
     * @return make
     */
    public java.lang.String getMake() {
        return make;
    }


    /**
     * Sets the make value for this Vehicle.
     * 
     * @param make
     */
    public void setMake(java.lang.String make) {
        this.make = make;
    }


    /**
     * Gets the vehcom value for this Vehicle.
     * 
     * @return vehcom
     */
    public java.lang.String getVehcom() {
        return vehcom;
    }


    /**
     * Sets the vehcom value for this Vehicle.
     * 
     * @param vehcom
     */
    public void setVehcom(java.lang.String vehcom) {
        this.vehcom = vehcom;
    }


    /**
     * Gets the speccom value for this Vehicle.
     * 
     * @return speccom
     */
    public java.lang.String getSpeccom() {
        return speccom;
    }


    /**
     * Sets the speccom value for this Vehicle.
     * 
     * @param speccom
     */
    public void setSpeccom(java.lang.String speccom) {
        this.speccom = speccom;
    }


    /**
     * Gets the color value for this Vehicle.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this Vehicle.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the productYear value for this Vehicle.
     * 
     * @return productYear
     */
    public java.lang.String getProductYear() {
        return productYear;
    }


    /**
     * Sets the productYear value for this Vehicle.
     * 
     * @param productYear
     */
    public void setProductYear(java.lang.String productYear) {
        this.productYear = productYear;
    }


    /**
     * Gets the modelYear value for this Vehicle.
     * 
     * @return modelYear
     */
    public java.lang.String getModelYear() {
        return modelYear;
    }


    /**
     * Sets the modelYear value for this Vehicle.
     * 
     * @param modelYear
     */
    public void setModelYear(java.lang.String modelYear) {
        this.modelYear = modelYear;
    }


    /**
     * Gets the preregDate value for this Vehicle.
     * 
     * @return preregDate
     */
    public java.lang.String getPreregDate() {
        return preregDate;
    }


    /**
     * Sets the preregDate value for this Vehicle.
     * 
     * @param preregDate
     */
    public void setPreregDate(java.lang.String preregDate) {
        this.preregDate = preregDate;
    }


    /**
     * Gets the reregdate value for this Vehicle.
     * 
     * @return reregdate
     */
    public java.lang.String getReregdate() {
        return reregdate;
    }


    /**
     * Sets the reregdate value for this Vehicle.
     * 
     * @param reregdate
     */
    public void setReregdate(java.lang.String reregdate) {
        this.reregdate = reregdate;
    }


    /**
     * Gets the customsDate value for this Vehicle.
     * 
     * @return customsDate
     */
    public java.lang.String getCustomsDate() {
        return customsDate;
    }


    /**
     * Sets the customsDate value for this Vehicle.
     * 
     * @param customsDate
     */
    public void setCustomsDate(java.lang.String customsDate) {
        this.customsDate = customsDate;
    }


    /**
     * Gets the firstregDate value for this Vehicle.
     * 
     * @return firstregDate
     */
    public java.lang.String getFirstregDate() {
        return firstregDate;
    }


    /**
     * Sets the firstregDate value for this Vehicle.
     * 
     * @param firstregDate
     */
    public void setFirstregDate(java.lang.String firstregDate) {
        this.firstregDate = firstregDate;
    }


    /**
     * Gets the newregDate value for this Vehicle.
     * 
     * @return newregDate
     */
    public java.lang.String getNewregDate() {
        return newregDate;
    }


    /**
     * Sets the newregDate value for this Vehicle.
     * 
     * @param newregDate
     */
    public void setNewregDate(java.lang.String newregDate) {
        this.newregDate = newregDate;
    }


    /**
     * Gets the deregDate value for this Vehicle.
     * 
     * @return deregDate
     */
    public java.lang.String getDeregDate() {
        return deregDate;
    }


    /**
     * Sets the deregDate value for this Vehicle.
     * 
     * @param deregDate
     */
    public void setDeregDate(java.lang.String deregDate) {
        this.deregDate = deregDate;
    }


    /**
     * Gets the ownregDate value for this Vehicle.
     * 
     * @return ownregDate
     */
    public java.lang.String getOwnregDate() {
        return ownregDate;
    }


    /**
     * Sets the ownregDate value for this Vehicle.
     * 
     * @param ownregDate
     */
    public void setOwnregDate(java.lang.String ownregDate) {
        this.ownregDate = ownregDate;
    }


    /**
     * Gets the manufacturer value for this Vehicle.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this Vehicle.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the country value for this Vehicle.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Vehicle.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the importerpersidno value for this Vehicle.
     * 
     * @return importerpersidno
     */
    public java.lang.String getImporterpersidno() {
        return importerpersidno;
    }


    /**
     * Sets the importerpersidno value for this Vehicle.
     * 
     * @param importerpersidno
     */
    public void setImporterpersidno(java.lang.String importerpersidno) {
        this.importerpersidno = importerpersidno;
    }


    /**
     * Gets the importername value for this Vehicle.
     * 
     * @return importername
     */
    public java.lang.String getImportername() {
        return importername;
    }


    /**
     * Sets the importername value for this Vehicle.
     * 
     * @param importername
     */
    public void setImportername(java.lang.String importername) {
        this.importername = importername;
    }


    /**
     * Gets the _import value for this Vehicle.
     * 
     * @return _import
     */
    public java.lang.String get_import() {
        return _import;
    }


    /**
     * Sets the _import value for this Vehicle.
     * 
     * @param _import
     */
    public void set_import(java.lang.String _import) {
        this._import = _import;
    }


    /**
     * Gets the vehiclestatus value for this Vehicle.
     * 
     * @return vehiclestatus
     */
    public java.lang.String getVehiclestatus() {
        return vehiclestatus;
    }


    /**
     * Sets the vehiclestatus value for this Vehicle.
     * 
     * @param vehiclestatus
     */
    public void setVehiclestatus(java.lang.String vehiclestatus) {
        this.vehiclestatus = vehiclestatus;
    }


    /**
     * Gets the disastertype value for this Vehicle.
     * 
     * @return disastertype
     */
    public java.lang.String getDisastertype() {
        return disastertype;
    }


    /**
     * Sets the disastertype value for this Vehicle.
     * 
     * @param disastertype
     */
    public void setDisastertype(java.lang.String disastertype) {
        this.disastertype = disastertype;
    }


    /**
     * Gets the hasdisasters value for this Vehicle.
     * 
     * @return hasdisasters
     */
    public boolean isHasdisasters() {
        return hasdisasters;
    }


    /**
     * Sets the hasdisasters value for this Vehicle.
     * 
     * @param hasdisasters
     */
    public void setHasdisasters(boolean hasdisasters) {
        this.hasdisasters = hasdisasters;
    }


    /**
     * Gets the fixed value for this Vehicle.
     * 
     * @return fixed
     */
    public boolean isFixed() {
        return fixed;
    }


    /**
     * Sets the fixed value for this Vehicle.
     * 
     * @param fixed
     */
    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }


    /**
     * Gets the hasaccidents value for this Vehicle.
     * 
     * @return hasaccidents
     */
    public boolean isHasaccidents() {
        return hasaccidents;
    }


    /**
     * Sets the hasaccidents value for this Vehicle.
     * 
     * @param hasaccidents
     */
    public void setHasaccidents(boolean hasaccidents) {
        this.hasaccidents = hasaccidents;
    }


    /**
     * Gets the usegroup value for this Vehicle.
     * 
     * @return usegroup
     */
    public java.lang.String getUsegroup() {
        return usegroup;
    }


    /**
     * Sets the usegroup value for this Vehicle.
     * 
     * @param usegroup
     */
    public void setUsegroup(java.lang.String usegroup) {
        this.usegroup = usegroup;
    }


    /**
     * Gets the regType value for this Vehicle.
     * 
     * @return regType
     */
    public java.lang.String getRegType() {
        return regType;
    }


    /**
     * Sets the regType value for this Vehicle.
     * 
     * @param regType
     */
    public void setRegType(java.lang.String regType) {
        this.regType = regType;
    }


    /**
     * Gets the plateTypefront value for this Vehicle.
     * 
     * @return plateTypefront
     */
    public java.lang.String getPlateTypefront() {
        return plateTypefront;
    }


    /**
     * Sets the plateTypefront value for this Vehicle.
     * 
     * @param plateTypefront
     */
    public void setPlateTypefront(java.lang.String plateTypefront) {
        this.plateTypefront = plateTypefront;
    }


    /**
     * Gets the plateTyperear value for this Vehicle.
     * 
     * @return plateTyperear
     */
    public java.lang.String getPlateTyperear() {
        return plateTyperear;
    }


    /**
     * Sets the plateTyperear value for this Vehicle.
     * 
     * @param plateTyperear
     */
    public void setPlateTyperear(java.lang.String plateTyperear) {
        this.plateTyperear = plateTyperear;
    }


    /**
     * Gets the plateStatus value for this Vehicle.
     * 
     * @return plateStatus
     */
    public java.lang.String getPlateStatus() {
        return plateStatus;
    }


    /**
     * Sets the plateStatus value for this Vehicle.
     * 
     * @param plateStatus
     */
    public void setPlateStatus(java.lang.String plateStatus) {
        this.plateStatus = plateStatus;
    }


    /**
     * Gets the plateStorageLocation value for this Vehicle.
     * 
     * @return plateStorageLocation
     */
    public java.lang.String getPlateStorageLocation() {
        return plateStorageLocation;
    }


    /**
     * Sets the plateStorageLocation value for this Vehicle.
     * 
     * @param plateStorageLocation
     */
    public void setPlateStorageLocation(java.lang.String plateStorageLocation) {
        this.plateStorageLocation = plateStorageLocation;
    }


    /**
     * Gets the insuranceCompany value for this Vehicle.
     * 
     * @return insuranceCompany
     */
    public java.lang.String getInsuranceCompany() {
        return insuranceCompany;
    }


    /**
     * Sets the insuranceCompany value for this Vehicle.
     * 
     * @param insuranceCompany
     */
    public void setInsuranceCompany(java.lang.String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }


    /**
     * Gets the insuranceStatus value for this Vehicle.
     * 
     * @return insuranceStatus
     */
    public boolean isInsuranceStatus() {
        return insuranceStatus;
    }


    /**
     * Sets the insuranceStatus value for this Vehicle.
     * 
     * @param insuranceStatus
     */
    public void setInsuranceStatus(boolean insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }


    /**
     * Gets the nextInspectionDate value for this Vehicle.
     * 
     * @return nextInspectionDate
     */
    public java.lang.String getNextInspectionDate() {
        return nextInspectionDate;
    }


    /**
     * Sets the nextInspectionDate value for this Vehicle.
     * 
     * @param nextInspectionDate
     */
    public void setNextInspectionDate(java.lang.String nextInspectionDate) {
        this.nextInspectionDate = nextInspectionDate;
    }


    /**
     * Gets the rebuilt value for this Vehicle.
     * 
     * @return rebuilt
     */
    public boolean isRebuilt() {
        return rebuilt;
    }


    /**
     * Sets the rebuilt value for this Vehicle.
     * 
     * @param rebuilt
     */
    public void setRebuilt(boolean rebuilt) {
        this.rebuilt = rebuilt;
    }


    /**
     * Gets the offroad value for this Vehicle.
     * 
     * @return offroad
     */
    public boolean isOffroad() {
        return offroad;
    }


    /**
     * Sets the offroad value for this Vehicle.
     * 
     * @param offroad
     */
    public void setOffroad(boolean offroad) {
        this.offroad = offroad;
    }


    /**
     * Gets the technical value for this Vehicle.
     * 
     * @return technical
     */
    public is.idega.webservice.vehicleregistryservice.client.Technical getTechnical() {
        return technical;
    }


    /**
     * Sets the technical value for this Vehicle.
     * 
     * @param technical
     */
    public void setTechnical(is.idega.webservice.vehicleregistryservice.client.Technical technical) {
        this.technical = technical;
    }


    /**
     * Gets the owners value for this Vehicle.
     * 
     * @return owners
     */
    public is.idega.webservice.vehicleregistryservice.client.Owner[] getOwners() {
        return owners;
    }


    /**
     * Sets the owners value for this Vehicle.
     * 
     * @param owners
     */
    public void setOwners(is.idega.webservice.vehicleregistryservice.client.Owner[] owners) {
        this.owners = owners;
    }


    /**
     * Gets the operators value for this Vehicle.
     * 
     * @return operators
     */
    public is.idega.webservice.vehicleregistryservice.client.Operator[] getOperators() {
        return operators;
    }


    /**
     * Sets the operators value for this Vehicle.
     * 
     * @param operators
     */
    public void setOperators(is.idega.webservice.vehicleregistryservice.client.Operator[] operators) {
        this.operators = operators;
    }


    /**
     * Gets the plates value for this Vehicle.
     * 
     * @return plates
     */
    public is.idega.webservice.vehicleregistryservice.client.Plate[] getPlates() {
        return plates;
    }


    /**
     * Sets the plates value for this Vehicle.
     * 
     * @param plates
     */
    public void setPlates(is.idega.webservice.vehicleregistryservice.client.Plate[] plates) {
        this.plates = plates;
    }


    /**
     * Gets the disasters value for this Vehicle.
     * 
     * @return disasters
     */
    public is.idega.webservice.vehicleregistryservice.client.Disaster[] getDisasters() {
        return disasters;
    }


    /**
     * Sets the disasters value for this Vehicle.
     * 
     * @param disasters
     */
    public void setDisasters(is.idega.webservice.vehicleregistryservice.client.Disaster[] disasters) {
        this.disasters = disasters;
    }


    /**
     * Gets the registrations value for this Vehicle.
     * 
     * @return registrations
     */
    public is.idega.webservice.vehicleregistryservice.client.Registration[] getRegistrations() {
        return registrations;
    }


    /**
     * Sets the registrations value for this Vehicle.
     * 
     * @param registrations
     */
    public void setRegistrations(is.idega.webservice.vehicleregistryservice.client.Registration[] registrations) {
        this.registrations = registrations;
    }


    /**
     * Gets the outofuses value for this Vehicle.
     * 
     * @return outofuses
     */
    public is.idega.webservice.vehicleregistryservice.client.OutOfUse[] getOutofuses() {
        return outofuses;
    }


    /**
     * Sets the outofuses value for this Vehicle.
     * 
     * @param outofuses
     */
    public void setOutofuses(is.idega.webservice.vehicleregistryservice.client.OutOfUse[] outofuses) {
        this.outofuses = outofuses;
    }


    /**
     * Gets the updatelocks value for this Vehicle.
     * 
     * @return updatelocks
     */
    public is.idega.webservice.vehicleregistryservice.client.Updatelock[] getUpdatelocks() {
        return updatelocks;
    }


    /**
     * Sets the updatelocks value for this Vehicle.
     * 
     * @param updatelocks
     */
    public void setUpdatelocks(is.idega.webservice.vehicleregistryservice.client.Updatelock[] updatelocks) {
        this.updatelocks = updatelocks;
    }


    /**
     * Gets the stolens value for this Vehicle.
     * 
     * @return stolens
     */
    public is.idega.webservice.vehicleregistryservice.client.Stolen[] getStolens() {
        return stolens;
    }


    /**
     * Sets the stolens value for this Vehicle.
     * 
     * @param stolens
     */
    public void setStolens(is.idega.webservice.vehicleregistryservice.client.Stolen[] stolens) {
        this.stolens = stolens;
    }


    /**
     * Gets the remarks value for this Vehicle.
     * 
     * @return remarks
     */
    public is.idega.webservice.vehicleregistryservice.client.Remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Vehicle.
     * 
     * @param remarks
     */
    public void setRemarks(is.idega.webservice.vehicleregistryservice.client.Remark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the inspections value for this Vehicle.
     * 
     * @return inspections
     */
    public is.idega.webservice.vehicleregistryservice.client.Inspection[] getInspections() {
        return inspections;
    }


    /**
     * Sets the inspections value for this Vehicle.
     * 
     * @param inspections
     */
    public void setInspections(is.idega.webservice.vehicleregistryservice.client.Inspection[] inspections) {
        this.inspections = inspections;
    }


    /**
     * Gets the ownerRegistrationErrors value for this Vehicle.
     * 
     * @return ownerRegistrationErrors
     */
    public is.idega.webservice.vehicleregistryservice.client.OwnerRegistrationError[] getOwnerRegistrationErrors() {
        return ownerRegistrationErrors;
    }


    /**
     * Sets the ownerRegistrationErrors value for this Vehicle.
     * 
     * @param ownerRegistrationErrors
     */
    public void setOwnerRegistrationErrors(is.idega.webservice.vehicleregistryservice.client.OwnerRegistrationError[] ownerRegistrationErrors) {
        this.ownerRegistrationErrors = ownerRegistrationErrors;
    }


    /**
     * Gets the vehicleChanges value for this Vehicle.
     * 
     * @return vehicleChanges
     */
    public is.idega.webservice.vehicleregistryservice.client.VehicleChange[] getVehicleChanges() {
        return vehicleChanges;
    }


    /**
     * Sets the vehicleChanges value for this Vehicle.
     * 
     * @param vehicleChanges
     */
    public void setVehicleChanges(is.idega.webservice.vehicleregistryservice.client.VehicleChange[] vehicleChanges) {
        this.vehicleChanges = vehicleChanges;
    }


    /**
     * Gets the typeChanges value for this Vehicle.
     * 
     * @return typeChanges
     */
    public is.idega.webservice.vehicleregistryservice.client.TypeChange[] getTypeChanges() {
        return typeChanges;
    }


    /**
     * Sets the typeChanges value for this Vehicle.
     * 
     * @param typeChanges
     */
    public void setTypeChanges(is.idega.webservice.vehicleregistryservice.client.TypeChange[] typeChanges) {
        this.typeChanges = typeChanges;
    }


    /**
     * Gets the specialEquipmentChanges value for this Vehicle.
     * 
     * @return specialEquipmentChanges
     */
    public is.idega.webservice.vehicleregistryservice.client.SpecialEquipmentChange[] getSpecialEquipmentChanges() {
        return specialEquipmentChanges;
    }


    /**
     * Sets the specialEquipmentChanges value for this Vehicle.
     * 
     * @param specialEquipmentChanges
     */
    public void setSpecialEquipmentChanges(is.idega.webservice.vehicleregistryservice.client.SpecialEquipmentChange[] specialEquipmentChanges) {
        this.specialEquipmentChanges = specialEquipmentChanges;
    }


    /**
     * Gets the addonsChanges value for this Vehicle.
     * 
     * @return addonsChanges
     */
    public is.idega.webservice.vehicleregistryservice.client.AddonsChange[] getAddonsChanges() {
        return addonsChanges;
    }


    /**
     * Sets the addonsChanges value for this Vehicle.
     * 
     * @param addonsChanges
     */
    public void setAddonsChanges(is.idega.webservice.vehicleregistryservice.client.AddonsChange[] addonsChanges) {
        this.addonsChanges = addonsChanges;
    }


    /**
     * Gets the superstructureChanges value for this Vehicle.
     * 
     * @return superstructureChanges
     */
    public is.idega.webservice.vehicleregistryservice.client.SuperstructureChange[] getSuperstructureChanges() {
        return superstructureChanges;
    }


    /**
     * Sets the superstructureChanges value for this Vehicle.
     * 
     * @param superstructureChanges
     */
    public void setSuperstructureChanges(is.idega.webservice.vehicleregistryservice.client.SuperstructureChange[] superstructureChanges) {
        this.superstructureChanges = superstructureChanges;
    }


    /**
     * Gets the adrs value for this Vehicle.
     * 
     * @return adrs
     */
    public is.idega.webservice.vehicleregistryservice.client.Adr[] getAdrs() {
        return adrs;
    }


    /**
     * Sets the adrs value for this Vehicle.
     * 
     * @param adrs
     */
    public void setAdrs(is.idega.webservice.vehicleregistryservice.client.Adr[] adrs) {
        this.adrs = adrs;
    }


    /**
     * Gets the latestRegistration value for this Vehicle.
     * 
     * @return latestRegistration
     */
    public java.lang.String getLatestRegistration() {
        return latestRegistration;
    }


    /**
     * Sets the latestRegistration value for this Vehicle.
     * 
     * @param latestRegistration
     */
    public void setLatestRegistration(java.lang.String latestRegistration) {
        this.latestRegistration = latestRegistration;
    }


    /**
     * Gets the queryTimeStamp value for this Vehicle.
     * 
     * @return queryTimeStamp
     */
    public java.util.Calendar getQueryTimeStamp() {
        return queryTimeStamp;
    }


    /**
     * Sets the queryTimeStamp value for this Vehicle.
     * 
     * @param queryTimeStamp
     */
    public void setQueryTimeStamp(java.util.Calendar queryTimeStamp) {
        this.queryTimeStamp = queryTimeStamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.permNo==null && other.getPermNo()==null) || 
             (this.permNo!=null &&
              this.permNo.equals(other.getPermNo()))) &&
            ((this.regNo==null && other.getRegNo()==null) || 
             (this.regNo!=null &&
              this.regNo.equals(other.getRegNo()))) &&
            ((this.vin==null && other.getVin()==null) || 
             (this.vin!=null &&
              this.vin.equals(other.getVin()))) &&
            ((this.typeNo==null && other.getTypeNo()==null) || 
             (this.typeNo!=null &&
              this.typeNo.equals(other.getTypeNo()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.typeApproval==null && other.getTypeApproval()==null) || 
             (this.typeApproval!=null &&
              this.typeApproval.equals(other.getTypeApproval()))) &&
            ((this.typeapprovalextension==null && other.getTypeapprovalextension()==null) || 
             (this.typeapprovalextension!=null &&
              this.typeapprovalextension.equals(other.getTypeapprovalextension()))) &&
            ((this.eutypeapproval==null && other.getEutypeapproval()==null) || 
             (this.eutypeapproval!=null &&
              this.eutypeapproval.equals(other.getEutypeapproval()))) &&
            ((this.variant==null && other.getVariant()==null) || 
             (this.variant!=null &&
              this.variant.equals(other.getVariant()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.modelcode==null && other.getModelcode()==null) || 
             (this.modelcode!=null &&
              this.modelcode.equals(other.getModelcode()))) &&
            ((this.make==null && other.getMake()==null) || 
             (this.make!=null &&
              this.make.equals(other.getMake()))) &&
            ((this.vehcom==null && other.getVehcom()==null) || 
             (this.vehcom!=null &&
              this.vehcom.equals(other.getVehcom()))) &&
            ((this.speccom==null && other.getSpeccom()==null) || 
             (this.speccom!=null &&
              this.speccom.equals(other.getSpeccom()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.productYear==null && other.getProductYear()==null) || 
             (this.productYear!=null &&
              this.productYear.equals(other.getProductYear()))) &&
            ((this.modelYear==null && other.getModelYear()==null) || 
             (this.modelYear!=null &&
              this.modelYear.equals(other.getModelYear()))) &&
            ((this.preregDate==null && other.getPreregDate()==null) || 
             (this.preregDate!=null &&
              this.preregDate.equals(other.getPreregDate()))) &&
            ((this.reregdate==null && other.getReregdate()==null) || 
             (this.reregdate!=null &&
              this.reregdate.equals(other.getReregdate()))) &&
            ((this.customsDate==null && other.getCustomsDate()==null) || 
             (this.customsDate!=null &&
              this.customsDate.equals(other.getCustomsDate()))) &&
            ((this.firstregDate==null && other.getFirstregDate()==null) || 
             (this.firstregDate!=null &&
              this.firstregDate.equals(other.getFirstregDate()))) &&
            ((this.newregDate==null && other.getNewregDate()==null) || 
             (this.newregDate!=null &&
              this.newregDate.equals(other.getNewregDate()))) &&
            ((this.deregDate==null && other.getDeregDate()==null) || 
             (this.deregDate!=null &&
              this.deregDate.equals(other.getDeregDate()))) &&
            ((this.ownregDate==null && other.getOwnregDate()==null) || 
             (this.ownregDate!=null &&
              this.ownregDate.equals(other.getOwnregDate()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.importerpersidno==null && other.getImporterpersidno()==null) || 
             (this.importerpersidno!=null &&
              this.importerpersidno.equals(other.getImporterpersidno()))) &&
            ((this.importername==null && other.getImportername()==null) || 
             (this.importername!=null &&
              this.importername.equals(other.getImportername()))) &&
            ((this._import==null && other.get_import()==null) || 
             (this._import!=null &&
              this._import.equals(other.get_import()))) &&
            ((this.vehiclestatus==null && other.getVehiclestatus()==null) || 
             (this.vehiclestatus!=null &&
              this.vehiclestatus.equals(other.getVehiclestatus()))) &&
            ((this.disastertype==null && other.getDisastertype()==null) || 
             (this.disastertype!=null &&
              this.disastertype.equals(other.getDisastertype()))) &&
            this.hasdisasters == other.isHasdisasters() &&
            this.fixed == other.isFixed() &&
            this.hasaccidents == other.isHasaccidents() &&
            ((this.usegroup==null && other.getUsegroup()==null) || 
             (this.usegroup!=null &&
              this.usegroup.equals(other.getUsegroup()))) &&
            ((this.regType==null && other.getRegType()==null) || 
             (this.regType!=null &&
              this.regType.equals(other.getRegType()))) &&
            ((this.plateTypefront==null && other.getPlateTypefront()==null) || 
             (this.plateTypefront!=null &&
              this.plateTypefront.equals(other.getPlateTypefront()))) &&
            ((this.plateTyperear==null && other.getPlateTyperear()==null) || 
             (this.plateTyperear!=null &&
              this.plateTyperear.equals(other.getPlateTyperear()))) &&
            ((this.plateStatus==null && other.getPlateStatus()==null) || 
             (this.plateStatus!=null &&
              this.plateStatus.equals(other.getPlateStatus()))) &&
            ((this.plateStorageLocation==null && other.getPlateStorageLocation()==null) || 
             (this.plateStorageLocation!=null &&
              this.plateStorageLocation.equals(other.getPlateStorageLocation()))) &&
            ((this.insuranceCompany==null && other.getInsuranceCompany()==null) || 
             (this.insuranceCompany!=null &&
              this.insuranceCompany.equals(other.getInsuranceCompany()))) &&
            this.insuranceStatus == other.isInsuranceStatus() &&
            ((this.nextInspectionDate==null && other.getNextInspectionDate()==null) || 
             (this.nextInspectionDate!=null &&
              this.nextInspectionDate.equals(other.getNextInspectionDate()))) &&
            this.rebuilt == other.isRebuilt() &&
            this.offroad == other.isOffroad() &&
            ((this.technical==null && other.getTechnical()==null) || 
             (this.technical!=null &&
              this.technical.equals(other.getTechnical()))) &&
            ((this.owners==null && other.getOwners()==null) || 
             (this.owners!=null &&
              java.util.Arrays.equals(this.owners, other.getOwners()))) &&
            ((this.operators==null && other.getOperators()==null) || 
             (this.operators!=null &&
              java.util.Arrays.equals(this.operators, other.getOperators()))) &&
            ((this.plates==null && other.getPlates()==null) || 
             (this.plates!=null &&
              java.util.Arrays.equals(this.plates, other.getPlates()))) &&
            ((this.disasters==null && other.getDisasters()==null) || 
             (this.disasters!=null &&
              java.util.Arrays.equals(this.disasters, other.getDisasters()))) &&
            ((this.registrations==null && other.getRegistrations()==null) || 
             (this.registrations!=null &&
              java.util.Arrays.equals(this.registrations, other.getRegistrations()))) &&
            ((this.outofuses==null && other.getOutofuses()==null) || 
             (this.outofuses!=null &&
              java.util.Arrays.equals(this.outofuses, other.getOutofuses()))) &&
            ((this.updatelocks==null && other.getUpdatelocks()==null) || 
             (this.updatelocks!=null &&
              java.util.Arrays.equals(this.updatelocks, other.getUpdatelocks()))) &&
            ((this.stolens==null && other.getStolens()==null) || 
             (this.stolens!=null &&
              java.util.Arrays.equals(this.stolens, other.getStolens()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.inspections==null && other.getInspections()==null) || 
             (this.inspections!=null &&
              java.util.Arrays.equals(this.inspections, other.getInspections()))) &&
            ((this.ownerRegistrationErrors==null && other.getOwnerRegistrationErrors()==null) || 
             (this.ownerRegistrationErrors!=null &&
              java.util.Arrays.equals(this.ownerRegistrationErrors, other.getOwnerRegistrationErrors()))) &&
            ((this.vehicleChanges==null && other.getVehicleChanges()==null) || 
             (this.vehicleChanges!=null &&
              java.util.Arrays.equals(this.vehicleChanges, other.getVehicleChanges()))) &&
            ((this.typeChanges==null && other.getTypeChanges()==null) || 
             (this.typeChanges!=null &&
              java.util.Arrays.equals(this.typeChanges, other.getTypeChanges()))) &&
            ((this.specialEquipmentChanges==null && other.getSpecialEquipmentChanges()==null) || 
             (this.specialEquipmentChanges!=null &&
              java.util.Arrays.equals(this.specialEquipmentChanges, other.getSpecialEquipmentChanges()))) &&
            ((this.addonsChanges==null && other.getAddonsChanges()==null) || 
             (this.addonsChanges!=null &&
              java.util.Arrays.equals(this.addonsChanges, other.getAddonsChanges()))) &&
            ((this.superstructureChanges==null && other.getSuperstructureChanges()==null) || 
             (this.superstructureChanges!=null &&
              java.util.Arrays.equals(this.superstructureChanges, other.getSuperstructureChanges()))) &&
            ((this.adrs==null && other.getAdrs()==null) || 
             (this.adrs!=null &&
              java.util.Arrays.equals(this.adrs, other.getAdrs()))) &&
            ((this.latestRegistration==null && other.getLatestRegistration()==null) || 
             (this.latestRegistration!=null &&
              this.latestRegistration.equals(other.getLatestRegistration()))) &&
            ((this.queryTimeStamp==null && other.getQueryTimeStamp()==null) || 
             (this.queryTimeStamp!=null &&
              this.queryTimeStamp.equals(other.getQueryTimeStamp())));
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
        if (getPermNo() != null) {
            _hashCode += getPermNo().hashCode();
        }
        if (getRegNo() != null) {
            _hashCode += getRegNo().hashCode();
        }
        if (getVin() != null) {
            _hashCode += getVin().hashCode();
        }
        if (getTypeNo() != null) {
            _hashCode += getTypeNo().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTypeApproval() != null) {
            _hashCode += getTypeApproval().hashCode();
        }
        if (getTypeapprovalextension() != null) {
            _hashCode += getTypeapprovalextension().hashCode();
        }
        if (getEutypeapproval() != null) {
            _hashCode += getEutypeapproval().hashCode();
        }
        if (getVariant() != null) {
            _hashCode += getVariant().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getModelcode() != null) {
            _hashCode += getModelcode().hashCode();
        }
        if (getMake() != null) {
            _hashCode += getMake().hashCode();
        }
        if (getVehcom() != null) {
            _hashCode += getVehcom().hashCode();
        }
        if (getSpeccom() != null) {
            _hashCode += getSpeccom().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getProductYear() != null) {
            _hashCode += getProductYear().hashCode();
        }
        if (getModelYear() != null) {
            _hashCode += getModelYear().hashCode();
        }
        if (getPreregDate() != null) {
            _hashCode += getPreregDate().hashCode();
        }
        if (getReregdate() != null) {
            _hashCode += getReregdate().hashCode();
        }
        if (getCustomsDate() != null) {
            _hashCode += getCustomsDate().hashCode();
        }
        if (getFirstregDate() != null) {
            _hashCode += getFirstregDate().hashCode();
        }
        if (getNewregDate() != null) {
            _hashCode += getNewregDate().hashCode();
        }
        if (getDeregDate() != null) {
            _hashCode += getDeregDate().hashCode();
        }
        if (getOwnregDate() != null) {
            _hashCode += getOwnregDate().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getImporterpersidno() != null) {
            _hashCode += getImporterpersidno().hashCode();
        }
        if (getImportername() != null) {
            _hashCode += getImportername().hashCode();
        }
        if (get_import() != null) {
            _hashCode += get_import().hashCode();
        }
        if (getVehiclestatus() != null) {
            _hashCode += getVehiclestatus().hashCode();
        }
        if (getDisastertype() != null) {
            _hashCode += getDisastertype().hashCode();
        }
        _hashCode += (isHasdisasters() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFixed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasaccidents() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUsegroup() != null) {
            _hashCode += getUsegroup().hashCode();
        }
        if (getRegType() != null) {
            _hashCode += getRegType().hashCode();
        }
        if (getPlateTypefront() != null) {
            _hashCode += getPlateTypefront().hashCode();
        }
        if (getPlateTyperear() != null) {
            _hashCode += getPlateTyperear().hashCode();
        }
        if (getPlateStatus() != null) {
            _hashCode += getPlateStatus().hashCode();
        }
        if (getPlateStorageLocation() != null) {
            _hashCode += getPlateStorageLocation().hashCode();
        }
        if (getInsuranceCompany() != null) {
            _hashCode += getInsuranceCompany().hashCode();
        }
        _hashCode += (isInsuranceStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNextInspectionDate() != null) {
            _hashCode += getNextInspectionDate().hashCode();
        }
        _hashCode += (isRebuilt() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOffroad() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTechnical() != null) {
            _hashCode += getTechnical().hashCode();
        }
        if (getOwners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisasters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisasters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisasters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistrations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutofuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutofuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutofuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpdatelocks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdatelocks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdatelocks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStolens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStolens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStolens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInspections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInspections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInspections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwnerRegistrationErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwnerRegistrationErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwnerRegistrationErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVehicleChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicleChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicleChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTypeChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypeChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypeChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecialEquipmentChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialEquipmentChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialEquipmentChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddonsChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddonsChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddonsChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuperstructureChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuperstructureChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuperstructureChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdrs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdrs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdrs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLatestRegistration() != null) {
            _hashCode += getLatestRegistration().hashCode();
        }
        if (getQueryTimeStamp() != null) {
            _hashCode += getQueryTimeStamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vehicle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehicle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("typeNo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeApproval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeapprovalextension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Typeapprovalextension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eutypeapproval");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Eutypeapproval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variant");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Variant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelcode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Modelcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("speccom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Speccom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productYear");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ProductYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelYear");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ModelYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preregDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PreregDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reregdate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reregdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CustomsDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstregDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "FirstregDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newregDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "NewregDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deregDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "DeregDate"));
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
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importerpersidno");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Importerpersidno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importername");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Importername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_import");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Import"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehiclestatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehiclestatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disastertype");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disastertype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasdisasters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Hasdisasters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Fixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasaccidents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Hasaccidents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usegroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Usegroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "RegType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plateTypefront");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PlateTypefront"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plateTyperear");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PlateTyperear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plateStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PlateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plateStorageLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PlateStorageLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InsuranceCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InsuranceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("rebuilt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Rebuilt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offroad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Offroad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technical");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Technical"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Technical"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owners");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Owners"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Owner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Owner"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Operators"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Operator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Operator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Plates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Plate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Plate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disasters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disasters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disaster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disaster"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Registrations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Registration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Registration"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outofuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Outofuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OutOfUse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OutOfUse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatelocks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Updatelocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Updatelock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Updatelock"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stolens");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stolens"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stolen"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stolen"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Remark"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Remark"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspections");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Inspections"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Inspection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Inspection"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerRegistrationErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnerRegistrationErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnerRegistrationError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnerRegistrationError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleChange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleChange"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeChange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeChange"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialEquipmentChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SpecialEquipmentChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SpecialEquipmentChange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SpecialEquipmentChange"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addonsChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AddonsChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AddonsChange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AddonsChange"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superstructureChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SuperstructureChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SuperstructureChange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SuperstructureChange"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adrs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Adrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Adr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Adr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "LatestRegistration"));
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
