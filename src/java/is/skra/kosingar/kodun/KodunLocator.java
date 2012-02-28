/**
 * KodunLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.skra.kosingar.kodun;

public class KodunLocator extends org.apache.axis.client.Service implements is.skra.kosingar.kodun.Kodun {

    public KodunLocator() {
    }


    public KodunLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public KodunLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for eGovElection_wsd_kodun_Port
    private java.lang.String eGovElection_wsd_kodun_Port_address = "https://egov.webservice.is/sst/runtime.asvc/com.actional.soapstation.eGOV_SKRA_KosningKodun";

    public java.lang.String geteGovElection_wsd_kodun_PortAddress() {
        return eGovElection_wsd_kodun_Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String eGovElection_wsd_kodun_PortWSDDServiceName = "eGovElection_wsd_kodun_Port";

    public java.lang.String geteGovElection_wsd_kodun_PortWSDDServiceName() {
        return eGovElection_wsd_kodun_PortWSDDServiceName;
    }

    public void seteGovElection_wsd_kodun_PortWSDDServiceName(java.lang.String name) {
        eGovElection_wsd_kodun_PortWSDDServiceName = name;
    }

    public is.skra.kosingar.kodun.Kodun_PortType geteGovElection_wsd_kodun_Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(eGovElection_wsd_kodun_Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return geteGovElection_wsd_kodun_Port(endpoint);
    }

    public is.skra.kosingar.kodun.Kodun_PortType geteGovElection_wsd_kodun_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.skra.kosingar.kodun.EGovElection_wsd_kodun_BinderStub _stub = new is.skra.kosingar.kodun.EGovElection_wsd_kodun_BinderStub(portAddress, this);
            _stub.setPortName(geteGovElection_wsd_kodun_PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void seteGovElection_wsd_kodun_PortEndpointAddress(java.lang.String address) {
        eGovElection_wsd_kodun_Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.skra.kosingar.kodun.Kodun_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.skra.kosingar.kodun.EGovElection_wsd_kodun_BinderStub _stub = new is.skra.kosingar.kodun.EGovElection_wsd_kodun_BinderStub(new java.net.URL(eGovElection_wsd_kodun_Port_address), this);
                _stub.setPortName(geteGovElection_wsd_kodun_PortWSDDServiceName());
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
        if ("eGovElection_wsd_kodun_Port".equals(inputPortName)) {
            return geteGovElection_wsd_kodun_Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://skra.is/kosingar/kodun", "kodun");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://skra.is/kosingar/kodun", "eGovElection_wsd_kodun_Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("eGovElection_wsd_kodun_Port".equals(portName)) {
            seteGovElection_wsd_kodun_PortEndpointAddress(address);
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
