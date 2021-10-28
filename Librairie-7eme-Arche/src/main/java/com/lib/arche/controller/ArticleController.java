 package com.lib.arche.controller;

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

import com.lib.arche.model.Article;
import com.lib.arche.model.Livre;
import com.lib.arche.repository.ArticleRepository;
import com.lib.arche.repository.LivreRepository;
import com.lib.arche.service.ArticleService;

/**
 * Logique des différents  articles.
 * La réponse aux differentes manipulations des utilisateurs 
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */

/**
 * Cette annotation est utilisée sur les classes Java qui jouent le rôle de
 * controleur dans notre application. L'annotation @Controller permet
 * l'auto-détection des classes de composants dans les définitions du chemin de
 * la classe et l'enregistrement automatique des beans.
 */
@Controller
public class ArticleController {
	/**
	 * L'annotation @Autowired permet d'activer l'injection automatique de
	 * dependance.
	 */
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	LivreRepository livreRepository;
	/**
	 * Cette annotation est utilisée pour mapper des requetes HTTP GET sur des
	 * methodes de gestionnaire specifiques
	 * 
	 * @GetMapping est une annotation composee qui agit comme un raccourci
	 *             pour @RequestMapping (method = RequestMethod. GET).
	 */
	/* Voir les articles */
	@GetMapping({ "/showArticles" })
	public String showArticle(Model model) {
		model.addAttribute("articles", articleRepository.findAll());
		return "article/showArticles";
	}

	/* Voir un article */
	@GetMapping("/showArticle/{id}")
	public String detailArticle(@PathVariable Long id, Model model) {
		model.addAttribute("article", articleRepository.findById(id).orElse(null));
		return "article/showArticle";
	}

	@Autowired
	ArticleService articleService;

	/* losque showCreate est demander vue createArticle retourner */
	@RequestMapping("/showCreate")
	/* créer un article */
	public String showCreate() {
		return "article/createArticle";
	}

	/* Enregistrer un article */
	@RequestMapping("/saveArticle")
	public String saveArticle(@ModelAttribute("article") Article article, ModelMap modelMap) {
		Article saveArticle = articleService.saveArticle(article);
		String msg = "article enregistré avec l'ID " + saveArticle.getId();
		modelMap.addAttribute("msg", msg);
		return "article/createArticle";
	}

	@RequestMapping("/ListeArticles")
	/* Liste des articles rajouter et enregistrer */

	public String listeArticles(ModelMap modelMap) {
		List<Article> arts = articleService.getAllArticles();
		modelMap.addAttribute("articles", arts);
		return "article/listeArticles";

	}

	@RequestMapping("/supprimerArticle")

	/* Supprimer les articles */
	public String supprimerArticle(@RequestParam("id") Long id, ModelMap modelMap) {

		articleService.deleteArticleById(id);
		List<Article> arts = articleService.getAllArticles();
		modelMap.addAttribute("articles", arts);
		return "article/listeArticles";
	}

	/* Modifier les articles */
	@RequestMapping("/modifierArticle")
	public String editerProduit(@RequestParam("id") Long id, ModelMap modelMap) {
		Livre a = livreRepository.findById(id).get();
		modelMap.addAttribute("article", a);
		return "article/editerArticle";
	}

	@PostMapping("/enregistrerArticle")
	public String updateProduit(@ModelAttribute("article") Livre article,

			ModelMap modelMap) {
		System.out.println(article);
		livreRepository.saveAndFlush(article);
		List<Article> arts = articleService.getAllArticles();
		modelMap.addAttribute("articles", arts);

		return "article/listeArticles";
	}
}
