package is.idega.webservice.parkingservice.business;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.util.IWTimestamp;

import stokkur.mpark.services.types.ParkedInReply;

@Service("parkingWebService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ParkingWebServiceBean extends DefaultSpringBean implements ParkingWebService {

	@Override
	public ParkedInReply getParkingInfo(String registrationNumber) {
		long start = System.currentTimeMillis();

		IWMainApplicationSettings settings = getApplication().getSettings();
		boolean globalDebug = IWMainApplication.isDebugActive();
		boolean debugParkingWS = settings.getBoolean("parking.debug_ws", Boolean.TRUE);
		try {
			IWMainApplication.setDebugMode(debugParkingWS);
			if (IWMainApplication.isDebugActive()) {
				getLogger().info("[ParkingWebService] Starting lookup on vehicle '" + registrationNumber + "': " + new IWTimestamp(start).toString());
			}

			if (IWMainApplication.isDebugActive()) {
				getLogger().info("[ParkingWebService] Returning null for '" + registrationNumber + "': " + (System.currentTimeMillis() - start) + "ms");
			}
			return null;
		} finally {
			IWMainApplication.setDebugMode(globalDebug);
		}
	}

}