 package com.lib.arche.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.arche.model.Adresse;


/**
 * Cette interface hérite de jpaRepository qui herite indirectement de crudRepository
 * qui va nous fournir un certains nombre de methodes pour intéragire avec la BDD
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
public interface AdresseRepository extends JpaRepository<Adresse, Long>{
}