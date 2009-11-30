/**
 * VehicleRegistryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public class VehicleRegistryServiceLocator extends org.apache.axis.client.Service implements is.idega.webservice.vehicleregistryservice.client.VehicleRegistryService {

/**
 * Webservice to get information from vehicleregistry
 */

    public VehicleRegistryServiceLocator() {
    }


    public VehicleRegistryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VehicleRegistryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VehicleRegistryServiceSoap12
    private java.lang.String VehicleRegistryServiceSoap12_address = "https://ws.lt.is/vehicleregistry/vehicleregistryservice.asmx";

    public java.lang.String getVehicleRegistryServiceSoap12Address() {
        return VehicleRegistryServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VehicleRegistryServiceSoap12WSDDServiceName = "VehicleRegistryServiceSoap12";

    public java.lang.String getVehicleRegistryServiceSoap12WSDDServiceName() {
        return VehicleRegistryServiceSoap12WSDDServiceName;
    }

    public void setVehicleRegistryServiceSoap12WSDDServiceName(java.lang.String name) {
        VehicleRegistryServiceSoap12WSDDServiceName = name;
    }

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VehicleRegistryServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVehicleRegistryServiceSoap12(endpoint);
    }

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap12Stub _stub = new is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getVehicleRegistryServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVehicleRegistryServiceSoap12EndpointAddress(java.lang.String address) {
        VehicleRegistryServiceSoap12_address = address;
    }


    // Use to get a proxy class for VehicleRegistryServiceSoap
    private java.lang.String VehicleRegistryServiceSoap_address = "https://ws.lt.is/vehicleregistry/vehicleregistryservice.asmx";

    public java.lang.String getVehicleRegistryServiceSoapAddress() {
        return VehicleRegistryServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VehicleRegistryServiceSoapWSDDServiceName = "VehicleRegistryServiceSoap";

    public java.lang.String getVehicleRegistryServiceSoapWSDDServiceName() {
        return VehicleRegistryServiceSoapWSDDServiceName;
    }

    public void setVehicleRegistryServiceSoapWSDDServiceName(java.lang.String name) {
        VehicleRegistryServiceSoapWSDDServiceName = name;
    }

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VehicleRegistryServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVehicleRegistryServiceSoap(endpoint);
    }

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_BindingStub _stub = new is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getVehicleRegistryServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVehicleRegistryServiceSoapEndpointAddress(java.lang.String address) {
        VehicleRegistryServiceSoap_address = address;
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
            if (is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap12Stub _stub = new is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap12Stub(new java.net.URL(VehicleRegistryServiceSoap12_address), this);
                _stub.setPortName(getVehicleRegistryServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_BindingStub _stub = new is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_BindingStub(new java.net.URL(VehicleRegistryServiceSoap_address), this);
                _stub.setPortName(getVehicleRegistryServiceSoapWSDDServiceName());
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
        if ("VehicleRegistryServiceSoap12".equals(inputPortName)) {
            return getVehicleRegistryServiceSoap12();
        }
        else if ("VehicleRegistryServiceSoap".equals(inputPortName)) {
            return getVehicleRegistryServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleRegistryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleRegistryServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleRegistryServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VehicleRegistryServiceSoap12".equals(portName)) {
            setVehicleRegistryServiceSoap12EndpointAddress(address);
        }
        else 
if ("VehicleRegistryServiceSoap".equals(portName)) {
            setVehicleRegistryServiceSoapEndpointAddress(address);
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
