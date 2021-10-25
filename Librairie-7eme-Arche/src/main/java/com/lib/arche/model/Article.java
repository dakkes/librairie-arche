package com.lib.arche.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
/**
 * Cette classe est la classe modele des differents 
 * article car dans no contraintes etaient specifier 
 * la possiblilite d'ajouter d'autres articles.
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */

public class Article {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String image;
	private float prixUnitaire;
	private int stock;
	
	
	@ManyToOne
	/**
	 * Cette classe permet d'afficher les différents articles.
	 * L'annotation ManyToOne definit que la propriete Article est lie a un objet de type Livre 
	 *  @version 1.0 
	 *  @author dakkes abdalohabe
	 */
	private Livre livre;
	public Article() {
		super();
	}

	 /**
	  * deux constructeurs, un pour la page principal
	  * et l'autre losqu'on ajoute l'article sur le 
	  * panier, s'affiche l'id en plus.
	  */
	
	public Article(String image, String titre, float prixUnitaire, int stock) {
		super();
		this.titre=titre;
		this.image = image;
		this.prixUnitaire = prixUnitaire;
		this.stock = stock;
	}
	
	public Article(Long id, String image, String titre, float prixUnitaire, int stock) {
		super();
		this.id = id;
		this.image = image;
		this.titre=titre;
		this.prixUnitaire = prixUnitaire;
		this.stock = stock;
	}

	 
}