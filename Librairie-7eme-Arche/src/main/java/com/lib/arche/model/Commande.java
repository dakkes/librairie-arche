 package com.lib.arche.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	LocalDateTime dateCommande = LocalDateTime.now();
	@OneToMany(fetch = FetchType.EAGER,cascade = { CascadeType.PERSIST})
	private List<LigneCommande> lignes = new ArrayList<>();;
	private double prixTotalTtc;
	@ManyToOne
	private User user = new User();
	
	public boolean add(LigneCommande e) {
		return lignes.add(e);
	}
	
	
}
