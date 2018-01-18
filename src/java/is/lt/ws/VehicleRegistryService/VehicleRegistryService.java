/**
 * VehicleRegistryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

public interface VehicleRegistryService extends javax.xml.rpc.Service {

/**
 * Webservice to get information from vehicleregistry
 */
    public java.lang.String getVehicleRegistryServiceSoap12Address();

    public is.lt.ws.VehicleRegistryService.VehicleRegistryServiceSoap getVehicleRegistryServiceSoap12() throws javax.xml.rpc.ServiceException;

    public is.lt.ws.VehicleRegistryService.VehicleRegistryServiceSoap getVehicleRegistryServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getVehicleRegistryServiceSoapAddress();

    public is.lt.ws.VehicleRegistryService.VehicleRegistryServiceSoap getVehicleRegistryServiceSoap() throws javax.xml.rpc.ServiceException;

    public is.lt.ws.VehicleRegistryService.VehicleRegistryServiceSoap getVehicleRegistryServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
