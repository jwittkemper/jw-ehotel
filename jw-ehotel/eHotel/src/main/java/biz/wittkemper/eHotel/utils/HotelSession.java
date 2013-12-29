package biz.wittkemper.eHotel.utils;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.request.Request;
import org.apache.wicket.spring.injection.annot.SpringBean;

import biz.wittkemper.eHotel.data.entity.User;
import biz.wittkemper.eHotel.data.repository.UserRepo;

public class HotelSession extends AuthenticatedWebSession {

	@SpringBean
	private UserRepo repo;

	private User user;

	private static final long serialVersionUID = -5029818572246918306L;

	public HotelSession(Request request) {
		super(request);
		Injector.get().inject(this);
		System.out.println("Hier...");
	}

	@Override
	public boolean authenticate(final String username, final String password) {

		user = repo.findByUsernameAndPassword(username, password);

		return user != null;
	}

	/**
	 * @see org.apache.wicket.authentication.AuthenticatedWebSession#getRoles()
	 */
	@Override
	public Roles getRoles() {
		if (isSignedIn()) {
			return new Roles(Roles.ADMIN);
		}
		return null;
	}
}
