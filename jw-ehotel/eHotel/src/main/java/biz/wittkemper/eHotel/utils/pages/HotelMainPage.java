package biz.wittkemper.eHotel.utils.pages;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.WebPage;

import biz.wittkemper.eHotel.utils.components.Footer;

@AuthorizeInstantiation("ADMIN")
public class HotelMainPage extends WebPage {

	private static final long serialVersionUID = -4634526324103057329L;

	public HotelMainPage() {

		add(new Footer("footer"));
	}
}
