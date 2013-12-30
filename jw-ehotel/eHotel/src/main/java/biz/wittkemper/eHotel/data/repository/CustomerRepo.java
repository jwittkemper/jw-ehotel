package biz.wittkemper.eHotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biz.wittkemper.eHotel.data.entity.Customer;

@Repository
@net.bull.javamelody.MonitoredWithSpring
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
