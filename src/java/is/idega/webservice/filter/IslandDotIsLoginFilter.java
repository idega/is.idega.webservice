package is.idega.webservice.filter;

import java.io.IOException;
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

import com.idega.presentation.IWContext;
import com.idega.servlet.filter.BaseFilter;
import com.idega.util.CoreConstants;
import com.idega.util.StringUtil;

import is.idega.webservice.business.IslandDotIsService;

public class IslandDotIsLoginFilter extends BaseFilter {

	private static final Logger LOGGER = Logger.getLogger(IslandDotIsLoginFilter.class.getName());

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) srequest;
		HttpServletResponse response = (HttpServletResponse) sresponse;

		IWContext iwc = new IWContext(request, response, request.getSession().getServletContext());
		WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(iwc.getServletContext());
		IslandDotIsService service = (IslandDotIsService) springContext.getBean(IslandDotIsService.BEAN_NAME);

		String uri = request.getRequestURI();
		String token = iwc.getParameter("token");
		if (uri.indexOf("innskraningislanddotis") != -1) {
			if (token != null && !"".equals(token.trim())) {
				String personalID = service.getPersonalIDFromToken(token, iwc.getRemoteIpAddress());
				if (personalID != null && !"".equals(personalID.trim())) {
					String responsePage = service.getHomePageForCitizen(personalID, iwc);
					response.sendRedirect(StringUtil.isEmpty(responsePage) ? CoreConstants.PAGES_URI_PREFIX : responsePage);
				} else {
					LOGGER.warning("Unable to get personal ID from token: " + token + ". URI: " + uri);
				}
			} else {
				LOGGER.warning("Token is not provided as parameter with name 'token'");
			}
		}

		chain.doFilter(srequest, sresponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}