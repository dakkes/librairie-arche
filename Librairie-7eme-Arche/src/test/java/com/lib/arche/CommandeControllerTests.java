package com.lib.arche;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lib.arche.model.Commande;
import com.lib.arche.model.LigneCommande;
import com.lib.arche.repository.ArticleRepository;
import com.lib.arche.repository.CommandeRepository;

@SpringBootTest
class CommandeControllerTests {
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void testPrixTotal() {

		var commandes = commandeRepository.findAll();
		for (Commande commande : commandes) {
			var total = 0;
			for (LigneCommande ligne : commande.getLignes()) {
				total += ligne.getArticle().getPrixUnitaire() * ligne.getQuantiteCommandee();
			}
			assertEquals(total, commande.getPrixTotalTtc());
		}

	}

}
