package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;

public class CoOwner extends Owner implements Serializable {

	private static final long serialVersionUID = 8945359060695788998L;

	public CoOwner() {
		super();
	}

	public CoOwner(Object extensionData, String persidno, String fullname, String address, String postalcode, String city) {
		this();

		setPersidno(persidno);
		setFullname(fullname);
		setAddress(address);
		setPostalcode(postalcode);
		setCity(city);
	}

}