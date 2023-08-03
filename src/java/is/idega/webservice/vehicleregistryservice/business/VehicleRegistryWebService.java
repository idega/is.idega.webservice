package is.idega.webservice.vehicleregistryservice.business;

import is.lt.ws.VehicleRegistryService.Vehicle;

public interface VehicleRegistryWebService {

	public Vehicle getVehicleInfo(String registrationNumber);

}