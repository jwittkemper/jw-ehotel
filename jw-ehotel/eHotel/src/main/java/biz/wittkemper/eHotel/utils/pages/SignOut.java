package biz.wittkemper.eHotel.utils.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import biz.wittkemper.eHotel.utils.components.Footer;
import biz.wittkemper.eHotel.utils.components.Header;

public class SignOut extends WebPage {

	private static final long serialVersionUID = -8926500406621299883L;

	public SignOut(final PageParameters parameters) {
		add(new Header("header"));
		add(new BookmarkablePageLink("page1Link", HotelMainPage.class));
		add(new Footer("footer"));
		// getSession().invalidate();
	}
}
