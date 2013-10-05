package biz.wittkemper.eHotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biz.wittkemper.eHotel.data.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsernameAndPassword(String username, String password);
}
