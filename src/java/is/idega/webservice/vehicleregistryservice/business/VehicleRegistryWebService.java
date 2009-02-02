package is.idega.webservice.vehicleregistryservice.business;

import is.idega.webservice.vehicleregistryservice.client.Vehicle;

public interface VehicleRegistryWebService {
	public Vehicle getVehicleInfo(String registrationNumber);
}
