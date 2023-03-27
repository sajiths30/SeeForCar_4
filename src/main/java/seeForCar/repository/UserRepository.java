package seeForCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import seeForCar.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);



}
