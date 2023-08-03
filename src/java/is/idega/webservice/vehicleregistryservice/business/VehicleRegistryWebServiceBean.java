package is.idega.webservice.vehicleregistryservice.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.Response.Status;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.core.business.DefaultSpringBean;
import com.idega.core.cache.IWCacheManager2;
import com.idega.core.file.util.MimeTypeUtil;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.restful.util.ConnectionUtil;
import com.idega.util.CoreConstants;
import com.idega.util.IWTimestamp;
import com.idega.util.ListUtil;
import com.idega.util.StringHandler;
import com.idega.util.StringUtil;
import com.sun.jersey.api.client.ClientResponse;

import is.idega.webservice.model.vehicle.CoOwner;
import is.idega.webservice.model.vehicle.CoOwners;
import is.idega.webservice.model.vehicle.Operator;
import is.idega.webservice.model.vehicle.Operators;
import is.idega.webservice.model.vehicle.Owner;
import is.idega.webservice.model.vehicle.Owners;
import is.idega.webservice.model.vehicle.Vehicle;

@Primary
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service("vehicleRegistryWebService")
public class VehicleRegistryWebServiceBean extends DefaultSpringBean implements VehicleRegistryWebService {

	private static final String CURRENT = "Current",
								VEHICLE_STATUS = "Vehiclestatus",
								LATEST_REGISTRATION = "LatestRegistration",
								FULL_NAME = "Fullname",
								PERSONAL_ID = "Persidno",
								ADDRESS = "Address",
								POSTAL_CODE = "Postalcode",
								CITY = "City",
								CO_OWNERS = "CoOwners";

	public static final String	VEHICLE_REGISTRY_CACHE = "vehicle_registry_cache",
								VEHICLE_REGISTRY_PASSWORD = "vehicle_registry_password",
								VEHICLE_REGISTRY_USER = "vehicle_registry_user",
								VEHICLE_REGISTRY_ENDPOINT = "vehicle_registry_endpoint";

	private List<Vehicle> getVehicleViaOldWS(String endpoint, String userid, String password, int timeout, String registrationNumber, String permNo) throws Exception {
		Integer status = null;
		String errorMessage = null, responseData = null;
		ClientResponse response = null;
		try {
			String url = endpoint;
			response = ConnectionUtil.getInstance().getResponseFromREST(
					url,
					null,
					MimeTypeUtil.MIME_TYPE_XML,
					HttpMethod.GET,
					null,
					timeout,
					timeout,
					null,
					null,
					new AdvancedProperty("userName", userid, "userName"),
					new AdvancedProperty("password", password, "password"),
					new AdvancedProperty("regno", StringUtil.isEmpty(registrationNumber) ? CoreConstants.EMPTY : registrationNumber, "regno"),
					new AdvancedProperty("permno", StringUtil.isEmpty(permNo) ? CoreConstants.EMPTY : permNo, "permno"),
					new AdvancedProperty("vin", CoreConstants.EMPTY, "vin"),
					new AdvancedProperty("queryInformation", CoreConstants.EMPTY, "queryInformation")
			);
			if (response == null || response.getStatus() != Status.OK.getStatusCode()) {
				status = response == null ? null : response.getStatus();
				errorMessage = response == null ? null : StringHandler.getContentFromInputStream(response.getEntityInputStream());
				getLogger().warning("Error getting basic information about vehicle " + registrationNumber + ". Response (" + response +
						") or response status is not OK: " + (status == null ? "unknown" : status) + ". Response message:\n" +
						(errorMessage == null ? "not provided" : errorMessage));
				return null;
			}

			responseData = StringHandler.getContentFromInputStream(response.getEntityInputStream());
			if (StringUtil.isEmpty(responseData)) {
				getLogger().warning("Empty response from " + response);
				return null;
			}

			return getVehicles(responseData);
		} catch (Exception e) {
			errorMessage = "Failed to get basic information about vehicle " + registrationNumber + ". Response (" + response +
					") or response status is not OK: " + (status == null ? "unknown" : status) + ". Response message:\n" +
					(errorMessage == null ? "not provided" : errorMessage);
			getLogger().log(Level.WARNING, errorMessage, e);
			throw new Exception(errorMessage, e);
		}
	}

