package com.lib.arche.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Ici est definis l'exeption au cas ou une personne n'est pas inscrite dans les utilisateurs de notre site.
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
@ResponseStatus(HttpStatus.NOT_FOUND)
/**
 * Dans le cas ou la personne n'est pa inscrite=>personne introuvable
 */
public class PersonneNotFoundException extends RuntimeException {
	public PersonneNotFoundException() {
		super("Personne introuvable");
	}
}
