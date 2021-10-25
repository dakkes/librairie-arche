package com.lib.arche.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lib.arche.model.User;
import com.lib.arche.repository.UserRepository;

/**
 * Page d'accueil.
 * 
 * @version 1.0
 * @author dakkes abdalohabe
 */
@Controller
public class HomeController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String home() {

		return "home/home";
	}

	@GetMapping("register")
	public String showForm(Model model) {

		User user = new User();
		model.addAttribute("user", user);

		return "home/register_form";
	}

	@PostMapping("register")
	public String submitForm(@ModelAttribute("user") User user, Model model) {
		user = userRepository.save(user);
		System.out.println(user);
		model.addAttribute("user", user);
		return "home/register_succes";
	}

}