/**
 * VehicleRegistryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

public interface VehicleRegistryServiceSoap extends java.rmi.Remote {

    /**
     * Returns all vehicle information
     */
    public is.lt.ws.VehicleRegistryService.VehicleAll[] allVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns only basic vehicle information
     */
    public is.lt.ws.VehicleRegistryService.Vehicle[] basicVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns additional vehicle information, function BasicVehicleInformation
     * must be called be first.
     */
    public is.lt.ws.VehicleRegistryService.VehicleExtra additionalVehicleInformation(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns list of possible stat records that are used in Stat
     * property of record Reading
     */
    public is.lt.ws.VehicleRegistryService.Stat[] statRecords(java.lang.String userName, java.lang.String password, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns all accidents on a vehicle.
     */
    public is.lt.ws.VehicleRegistryService.Accidents allAccidents(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns all vehicle for a persidno.
     */
    public is.lt.ws.VehicleRegistryService.PersIDNoLookup financialCompanyAllVehiclesForPersidno(java.lang.String userName, java.lang.String password, java.lang.String requestedPersonalNo, java.lang.String companyPersonalNo, java.lang.String employeePersonalNo) throws java.rmi.RemoteException;

    /**
     * Returns all vehicle for a persidno.
     */
    public is.lt.ws.VehicleRegistryService.PersIDNoLookup allVehiclesForPersidno(java.lang.String userName, java.lang.String password, java.lang.String clientPersonalNo, java.lang.String lawayerPersonalNo, boolean showDeregistered, boolean showHistory, java.lang.String requesterID) throws java.rmi.RemoteException;

    /**
     * Returns vehicle complete history in pdf format.
     */
    public byte[] vehicleCompleteHistoryPDF(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns all accidents on a vehicle in xml format.
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
     * Returns all accidents for the given vehicle in xml format.
     */
    public java.lang.String allAccidentsXml(java.lang.String userName, java.lang.String password, java.lang.String permno, java.lang.String regno, java.lang.String vin, java.lang.String queryInformation) throws java.rmi.RemoteException;

    /**
     * Returns web service version
     */
    public is.lt.ws.VehicleRegistryService.Version getServiceVersion() throws java.rmi.RemoteException;
}
