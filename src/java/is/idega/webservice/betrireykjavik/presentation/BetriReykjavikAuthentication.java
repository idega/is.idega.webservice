package is.idega.webservice.betrireykjavik.presentation;

import is.idega.webservice.business.IslandDotIsService;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.core.idgenerator.business.UUIDGenerator;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.Block;
import com.idega.presentation.IWContext;
import com.idega.presentation.Layer;
import com.idega.presentation.Span;
import com.idega.presentation.text.Link;
import com.idega.presentation.text.Text;
import com.idega.presentation.ui.Form;
import com.idega.presentation.ui.HiddenInput;
import com.idega.presentation.ui.Label;
import com.idega.presentation.ui.PasswordInput;
import com.idega.presentation.ui.TextInput;
import com.idega.user.data.User;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;
import com.idega.util.text.SocialSecurityNumber;

public class BetriReykjavikAuthentication extends Block {
	private static final String AUTHENTICATE_USER = "authenticate_user";
	private static final String RETURN_URL = "return_url";

	public final static String IW_BUNDLE_IDENTIFIER = "is.idega.webservice";

	private boolean useSubmitLinks = false;
	private IWResourceBundle iwrb;
	private IWBundle iwb;
	private String returnUrl = null;

	@Autowired
	IslandDotIsService service;

	@Override
	public void main(IWContext iwc) throws Exception {
		this.iwb = getBundle(iwc);
		this.iwrb = getResourceBundle(iwc);

		this.returnUrl = iwc.getParameter(RETURN_URL);
		if (this.returnUrl == null) {
			this.returnUrl = "http://ktest.betrireykjavik.is/";
		}

		boolean loginFailed = false;
		
		if (iwc.isParameterSet(AUTHENTICATE_USER)) {
			System.out
					.println("Authenticate user and return to return_url if ok");
			
	    	User user = getBusiness().authenticateUser(iwc.getParameter("login"), iwc.getParameter("password")); 
	    	if (user != null && SocialSecurityNumber.isValidIcelandicSocialSecurityNumber(user.getPersonalID())) {
	    		String hash = UUIDGenerator.getInstance().generateUUID();
	    		if (getBusiness().createHash(user.getPersonalID(), hash, iwc.getRemoteIpAddress())) {
	    			System.out.println("send redirect");
	    			this.returnUrl += "?token=" + hash + "&rr=1";
	    			
	    			System.out.println("return url = " + this.returnUrl);
	    			iwc.sendRedirect(this.returnUrl);
	    		}
	    	}
	    	
	    	loginFailed = true;
		}

		/*if (loginFailed) {
			displayAuthentificationFailedForm(iwc);			
		} else {
			displayAuthentificationForm(iwc);			
		}*/
		
		displayAuthentificationForm(iwc);
	}

	public void displayAuthentificationFailedForm(IWContext iwc) {
	}
	
	public void displayAuthentificationForm(IWContext iwc) {
		String cssFile = iwb
				.getVirtualPathWithFileNameString("style/login.css");
		if (!PresentationUtil.addStyleSheetToHeader(iwc, cssFile)) {
			Layer cssContainer = new Layer();
			cssContainer.setID("cssContainer");
			cssContainer.add(PresentationUtil.getStyleSheetSourceLine(cssFile));
			add(cssContainer);
		}

		Layer top = new Layer();
		top.setStyleClass("loginRedirect loggedOut loginForm");

		Form form = new Form();
		form.setStyleClass("loginForm");

		top.add(form);

		Layer layer = new Layer();
		layer.setStyleClass("username");
		TextInput username = new TextInput("login");
		username.setId("username");

		Label label = new Label(iwrb.getLocalizedString(
				"betri_reykjavik.username", "Username"), username);

		layer.add(label);
		layer.add(username);
		form.add(layer);

		layer = new Layer();
		layer.setStyleClass("password");
		PasswordInput password = new PasswordInput("password");
		password.setId("password");

		label = new Label(iwrb.getLocalizedString("betri_reykjavik.password",
				"Password"), password);

		layer.add(label);
		layer.add(password);
		form.add(layer);

		layer = new Layer();
		layer.setStyleClass("submit");

		Link submit = new Link(new Span(new Text(iwrb.getLocalizedString(
				"betri_reykjavik.authenticate", "Authenticate"))));
		submit.setStyleClass("loginButton");
		submit.setToFormSubmit(form);

		layer.add(submit);
		form.add(layer);

		form.add(new HiddenInput(AUTHENTICATE_USER, "true"));
		form.maintainParameter(RETURN_URL);
		
		this.add(top);
	}

	public boolean getUseSubmitLinks() {
		return this.useSubmitLinks;
	}

	public void setUseSubmitLinks(boolean useSubmitLinks) {
		this.useSubmitLinks = useSubmitLinks;
	}

	@Override
	public String getBundleIdentifier() {
		return IW_BUNDLE_IDENTIFIER;
	}

	private IslandDotIsService getBusiness() {
		if (service == null) {
			ELUtil.getInstance().autowire(this);
		}
		return service;
	}
}