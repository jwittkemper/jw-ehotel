package biz.wittkemper.eHotel.utils;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class BasePage extends WebPage {

	private static final long serialVersionUID = -7120613976566404345L;

	public BasePage() {
		this(new PageParameters());
	}

	public BasePage(PageParameters parameters) {
		add(new Label("PageTitle", "eHotel"));
	}
}
