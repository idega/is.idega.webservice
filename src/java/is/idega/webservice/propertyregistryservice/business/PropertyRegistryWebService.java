package is.idega.webservice.propertyregistryservice.business;

import is.idega.webservice.propertyregistryservice.data.Owner;
import is.idega.webservice.propertyregistryservice.data.Property;

import java.util.List;

public interface PropertyRegistryWebService {
	public List<Property> getApartmentNumberList(String address, String assessmentYear);
	public Property getApartmentByPropertyIdentifier(String identifier, String assessmentYear);
	public List<Owner> getOwnersByPropertyIdentifier(String identifier, String assessmentYear);
}
