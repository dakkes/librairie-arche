package com.lib.arche.model; 


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
/**
 * Cette classe permet d'afficher l'adresse de l'utilistateur(personne).
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String rue;
	@NonNull
	private String codePostal;
	@NonNull
	private String ville;
	/* Le @JsonIgnoreProperties L'annotation Jackson est utiliser pour specifier une liste de proprietes d'une classe à ignorer.*/
	 /**
	  * Cette méthode permet d'ignorer les champs nul.
	   *  
	  */
	@JsonIgnoreProperties("adresses")
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "adresses")
	private List<Personne> personnes = new ArrayList<Personne>();
}
