package is.lt.ws.VehicleRegistryService;

import java.util.Arrays;

import com.idega.util.ArrayUtil;

public class Vehicle {

	public Object ExtensionData;
	public String PermNo;
	public String RegNo;
	public String Vin;
	public String TypeNo;
	public String Type;
	public String TypeApproval;
	public String Typeapprovalextension;
	public String Eutypeapproval;
	public String Variant;
	public String Version;
	public String Modelcode;
	public String Make;
	public String Vehcom;
	public String Speccom;
	public String Color;
	public String ProductYear;
	public String ModelYear;
	public String PreregDate;
	public String Reregdate;
	public String CustomsDate;
	public String FirstregDate;
	public String NewregDate;
	public String DeregDate;
	public String OwnregDate;
	public String Manufacturer;
	public String Country;
	public String Importerpersidno;
	public String Importername;
	public String Import;
	public String Vehiclestatus;
	public String Disastertype;
	public String Hasdisasters;
	public String Fixed;
	public String Hasaccidents;
	public String Usegroup;
	public String RegType;
	public String PlateTypefront;
	public String PlateTyperear;
	public String PlateStatus;
	public String PlateStorageLocation;
	public String InsuranceCompany;
	public String InsuranceStatus;
	public String NextInspectionDate;
	public String Rebuilt;
	public String Offroad;
	public Technical Technical;
	public Owners Owners;
	public Operators Operators;
	public Plates Plates;
	public Disasters Disasters;
	public Registrations Registrations;
	public Outofuses Outofuses;
	public Updatelocks Updatelocks;
	public Stolens Stolens;
	public Remarks Remarks;
	public Inspections Inspections;
	public OwnerRegistrationErrors OwnerRegistrationErrors;
	public VehicleChanges VehicleChanges;
	public TypeChanges TypeChanges;
	public SpecialEquipmentChanges SpecialEquipmentChanges;
	public AddonsChanges AddonsChanges;
	public SuperstructureChanges SuperstructureChanges;
	public Adrs Adrs;
	public String LatestRegistration;
	public String QueryTimeStamp;
	public String FormerCountry;
	public String NextInspectionDateIfPassedInspectionToday;
	public String TaxGroup;

