 package com.lib.arche.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

import com.lib.arche.model.Commande;
import com.lib.arche.model.LigneCommande;
import com.lib.arche.model.LignePanier;
import com.lib.arche.model.Panier;
import com.lib.arche.model.User;
import com.lib.arche.repository.CommandeRepository;
import com.lib.arche.repository.UserRepository;

@Controller
public class CommandeController {
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/createCommande")

	public String createCommande(Model model, WebRequest request) {
		User user = (User) request.getAttribute("personne", WebRequest.SCOPE_SESSION);
		if (user == null) {
			request.setAttribute("go", true, WebRequest.SCOPE_SESSION);
			return "redirect:/connexion";
		}
		Panier panier = (Panier) request.getAttribute("panier", request.SCOPE_SESSION);
		Commande commande = new Commande();
		for (LignePanier lignePanier : panier.getLignes()) {
			commande.add(new LigneCommande(lignePanier.getQte(), lignePanier.getArticle()));
		}
		commande.setPrixTotalTtc(panier.getPrixTotalttc());
		commande.setUser(user);
		commandeRepository.save(commande);
		request.removeAttribute("panier", request.SCOPE_SESSION);
		return "redirect:/showCommande";

	}

	@GetMapping(value = "/showCommandes")
	public String showCommandes(Model model, WebRequest request) {
		User user = (User) request.getAttribute("personne", WebRequest.SCOPE_SESSION);
		if (user == null) {
			return "redirect:/connexion";
		}
		model.addAttribute("commandes", commandeRepository.findByUserId(user.getId()));
		return "commande/showCommandes";
	}

	@GetMapping(value = "/showCommande")
	public String showCommande(Model model, WebRequest request) {
		User user = (User) request.getAttribute("personne", WebRequest.SCOPE_SESSION);
		if (user == null) {
			return "redirect:/connexion";
		}
		List<Commande> commandes = commandeRepository.findByUserId(user.getId());
		Commande commande = commandes.get(commandes.size() - 1);
		model.addAttribute("commande", commande);
		return "commande/showCommande";
	}
}

