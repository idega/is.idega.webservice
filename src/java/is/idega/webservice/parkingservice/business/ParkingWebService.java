package is.idega.webservice.parkingservice.business;

import stokkur.mpark.services.types.ParkedInReply;

public interface ParkingWebService {
	public ParkedInReply getParkingInfo(String registrationNumber);
}
