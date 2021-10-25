package com.lib.arche;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lib.arche.model.Article;
import com.lib.arche.repository.ArticleRepository;

@SpringBootTest
/**
 *  Cette classe m'a permis de definir les test de mon crud
 *  @version 1.0 
 *  @author dakkes abdalohabe
 */ 
class Librairie7emeArcheApplicationTests {
	
	
	
	@Autowired
	private ArticleRepository articleRepository;
//test create article
@Test
/**
 *  Test creer un article pour le reponsable
 */
public void testCreateArticle() {
Article art = new Article("L'art de la victoire","www.amazone.com",15,12);
articleRepository.save(art);
}
@Test
/**
  *  Test trouver un article
 */
public void testFindArticle()
{ Article art = articleRepository.findById(1L).get(); System.out.println(art);
}
@Test
/**
 *  Test  modifier un article
*/
public void testUpdateArticle()
{ Article art = articleRepository.findById(1L).get();
art.setPrixUnitaire((float) 100.0); articleRepository.save(art);
}
@Test
/**
 *  Test supprimer un article
*/
public void testDeleteArticle()
{ articleRepository.deleteById(1L);;
}
@Test
/**
 *  Test Lister des articles
*/
public void testListerTousProduits()
{
List<Article> art = articleRepository.findAll();
for (Article arti : art)
{
System.out.println(arti);
}
}
}
