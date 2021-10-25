 package com.lib.arche.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * Cette classe permet d'afficher les differents articles rajouter dans
 *  le panier mais aussi de les modifier ainsi que de les supprimer.
 * L'utilisateur pourra ainsi à sa guise utiliser ces fonctionnaliter
* et passer au paiement 
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */

public class Panier {
	/*Liste panier*/
	
	private List<LignePanier> lignes = new ArrayList<>();
	private double prixTotalttc;
	/*boolean rajouter article dans panier*/
	 /**
	  * Cette methode retourne un boolean d'une arayList qui ne peut être que vrai.
	   * Et donc le rajoute
	  */
	public boolean addLignePanier(LignePanier e) {
		prixTotalttc+=e.getQte()*e.getArticle().getPrixUnitaire();
		return lignes.add(e);
	}
	/*boolean article present dans  panier existant effaçer article dans panier*/
	 /**
	  * Cette methode retourne un boolean d'une arayList qui efface l'article ici dans notre cas si il est dans le panier.
	   * Et donc le rajoute
	  */
	public boolean deleteLignePanier(LignePanier e) {
		prixTotalttc-=e.getQte()*e.getArticle().getPrixUnitaire();
		return lignes.remove(e);
	}
	 
	//public boolean updateLignePanier(LignePanier e) {
		//return lignes.add(e);
	//}
	
	
}
