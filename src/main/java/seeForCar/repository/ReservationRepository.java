package seeForCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import seeForCar.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
