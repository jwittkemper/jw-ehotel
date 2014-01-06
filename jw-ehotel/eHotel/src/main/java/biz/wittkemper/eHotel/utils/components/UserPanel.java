package biz.wittkemper.eHotel.utils.components;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.Panel;

import biz.wittkemper.eHotel.utils.pages.SignOut;

public class UserPanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5614239727881340653L;

	public UserPanel(String id) {
		super(id);
		Form form = new Form("form");
		form.add(new Button("logout") {
			@Override
			public void onSubmit() {
				setResponsePage(SignOut.class);
				getSession().invalidate();
			}
		});

		add(form);

	}

}
