 package com.lib.arche;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lib.arche.model.Livre;
import com.lib.arche.model.User;
import com.lib.arche.repository.ArticleRepository;
import com.lib.arche.repository.UserRepository;

@SpringBootApplication
public class Librairie7emeArcheApplication implements ApplicationRunner {

	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Librairie7emeArcheApplication.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Livre livre1 = new Livre("MATRIX",
				"https://images-na.ssl-images-amazon.com/images/I/41nyvqBQl6L._SX353_BO1,204,203,200_.jpg",
				15, 10, "papier", "Science-Fiction", "Joshua Clover", "156824597523");
		Livre livre2 = new Livre("ARTEMEDIA",
				"https://images-na.ssl-images-amazon.com/images/I/41RmQBEiYjL._SX311_BO1,204,203,200_.jpg",
				22, 12, "Papier", "histoire", "Dominique Besnehard", "365824598564");
		Livre livre3 = new Livre("STAR WARS",
				"https://images-na.ssl-images-amazon.com/images/I/511EGQkPfjS._SX370_BO1,204,203,200_.jpg",
				25, 10, "Papier", "Science-Fiction", "Paul Duncan", "4520567896254");
		Livre livre4 = new Livre("LE MAGNIFIQUE",
				"https://images-na.ssl-images-amazon.com/images/I/51lFeEnMCvL._SX406_BO1,204,203,200_.jpg",
				24, 10, "Papier", "Policier", "Wibon Jérome", "4540567897254");
		Livre livre5 = new Livre("MICKAEL MANN",
				"https://images-na.ssl-images-amazon.com/images/I/41eAHuFB9+L._SX348_BO1,204,203,200_.jpg",
				35, 10, "Papier", "histoire", "Jean-Baptiste-Thoret", "4540567897254");
		Livre livre6 = new Livre("KILLER SOCIALE CLUB", "https://m.media-amazon.com/images/I/51ha1caKAQL._SL500_.jpg",
				12, 9, "papier", "Policier", "Fréderic petit jean", "156824595223");
		Livre livre7 = new Livre("DUNE 1.1", "https://m.media-amazon.com/images/I/51TLWUadlLL._SL500_.jpg",
				25, 12, "Papier", "Science-Fiction", "Franck Herber", "365821298564");
		Livre livre8 = new Livre("THE SANDMAN", "https://m.media-amazon.com/images/I/61jEF97z7eL._SL500_.jpg",
				20, 11, "Papier", "Horreur", "Dirk Maggs", "4520787896254");
		Livre livre9 = new Livre("L'INSTITUT", "https://m.media-amazon.com/images/I/51HHGOgW+UL._SL500_.jpg",
				25, 12, "Papier", "Horreur", "Stephen King", "4540578897254");
		Livre livre10 = new Livre("MICKAEL MANN", "https://m.media-amazon.com/images/I/61QJkw-j87L._SL500_.jpg",
				22, 10, "Papier", "histoire", "Jean-Baptiste-Thoret", "4540542897254");
		Livre livre11 = new Livre("CINEMA",
				"https://images-na.ssl-images-amazon.com/images/I/51CKb3jJdIL._SX406_BO1,204,203,200_.jpg",
				25, 13, "Papier", "histoire", "Laurent Delmas", "4540582895254");
		Livre livre12 = new Livre("MANDALORIAN",
				"https://images-eu.ssl-images-amazon.com/images/I/518phn4z7SL._SX218_BO1,204,203,200_QL40_ML2_.jpg",
				25, 10, "Papier", "Science-Fiction", "Szostak Phil", "4540542897254");
		Livre livre13 = new Livre("Harry Potter",
				"https://images-eu.ssl-images-amazon.com/images/I/413ov8mUkjS._SY291_BO1,204,203,200_QL40_ML2_.jpg",
				22, 10, "Papier", "Science-Fiction", "J.K Rowling", "4547842897254");
		Livre livre14 = new Livre("BOND",
				"https://images-na.ssl-images-amazon.com/images/I/31lP+KwSGkL._SY344_BO1,204,203,200_.jpg",
				18, 10, "Papier", "Policier", "Guillaume Evin", "4540542885254");
		Livre livre15 = new Livre("LE MEDIEUM", "https://m.media-amazon.com/images/I/41tqdSPoH5L._SY346_.jpg",
				22, 12, "Papier", "horreur", "Julia Salvador", "4540582885254");
		Livre livre16 = new Livre("COMPLOT", "https://m.media-amazon.com/images/I/51mhvph1MBL.jpg",
				17, 12, "Papier", "histoire", " Nicolas Beuglet", "4540582895254");

		articleRepository.saveAll(Arrays.asList(livre1, livre2, livre3, livre4, livre5, livre6, livre7, livre8, livre9,
				livre10, livre11, livre12, livre13, livre14, livre15, livre16));
	User user = new User("dakkes", "abdalohabe", "rilk.dakks@yahoo.fr", "wick", "2 bis allée des chênes", 78320,
				"La verrière");
		userRepository.save(user);
	}

}
