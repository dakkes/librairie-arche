package com.lib.arche.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.lib.arche.model.Adresse;
import com.lib.arche.model.Personne;
import com.lib.arche.repository.AdresseRepository;
import com.lib.arche.repository.PersonneRepository;
@RestController
@RequestMapping("/personne")
public class PersonneRestController {
	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private AdresseRepository adresseRepository;
	@GetMapping("")
	public List<Personne> getAllPersonnes() {
		return personneRepository.findAll();
	}
	@GetMapping("/{num}")
	public Personne getPersonne(@PathVariable Long num) {
	    var personne =  personneRepository.findById(num).orElse(null);
	    if (personne == null)
	    	throw new ResponseStatusException(
	    	          HttpStatus.NOT_FOUND, "Personne avec id = " + num + " est introuvable");
	    return personne;
	}
	@DeleteMapping("/{num}")
	public void deletePersonne(@PathVariable Long num) {
		personneRepository.deleteById(num);
	}
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("")
	public Personne addPersonne(@RequestBody Personne personne) {
		List<Adresse> adresses = personne.getAdresses();
		for (Adresse adresse : adresses) {
			Adresse adr = null;
			if (adresse.getId() != null) {
				adr = adresseRepository.findById(adresse.getId()).orElse(null);
				adresses.set(adresses.indexOf(adresse), adr);
			} else {
				adr = adresseRepository.save(adresse);
			}
		}
		return personneRepository.saveAndFlush(personne);
	}
	@PutMapping("/{num}")
	public Personne editPersonne(@PathVariable Long num, @RequestBody Personne personne) {
		if (num == personne.getNum()) {
			return personneRepository.save(personne);
		} else {
			return null;
		}
	}
}