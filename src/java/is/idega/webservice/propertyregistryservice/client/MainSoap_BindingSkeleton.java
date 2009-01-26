/**
 * MainSoap_BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class MainSoap_BindingSkeleton implements is.idega.webservice.propertyregistryservice.client.MainSoap_PortType, org.apache.axis.wsdl.Skeleton {
    private is.idega.webservice.propertyregistryservice.client.MainSoap_PortType impl;
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
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getCompanies", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetCompaniesResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCompanies"));
        _oper.setSoapAction("http://tempuri.org/GetCompanies");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCompanies") == null) {
            _myOperations.put("getCompanies", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCompanies")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("login", _params, new javax.xml.namespace.QName("http://tempuri.org/", "LoginResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Login"));
        _oper.setSoapAction("http://tempuri.org/Login");
        _myOperationsList.add(_oper);
        if (_myOperations.get("login") == null) {
            _myOperations.put("login", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("login")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("pingServer", _params, new javax.xml.namespace.QName("http://tempuri.org/", "PingServerResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "PingServer"));
        _oper.setSoapAction("http://tempuri.org/PingServer");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pingServer") == null) {
            _myOperations.put("pingServer", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pingServer")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "TableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnTree"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getData", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetDataResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDataResponse>GetDataResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetData"));
        _oper.setSoapAction("http://tempuri.org/GetData");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getData") == null) {
            _myOperations.put("getData", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getData")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "TableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "OrderBy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnTree"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDataOrder", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetDataOrderResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDataOrderResponse>GetDataOrderResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDataOrder"));
        _oper.setSoapAction("http://tempuri.org/GetDataOrder");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDataOrder") == null) {
            _myOperations.put("getDataOrder", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDataOrder")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "TableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dsChanges"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", ">>SaveData>dsChanges"), is.idega.webservice.propertyregistryservice.client.SaveDataDsChanges.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("saveData", _params, new javax.xml.namespace.QName("http://tempuri.org/", "SaveDataResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SaveDataResponse>SaveDataResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "SaveData"));
        _oper.setSoapAction("http://tempuri.org/SaveData");
        _myOperationsList.add(_oper);
        if (_myOperations.get("saveData") == null) {
            _myOperations.put("saveData", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("saveData")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("openQuery", _params, new javax.xml.namespace.QName("http://tempuri.org/", "OpenQueryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>OpenQueryResponse>OpenQueryResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "OpenQuery"));
        _oper.setSoapAction("http://tempuri.org/OpenQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("openQuery") == null) {
            _myOperations.put("openQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("openQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "strTableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getID", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetIDResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetID"));
        _oper.setSoapAction("http://tempuri.org/GetID");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getID") == null) {
            _myOperations.put("getID", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getID")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCube", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetCubeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCubeResponse>GetCubeResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCube"));
        _oper.setSoapAction("http://tempuri.org/GetCube");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCube") == null) {
            _myOperations.put("getCube", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCube")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getUser", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetUserResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "TMUser"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetUser"));
        _oper.setSoapAction("http://tempuri.org/GetUser");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUser") == null) {
            _myOperations.put("getUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUser")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "QueryType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "YfirFlokkur"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "UndirFlokkur"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getQueries", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetQueriesResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfQuery"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetQueries"));
        _oper.setSoapAction("http://tempuri.org/GetQueries");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getQueries") == null) {
            _myOperations.put("getQueries", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getQueries")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "QueryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "FieldInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getQueryInfo", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetQueryInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "QueryInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetQueryInfo"));
        _oper.setSoapAction("http://tempuri.org/GetQueryInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getQueryInfo") == null) {
            _myOperations.put("getQueryInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getQueryInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "QueryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfParamInfo"), is.idega.webservice.propertyregistryservice.client.ParamInfo[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("genReport", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GenReportResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GenReport"));
        _oper.setSoapAction("http://tempuri.org/GenReport");
        _myOperationsList.add(_oper);
        if (_myOperations.get("genReport") == null) {
            _myOperations.put("genReport", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("genReport")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "QueryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfParamInfo"), is.idega.webservice.propertyregistryservice.client.ParamInfo[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("genReportFilePath", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GenReportFilePathResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GenReportFilePath"));
        _oper.setSoapAction("http://tempuri.org/GenReportFilePath");
        _myOperationsList.add(_oper);
        if (_myOperations.get("genReportFilePath") == null) {
            _myOperations.put("genReportFilePath", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("genReportFilePath")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "QueryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfParamInfo"), is.idega.webservice.propertyregistryservice.client.ParamInfo[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ResultParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfResultField"), is.idega.webservice.propertyregistryservice.client.ResultField[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("genDataSet", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GenDataSetResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GenDataSetResponse>GenDataSetResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GenDataSet"));
        _oper.setSoapAction("http://tempuri.org/GenDataSet");
        _myOperationsList.add(_oper);
        if (_myOperations.get("genDataSet") == null) {
            _myOperations.put("genDataSet", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("genDataSet")).add(_oper);
    }

    public MainSoap_BindingSkeleton() {
        this.impl = new is.idega.webservice.propertyregistryservice.client.MainSoap_BindingImpl();
    }

    public MainSoap_BindingSkeleton(is.idega.webservice.propertyregistryservice.client.MainSoap_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String getCompanies() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getCompanies();
        return ret;
    }

    public java.lang.String login(java.lang.String company, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.login(company, userName, password);
        return ret;
    }

    public java.lang.String pingServer() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.pingServer();
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.GetDataResponseGetDataResult getData(java.lang.String sessionId, java.lang.String tableName, java.lang.String filter, boolean returnTree) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.GetDataResponseGetDataResult ret = impl.getData(sessionId, tableName, filter, returnTree);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.GetDataOrderResponseGetDataOrderResult getDataOrder(java.lang.String sessionId, java.lang.String tableName, java.lang.String filter, java.lang.String orderBy, boolean returnTree) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.GetDataOrderResponseGetDataOrderResult ret = impl.getDataOrder(sessionId, tableName, filter, orderBy, returnTree);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.SaveDataResponseSaveDataResult saveData(java.lang.String sessionId, java.lang.String tableName, is.idega.webservice.propertyregistryservice.client.SaveDataDsChanges dsChanges) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.SaveDataResponseSaveDataResult ret = impl.saveData(sessionId, tableName, dsChanges);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.OpenQueryResponseOpenQueryResult openQuery(java.lang.String sessionId, java.lang.String queryString) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.OpenQueryResponseOpenQueryResult ret = impl.openQuery(sessionId, queryString);
        return ret;
    }

    public int getID(java.lang.String sessionId, java.lang.String strTableName) throws java.rmi.RemoteException
    {
        int ret = impl.getID(sessionId, strTableName);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.GetCubeResponseGetCubeResult getCube(java.lang.String sessionId, java.lang.String queryString) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.GetCubeResponseGetCubeResult ret = impl.getCube(sessionId, queryString);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.TMUser getUser(java.lang.String sessionId) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.TMUser ret = impl.getUser(sessionId);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.Query[] getQueries(java.lang.String sessionId, java.lang.String queryType, java.lang.String yfirFlokkur, java.lang.String undirFlokkur) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.Query[] ret = impl.getQueries(sessionId, queryType, yfirFlokkur, undirFlokkur);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.QueryInfo getQueryInfo(java.lang.String sessionId, java.lang.String queryId, boolean fieldInfo) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.QueryInfo ret = impl.getQueryInfo(sessionId, queryId, fieldInfo);
        return ret;
    }

    public byte[] genReport(java.lang.String sessionId, java.lang.String queryId, java.lang.String type, is.idega.webservice.propertyregistryservice.client.ParamInfo[] param) throws java.rmi.RemoteException
    {
        byte[] ret = impl.genReport(sessionId, queryId, type, param);
        return ret;
    }

    public java.lang.String genReportFilePath(java.lang.String sessionId, java.lang.String queryId, java.lang.String type, is.idega.webservice.propertyregistryservice.client.ParamInfo[] param) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.genReportFilePath(sessionId, queryId, type, param);
        return ret;
    }

    public is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult genDataSet(java.lang.String sessionId, java.lang.String queryId, java.lang.String filter, is.idega.webservice.propertyregistryservice.client.ParamInfo[] param, is.idega.webservice.propertyregistryservice.client.ResultField[] resultParam) throws java.rmi.RemoteException
    {
        is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult ret = impl.genDataSet(sessionId, queryId, filter, param, resultParam);
        return ret;
    }

}
