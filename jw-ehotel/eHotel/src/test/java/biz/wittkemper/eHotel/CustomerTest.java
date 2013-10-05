package biz.wittkemper.eHotel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.wittkemper.eHotel.data.entity.Customer;
import biz.wittkemper.eHotel.data.repository.CustomerRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:WEB-INF/applicationContext.xml" })
public class CustomerTest {

	@Autowired
	CustomerRepo customerRepo;

	@Test
	public void createCustomer() {
		Customer customer = new Customer();
		customer.setFirstName("Jörg");
		customer.setLastName("Wittkemper");

		customerRepo.save(customer);
		System.out.println(customer.getId());
	}

}
