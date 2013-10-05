package biz.wittkemper.eHotel.utils;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;
import org.apache.wicket.spring.injection.annot.SpringBean;

import biz.wittkemper.eHotel.data.entity.User;
import biz.wittkemper.eHotel.data.repository.UserRepo;

public class HotelSession extends AuthenticatedWebSession {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5029818572246918306L;
	private User user = new User();

	@SpringBean
	private UserRepo repo;

	public HotelSession(Request request) {
		super(request);
		// Injector.get().inject(this);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public boolean authenticate(String username, String password) {
		this.user = repo.findByUsernameAndPassword(username, password);
		return user != null;
	}

	@Override
	public Roles getRoles() {
		return null;
	}

}