	public Object getExtensionData() {
		return ExtensionData;
	}
	public void setExtensionData(Object extensionData) {
		ExtensionData = extensionData;
	}
	public String getPermNo() {
		return PermNo;
	}
	public void setPermNo(String permNo) {
		PermNo = permNo;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getVin() {
		return Vin;
	}
	public void setVin(String vin) {
		Vin = vin;
	}
	public String getTypeNo() {
		return TypeNo;
	}
	public void setTypeNo(String typeNo) {
		TypeNo = typeNo;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getTypeApproval() {
		return TypeApproval;
	}
	public void setTypeApproval(String typeApproval) {
		TypeApproval = typeApproval;
	}
	public String getTypeapprovalextension() {
		return Typeapprovalextension;
	}
	public void setTypeapprovalextension(String typeapprovalextension) {
		Typeapprovalextension = typeapprovalextension;
	}
	public String getEutypeapproval() {
		return Eutypeapproval;
	}
	public void setEutypeapproval(String eutypeapproval) {
		Eutypeapproval = eutypeapproval;
	}
	public String getVariant() {
		return Variant;
	}
	public void setVariant(String variant) {
		Variant = variant;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public String getModelcode() {
		return Modelcode;
	}
	public void setModelcode(String modelcode) {
		Modelcode = modelcode;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getVehcom() {
		return Vehcom;
	}
	public void setVehcom(String vehcom) {
		Vehcom = vehcom;
	}
	public String getSpeccom() {
		return Speccom;
	}
	public void setSpeccom(String speccom) {
		Speccom = speccom;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getProductYear() {
		return ProductYear;
	}
	public void setProductYear(String productYear) {
		ProductYear = productYear;
	}
	public String getModelYear() {
		return ModelYear;
	}
	public void setModelYear(String modelYear) {
		ModelYear = modelYear;
	}
	public String getPreregDate() {
		return PreregDate;
	}
	public void setPreregDate(String preregDate) {
		PreregDate = preregDate;
	}
	public String getReregdate() {
		return Reregdate;
	}
	public void setReregdate(String reregdate) {
		Reregdate = reregdate;
	}
	public String getCustomsDate() {
		return CustomsDate;
	}
	public void setCustomsDate(String customsDate) {
		CustomsDate = customsDate;
	}
	public String getFirstregDate() {
		return FirstregDate;
	}
	public void setFirstregDate(String firstregDate) {
		FirstregDate = firstregDate;
	}
	public String getNewregDate() {
		return NewregDate;
	}
	public void setNewregDate(String newregDate) {
		NewregDate = newregDate;
	}
	public String getDeregDate() {
		return DeregDate;
	}
	public void setDeregDate(String deregDate) {
		DeregDate = deregDate;
	}
	public String getOwnregDate() {
		return OwnregDate;
	}
	public void setOwnregDate(String ownregDate) {
		OwnregDate = ownregDate;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getImporterpersidno() {
		return Importerpersidno;
	}
	public void setImporterpersidno(String importerpersidno) {
		Importerpersidno = importerpersidno;
	}
	public String getImportername() {
		return Importername;
	}
	public void setImportername(String importername) {
		Importername = importername;
	}
	public String getImport() {
		return Import;
	}
	public void setImport(String import1) {
		Import = import1;
	}
	public String getVehiclestatus() {
		return Vehiclestatus;
	}
	public void setVehiclestatus(String vehiclestatus) {
		Vehiclestatus = vehiclestatus;
	}
	public String getDisastertype() {
		return Disastertype;
	}
	public void setDisastertype(String disastertype) {
		Disastertype = disastertype;
	}
	public String getHasdisasters() {
		return Hasdisasters;
	}
	public void setHasdisasters(String hasdisasters) {
		Hasdisasters = hasdisasters;
	}
	public String getFixed() {
		return Fixed;
	}
	public void setFixed(String fixed) {
		Fixed = fixed;
	}
	public String getHasaccidents() {
		return Hasaccidents;
	}
	public void setHasaccidents(String hasaccidents) {
		Hasaccidents = hasaccidents;
	}
	public String getUsegroup() {
		return Usegroup;
	}
	public void setUsegroup(String usegroup) {
		Usegroup = usegroup;
	}
	public String getRegType() {
		return RegType;
	}
	public void setRegType(String regType) {
		RegType = regType;
	}
	public String getPlateTypefront() {
		return PlateTypefront;
	}
	public void setPlateTypefront(String plateTypefront) {
		PlateTypefront = plateTypefront;
	}
	public String getPlateTyperear() {
		return PlateTyperear;
	}
	public void setPlateTyperear(String plateTyperear) {
		PlateTyperear = plateTyperear;
	}
	public String getPlateStatus() {
		return PlateStatus;
	}
	public void setPlateStatus(String plateStatus) {
		PlateStatus = plateStatus;
	}
	public String getPlateStorageLocation() {
		return PlateStorageLocation;
	}
	public void setPlateStorageLocation(String plateStorageLocation) {
		PlateStorageLocation = plateStorageLocation;
	}
	public String getInsuranceCompany() {
		return InsuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		InsuranceCompany = insuranceCompany;
	}
	public String getInsuranceStatus() {
		return InsuranceStatus;
	}
	public void setInsuranceStatus(Boolean insuranceStatus) {
		if (insuranceStatus != null) {
			setInsuranceStatus(String.valueOf(insuranceStatus));
		}
	}
	public void setInsuranceStatus(String insuranceStatus) {
		InsuranceStatus = insuranceStatus;
	}
	public String getNextInspectionDate() {
		return NextInspectionDate;
	}
	public void setNextInspectionDate(String nextInspectionDate) {
		NextInspectionDate = nextInspectionDate;
	}
	public String getRebuilt() {
		return Rebuilt;
	}
	public void setRebuilt(String rebuilt) {
		Rebuilt = rebuilt;
	}
	public String getOffroad() {
		return Offroad;
	}
	public void setOffroad(String offroad) {
		Offroad = offroad;
	}
	public Technical getTechnical() {
		return Technical;
	}
	public void setTechnical(Technical technical) {
		Technical = technical;
	}
	public Owners getOwners() {
		return Owners;
	}
	public void setOwners(Owner[] owners) {
		if (!ArrayUtil.isEmpty(owners)) {
			Owners = new Owners();
			Owners.Owner = Arrays.asList(owners);
		}
	}
	public void setOwners(Owners owners) {
		Owners = owners;
	}
	public Operators getOperators() {
		return Operators;
	}
	public void setOperators(Operator[] operators) {
		if (!ArrayUtil.isEmpty(operators)) {
			Operators = new Operators();
			Operators.Operator = Arrays.asList(operators);
		}
	}
	public void setOperators(Operators operators) {
		Operators = operators;
	}
	public Plates getPlates() {
		return Plates;
	}
	public void setPlates(Plates plates) {
		Plates = plates;
	}
	public Disasters getDisasters() {
		return Disasters;
	}
	public void setDisasters(Disasters disasters) {
		Disasters = disasters;
	}
	public Registrations getRegistrations() {
		return Registrations;
	}
	public void setRegistrations(Registrations registrations) {
		Registrations = registrations;
	}
	public Outofuses getOutofuses() {
		return Outofuses;
	}
	public void setOutofuses(Outofuses outofuses) {
		Outofuses = outofuses;
	}
	public Updatelocks getUpdatelocks() {
		return Updatelocks;
	}
	public void setUpdatelocks(Updatelocks updatelocks) {
		Updatelocks = updatelocks;
	}
	public Stolens getStolens() {
		return Stolens;
	}
	public void setStolens(Stolens stolens) {
		Stolens = stolens;
	}
	public Remarks getRemarks() {
		return Remarks;
	}
	public void setRemarks(Remark[] remarks) {
		if (ArrayUtil.isEmpty(remarks)) {
			return;
		}

		Remarks = new is.lt.ws.VehicleRegistryService.Remarks();
		Remarks.Remark = Arrays.asList(remarks);
	}
	public void setRemarks(Remarks remarks) {
		Remarks = remarks;
	}
	public Inspections getInspections() {
		return Inspections;
	}
	public void setInspections(Inspections inspections) {
		Inspections = inspections;
	}
	public OwnerRegistrationErrors getOwnerRegistrationErrors() {
		return OwnerRegistrationErrors;
	}
	public void setOwnerRegistrationErrors(OwnerRegistrationErrors ownerRegistrationErrors) {
		OwnerRegistrationErrors = ownerRegistrationErrors;
	}
	public VehicleChanges getVehicleChanges() {
		return VehicleChanges;
	}
	public void setVehicleChanges(VehicleChanges vehicleChanges) {
		VehicleChanges = vehicleChanges;
	}
	public TypeChanges getTypeChanges() {
		return TypeChanges;
	}
	public void setTypeChanges(TypeChanges typeChanges) {
		TypeChanges = typeChanges;
	}
	public SpecialEquipmentChanges getSpecialEquipmentChanges() {
		return SpecialEquipmentChanges;
	}
	public void setSpecialEquipmentChanges(SpecialEquipmentChanges specialEquipmentChanges) {
		SpecialEquipmentChanges = specialEquipmentChanges;
	}
	public AddonsChanges getAddonsChanges() {
		return AddonsChanges;
	}
	public void setAddonsChanges(AddonsChanges addonsChanges) {
		AddonsChanges = addonsChanges;
	}
	public SuperstructureChanges getSuperstructureChanges() {
		return SuperstructureChanges;
	}
	public void setSuperstructureChanges(SuperstructureChanges superstructureChanges) {
		SuperstructureChanges = superstructureChanges;
	}
	public Adrs getAdrs() {
		return Adrs;
	}
	public void setAdrs(Adrs adrs) {
		Adrs = adrs;
	}
	public String getLatestRegistration() {
		return LatestRegistration;
	}
	public void setLatestRegistration(String latestRegistration) {
		LatestRegistration = latestRegistration;
	}
	public String getQueryTimeStamp() {
		return QueryTimeStamp;
	}
	public void setQueryTimeStamp(String queryTimeStamp) {
		QueryTimeStamp = queryTimeStamp;
	}
	public String getFormerCountry() {
		return FormerCountry;
	}
	public void setFormerCountry(String formerCountry) {
		FormerCountry = formerCountry;
	}
	public String getNextInspectionDateIfPassedInspectionToday() {
		return NextInspectionDateIfPassedInspectionToday;
	}
	public void setNextInspectionDateIfPassedInspectionToday(String nextInspectionDateIfPassedInspectionToday) {
		NextInspectionDateIfPassedInspectionToday = nextInspectionDateIfPassedInspectionToday;
	}
	public String getTaxGroup() {
		return TaxGroup;
	}
	public void setTaxGroup(String taxGroup) {
		TaxGroup = taxGroup;
	}

	@Override
	public String toString() {
		return "Perm. no.: " + getPermNo() + ", reg. no.: " + getRegNo() + ", make: " + getMake() + ", model: " + getVehcom() + ", colour: " + getColor();
	}

}