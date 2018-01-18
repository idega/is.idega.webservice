/**
 * ParkedInService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package stokkur.mpark.service.client;

public class ParkedInService_ServiceLocator extends org.apache.axis.client.Service implements stokkur.mpark.service.client.ParkedInService_Service {

    public ParkedInService_ServiceLocator() {
    }


    public ParkedInService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ParkedInService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ParkedInServiceHttpPort
    private java.lang.String ParkedInServiceHttpPort_address = "http://www.leggja.is/leggja/services/ParkedInService";

    public java.lang.String getParkedInServiceHttpPortAddress() {
        return ParkedInServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ParkedInServiceHttpPortWSDDServiceName = "ParkedInServiceHttpPort";

    public java.lang.String getParkedInServiceHttpPortWSDDServiceName() {
        return ParkedInServiceHttpPortWSDDServiceName;
    }

    public void setParkedInServiceHttpPortWSDDServiceName(java.lang.String name) {
        ParkedInServiceHttpPortWSDDServiceName = name;
    }

    public stokkur.mpark.service.client.ParkedInService_PortType getParkedInServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ParkedInServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getParkedInServiceHttpPort(endpoint);
    }

    public stokkur.mpark.service.client.ParkedInService_PortType getParkedInServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            stokkur.mpark.service.client.ParkedInServiceHttpBindingStub _stub = new stokkur.mpark.service.client.ParkedInServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getParkedInServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setParkedInServiceHttpPortEndpointAddress(java.lang.String address) {
        ParkedInServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (stokkur.mpark.service.client.ParkedInService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                stokkur.mpark.service.client.ParkedInServiceHttpBindingStub _stub = new stokkur.mpark.service.client.ParkedInServiceHttpBindingStub(new java.net.URL(ParkedInServiceHttpPort_address), this);
                _stub.setPortName(getParkedInServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ParkedInServiceHttpPort".equals(inputPortName)) {
            return getParkedInServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://client.service.mpark.stokkur", "ParkedInService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://client.service.mpark.stokkur", "ParkedInServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ParkedInServiceHttpPort".equals(portName)) {
            setParkedInServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
