package com.lib.arche.controller;

import java.util.ArrayList;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.lib.arche.model.Personne;
import com.lib.arche.repository.PersonneRepository;
/**
* Logique de l'ajout, éffacer et modifier une personne.
*  @version 1.0 
*  @author dakkes abdalohabe
*/ 
@Controller
public class PersonneController {
	@Autowired
	PersonneRepository personneRepository;
	
	
	@GetMapping("/addPersonne")
	public String addPersonne(Model model) {
		model.addAttribute("personne", new Personne());
		return "personne/addPersonne";
	}
	@PostMapping("/addPersonne")
	public String addPersonne(@ModelAttribute("personne") @Valid Personne personne, BindingResult result, Model model,WebRequest request) {
		if(result.hasErrors()) {
			return "personne/addPersonne";
		}
		

		// ajout d' un élément dans la session
		request.setAttribute("personne", personne, WebRequest.SCOPE_SESSION);
		// élément de la session
		Personne personne2 = (Personne) request.getAttribute("personne", WebRequest.SCOPE_SESSION);
		// supprimer un élément de la session
		request.removeAttribute("personne", WebRequest.SCOPE_SESSION);
		
		
		personneRepository.save(personne);
		return "redirect:/showPersonnes";
	}

	
	@GetMapping("/deletePersonne/{num}")
	public String deletePerson(@PathVariable Long  num){    
		personneRepository.deleteById(num);    
		return "redirect:/showPersonnes";   	    

	}
	
	@GetMapping("/editPersonne/{num}")
	public String modifierPersonnes(@PathVariable Long num, Model model) {
		model.addAttribute("personne", personneRepository.findById(num).orElse(null));
		return "personne/editPersonne";
	}
	
	@PostMapping("/editPersonne")
	public String editPersonne(@ModelAttribute("personne") @Valid Personne personne, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "personne/editPersonne";
		}
		personneRepository.save(personne);
		return "redirect:/showPersonnes";
	}

    

	// afficher la liste des personnes
	@GetMapping("/showPersonnes")
	public String showPersonnes(Model model) {
		var personnes = personneRepository.findAll();
		model.addAttribute("personnes", personnes);
		return "personne/showPersonnes";
	}

}
	
	
	