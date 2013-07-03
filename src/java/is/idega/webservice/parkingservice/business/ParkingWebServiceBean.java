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

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.util.CoreConstants;
import com.idega.util.IWTimestamp;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service("parkingWebService")
public class ParkingWebServiceBean extends DefaultSpringBean implements ParkingWebService {

	private static final Logger LOGGER = Logger.getLogger(ParkingWebServiceBean.class.getName());

	private static final String PARKING_SERVICE_ENDPOINT = "parking_service_endpoint";
	private static final String PARKING_SERVICE_USER = "parking_service_user";

	@Override
	public ParkedInReply getParkingInfo(String registrationNumber) {
		long start = System.currentTimeMillis();

		IWMainApplicationSettings settings = getApplication().getSettings();
		boolean globalDebug = IWMainApplication.isDebugActive();
		boolean debugParkingWS = settings.getBoolean("parking.debug_ws", Boolean.TRUE);
		try {
			IWMainApplication.setDebugMode(debugParkingWS);
			if (IWMainApplication.isDebugActive()) {
				LOGGER.info("[ParkingWebService] Starting lookup on vehicle '" + registrationNumber + "': " + new IWTimestamp(start).toString());
			}

			String endpoint = settings.getProperty(PARKING_SERVICE_ENDPOINT, CoreConstants.EMPTY);
			String userid = settings.getProperty(PARKING_SERVICE_USER, CoreConstants.EMPTY);

			int timeout = Integer.parseInt(settings.getProperty("egov.parking.timeout", "5000"));

			try {
				ParkedInService_ServiceLocator locator = new ParkedInService_ServiceLocator();
				ParkedInService_PortType port = locator.getParkedInServiceHttpPort(new URL(endpoint));
				((org.apache.axis.client.Stub) port).setTimeout(timeout); //Setting timeout to stop the load if the service is not answering
				if (IWMainApplication.isDebugActive()) {
					LOGGER.info("[ParkingWebService] Fetching parking info for '" + registrationNumber + "' from web service: endpoint: '" +
							endpoint + "', user ID: '" + userid + "' " + (System.currentTimeMillis() - start) + "ms");
				}

				ParkedInRequest request = new ParkedInRequest(registrationNumber, userid);
				ParkedInReply reply = port.parkedIn(request);
				if (reply != null) {
					if (IWMainApplication.isDebugActive()) {
						LOGGER.info("[ParkingWebService] Returning parking info (" + reply + ") for '" + registrationNumber + "': " +
								(System.currentTimeMillis() - start) + "ms");
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
		} finally {
			IWMainApplication.setDebugMode(globalDebug);
		}
	}
}
