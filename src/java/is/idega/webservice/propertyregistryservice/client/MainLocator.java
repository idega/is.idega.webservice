/**
 * MainLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class MainLocator extends org.apache.axis.client.Service implements is.idega.webservice.propertyregistryservice.client.Main {

    public MainLocator() {
    }


    public MainLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MainLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MainSoap
    private java.lang.String MainSoap_address = "http://webservices.fasteignaskra.is/main.asmx";

    public java.lang.String getMainSoapAddress() {
        return MainSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MainSoapWSDDServiceName = "MainSoap";

    public java.lang.String getMainSoapWSDDServiceName() {
        return MainSoapWSDDServiceName;
    }

    public void setMainSoapWSDDServiceName(java.lang.String name) {
        MainSoapWSDDServiceName = name;
    }

    public is.idega.webservice.propertyregistryservice.client.MainSoap_PortType getMainSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MainSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMainSoap(endpoint);
    }

    public is.idega.webservice.propertyregistryservice.client.MainSoap_PortType getMainSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.webservice.propertyregistryservice.client.MainSoap_BindingStub _stub = new is.idega.webservice.propertyregistryservice.client.MainSoap_BindingStub(portAddress, this);
            _stub.setPortName(getMainSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMainSoapEndpointAddress(java.lang.String address) {
        MainSoap_address = address;
    }


    // Use to get a proxy class for MainSoap12
    private java.lang.String MainSoap12_address = "http://webservices.fasteignaskra.is/main.asmx";

    public java.lang.String getMainSoap12Address() {
        return MainSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MainSoap12WSDDServiceName = "MainSoap12";

    public java.lang.String getMainSoap12WSDDServiceName() {
        return MainSoap12WSDDServiceName;
    }

    public void setMainSoap12WSDDServiceName(java.lang.String name) {
        MainSoap12WSDDServiceName = name;
    }

    public is.idega.webservice.propertyregistryservice.client.MainSoap_PortType getMainSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MainSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMainSoap12(endpoint);
    }

    public is.idega.webservice.propertyregistryservice.client.MainSoap_PortType getMainSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.webservice.propertyregistryservice.client.MainSoap12Stub _stub = new is.idega.webservice.propertyregistryservice.client.MainSoap12Stub(portAddress, this);
            _stub.setPortName(getMainSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMainSoap12EndpointAddress(java.lang.String address) {
        MainSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.idega.webservice.propertyregistryservice.client.MainSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.webservice.propertyregistryservice.client.MainSoap_BindingStub _stub = new is.idega.webservice.propertyregistryservice.client.MainSoap_BindingStub(new java.net.URL(MainSoap_address), this);
                _stub.setPortName(getMainSoapWSDDServiceName());
                return _stub;
            }
            if (is.idega.webservice.propertyregistryservice.client.MainSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.webservice.propertyregistryservice.client.MainSoap12Stub _stub = new is.idega.webservice.propertyregistryservice.client.MainSoap12Stub(new java.net.URL(MainSoap12_address), this);
                _stub.setPortName(getMainSoap12WSDDServiceName());
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
        if ("MainSoap".equals(inputPortName)) {
            return getMainSoap();
        }
        else if ("MainSoap12".equals(inputPortName)) {
            return getMainSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Main");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "MainSoap"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "MainSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MainSoap".equals(portName)) {
            setMainSoapEndpointAddress(address);
        }
        else 
if ("MainSoap12".equals(portName)) {
            setMainSoap12EndpointAddress(address);
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
