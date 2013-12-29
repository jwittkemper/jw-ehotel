package biz.wittkemper.eHotel;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import biz.wittkemper.eHotel.utils.SignOut;

@AuthorizeInstantiation("ADMIN")
public class HotelMainPage extends WebPage {

	private static final long serialVersionUID = -4634526324103057329L;

	public HotelMainPage() {
		add(new BookmarkablePageLink("page1Link", SignOut.class));
	}
}
