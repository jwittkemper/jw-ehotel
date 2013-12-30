package biz.wittkemper.eHotel.utils.pages;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

@AuthorizeInstantiation("ADMIN")
public class HotelMainPage extends BasePage {

	private static final long serialVersionUID = -4634526324103057329L;

	public HotelMainPage() {
		add(new BookmarkablePageLink("page1Link", SignOut.class));
	}
}
