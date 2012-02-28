/**
 * BetriReykjavikServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.webservice.betrireykjavik.server;

public class BetriReykjavikServiceSoapBindingSkeleton implements is.idega.webservice.betrireykjavik.server.BetriReykjavik, org.apache.axis.wsdl.Skeleton {
    private is.idega.webservice.betrireykjavik.server.BetriReykjavik impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("authenticateUser", _params, new javax.xml.namespace.QName("", "authenticateUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://illuminati.is", "authenticateUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("authenticateUser") == null) {
            _myOperations.put("authenticateUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("authenticateUser")).add(_oper);
    }

    public BetriReykjavikServiceSoapBindingSkeleton() {
        this.impl = new is.idega.webservice.betrireykjavik.server.BetriReykjavikServiceSoapBindingImpl();
    }

    public BetriReykjavikServiceSoapBindingSkeleton(is.idega.webservice.betrireykjavik.server.BetriReykjavik impl) {
        this.impl = impl;
    }
    public java.lang.String authenticateUser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.authenticateUser(username, password);
        return ret;
    }

}
