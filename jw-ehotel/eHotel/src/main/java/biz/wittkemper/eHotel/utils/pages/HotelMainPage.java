package biz.wittkemper.eHotel.utils.pages;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.markup.html.bootstrap.html.HtmlTag;
import de.agilecoders.wicket.core.markup.html.bootstrap.html.OptimizedMobileViewportMetaTag;

@AuthorizeInstantiation("ADMIN")
public class HotelMainPage extends WebPage {

	private static final long serialVersionUID = -4634526324103057329L;

	public HotelMainPage() {

		// add(new UserPanel("user"));
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(new HtmlTag("html-tag", getLocale()));
		add(new OptimizedMobileViewportMetaTag("viewport"));
	}

	@Override
	public void renderHead(final IHeaderResponse response) {
		super.renderHead(response);
		// add all the JS and CSS for bootstrap
		Bootstrap.renderHead(response);
	}

}
