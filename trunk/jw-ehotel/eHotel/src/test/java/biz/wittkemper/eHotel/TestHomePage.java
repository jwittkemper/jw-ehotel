package biz.wittkemper.eHotel;

import javax.servlet.ServletContext;

import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import biz.wittkemper.eHotel.utils.pages.HotelMainPage;
import biz.wittkemper.eHotel.utils.pages.SignIn;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:WEB-INF/applicationContext.xml" })
public class TestHomePage {
	private WicketTester tester;

	WicketApplication application;

	@Before
	public void setUp() {
		tester = new WicketTester(application = new WicketApplication() {

			/**
			 * adjust the servletcontext to contain a WebApplicationContext
			 */
			@Override
			public ServletContext getServletContext() {
				ServletContext servletContext = super.getServletContext();
				XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
				applicationContext
						.setConfigLocation("classpath:WEB-INF/applicationContext.xml");
				applicationContext.setServletContext(servletContext);
				applicationContext.refresh();
				servletContext
						.setAttribute(
								WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE,
								applicationContext);

				return servletContext;
			}

		});

	}

	@After
	public void tearDown() {
		tester.destroy();
	}

	@Test
	public void signInRendersSuccessfully() {
		// start and render the test page
		tester.startPage(SignIn.class);

		// assert rendered page class
		tester.assertRenderedPage(SignIn.class);
	}

	@Test
	public void MainPageRendersSuccessfully() {
		// start and render the test page
		tester.startPage(HotelMainPage.class);

		// assert rendered page class
		tester.assertRenderedPage(SignIn.class);
		tester.assertContains("signInPanel");
		FormTester formTester = tester.newFormTester("signInPanel:signInForm");
		formTester.setValue("username", "jerry");
		formTester.setValue("password", "joerg");
		formTester.submit();
		tester.assertRenderedPage(HotelMainPage.class);
	}

}
