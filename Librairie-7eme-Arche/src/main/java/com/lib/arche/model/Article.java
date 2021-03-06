 package com.lib.arche.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
/**
 * Cette classe est la classe modele des differents article car dans no
 * contraintes etaient specifier la possiblilite d'ajouter d'autres articles.
 * 
 * @version 1.0
 * @author dakkes abdalohabe
 */
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@NonNull
	private String titre;
	@NonNull
	private String image;
	@NonNull
	private float prixUnitaire;
	@NonNull
	private int stock;

}