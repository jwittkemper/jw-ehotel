package biz.wittkemper.eHotel.utils;

import org.apache.wicket.authroles.authentication.panel.SignInPanel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import biz.wittkemper.eHotel.Footer;
import biz.wittkemper.eHotel.Header;

public final class SignIn extends WebPage {

	private static final long serialVersionUID = 5770579383190866431L;

	/**
	 * Constructor
	 */
	public SignIn() {
		this(null);
	}

	public SignIn(final PageParameters parameters) {
		add(new Header("header"));
		add(new SignInPanel("signInPanel", false));
		add(new Footer("footer"));
	}

}
