 package com.lib.arche;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.lib.arche.model.Article;
import com.lib.arche.repository.ArticleRepository;

@SpringBootTest
@AutoConfigureMockMvc
class ArticleControllerTests {
	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testUpdateProduit() throws Exception {
//		Article article = articleRepository.findById(5L).get();
//		article.setPrixUnitaire(500);
//		this.mockMvc.perform(post("/enregistrerArticle").flashAttr("article", article))
//		.andDo(print())
//		.andExpect(status().isOk())
//		.andExpect(view().name("article/listeArticles")) 
//		.andExpect(model().attribute("articles", articleRepository.findAll()));
	}

}
