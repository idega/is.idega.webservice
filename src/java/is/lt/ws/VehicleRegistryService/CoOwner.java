package is.lt.ws.VehicleRegistryService;

public class CoOwner extends Owner {

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