package seeForCar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import seeForCar.entity.User;
import seeForCar.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}
    //http://localhost:8080/showReg
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/show_Reg";
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user")User user ,Model model) {
		userRepo.save(user);
		model.addAttribute("msg", "data is saved");
		return "login/login"; 
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("username")String userName,@RequestParam("password")String password,Model model) {
		User user = userRepo.findByEmail(userName);
		if(user!=null) {
			if(user.getEmail().equals(userName)&& user.getPassword().equals(password)){
				return "find_cars";
			}else {
				model.addAttribute("Error", " invalid username/password");
				return "login/login";
			}
		}else {
			model.addAttribute("Error", " invalid username/password");
			return "login/login";
		}
	}
}
