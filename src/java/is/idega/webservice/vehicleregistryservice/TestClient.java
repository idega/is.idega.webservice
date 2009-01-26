package is.idega.webservice.vehicleregistryservice;

import is.idega.webservice.vehicleregistryservice.client.Vehicle;
import is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceLocator;
import is.idega.webservice.vehicleregistryservice.client.VehicleRegistryServiceSoap_PortType;

import java.net.URL;

public class TestClient {
	public static void main(String[] args) {
		TestClient client = new TestClient();
		client.doStuff();
	}

	private void doStuff() {
		try {
			String endpoint = "https://ws.lt.is/vehicleregistry/vehicleregistryservice.asmx";

			VehicleRegistryServiceLocator locator = new VehicleRegistryServiceLocator();
			VehicleRegistryServiceSoap_PortType port = locator.getVehicleRegistryServiceSoap(new URL(endpoint));
			
			Vehicle vehicles[] = port.basicVehicleInformation("bilastaedi6", "hS6.dbYK", "TEST1", "", "", "");
			System.out.println("vehicles.length = " + vehicles.length);
			for (Vehicle vehicle: vehicles) {
				System.out.println("make = " + vehicle.getMake());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}