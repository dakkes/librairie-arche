 package com.lib.arche.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class User {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String firstName;
	private String email;
	private String password;
	private String Adresse;
	private int CodePostale;
	private String Ville;
	private Date birthday;
	
	
	public User() {
		super();
	}
	public User(String name, String firstName, String email, String password, String adresse, int codePostale,
			String Ville) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.Adresse = adresse;
		this.CodePostale = codePostale;
		this.Ville=Ville;
	}
	public User(String name, String firstName, String email, String password, String adresse, int codePostale,
			String Ville,
			Date birthday) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.Adresse = adresse;
		this.CodePostale = codePostale;
		this.Ville=Ville;
		this.birthday = birthday;
	}
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getCodePostale() {
		return CodePostale;
	}
	public void setCodePostale(int codePostale) {
		CodePostale = codePostale;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		this.Ville = ville;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", firstName=" + firstName + ", email=" + email + ", password=" + password
				+ ", Adresse=" + Adresse + ", CodePostale=" + CodePostale + ", ville=" + Ville + "]";
	}
	
	
	
	
	
	
	
	
	
	

}