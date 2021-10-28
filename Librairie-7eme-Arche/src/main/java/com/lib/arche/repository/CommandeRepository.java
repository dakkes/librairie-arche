 package com.lib.arche.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lib.arche.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
	@Query("select c from Commande c where c.user.id = ?1")
	List<Commande> findByUserId(Long id);
}
