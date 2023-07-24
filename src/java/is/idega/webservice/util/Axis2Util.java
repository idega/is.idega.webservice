package is.idega.webservice.util;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.Stub;
import org.hsqldb.lib.StringUtil;

public class Axis2Util {

	/**
	 *
	 * @param stub to get endpoint for, not <code>null</code>
	 * @return endpoint address of webservice or <code>null</code> on failure;
	 */
	public static String getEndpoint(org.apache.axis2.client.Stub stub) {
		if (stub != null) {
			ServiceClient serviceClient = stub._getServiceClient();
			if (serviceClient != null) {
				Options options = serviceClient.getOptions();
				if (options != null) {
					EndpointReference to = options.getTo();
					if (to != null) {
						return to.getAddress();
					}
				}
			}
		}

		return null;
	}

	/**
	 *
	 * <p>Compares if given webservice address matches given {@link Stub}</p>
	 * @param stub to check, not <code>null</code>;
	 * @param endpoint to compare, not <code>null</code>;
	 * @return <code>true</code> when service has given endpoint;
	 */
	public static boolean isServiceEndpoint(org.apache.axis2.client.Stub stub,
			String endpoint) {
		String serviceEndpoint = getEndpoint(stub);
		if (StringUtil.isEmpty(serviceEndpoint) || StringUtil.isEmpty(endpoint)) {
			return false;
		}

		return serviceEndpoint.equals(endpoint);
	}

	public static void changeEndpoint(
			org.apache.axis2.client.Stub stub,
			String endpoint) {
		if (!isServiceEndpoint(stub, endpoint)) {
			ServiceClient serviceClient = stub._getServiceClient();
			if (serviceClient != null) {
				Options options = serviceClient.getOptions();
				if (options != null) {
					EndpointReference to = options.getTo();
					if (to != null) {
						to.setAddress(endpoint);
					}
				}
			}
		}
	}

}