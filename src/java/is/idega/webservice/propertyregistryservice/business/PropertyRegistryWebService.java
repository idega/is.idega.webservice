package is.idega.webservice.propertyregistryservice.business;

import java.util.List;

import org.apache.axiom.om.OMElement;

import is.idega.webservice.propertyregistryservice.business.PropertyRegistryWebServiceBean.StubAndSession;
import is.idega.webservice.propertyregistryservice.data.Owner;
import is.idega.webservice.propertyregistryservice.data.Property;

public interface PropertyRegistryWebService {

	public List<Property> getApartmentNumberList(String address, String assessmentYear);

	public Property getApartmentByPropertyIdentifier(String identifier, String assessmentYear);

	public List<Owner> getOwnersByPropertyIdentifier(String identifier, String assessmentYear);

	public StubAndSession getStubAndSession();

	public String getValue(OMElement element, String name);

}