	private List<Vehicle> getVehicles(String xml) throws Exception {
		if (StringUtil.isEmpty(xml)) {
			return null;
		}

		Document document = Jsoup.parse(xml);
		if (document == null) {
			return null;
		}

		Elements vehicleTags = document.getElementsByTag("Vehicle");
		if (ListUtil.isEmpty(vehicleTags)) {
			return null;
		}

		List<Vehicle> results = new ArrayList<>();
		for (Iterator<Element> iter = vehicleTags.iterator(); iter.hasNext();) {
			Element element = iter.next();

			Vehicle vehicle = new Vehicle();
			vehicle.setLatestRegistration(getValue(element, LATEST_REGISTRATION));
			vehicle.setVehiclestatus(getValue(element, VEHICLE_STATUS));

			vehicle.setRegNo(getValue(element, "RegNo"));
			vehicle.setPermNo(getValue(element, "PermNo"));

			vehicle.setMake(getValue(element, "Make"));
			vehicle.setManufacturer(getValue(element, "Manufacturer"));
			vehicle.setVehcom(getValue(element, "Vehcom"));

			vehicle.setColor(getValue(element, "Color"));

			vehicle.setInsuranceCompany(getValue(element, "InsuranceCompany"));
			vehicle.setInsuranceStatus(getValue(element, "InsuranceStatus"));

			vehicle.setOwners(getOwners(element));
			vehicle.setOperators(getOperators(element));

			results.add(vehicle);
		}

		return results;
	}

	private <T extends Element> String getValue(T documentOrElement, String tag) {
		if (documentOrElement == null || StringUtil.isEmpty(tag)) {
			return null;
		}

		Elements elements = documentOrElement.getElementsByTag(tag);
		if (ListUtil.isEmpty(elements)) {
			return null;
		}

		String value = null;
		for (Iterator<Element> iter = elements.iterator(); (iter.hasNext() && StringUtil.isEmpty(value));) {
			Element element = iter.next();
			value = element == null ? null : element.text();
		}
		return value;
	}

	private <T extends Element> Owners getOwners(T document) {
		if (document == null) {
			return null;
		}

		Elements ownersEl = document.getElementsByTag("Owner");
		if (ListUtil.isEmpty(ownersEl)) {
			return null;
		}

		Owners result = new Owners();
		List<Owner> owners = new ArrayList<>();
		for (Iterator<Element> iter = ownersEl.iterator(); iter.hasNext();) {
			Element ownerEl = iter.next();

			String name = getValue(ownerEl, FULL_NAME);
			String personalId = getValue(ownerEl, PERSONAL_ID);
			if (StringUtil.isEmpty(name) || StringUtil.isEmpty(personalId)) {
				continue;
			}

			Owner owner = new Owner();
			owner.setFullname(name);
			owner.setPersidno(personalId);
			owner.setCurrent(getValue(ownerEl, CURRENT));
			owner.setAddress(getValue(ownerEl, ADDRESS));
			owner.setPostalcode(getValue(ownerEl, POSTAL_CODE));
			owner.setCity(getValue(ownerEl, CITY));

			Elements coOwnersEl = ownerEl.getElementsByTag(CO_OWNERS);
			if (!ListUtil.isEmpty(coOwnersEl)) {
				List<CoOwner> coOwners = new ArrayList<>();
				for (Element coOwnerEl: coOwnersEl) {
					String coOwnerName = getValue(coOwnerEl, FULL_NAME);
					String coOwnerPersonalId = getValue(coOwnerEl, PERSONAL_ID);
					if (StringUtil.isEmpty(coOwnerName) || StringUtil.isEmpty(coOwnerPersonalId)) {
						continue;
					}

					CoOwner coOwner = new CoOwner();
					coOwner.setFullname(coOwnerName);
					coOwner.setPersidno(coOwnerPersonalId);
					coOwner.setAddress(getValue(coOwnerEl, ADDRESS));
					coOwner.setPostalcode(getValue(coOwnerEl, POSTAL_CODE));
					coOwner.setCity(getValue(coOwnerEl, CITY));
					coOwners.add(coOwner);
				}
				if (coOwners.size() > 0) {
					CoOwners coOwnersObject = new CoOwners();
					owner.setCoOwners(coOwnersObject);
					coOwnersObject.setCoOwner(coOwners);
				}
			}

			owners.add(owner);
		}
		result.setOwner(owners);
		return result;
	}

