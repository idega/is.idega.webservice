/**
 * VehicleRegistryServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.vehicleregistryservice.client;

public interface VehicleRegistryServiceSoap_PortType extends java.rmi.Remote {

    /**
     * Returns all vehicle information
     */
    public is.idega.webservice.vehicleregistryservice.client.VehicleAll[] allVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns only basic vehicle information
     */
    public is.idega.webservice.vehicleregistryservice.client.Vehicle[] basicVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns additional vehicle information, function BasicVehicleInformation
     * must be called be first.
     */
    public is.idega.webservice.vehicleregistryservice.client.VehicleExtra additionalVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns list of possible stat records that are used in Stat
     * property of record Reading
     */
    public is.idega.webservice.vehicleregistryservice.client.Stat[] statRecords(java.lang.String userName, java.lang.String password, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns all vehicle information in xml format
     */
    public java.lang.String allVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns only basic vehicle information in xml format
     */
    public java.lang.String basicVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns additional vehicle information in xml format, function
     * BasicVehicleInformation or BasicVehicleInformationXml must be called
     * be first.
     */
    public java.lang.String additionalVehicleInformationXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns list of stat records that are used in Stat property
     * of record Reading in xml format
     */
    public java.lang.String statRecordsXml(java.lang.String userName, java.lang.String password, java.lang.String xmlVersion, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns web service version
     */
    public is.idega.webservice.vehicleregistryservice.client.Version getServiceVersion() throws java.rmi.RemoteException;
}
