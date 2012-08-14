package is.idega.webservice.parkingservice.business;

import is.idega.webservice.parkingservice.client.ParkedInReply;
import is.idega.webservice.parkingservice.client.ParkedInRequest;
import is.idega.webservice.parkingservice.client.ParkedInService_PortType;
import is.idega.webservice.parkingservice.client.ParkedInService_ServiceLocator;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.logging.Logger;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.util.IWTimestamp;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service("parkingWebService")
public class ParkingWebServiceBean implements ParkingWebService {

	private static final Logger LOGGER = Logger.getLogger(ParkingWebServiceBean.class.getName());

	private static final String PARKING_SERVICE_ENDPOINT = "parking_service_endpoint";
	private static final String PARKING_SERVICE_USER = "parking_service_user";

	@Override
	public ParkedInReply getParkingInfo(String registrationNumber) {
		long start = System.currentTimeMillis();

		if (IWMainApplication.isDebugActive()) {
			LOGGER.info("[ParkingWebService] Starting lookup on vehicle '" + registrationNumber + "': " + new IWTimestamp(start).toString());
		}

		String endpoint = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(PARKING_SERVICE_ENDPOINT,
						"");
		String userid = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings().getProperty(PARKING_SERVICE_USER, "");

		int timeout = Integer.parseInt(IWMainApplication.getDefaultIWApplicationContext().getApplicationSettings().getProperty("egov.parking.timeout", "5000"));

		try {
			ParkedInService_ServiceLocator locator = new ParkedInService_ServiceLocator();
			ParkedInService_PortType port = locator.getParkedInServiceHttpPort(new URL(endpoint));
			((org.apache.axis.client.Stub) port).setTimeout(timeout); //Setting timeout to stop the load if the service is not answering
			if (IWMainApplication.isDebugActive()) {
				LOGGER.info("[ParkingWebService] Fetching parking info for '" + registrationNumber + "' from web service: " + (System.currentTimeMillis() - start) + "ms");
			}

			ParkedInRequest request = new ParkedInRequest(registrationNumber, userid);
			ParkedInReply reply = port.parkedIn(request);
			if (reply != null) {
				if (IWMainApplication.isDebugActive()) {
					LOGGER.info("[ParkingWebService] Returning parking info for '" + registrationNumber + "': " + (System.currentTimeMillis() - start) + "ms");
				}
				return reply;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		if (IWMainApplication.isDebugActive()) {
			LOGGER.info("[ParkingWebService] Returning null for '" + registrationNumber + "': " + (System.currentTimeMillis() - start) + "ms");
		}
		return null;
	}
}
