/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws;

public interface Service extends javax.xml.rpc.Service {

/**
 * Webservice to get information from vehicleregistry
 */
    public java.lang.String getServiceSoapAddress();

    public is.lt.ws.ServiceSoap getServiceSoap() throws javax.xml.rpc.ServiceException;

    public is.lt.ws.ServiceSoap getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getServiceSoap12Address();

    public is.lt.ws.ServiceSoap getServiceSoap12() throws javax.xml.rpc.ServiceException;

    public is.lt.ws.ServiceSoap getServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
