package is.idega.webservice.vehicleregistryservice.business;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Stub;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.core.cache.IWCacheManager2;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.util.ArrayUtil;
import com.idega.util.CoreConstants;
import com.idega.util.IOUtil;
import com.idega.util.IWTimestamp;
import com.idega.util.StringHandler;
import com.idega.util.StringUtil;

import is.lt.ws.ServiceLocator;
import is.lt.ws.ServiceSoap;
import is.lt.ws.VehicleRegistryService.Vehicle;
import is.lt.ws.VehicleRegistryService.VehicleRegistryServiceLocator;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service("vehicleRegistryWebService")
public class VehicleRegistryWebServiceBean extends DefaultSpringBean implements VehicleRegistryWebService {

	private static final String VEHICLE_REGISTRY_CACHE = "vehicle_registry_cache";
	private static final String VEHICLE_REGISTRY_PASSWORD = "vehicle_registry_password";
	private static final String VEHICLE_REGISTRY_USER = "vehicle_registry_user";
	private static final String VEHICLE_REGISTRY_ENDPOINT = "vehicle_registry_endpoint";

	private void setTimeout(Stub port, int timeout) {
		if (port == null || timeout < 0) {
			return;
		}

		port.setTimeout(timeout); //Setting timeout to stop the load if the service is not answering
	}

	private Vehicle[] getVehicleViaOldWS(String endpoint, String userid, String password, int timeout, String registrationNumber, String permNo) throws MalformedURLException, ServiceException, RemoteException {
		VehicleRegistryServiceLocator locator = new VehicleRegistryServiceLocator();
		is.lt.ws.VehicleRegistryService.VehicleRegistryServiceSoap port = locator.getVehicleRegistryServiceSoap(new URL(endpoint));
		setTimeout((Stub) port, timeout);

		return port.basicVehicleInformation(
				userid,
				password,
				permNo,
				registrationNumber,
				CoreConstants.EMPTY,
				CoreConstants.EMPTY
		);
	}

	private Vehicle[] getVehicleViaNewWS(String endpoint, String userid, String password, int timeout, String registrationNumber, String permNo) throws MalformedURLException, ServiceException, RemoteException {
		ServiceLocator locator = new ServiceLocator();
		ServiceSoap port = locator.getServiceSoap(new URL(endpoint));
		setTimeout((Stub) port, timeout);

		String vehicleInfo = port.allVehicleInformation(userid, password, null, permNo, registrationNumber, null);
		if (StringUtil.isEmpty(vehicleInfo)) {
			return null;
		}

		InputStream stream = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Vehicle.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			stream = StringHandler.getStreamFromString(vehicleInfo);
			Vehicle vehicle = (Vehicle) jaxbUnmarshaller.unmarshal(stream);
			if (vehicle != null) {
				return new Vehicle[] {vehicle};
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error creating " + Vehicle.class.getName() + " object from " + vehicleInfo, e);
		} finally {
			IOUtil.close(stream);
		}

		return null;
	}

