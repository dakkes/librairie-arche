  package com.lib.arche.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import com.lib.arche.model.Article;
import com.lib.arche.model.LignePanier;
import com.lib.arche.model.Panier;
import com.lib.arche.repository.ArticleRepository;
import com.lib.arche.service.ArticleService;
import com.lib.arche.service.ArticleServiceImpl;
/**
 * Logique de l'ajout d'un article.
 * La réponse aux differentes manipulations des utilisateurs 
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
 

@Controller
public class PanierController {
	@Autowired
	private ArticleRepository articleRepository;
	 
/*Action pour voir le panier*/
	@GetMapping(value = "/showPanier")
	/**
	  * Action pour voir un panier
	  */
	public String showPanier(Model model, WebRequest request) {
		Panier panier = (Panier) request.getAttribute("panier", request.SCOPE_SESSION);
		System.out.println(panier);
		model.addAttribute("panier", panier);
		return "panier/panier";
	}
	/*Action post pour rajouter dans  le panier*/
	/**
	  * Action pour rajouter un article au panier
	  */
	
	@PostMapping(value = "/addArticle")
	public String addArticle(@RequestParam long id, Model model, WebRequest request) {
		Panier panier = (Panier) request.getAttribute("panier", request.SCOPE_SESSION);
		if (panier == null) {
			panier = new Panier();
		}
		LignePanier ligne = new LignePanier();
		ligne.setArticle(articleRepository.findById(id).orElse(null));
		ligne.setQte(1);
		panier.addLignePanier(ligne);
		request.setAttribute("panier", panier, request.SCOPE_SESSION);
		return "redirect:/showPanier";
	
		}
	
	/*Action pour effaçer un article dans le panier*/
	/**
	  * Action pour effaçer un article au panier
	  */
	
	@GetMapping(value = "/deleteArticle")
	public String deleteArticle(@RequestParam long id, Model model, WebRequest request){
   Article article = (Article) request.getAttribute("article", request.SCOPE_SESSION);
   LignePanier ligne = new LignePanier();
	ligne.setArticle(articleRepository.findById(id).orElse(null));
	ligne.setQte(1);
	Panier panier = (Panier) request.getAttribute("panier", request.SCOPE_SESSION);
	panier.deleteLignePanier(ligne);
	request.setAttribute("panier", panier, request.SCOPE_SESSION);
	return "redirect:/showPanier";
	}
	
	/*Action pour mettre à jour le panier*/
	
	@GetMapping(value = "/updateArticle")
	public String updateArticle(@RequestParam long id, Model model, WebRequest request){
   Article article = (Article) request.getAttribute("article", request.SCOPE_SESSION);
   LignePanier ligne = new LignePanier();
	ligne.setArticle(articleRepository.findById(id).orElse(null));
	ligne.setQte(1);
	Panier panier = (Panier) request.getAttribute("panier", request.SCOPE_SESSION);
	panier.deleteLignePanier(ligne);
	request.setAttribute("panier", panier, request.SCOPE_SESSION);
	return "article/showArticle";
	}
	}

