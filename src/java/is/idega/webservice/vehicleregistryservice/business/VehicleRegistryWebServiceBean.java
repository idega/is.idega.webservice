package is.idega.webservice.vehicleregistryservice.business;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import is.idega.webservice.propertyregistryservice.client.MainLocator;
import is.idega.webservice.propertyregistryservice.client.MainSoap_PortType;
import is.idega.webservice.vehicleregistryservice.client.Vehicle;
import is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceLocator;
import is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;

@Scope("singleton")
@Service("vehicleRegistryWebService")
public class VehicleRegistryWebServiceBean implements VehicleRegistryWebService {
	private static final String VEHICLE_REGISTRY_PASSWORD = "vehicle_registry_password";
	private static final String VEHICLE_REGISTRY_USER = "vehicle_registry_user";
	private static final String VEHICLE_REGISTRY_ENDPOINT = "vehicle_registry_endpoint";

	public Vehicle getVehicleInfo(String registrationNumber) {
		String endpoint = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(
						VEHICLE_REGISTRY_ENDPOINT, "");
		String userid = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(VEHICLE_REGISTRY_USER, "");
		String password = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(
						VEHICLE_REGISTRY_PASSWORD, "");

		try {
			VehicleRegistryServiceLocator locator = new VehicleRegistryServiceLocator();
			VehicleRegistryServiceSoap_PortType port = locator.getVehicleRegistryServiceSoap(new URL(endpoint));
			Vehicle vehicles[] = port.basicVehicleInformation(userid, password, registrationNumber, "", "", "");
			if (vehicles != null && vehicles.length > 0) {
				return vehicles[0];
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}
}
