package is.idega.webservice.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.presentation.IWContext;
import com.idega.util.CoreConstants;
import com.idega.util.StringHandler;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

import is.idega.webservice.business.IslandDotIsService;

public class IslandDotIsLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 4577682631949782354L;

	private static final Logger LOGGER = Logger.getLogger(IslandDotIsLoginServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	private AdvancedProperty getAuthorizedViaSAML(IWContext iwc, HttpServletRequest request, HttpServletResponse response, IslandDotIsService service) {
		String saml = null;
		try {
			saml = StringHandler.getContentFromReader(request.getReader());
		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Error getting SAML message from request " + request.getRequestURI(), e);
		}
		if (StringUtil.isEmpty(saml)) {
			saml = iwc.getParameter("token");
			if (StringUtil.isEmpty(saml)) {
				LOGGER.warning("Unable to get SAML message from parameter 'token'");
			} else {
				LOGGER.info("SAML message was unknown in request's reader, got it from parameter 'token': " + saml);
			}
		}

		return service.getPersonalIDAndNameFromSAMLMessage(request, response, saml);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IWContext iwc = new IWContext(request, response, getServletContext());
		IslandDotIsService service = ELUtil.getInstance().getBean(IslandDotIsService.BEAN_NAME);

		String uri = request.getRequestURI();
		if (!StringUtil.isEmpty(uri) && uri.indexOf("/innskraningislanddotis/register/oidc") != -1) {
			String state = iwc.getParameter("state");
			String verifier = iwc.getParameter("verifier");
			service.setOIDC(state, verifier);
			return;
		}

		AdvancedProperty personalIdAndName = null;
		String code = request.getParameter("code");
		if (!StringUtil.isEmpty(code)) {
			personalIdAndName = service.getPersonalIDAndNameFromOIDC(request, response);
		}
		if (personalIdAndName == null) {
			personalIdAndName = getAuthorizedViaSAML(iwc, request, response, service);
		}

		String personalID = personalIdAndName == null ? null : personalIdAndName.getId();
		if (StringUtil.isEmpty(personalID)) {
			response.sendRedirect(CoreConstants.PAGES_URI_PREFIX);
			return;
		}

		String responsePage = service.getHomePageForCitizen(personalID, personalIdAndName == null ? null : personalIdAndName.getValue(), iwc);
		response.sendRedirect(StringUtil.isEmpty(responsePage) ? CoreConstants.PAGES_URI_PREFIX : responsePage);
	}

}