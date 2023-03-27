package seeForCar.entity;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Car extends AbstractEntity {
private String carNumber;
private String carService;
private String departureCity;
private String arrivalCity;
private Date dateOfDeparture;
private Timestamp estimatedDepartureTime;
public String getCarNumber() {
	return carNumber;
}
public void setCarNumber(String carNumber) {
	this.carNumber = carNumber;
}
public String getCarService() {
	return carService;
}
public void setCarService(String carService) {
	this.carService = carService;
}
public String getDepartureCity() {
	return departureCity;
}
public void setDepartureCity(String departureCity) {
	this.departureCity = departureCity;
}
public String getArrivalCity() {
	return arrivalCity;
}
public void setArrivalCity(String arrivalCity) {
	this.arrivalCity = arrivalCity;
}
public Date getDateOfDeparture() {
	return dateOfDeparture;
}
public void setDateOfDeparture(Date dateOfDeparture) {
	this.dateOfDeparture = dateOfDeparture;
}
public Timestamp getEstimatedDepartureTime() {
	return estimatedDepartureTime;
}
public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
	this.estimatedDepartureTime = estimatedDepartureTime;
}


}
