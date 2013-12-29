package biz.wittkemper.eHotel.utils;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import biz.wittkemper.eHotel.HotelMainPage;

public class SignOut extends WebPage {

	private static final long serialVersionUID = -8926500406621299883L;

	public SignOut(final PageParameters parameters) {
		getSession().invalidate();
		add(new BookmarkablePageLink("page1Link", HotelMainPage.class));
	}
}
