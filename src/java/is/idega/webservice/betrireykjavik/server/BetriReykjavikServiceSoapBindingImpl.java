/**
 * BetriReykjavikServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.webservice.betrireykjavik.server;

import is.idega.webservice.business.IslandDotIsService;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.core.idgenerator.business.UUIDGenerator;
import com.idega.user.data.User;
import com.idega.util.expression.ELUtil;

public class BetriReykjavikServiceSoapBindingImpl implements is.idega.webservice.betrireykjavik.server.BetriReykjavik{
	@Autowired IslandDotIsService service;
	
    public java.lang.String authenticateUser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
    	User user = getBusiness().authenticateUser(username, password); 
    	if (user != null) {
    		String hash = UUIDGenerator.getInstance().generateUUID();
    		if (getBusiness().getHash(user.getPersonalID(), hash, "")) {
        		return hash;    			
    		}
    	}
    	
        return null;
    }

    private IslandDotIsService getBusiness() {
		if (service == null) {
			ELUtil.getInstance().autowire(this);
		}
		return service;
	}
}
