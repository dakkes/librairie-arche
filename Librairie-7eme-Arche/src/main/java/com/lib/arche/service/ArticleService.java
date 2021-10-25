package com.lib.arche.service;

import java.util.List;

import com.lib.arche.model.Article;

/**
 *  L'interface sert  à créer des comportements génériques, la classe
 *  doit obéir a un comportement  particulier, on l'implémente par la classe articleServiceImpl
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
public interface ArticleService {
	
	Article saveArticle(Article a);
	Article updateArticle(Article a);
	void deleteArticle(Article a);
	void deleteArticleById(Long id);
	Article getArticle(Long id);
	List<Article> getAllArticles();

}
