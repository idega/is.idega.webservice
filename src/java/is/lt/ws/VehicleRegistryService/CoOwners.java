package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;
import java.util.List;

public class CoOwners implements Serializable {

	private static final long serialVersionUID = 6361243475666484611L;

	public List<CoOwner> CoOwner;

	public List<CoOwner> getCoOwner() {
		return CoOwner;
	}

	public void setCoOwner(List<CoOwner> coOwner) {
		CoOwner = coOwner;
	}

}