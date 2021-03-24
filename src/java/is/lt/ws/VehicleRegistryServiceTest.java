package is.lt.ws;

import java.net.URL;

import org.apache.axis.client.Stub;

import com.idega.util.CoreConstants;

import is.lt.ws.VehicleRegistryService.VehicleRegistryServiceLocator;

public class VehicleRegistryServiceTest {

	public static void main(String[] args) throws Exception {
		String endpoint = "https://api-developer.creditinfo.is/vehicleregistry/vehicleregistryservice.asmx";
		VehicleRegistryServiceLocator locator = new VehicleRegistryServiceLocator();
		is.lt.ws.VehicleRegistryService.VehicleRegistryServiceSoap port = locator.getVehicleRegistryServiceSoap12(new URL(endpoint));
		((Stub) port).setTimeout(5000);

		is.lt.ws.VehicleRegistryService.Vehicle[] vehicles = port.basicVehicleInformation(
				"ws_bilastaedi",
				"ws_bilastaediDEMO",
				null,
				"BPR35",
				CoreConstants.EMPTY,
				CoreConstants.EMPTY
		);

		System.out.println("INFO: " + vehicles);
	}

}