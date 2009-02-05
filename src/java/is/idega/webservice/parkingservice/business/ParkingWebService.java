package is.idega.webservice.parkingservice.business;

import is.idega.webservice.parkingservice.client.ParkedInReply;

public interface ParkingWebService {
	public ParkedInReply getParkingInfo(String registrationNumber);
}
