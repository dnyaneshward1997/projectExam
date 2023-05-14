package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdac.entity.ContactUs;
import com.cdac.entity.User;
import com.cdac.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	
	@GetMapping("/register")
	public String registerPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@GetMapping("/contactus")
	public String contactUsPage(Model model) {
		ContactUs c = new ContactUs();
		model.addAttribute("contactus", c);
		return "contact";
	}
	
	@PostMapping("/register")
	public String register(User user) {
		System.out.println(user);
		User saveUser = userService.register(user);
		if(saveUser != null) {
			return "redirect:/login";
		}
		return "register";
	}
	
	@PostMapping("/contactus")
	public String contactUs(ContactUs c) {
		ContactUs c1 = userService.contactUs(c);
		return "redirect:/contactus";
	}
}
