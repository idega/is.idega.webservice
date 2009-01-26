/**
 * ParkedInServiceHttpBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.parkingservice.client;

public class ParkedInServiceHttpBindingSkeleton implements is.idega.webservice.parkingservice.client.ParkedInService_PortType, org.apache.axis.wsdl.Skeleton {
    private is.idega.webservice.parkingservice.client.ParkedInService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://client.service.mpark.stokkur", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "ParkedInRequest"), is.idega.webservice.parkingservice.client.ParkedInRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("parkedIn", _params, new javax.xml.namespace.QName("http://client.service.mpark.stokkur", "result"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://types.services.mpark.stokkur", "ParkedInReply"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://client.service.mpark.stokkur", "parkedIn"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("parkedIn") == null) {
            _myOperations.put("parkedIn", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("parkedIn")).add(_oper);
    }

    public ParkedInServiceHttpBindingSkeleton() {
        this.impl = new is.idega.webservice.parkingservice.client.ParkedInServiceHttpBindingImpl();
    }

    public ParkedInServiceHttpBindingSkeleton(is.idega.webservice.parkingservice.client.ParkedInService_PortType impl) {
        this.impl = impl;
    }
    public is.idega.webservice.parkingservice.client.ParkedInReply parkedIn(is.idega.webservice.parkingservice.client.ParkedInRequest request) throws java.rmi.RemoteException
    {
        is.idega.webservice.parkingservice.client.ParkedInReply ret = impl.parkedIn(request);
        return ret;
    }

}
