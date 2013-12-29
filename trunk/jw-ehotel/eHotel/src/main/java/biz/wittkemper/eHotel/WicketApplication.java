package biz.wittkemper.eHotel;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import biz.wittkemper.eHotel.utils.HotelSession;
import biz.wittkemper.eHotel.utils.SignIn;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see biz.wittkemper.eHotel.Start#main(String[])
 */
public class WicketApplication extends AuthenticatedWebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HotelMainPage.class;
	}

	/**
	 * @see org.apache.wicket.protocol.http.WebApplication#newSession(org.apache.wicket.request.Request,
	 *      Response)
	 */
	@Override
	public Session newSession(Request request, Response response) {
		return new HotelSession(request);
	}

	/**
	 * @see org.apache.wicket.examples.WicketExampleApplication#init()
	 */
	@Override
	protected void init() {
		super.init();
		getDebugSettings().setDevelopmentUtilitiesEnabled(true);
		getComponentInstantiationListeners().add(
				new SpringComponentInjector(this));
	}

	@Override
	protected Class<? extends WebPage> getSignInPageClass() {

		return SignIn.class;
	}

	@Override
	protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() {
		return HotelSession.class;
	}
}
