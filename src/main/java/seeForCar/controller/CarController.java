package seeForCar.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import seeForCar.entity.Car;
import seeForCar.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private CarRepository carRepo;
 
	@RequestMapping("/findcars")
	public String findcars(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("departureDate")@DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,Model model) {
		List<Car> cars = carRepo.findCars(from,to,departureDate); 
		model.addAttribute("cars", cars);
		return "display_Cars";
	}
}
