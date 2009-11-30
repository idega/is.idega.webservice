/**
 * VehicleRegistryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public interface VehicleRegistryService extends javax.xml.rpc.Service {

/**
 * Webservice to get information from vehicleregistry
 */
    public java.lang.String getVehicleRegistryServiceSoap12Address();

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap12() throws javax.xml.rpc.ServiceException;

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getVehicleRegistryServiceSoapAddress();

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap() throws javax.xml.rpc.ServiceException;

    public is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType getVehicleRegistryServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
