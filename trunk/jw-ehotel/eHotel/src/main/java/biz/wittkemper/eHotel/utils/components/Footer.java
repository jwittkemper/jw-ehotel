package biz.wittkemper.eHotel.utils.components;

import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.request.resource.ContextRelativeResource;

public class Footer extends Panel {

	private static final long serialVersionUID = 4428288145137491662L;

	public Footer(String id) {
		super(id);
		add(new Image("sun", new ContextRelativeResource(
				"/docs-assets/ico/sun.png")));
	}

}
