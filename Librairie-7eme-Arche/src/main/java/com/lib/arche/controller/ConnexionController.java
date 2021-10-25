package com.lib.arche.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import com.lib.arche.model.Personne;
import com.lib.arche.model.User;
import com.lib.arche.repository.UserRepository;

/**
 * Mode connexion simple.
 * 
 * @version 1.0
 * @author dakkes abdalohabe
 */
@Controller

public class ConnexionController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/connexion")
	public String connexion(Model model) {
		model.addAttribute("personne", new User());
		return "connexion/connexion";
	}

	@PostMapping("/connexion")
	public String connexion(@ModelAttribute("personne") User personne,  Model model,
			WebRequest request) {
		System.out.println(personne);
		List<User> resultat = userRepository.findByEmailAndPassword(personne.getEmail(), personne.getPassword());
		if (resultat.size() > 0) {
			request.setAttribute("personne", resultat.get(0), WebRequest.SCOPE_SESSION);
			return "redirect:/showArticles";
		} else {
			return "connexion/connexion";
		}
	}
}