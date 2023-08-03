package is.lt.ws.VehicleRegistryService;

import java.util.List;

public class Owners {

	public List<Owner> Owner;

	public Owners() {
		super();
	}

	public Owners(List<Owner> owners) {
		this();

		Owner = owners;
	}

	public List<Owner> getOwner() {
		return Owner;
	}

	public void setOwner(List<Owner> owner) {
		Owner = owner;
	}

}