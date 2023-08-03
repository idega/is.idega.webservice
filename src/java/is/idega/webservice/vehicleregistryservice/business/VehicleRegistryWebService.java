package is.idega.webservice.vehicleregistryservice.business;

import is.idega.webservice.model.vehicle.Vehicle;

public interface VehicleRegistryWebService {

	public Vehicle getVehicleInfo(String registrationNumber);

}