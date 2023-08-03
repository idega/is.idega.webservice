package is.lt.ws.VehicleRegistryService;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.idega.util.ArrayUtil;
import com.idega.util.StringUtil;

public class Owner implements Serializable {

	private static final long serialVersionUID = 2271772808616359046L;

	public ExtensionData ExtensionData;
	public String Current;
	public String Anonymous;
	public String PurchaseDate;
	public String OwnregDate;
	public String ReceptionDate;
	public String Persidno;
	public String Fullname;
	public String Address;
	public String Postalcode;
	public String City;
	public String Ownerinsurancecode;
	public CoOwners CoOwners;

	public Owner() {
		super();
	}

	public Owner(String current, String persIdNo, String fullName) {
		this();

		Current = current;
		Persidno = persIdNo;
		Fullname = fullName;
	}

	public Owner(
			Object extensionData,
			boolean current,
			boolean anonymous,
			String purchaseDate,
			String ownregDate,
			String receptionDate,
			String persidno,
			String fullname,
			String address,
			String postalcode,
			String city,
			String ownerinsurancecode,
			CoOwner[] coOwners
	) {
		this();

		setCurrent(current);
		setAnonymous(String.valueOf(anonymous));
		setPurchaseDate(purchaseDate);
		setOwnregDate(ownregDate);
		setReceptionDate(receptionDate);
		setPersidno(persidno);
		setFullname(fullname);
		setAddress(address);
		setPostalcode(postalcode);
		setCity(city);
		setOwnerinsurancecode(ownerinsurancecode);
		setCoOwners(coOwners);
	}

	public ExtensionData getExtensionData() {
		return ExtensionData;
	}
	public void setExtensionData(ExtensionData extensionData) {
		ExtensionData = extensionData;
	}
	public String getCurrent() {
		return Current;
	}
	public boolean isCurrent() {
		return StringUtil.isEmpty(Current) ? Boolean.FALSE : Boolean.valueOf(Current) || "1".equals(Current);
	}
	public void setCurrent(Boolean current) {
		if (current != null) {
			setCurrent(String.valueOf(current));
		}
	}
	public void setCurrent(String current) {
		Current = current;
	}
	public String getAnonymous() {
		return Anonymous;
	}
	public void setAnonymous(String anonymous) {
		Anonymous = anonymous;
	}
	public String getPurchaseDate() {
		return PurchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		PurchaseDate = purchaseDate;
	}
	public String getOwnregDate() {
		return OwnregDate;
	}
	public void setOwnregDate(String ownregDate) {
		OwnregDate = ownregDate;
	}
	public String getReceptionDate() {
		return ReceptionDate;
	}
	public void setReceptionDate(String receptionDate) {
		ReceptionDate = receptionDate;
	}
	public String getPersidno() {
		return Persidno;
	}
	public void setPersidno(String persidno) {
		Persidno = persidno;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPostalcode() {
		return Postalcode;
	}
	public void setPostalcode(String postalcode) {
		Postalcode = postalcode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getOwnerinsurancecode() {
		return Ownerinsurancecode;
	}
	public void setOwnerinsurancecode(String ownerinsurancecode) {
		Ownerinsurancecode = ownerinsurancecode;
	}
	public CoOwner[] getCoOwners() {
		List<CoOwner> coOwners = CoOwners == null ? null : CoOwners.CoOwner;
		return ArrayUtil.convertListToArray(coOwners);
	}
	public void setCoOwners(CoOwners coOwners) {
		CoOwners = coOwners;
	}
	public void setCoOwners(CoOwner[] coOwners) {
		if (!ArrayUtil.isEmpty(coOwners)) {
			CoOwners = new CoOwners();
			CoOwners.CoOwner = Arrays.asList(coOwners);
		}
	}
}