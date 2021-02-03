package is.idega.webservice.filter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.core.accesscontrol.business.LoginBusinessBean;
import com.idega.presentation.IWContext;
import com.idega.servlet.filter.BaseFilter;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.StringUtil;

import is.idega.webservice.business.IslandDotIsService;

public class IslandDotIsLoginFilter extends BaseFilter {

	private static final Logger LOGGER = Logger.getLogger(IslandDotIsLoginFilter.class.getName());

	@Override
	public void destroy() {
	}

	private boolean logout(IWContext iwc) {
		User user = null;
		try {
			if (iwc == null) {
				LOGGER.warning(IWContext.class.getName() + " is not provided");
				return false;
			}

			user = iwc.isLoggedOn() ? iwc.getCurrentUser() : null;

			LoginBusinessBean loginBusiness = null;
	    	try {
	    		loginBusiness = LoginBusinessBean.getLoginBusinessBean(iwc.getRequest().getSession(false));
	    	} catch (Exception e) {
	    		LOGGER.log(Level.WARNING, "Error getting " + LoginBusinessBean.class.getName() + ". User: " + user, e);
	    	}
	    	if (loginBusiness == null) {
	    		LOGGER.warning(LoginBusinessBean.class.getName() + " can not be initialized. User: " + user);
	    		return false;
	    	}

	    	if (loginBusiness.logOutUser(iwc)) {
	    		if (user != null) {
	    			LOGGER.info("Logged out " + user);
	    		}
	    		return true;
	    	}

	    	LOGGER.warning("Failed to logout " + user);
	    	return false;
		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Error logging out " + user, e);
		}
		return false;
	}

	@Override
	public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) srequest;
		HttpServletResponse response = (HttpServletResponse) sresponse;

		IWContext iwc = new IWContext(request, response, request.getSession().getServletContext());
		WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(iwc.getServletContext());
		IslandDotIsService service = (IslandDotIsService) springContext.getBean(IslandDotIsService.BEAN_NAME);

		String errorPage = iwc.getApplicationSettings().getProperty("login_via_island.errorpage");

		String uri = request.getRequestURI();
		String token = iwc.getParameter("token");
		if (uri.indexOf("innskraningislanddotis") != -1) {
			logout(iwc);

			if (token != null && !"".equals(token.trim())) {
				AdvancedProperty personalIdAndName = service.getPersonalIDAndNameFromSAMLMessage(request, response, token);
				String personalID = personalIdAndName == null ? null : personalIdAndName.getId();
				String name = personalIdAndName == null ? null : personalIdAndName.getValue();
				if (StringUtil.isEmpty(personalID)) {
					personalID = service.getPersonalIDFromToken(token, iwc.getRemoteIpAddress());
				}

				if (personalID != null && !"".equals(personalID.trim())) {
					String responsePage = service.getHomePageForCitizen(personalID, name, iwc);
					response.sendRedirect(StringUtil.isEmpty(responsePage) ? CoreConstants.PAGES_URI_PREFIX : responsePage);
					return;
				} else {
					LOGGER.warning("Unable to get personal ID from token: " + token + ". URI: " + uri);
				}
			} else {
				LOGGER.warning("Token is not provided as parameter with name 'token'");
			}

			if (!StringUtil.isEmpty(errorPage)) {
				response.sendRedirect(errorPage);
				return;
			}
		}

		chain.doFilter(srequest, sresponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}