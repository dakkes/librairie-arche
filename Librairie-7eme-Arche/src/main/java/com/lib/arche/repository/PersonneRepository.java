 package com.lib.arche.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.arche.model.Personne;

/**
 * Cette interface hérite de jpaRepository qui hérite indirectement de crudRepository .
 * qui va nous fournir un certains nombre de méthodes pour interagire avec la BDD
 * Ici on recherche une personne avec un mail et un mot de pass
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
public interface PersonneRepository extends JpaRepository<Personne, Long> {
	List<Personne>findByEmailAndMotDePasse(String email, String motDePasse);
}