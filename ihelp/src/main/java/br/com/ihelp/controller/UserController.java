package br.com.ihelp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.ihelp.model.Shipment;
import br.com.ihelp.model.User;
import br.com.ihelp.repository.ShipmentRepository;
import br.com.ihelp.repository.UserRepository;
import br.com.ihelp.service.AuthenticationService;

@Controller
public class UserController {
	
	@Autowired
	private ShipmentRepository shipmentRepository;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	public String loginPage(User user) {
		return "login";
	}
	
	@PostMapping("/")
	public String makeLogin() {
		return "redirect:/shipments";
	}

	@GetMapping("/register")
	public String registerPage(User user) {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid User user, BindingResult result, RedirectAttributes ra) {
		if (result.hasErrors()) {
			return "register";
		}
		user.setPassword(AuthenticationService.getPasswordEncoder().encode(user.getPassword()));
		userRepository.save(user);
		ra.addFlashAttribute("msg", "Usuário cadastrado com sucesso!");
		return "redirect:/";
	}
	
	@GetMapping("/shipments")
	public ModelAndView shipmentsPage() {
		ModelAndView modelAndView = new ModelAndView("shipments");
		List<Shipment> findAll = shipmentRepository.findAll();
		modelAndView.addObject("shipments", findAll);
		return modelAndView;
	}
	
}
