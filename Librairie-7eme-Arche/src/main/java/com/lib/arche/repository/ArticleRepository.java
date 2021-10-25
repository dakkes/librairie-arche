package com.lib.arche.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

 
import com.lib.arche.model.Article;
/**
 * Cette interface hérite de jpaRepository qui herite indirectement de crudRepository .
 * qui va nous fournir un certains nombre de methodes pour interagire avec la BDD
 * Ici on recherche des article par titre
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
 

public interface ArticleRepository extends JpaRepository<Article, Long>{
	
	List<Article> findByTitre(String nom);
}