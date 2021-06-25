package com.vinay.Cars;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private UserRepositary repo1;

	@Autowired
	private CarRepositary repo2;

	@GetMapping("")
	public String Home() {
		return "index";
	}

	@GetMapping("/register")
	public String Register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/showcars")
	public String Showcars(Model model) {
		List<Car> carlist = repo2.findAll();
		model.addAttribute("list", carlist);
		return "showcars";
	}

	@GetMapping("/userdashboard")
	public String Userdashboard(Model model, Authentication auth) {
		// get signed in user email
		String email = auth.getName();
		List<Car> carlist = repo2.findByEmail(email);
		model.addAttribute("list", carlist);
		model.addAttribute("cardelete", new CarId());
		model.addAttribute("caredit", new CarId());
		return "userdashboard";
	}

	@GetMapping("/addcar")
	public String Addcar(Model model) {
		model.addAttribute("car", new Car());
		Extras et = new Extras();
		Map<String,List<String>> location = et.getlocations();
		//System.out.println(location);
		model.addAttribute("loc", location);
		return "carregister";
	}
	
	@PostMapping("/car_edit")
	public String editcar(CarId caredit,Model model) {
		Car c = repo2.findById(caredit.getId()).get();
		model.addAttribute("car", c);
		return "caredit";
	}
	
	@PostMapping("/car_delete")
	public ModelAndView deletecar(CarId cardelete) {
		//System.out.println(cardelete.getId());
		repo2.deleteById(cardelete.getId());
		return new ModelAndView("redirect:/userdashboard");
	}
	
	@PostMapping("/car_update")
	public String carupdate(Car car) {
		//System.out.println(car);
		repo2.updatecar(car.getId(), car.getPrice(), car.getYears(), car.getKmdriven());
		return "carsuccess";
	}
	
	@PostMapping("/car_register")
	public String carregister(Car car) {
		//System.out.println(car);
		repo2.save(car);
		return "carsuccess";
	}

	@PostMapping("/process_register")
	public String processregistration(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		repo1.save(user);
		return "registersuccess";
	}
}
