/**
 * VehicleRegistryServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

public class VehicleRegistryServiceSoapStub extends org.apache.axis.client.Stub implements is.lt.ws.VehicleRegistryService.VehicleRegistryServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllVehicleInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehicleAll"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.VehicleAll[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformationResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleAll"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BasicVehicleInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehicle"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.Vehicle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformationResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehicle"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AdditionalVehicleInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleExtra"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.VehicleExtra.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StatRecords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfStat"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.Stat[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecordsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stat"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllAccidents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accidents"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.Accidents.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllAccidentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FinancialCompanyAllVehiclesForPersidno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "requestedPersonalNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "companyPersonalNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "employeePersonalNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PersIDNoLookup"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.PersIDNoLookup.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "FinancialCompanyAllVehiclesForPersidnoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllVehiclesForPersidno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "clientPersonalNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "lawayerPersonalNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "showDeregistered"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "showHistory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "requesterID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PersIDNoLookup"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.PersIDNoLookup.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehiclesForPersidnoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VehicleCompleteHistoryPDF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleCompleteHistoryPDFResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllVehicleInformationXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformationXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BasicVehicleInformationXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformationXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AdditionalVehicleInformationXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformationXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StatRecordsXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecordsXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllAccidentsXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllAccidentsXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceVersion");
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Version"));
        oper.setReturnClass(is.lt.ws.VehicleRegistryService.Version.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "GetServiceVersionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

    }

    public VehicleRegistryServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public VehicleRegistryServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public VehicleRegistryServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accident");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Accident.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accidents");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Accidents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentVehicle");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.AccidentVehicle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AddonsChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.AddonsChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Adr");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Adr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfAccident");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Accident[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accident");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Accident");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfAccidentVehicle");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.AccidentVehicle[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentVehicle");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AccidentVehicle");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfAddonsChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.AddonsChange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AddonsChange");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AddonsChange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfAdr");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Adr[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Adr");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Adr");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfBoolean");
            cachedSerQNames.add(qName);
            cls = boolean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "boolean");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Change[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Change");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Change");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfCoOwner");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.CoOwner[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CoOwner");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CoOwner");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfDisaster");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Disaster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disaster");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disaster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfExciseTax");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.ExciseTax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTax");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTax");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfImpacts");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Impacts[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Impacts");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Impacts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfInspection");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Inspection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Inspection");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Inspection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfInspectionRemark");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.InspectionRemark[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InspectionRemark");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InspectionRemark");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfOperator");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Operator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Operator");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Operator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfOutOfUse");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.OutOfUse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OutOfUse");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OutOfUse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfOwner");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Owner[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Owner");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Owner");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfOwnerRegistrationError");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.OwnerRegistrationError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnerRegistrationError");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnerRegistrationError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfPlate");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Plate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Plate");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Plate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfReading");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Reading[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reading");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reading");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfRegistration");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Registration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Registration");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Registration");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfRemark");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Remark[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Remark");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Remark");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfSpecialEquipmentChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.SpecialEquipmentChange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SpecialEquipmentChange");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SpecialEquipmentChange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfStat");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Stat[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stat");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stat");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfStolen");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Stolen[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stolen");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stolen");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfSuperstructureChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.SuperstructureChange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SuperstructureChange");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SuperstructureChange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfTypeChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.TypeChange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeChange");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeChange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfUpdatelock");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Updatelock[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Updatelock");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Updatelock");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehicle");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Vehicle[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehicle");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehicle");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehicleAll");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.VehicleAll[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleAll");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleAll");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehicleChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.VehicleChange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleChange");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleChange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehiclePersidno");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.VehiclePersidno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehiclePersidno");
            qName2 = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehiclePersidno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AutomobileTaxClass");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.AutomobileTaxClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Axle");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Axle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Change");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Change.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "CoOwner");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.CoOwner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Disaster");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Disaster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "EstimatedAutomobileTax");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.EstimatedAutomobileTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExciseTax");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.ExciseTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.ExtensionDataObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Impacts");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Impacts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Inspection");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Inspection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "InspectionRemark");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.InspectionRemark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Mass");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Mass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Operator");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Operator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OutOfUse");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.OutOfUse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Owner");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Owner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "OwnerRegistrationError");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.OwnerRegistrationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PersIDNoLookup");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.PersIDNoLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Plate");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Plate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Reading");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Reading.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Registration");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Registration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Remark");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Remark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Size");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Size.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SpecialEquipmentChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.SpecialEquipmentChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stat");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Stat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Stolen");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Stolen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "SuperstructureChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.SuperstructureChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Technical");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Technical.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TotalStatus");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.TotalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "TypeChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.TypeChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Tyre");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Tyre.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Updatelock");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Updatelock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehicle");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Vehicle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleAll");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.VehicleAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleChange");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.VehicleChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleExtra");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.VehicleExtra.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehiclePersidno");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.VehiclePersidno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Version");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Version.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Wage");
            cachedSerQNames.add(qName);
            cls = is.lt.ws.VehicleRegistryService.Wage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public is.lt.ws.VehicleRegistryService.VehicleAll[] allVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/AllVehicleInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.VehicleAll[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.VehicleAll[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.VehicleAll[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.lt.ws.VehicleRegistryService.Vehicle[] basicVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/BasicVehicleInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.Vehicle[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.Vehicle[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.Vehicle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.lt.ws.VehicleRegistryService.VehicleExtra additionalVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/AdditionalVehicleInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.VehicleExtra) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.VehicleExtra) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.VehicleExtra.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.lt.ws.VehicleRegistryService.Stat[] statRecords(java.lang.String userName, java.lang.String password, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/StatRecords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.Stat[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.Stat[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.Stat[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.lt.ws.VehicleRegistryService.Accidents allAccidents(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/AllAccidents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllAccidents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.Accidents) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.Accidents) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.Accidents.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.lt.ws.VehicleRegistryService.PersIDNoLookup financialCompanyAllVehiclesForPersidno(java.lang.String userName, java.lang.String password, java.lang.String requestedPersonalNo, java.lang.String companyPersonalNo, java.lang.String employeePersonalNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/FinancialCompanyAllVehiclesForPersidno");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "FinancialCompanyAllVehiclesForPersidno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, requestedPersonalNo, companyPersonalNo, employeePersonalNo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.PersIDNoLookup) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.PersIDNoLookup) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.PersIDNoLookup.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.lt.ws.VehicleRegistryService.PersIDNoLookup allVehiclesForPersidno(java.lang.String userName, java.lang.String password, java.lang.String clientPersonalNo, java.lang.String lawayerPersonalNo, boolean showDeregistered, boolean showHistory, java.lang.String requesterID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/AllVehiclesForPersidno");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehiclesForPersidno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, clientPersonalNo, lawayerPersonalNo, new java.lang.Boolean(showDeregistered), new java.lang.Boolean(showHistory), requesterID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.PersIDNoLookup) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.PersIDNoLookup) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.PersIDNoLookup.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] vehicleCompleteHistoryPDF(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/VehicleCompleteHistoryPDF");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleCompleteHistoryPDF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String allVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/AllVehicleInformationXml");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformationXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, xmlVersion, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String basicVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/BasicVehicleInformationXml");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformationXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, xmlVersion, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String additionalVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/AdditionalVehicleInformationXml");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformationXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, xmlVersion, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String statRecordsXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/StatRecordsXml");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecordsXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, xmlVersion, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String allAccidentsXml(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/AllAccidentsXml");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllAccidentsXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, permno, regno, vin, queryInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.lt.ws.VehicleRegistryService.Version getServiceVersion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.lt.is/VehicleRegistryService/GetServiceVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "GetServiceVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.lt.ws.VehicleRegistryService.Version) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.lt.ws.VehicleRegistryService.Version) org.apache.axis.utils.JavaUtils.convert(_resp, is.lt.ws.VehicleRegistryService.Version.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
