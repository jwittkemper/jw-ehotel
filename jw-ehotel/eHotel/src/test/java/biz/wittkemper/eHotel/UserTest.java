package biz.wittkemper.eHotel;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.wittkemper.eHotel.data.entity.User;
import biz.wittkemper.eHotel.data.repository.UserRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:WEB-INF/applicationContext.xml" })
public class UserTest {

	@Autowired
	UserRepo hotelUserRepo;

	@Test
	public void TestCreateUser() {
		User user = new User();
		user.setName("Wittkemper");
		user.setVorname("Jörg");
		user.setPassword("joerg");
		user.setUsername("jerry");

		hotelUserRepo.save(user);
	}

	@Test
	public void checkUserExist() {

		User user = hotelUserRepo.findByUsernameAndPassword("jerry", "joerg");
		Assert.assertNotNull(user);
	}

}
