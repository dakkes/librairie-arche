  package com.lib.arche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PartenairesController {
	/*Page d'affichage des partenaires*/
	@GetMapping("partenaires")
	/**
	 * Différents partenaires de notre site.
	 *  
	 *  @version 1.0 
	 *  @author dakkes abdalohabe
	 */ 
	  public String Partenaires(){
		   
		  return "home/partenaires";
}
 
	 
	
	
		
	
	
	
}