	@Override
	public Vehicle getVehicleInfo(String registrationNumber) {
		long start = System.currentTimeMillis();

		IWMainApplicationSettings settings = getApplication().getSettings();
		boolean globalDebug = IWMainApplication.isDebugActive();
		boolean debugParkingWS = settings.getBoolean("parking.debug_ws", Boolean.TRUE);
		try {
			IWMainApplication.setDebugMode(debugParkingWS);

			if (IWMainApplication.isDebugActive()) {
				getLogger().info("[VehicleRegistryWebService] Starting lookup on vehicle '" + registrationNumber + "': " + new IWTimestamp(start).toString());
			}

			String endpoint = settings.getProperty(VEHICLE_REGISTRY_ENDPOINT, CoreConstants.EMPTY);
			String userid = settings.getProperty(VEHICLE_REGISTRY_USER, CoreConstants.EMPTY);
			String password = settings.getProperty(VEHICLE_REGISTRY_PASSWORD, CoreConstants.EMPTY);

			int timeout = Integer.parseInt(settings.getProperty("egov.parking.timeout", "5000"));

			IWCacheManager2 manager = IWCacheManager2.getInstance(IWMainApplication.getDefaultIWMainApplication());
			Map<String, Vehicle> cache = null;
			if (manager != null) {
				cache = manager.getCache(VEHICLE_REGISTRY_CACHE);
				if (cache.containsKey(registrationNumber)) {
					if (IWMainApplication.isDebugActive()) {
						getLogger().info("[VehicleRegistryWebService] Fetching vehicle '" + registrationNumber + "' from cache: " + (System.currentTimeMillis() - start) + " ms");
					}
					return cache.get(registrationNumber);
				}
			}

			if (IWMainApplication.isDebugActive()) {
				getLogger().info("[VehicleRegistryWebService] Fetching vehicle '" + registrationNumber + "' from web service: endpoint: '" +
						endpoint + "', user ID: '" + userid + "', password: '" + password + "', registration number: '" + registrationNumber + "' " +
						(System.currentTimeMillis() - start) + " ms");
			}

			try {
				boolean newWS = settings.getBoolean("parking.use_new_ws_for_vehicle", true);
				Vehicle[] vehicles = newWS ?
						getVehicleViaNewWS(endpoint, userid, password, timeout, registrationNumber, null):
						getVehicleViaOldWS(endpoint, userid, password, timeout, registrationNumber, CoreConstants.EMPTY);

				if (ArrayUtil.isEmpty(vehicles)) {
					getLogger().warning("Vehicle was not found by registration number: " + registrationNumber);
					return null;
				}
				if (vehicles.length == 1) {
					if (cache != null) {
						cache.put(registrationNumber, vehicles[0]);
					}
					if (
							(vehicles[0].getLatestRegistration() != null && !vehicles[0].getLatestRegistration().startsWith("Afskr")) ||
							(vehicles[0].getVehiclestatus() != null && !vehicles[0].getVehiclestatus().startsWith("Afskr"))
					) {
						if (IWMainApplication.isDebugActive()) {
							getLogger().info("[VehicleRegistryWebService] Returning vehicle '" + registrationNumber + "': " +
									(System.currentTimeMillis() - start) + " ms");
						}
						return vehicles[0];
					} else {
						if (IWMainApplication.isDebugActive()) {
							getLogger().warning("[VehicleRegistryWebService] No valid vehicle found; regNo = '" + registrationNumber + "': " +
									(System.currentTimeMillis() - start) + " ms");
						}
						return null;
					}
				} else {
					if (IWMainApplication.isDebugActive()) {
						getLogger().info("[VehicleRegistryWebService] Found more than one vehicle with regNo = '" + registrationNumber + "': " +
								(System.currentTimeMillis() - start) + " ms");
					}
					String permNo = null;

					Collection<Vehicle> registered = new ArrayList<Vehicle>();
					for (Vehicle vehicle : vehicles) {
						if (!vehicle.getLatestRegistration().startsWith("Afskr")) {
							registered.add(vehicle);
						}
					}

					if (!registered.isEmpty()) {
						if (registered.size() == 1) {
							permNo = registered.iterator().next().getPermNo();
						} else {
							for (Vehicle vehicle : registered) {
								if (vehicle.getPermNo().equalsIgnoreCase(registrationNumber)) {
									permNo = vehicle.getPermNo();
									break;
								}
							}

							if (permNo == null) {
								IWTimestamp lastRegistration = null;
								for (Vehicle vehicle2 : registered) {
									IWTimestamp firstRegistration = new IWTimestamp(vehicle2.getFirstregDate());
									if (lastRegistration == null || (lastRegistration != null && lastRegistration.isEarlierThan(firstRegistration))) {
										lastRegistration = firstRegistration;
										permNo = vehicle2.getPermNo();
									}
								}
							}
						}
					}

					if (permNo != null) {
						if (IWMainApplication.isDebugActive()) {
							getLogger().info("[VehicleRegistryWebService] Fetching vehicle with permNo = '" + permNo + "' and regNo = '" +
									registrationNumber + "' from web service: " + (System.currentTimeMillis() - start) + " ms");
						}

						Vehicle permVehicles[] = newWS ?
								getVehicleViaNewWS(endpoint, userid, password, timeout, null, permNo):
								getVehicleViaOldWS(endpoint, userid, password, timeout, CoreConstants.EMPTY, permNo);
						if (permVehicles != null && permVehicles.length > 0) {
							if (cache != null) {
								cache.put(registrationNumber, permVehicles[0]);
							}
							if (IWMainApplication.isDebugActive()) {
								getLogger().info("[VehicleRegistryWebService] Returning vehicle '" + registrationNumber + "': " +
										(System.currentTimeMillis() - start) + " ms");
							}
							return permVehicles[0];
						}
					}
				}
			} catch (MalformedURLException e) {
				if (IWMainApplication.isDebugActive()) {
					getLogger().warning("[VehicleRegistryWebService] Exception thrown (" + e.getMessage() + "): " +
							(System.currentTimeMillis() - start) + " ms");
				}
				e.printStackTrace();
			} catch (ServiceException e) {
				if (IWMainApplication.isDebugActive()) {
					getLogger().warning("[VehicleRegistryWebService] Exception thrown (" + e.getMessage() + "): " +
							(System.currentTimeMillis() - start) + " ms");
				}
				e.printStackTrace();
			} catch (RemoteException e) {
				if (IWMainApplication.isDebugActive()) {
					getLogger().warning("[VehicleRegistryWebService] Exception thrown (" + e.getMessage() + "): " +
							(System.currentTimeMillis() - start) + " ms");
				}
				getLogger().log(Level.WARNING, "Error while getting vehicle by registration number: " + registrationNumber, e);
			}

			return null;
		} finally {
			IWMainApplication.setDebugMode(globalDebug);
		}
	}

}