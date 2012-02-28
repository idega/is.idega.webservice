/**
 * EGOVDKM_AuthConsumerAccessPointLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eGOVDKM_AuthConsumer;

public class EGOVDKM_AuthConsumerAccessPointLocator extends org.apache.axis.client.Service implements eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerAccessPoint {

    public EGOVDKM_AuthConsumerAccessPointLocator() {
    }


    public EGOVDKM_AuthConsumerAccessPointLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EGOVDKM_AuthConsumerAccessPointLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for eGOVDKM_AuthConsumerAccessPointPort
    private java.lang.String eGOVDKM_AuthConsumerAccessPointPort_address = "https://egov.webservice.is/sst/runtime.asvc/com.actional.soapstation.eGOVDKM_AuthConsumer.AccessPoint";

    public java.lang.String geteGOVDKM_AuthConsumerAccessPointPortAddress() {
        return eGOVDKM_AuthConsumerAccessPointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String eGOVDKM_AuthConsumerAccessPointPortWSDDServiceName = "eGOVDKM_AuthConsumerAccessPointPort";

    public java.lang.String geteGOVDKM_AuthConsumerAccessPointPortWSDDServiceName() {
        return eGOVDKM_AuthConsumerAccessPointPortWSDDServiceName;
    }

    public void seteGOVDKM_AuthConsumerAccessPointPortWSDDServiceName(java.lang.String name) {
        eGOVDKM_AuthConsumerAccessPointPortWSDDServiceName = name;
    }

    public eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerType geteGOVDKM_AuthConsumerAccessPointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(eGOVDKM_AuthConsumerAccessPointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return geteGOVDKM_AuthConsumerAccessPointPort(endpoint);
    }

    public eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerType geteGOVDKM_AuthConsumerAccessPointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerBindingStub _stub = new eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerBindingStub(portAddress, this);
            _stub.setPortName(geteGOVDKM_AuthConsumerAccessPointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void seteGOVDKM_AuthConsumerAccessPointPortEndpointAddress(java.lang.String address) {
        eGOVDKM_AuthConsumerAccessPointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerType.class.isAssignableFrom(serviceEndpointInterface)) {
                eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerBindingStub _stub = new eGOVDKM_AuthConsumer.EGOVDKM_AuthConsumerBindingStub(new java.net.URL(eGOVDKM_AuthConsumerAccessPointPort_address), this);
                _stub.setPortName(geteGOVDKM_AuthConsumerAccessPointPortWSDDServiceName());
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
        if ("eGOVDKM_AuthConsumerAccessPointPort".equals(inputPortName)) {
            return geteGOVDKM_AuthConsumerAccessPointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("uri:eGOVDKM_AuthConsumer", "eGOVDKM_AuthConsumerAccessPoint");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("uri:eGOVDKM_AuthConsumer", "eGOVDKM_AuthConsumerAccessPointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("eGOVDKM_AuthConsumerAccessPointPort".equals(portName)) {
            seteGOVDKM_AuthConsumerAccessPointPortEndpointAddress(address);
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
