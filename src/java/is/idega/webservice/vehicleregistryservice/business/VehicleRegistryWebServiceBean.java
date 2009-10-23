package is.idega.webservice.vehicleregistryservice.business;

import is.idega.webservice.vehicleregistryservice.client.Vehicle;
import is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceLocator;
import is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.cache.IWCacheManager2;
import com.idega.idegaweb.IWMainApplication;
import com.idega.util.IWTimestamp;

@Scope("singleton")
@Service("vehicleRegistryWebService")
public class VehicleRegistryWebServiceBean implements VehicleRegistryWebService {
	private static final String VEHICLE_REGISTRY_CACHE = "vehicle_registry_cache";
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

		IWCacheManager2 manager = IWCacheManager2.getInstance(IWMainApplication.getDefaultIWMainApplication());
		Map cache = null;
		if (manager != null) {
			cache = manager.getCache(VEHICLE_REGISTRY_CACHE);
			if (cache.containsKey(registrationNumber)) {
				return (Vehicle)cache.get(registrationNumber);
			}
		}
		
		try {
			VehicleRegistryServiceLocator locator = new VehicleRegistryServiceLocator();
			VehicleRegistryServiceSoap_PortType port = locator.getVehicleRegistryServiceSoap(new URL(endpoint));
			Vehicle vehicles[] = port.basicVehicleInformation(userid, password, "", registrationNumber, "", "");
			if (vehicles != null && vehicles.length > 0) {
				if (vehicles.length == 1) {
					if (cache != null) {
						cache.put(registrationNumber, vehicles[0]);
					}
					return vehicles[0];
				}
				else {
					IWTimestamp stamp = null;
					String permNo = null;
					for (Vehicle vehicle : vehicles) {
						IWTimestamp regDate = new IWTimestamp(vehicle.getFirstregDate());
						if (stamp == null || stamp.isEarlierThan(regDate)) {
							stamp = regDate;
							permNo = vehicle.getPermNo();
						}
					}
					
					if (permNo != null) {
						Vehicle permVehicles[] = port.basicVehicleInformation(userid, password, permNo, "", "", "");
						if (permVehicles != null && permVehicles.length > 0) {
							if (cache != null) {
								cache.put(registrationNumber, vehicles[0]);
							}
							return vehicles[0];
						}
					}
				}
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
