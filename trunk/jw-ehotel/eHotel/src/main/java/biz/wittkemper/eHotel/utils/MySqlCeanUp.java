package biz.wittkemper.eHotel.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;

public class MySqlCeanUp implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// Nothing to do!

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		try {
			AbandonedConnectionCleanupThread.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
