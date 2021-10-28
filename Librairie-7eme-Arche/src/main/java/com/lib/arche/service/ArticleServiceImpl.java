  package com.lib.arche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.arche.model.Article;
import com.lib.arche.repository.ArticleRepository;
/*service pour injection de dependances*/

/**
 *  ArticleServiceImpl implemente articleService
 *  Nous définissons les méthodes d'implementations.
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 


@Service
public class ArticleServiceImpl implements ArticleService{
	//*Injection de dependances*/
	@Autowired
	ArticleRepository articleRepository;

	@Override
	/**
	  * Cette methode permet d'enregistrer un article
	  */
	public Article saveArticle(Article a) {
		return  articleRepository.save(a);
	}

	@Override
	/**
	  * Cette methode permet modifier un article
	  */
	public Article updateArticle(Article a) {
		return  articleRepository.save(a);
	}

	@Override
	/**
	  * Cette méthode permet d'effaçer un article
	  */
	public void deleteArticle(Article a) {
		articleRepository.delete(a);
		
	}

	@Override
	/**
	  * Cette méthode permet d'effaçer un article par id
	  */
	public void deleteArticleById(Long id) {
		articleRepository.deleteById(id);
	}
	/**
	  * Cette méthode de retrouver un article par id
	  */
	@Override
	public Article getArticle(Long id) {
		return articleRepository.findById(id).get();
	}

	@Override
	/**
	  * Cette méthode de retrouver tous les articles
	  */
	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}
	
	
 

}
