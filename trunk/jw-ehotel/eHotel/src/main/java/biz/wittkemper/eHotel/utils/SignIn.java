package biz.wittkemper.eHotel.utils;

import org.apache.wicket.authroles.authentication.panel.SignInPanel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public final class SignIn extends WebPage {

	private static final long serialVersionUID = 5770579383190866431L;

	/**
	 * Constructor
	 */
	public SignIn() {
		this(null);
	}

	public SignIn(final PageParameters parameters) {
		// Take our standard Logon Panel from the auth-role module and add it to
		// the Page. That is
		// all what is necessary.
		add(new SignInPanel("signInPanel", false));
	}

}
