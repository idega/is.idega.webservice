/**
 * VehicleRegistryServiceSoap_BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class VehicleRegistryServiceSoap_BindingSkeleton implements is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType, org.apache.axis.wsdl.Skeleton {
    private is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        //org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("allVehicleInformation", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformationResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehicleAll"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformation"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/AllVehicleInformation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("allVehicleInformation") == null) {
            _myOperations.put("allVehicleInformation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("allVehicleInformation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("basicVehicleInformation", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformationResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfVehicle"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformation"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/BasicVehicleInformation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("basicVehicleInformation") == null) {
            _myOperations.put("basicVehicleInformation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("basicVehicleInformation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("additionalVehicleInformation", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformationResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleExtra"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformation"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/AdditionalVehicleInformation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("additionalVehicleInformation") == null) {
            _myOperations.put("additionalVehicleInformation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("additionalVehicleInformation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("statRecords", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecordsResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ArrayOfStat"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecords"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/StatRecords");
        _myOperationsList.add(_oper);
        if (_myOperations.get("statRecords") == null) {
            _myOperations.put("statRecords", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("statRecords")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("allVehicleInformationXml", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformationXmlResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AllVehicleInformationXml"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/AllVehicleInformationXml");
        _myOperationsList.add(_oper);
        if (_myOperations.get("allVehicleInformationXml") == null) {
            _myOperations.put("allVehicleInformationXml", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("allVehicleInformationXml")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("basicVehicleInformationXml", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformationXmlResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "BasicVehicleInformationXml"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/BasicVehicleInformationXml");
        _myOperationsList.add(_oper);
        if (_myOperations.get("basicVehicleInformationXml") == null) {
            _myOperations.put("basicVehicleInformationXml", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("basicVehicleInformationXml")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "permno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "regno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "vin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("additionalVehicleInformationXml", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformationXmlResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "AdditionalVehicleInformationXml"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/AdditionalVehicleInformationXml");
        _myOperationsList.add(_oper);
        if (_myOperations.get("additionalVehicleInformationXml") == null) {
            _myOperations.put("additionalVehicleInformationXml", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("additionalVehicleInformationXml")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "xmlVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "queryInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("statRecordsXml", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecordsXmlResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StatRecordsXml"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/StatRecordsXml");
        _myOperationsList.add(_oper);
        if (_myOperations.get("statRecordsXml") == null) {
            _myOperations.put("statRecordsXml", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("statRecordsXml")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getServiceVersion", _params, new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "GetServiceVersionResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Version"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "GetServiceVersion"));
        _oper.setSoapAction("https://ws.lt.is/VehicleRegistryService/GetServiceVersion");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getServiceVersion") == null) {
            _myOperations.put("getServiceVersion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getServiceVersion")).add(_oper);
    }

    public VehicleRegistryServiceSoap_BindingSkeleton() {
        this.impl = new is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_BindingImpl();
    }

    public VehicleRegistryServiceSoap_BindingSkeleton(is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType impl) {
        this.impl = impl;
    }
    public is.idega.webservice.vehicleregistryservice.client.VehicleAll[] allVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        is.idega.webservice.vehicleregistryservice.client.VehicleAll[] ret = impl.allVehicleInformation(userName, password, permno, regno, vin, queryInformation);
        return ret;
    }

    public is.idega.webservice.vehicleregistryservice.client.Vehicle[] basicVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        is.idega.webservice.vehicleregistryservice.client.Vehicle[] ret = impl.basicVehicleInformation(userName, password, permno, regno, vin, queryInformation);
        return ret;
    }

    public is.idega.webservice.vehicleregistryservice.client.VehicleExtra additionalVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        is.idega.webservice.vehicleregistryservice.client.VehicleExtra ret = impl.additionalVehicleInformation(userName, password, permno, regno, vin, queryInformation);
        return ret;
    }

    public is.idega.webservice.vehicleregistryservice.client.Stat[] statRecords(java.lang.String userName, java.lang.String password, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        is.idega.webservice.vehicleregistryservice.client.Stat[] ret = impl.statRecords(userName, password, queryInformation);
        return ret;
    }

    public java.lang.String allVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.allVehicleInformationXml(userName, password, xmlVersion, permno, regno, vin, queryInformation);
        return ret;
    }

    public java.lang.String basicVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.basicVehicleInformationXml(userName, password, xmlVersion, permno, regno, vin, queryInformation);
        return ret;
    }

    public java.lang.String additionalVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.additionalVehicleInformationXml(userName, password, xmlVersion, permno, regno, vin, queryInformation);
        return ret;
    }

    public java.lang.String statRecordsXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String queryInformation) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.statRecordsXml(userName, password, xmlVersion, queryInformation);
        return ret;
    }

    public is.idega.webservice.vehicleregistryservice.client.Version getServiceVersion() throws java.rmi.RemoteException
    {
        is.idega.webservice.vehicleregistryservice.client.Version ret = impl.getServiceVersion();
        return ret;
    }

}
