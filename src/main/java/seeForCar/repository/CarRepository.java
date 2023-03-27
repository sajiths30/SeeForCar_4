package seeForCar.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import seeForCar.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	@Query("from Car where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture ")
	List<Car> findCars(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") Date departureDate);

}
