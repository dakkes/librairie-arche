
package com.lib.arche.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.arche.model.Livre;

/**
 * Cette interface herite de jpaRepository qui herite indirectement de crudRepository .
 * qui va nous fournir un certains nombre de methodes pour interagire avec la BDD
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
public interface LivreRepository extends JpaRepository<Livre, Long>{
}
