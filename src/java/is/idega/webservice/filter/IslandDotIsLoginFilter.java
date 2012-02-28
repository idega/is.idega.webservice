package is.idega.webservice.filter;

import is.idega.webservice.business.IslandDotIsService;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.ejb.FinderException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.idega.business.IBOLookup;
import com.idega.core.accesscontrol.business.LoginBusinessBean;
import com.idega.idegaweb.IWApplicationContext;
import com.idega.presentation.IWContext;
import com.idega.servlet.filter.BaseFilter;
import com.idega.user.data.User;

public class IslandDotIsLoginFilter extends BaseFilter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest srequest, ServletResponse sresponse,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) srequest;
		HttpServletResponse response = (HttpServletResponse) sresponse;

		IWContext iwc = new IWContext(request, response, request.getSession().getServletContext());
		WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(iwc.getServletContext());
		IslandDotIsService service = (IslandDotIsService) springContext.getBean("islandDotIsService");

		String token = iwc.getParameter("token");
		if (token == null || "".equals(token.trim())) {
			response.sendRedirect("/pages/");	
		}
		
		String personalID = service.getPersonalIDFromToken(token, iwc.getRemoteIpAddress());
		LoginBusinessBean loginBusiness = getLoginBusiness(request);
		boolean isLoggedOn = loginBusiness.isLoggedOn(request);
		try {
			User user = getUserBusiness(iwc.getApplicationContext()).getUser(personalID);
			if (isLoggedOn) {
				loginBusiness.logOutUser(iwc);
			}
			loginBusiness.logInByPersonalID(iwc, personalID);
			response.sendRedirect("/pages/notandi/sidanmin");	
		} catch (FinderException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("/pages/");			
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	protected com.idega.user.business.UserBusiness getUserBusiness(IWApplicationContext iwac) throws RemoteException {
		return (com.idega.user.business.UserBusiness) IBOLookup.getServiceInstance(iwac, com.idega.user.business.UserBusiness.class);
	}
}