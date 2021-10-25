 package com.lib.arche.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
/**
 * Cette classe permet d'afficher les différents livres. 
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */
public class Livre extends Article {

	private String titre;
	private String format;
	private String genre;
	private String auteur;
	private String isbn;

	public Livre() {
		super();
	}

	public Livre(String image, float prixUnitaire, int stock, String titre, String format, String genre, String auteur,
			String isbn) {
		super(image, isbn, prixUnitaire, stock);
		this.titre = titre;
		this.format = format;
		this.genre = genre;
		this.auteur = auteur;
		this.isbn = isbn;
	}

	public Livre(Long id, String image, float prixUnitaire, int stock, String titre, String format, String genre,
			String auteur, String isbn) {
		super();
		this.titre = titre;
		this.format = format;
		this.genre = genre;
		this.auteur = auteur;
		this.isbn = isbn;
	}

}