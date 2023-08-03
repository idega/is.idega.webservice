package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;
import java.util.List;

public class Owners implements Serializable {

	private static final long serialVersionUID = 4457036528977680295L;

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