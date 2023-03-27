package seeForCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import seeForCar.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
