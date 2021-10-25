 package com.lib.arche.model;
 import java.util.ArrayList;
 import java.util.List;
 import javax.persistence.CascadeType;
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.ManyToMany;
 import javax.validation.constraints.Pattern;
 import javax.validation.constraints.Size;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 import lombok.AccessLevel;
 import lombok.AllArgsConstructor;
 import lombok.Data;
 import lombok.NoArgsConstructor;
 import lombok.NonNull;
 import lombok.RequiredArgsConstructor;
 import lombok.ToString;
 import lombok.experimental.FieldDefaults;
 @FieldDefaults(level = AccessLevel.PRIVATE)
 @Data
 @Entity
 @ToString(of = { "email", "motDePasse" })
 @AllArgsConstructor
 @NoArgsConstructor
 @RequiredArgsConstructor
  
 public class Personne {
 	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	Long num;
 	@NonNull
 	String nom;
 	@NonNull
 	String prenom;
 	@NonNull
 	@Pattern(regexp = "^[A-Z][a-z]{1,19}$", message = "L'email doit être dans les normes")
 	String email;
 	@NonNull
 	@Size(min = 2, message = "Le Mot de passe doit contenir au moins deux caractères")
 	String motDePasse;
 	@JsonIgnoreProperties("personnes")
 	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.EAGER)
 	private List<Adresse> adresses = new ArrayList<Adresse>();
 }