	private <T extends Element> Operators getOperators(T document) {
		if (document == null) {
			return null;
		}

		Elements operatorsEl = document.getElementsByTag("Operator");
		if (ListUtil.isEmpty(operatorsEl)) {
			return null;
		}

		Operators result = new Operators();
		List<Operator> operators = new ArrayList<>();
		for (Iterator<Element> iter = operatorsEl.iterator(); iter.hasNext();) {
			Element operatorEl = iter.next();

			String name = getValue(operatorEl, FULL_NAME);
			String personalId = getValue(operatorEl, PERSONAL_ID);
			if (StringUtil.isEmpty(name) || StringUtil.isEmpty(personalId)) {
				continue;
			}

			Operator operator = new Operator();
			operator.setFullname(name);
			operator.setPersidno(personalId);
			operator.setCurrent(getValue(operatorEl, CURRENT));
			operator.setAddress(getValue(operatorEl, ADDRESS));
			operator.setPostalcode(getValue(operatorEl, POSTAL_CODE));
			operator.setCity(getValue(operatorEl, CITY));
			operators.add(operator);
		}
		result.setOperator(operators);
		return result;
	}

	private List<Vehicle> getVehicleViaNewWS(String endpoint, String userid, String password, int timeout, String registrationNumber, String permNo) throws Exception {
		return getVehicleViaOldWS(endpoint, userid, password, timeout, registrationNumber, permNo);
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

			String endpoint = settings.getProperty(VEHICLE_REGISTRY_ENDPOINT, CoreConstants.EMPTY);//"https://ws.lt.is/VehicleRegistry/VehicleRegistryService.asmx/BasicVehicleInformation";
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
				List<Vehicle> vehicles = newWS ?
						getVehicleViaNewWS(endpoint, userid, password, timeout, registrationNumber, null):
						getVehicleViaOldWS(endpoint, userid, password, timeout, registrationNumber, CoreConstants.EMPTY);

				if (ListUtil.isEmpty(vehicles)) {
					getLogger().warning("Vehicle was not found by registration number: " + registrationNumber);
					return null;
				}
				if (vehicles.size() == 1) {
					if (cache != null) {
						cache.put(registrationNumber, vehicles.get(0));
					}
					if (
							(vehicles.get(0).getLatestRegistration() != null && !vehicles.get(0).getLatestRegistration().startsWith("Afskr")) ||
							(vehicles.get(0).getVehiclestatus() != null && !vehicles.get(0).getVehiclestatus().startsWith("Afskr"))
					) {
						if (IWMainApplication.isDebugActive()) {
							getLogger().info("[VehicleRegistryWebService] Returning vehicle '" + registrationNumber + "': " +
									(System.currentTimeMillis() - start) + " ms");
						}
						return vehicles.get(0);
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

					Collection<Vehicle> registered = new ArrayList<>();
					for (Vehicle vehicle: vehicles) {
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

						List<Vehicle> permVehicles = newWS ?
								getVehicleViaNewWS(endpoint, userid, password, timeout, null, permNo):
								getVehicleViaOldWS(endpoint, userid, password, timeout, CoreConstants.EMPTY, permNo);
						if (permVehicles != null && permVehicles.size() > 0) {
							if (cache != null) {
								cache.put(registrationNumber, permVehicles.get(0));
							}
							if (IWMainApplication.isDebugActive()) {
								getLogger().info("[VehicleRegistryWebService] Returning vehicle '" + registrationNumber + "': " +
										(System.currentTimeMillis() - start) + " ms");
							}
							return permVehicles.get(0);
						}
					}
				}
			} catch (Exception e) {
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