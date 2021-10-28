 package com.lib.arche.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
/**
 * Cette classe permet d'afficher les différents livres.
 * 
 * @version 1.0
 * @author dakkes abdalohabe
 */
public class Livre extends Article {

	private String format;
	private String genre;
	private String auteur;
	private String isbn;

	public Livre() {
		super();
	}

	public Livre(String titre, String image, float prixUnitaire, int stock, String format, String genre, String auteur,
			String isbn) {
		super(titre, image, prixUnitaire, stock);
		this.format = format;
		this.genre = genre;
		this.auteur = auteur;
		this.isbn = isbn;
	}

	public Livre(Long id, String titre, String image, float prixUnitaire, int stock, String format, String genre,
			String auteur, String isbn) {
		super(id, titre, image, prixUnitaire, stock);
		this.format = format;
		this.genre = genre;
		this.auteur = auteur;
		this.isbn = isbn;

	}

}