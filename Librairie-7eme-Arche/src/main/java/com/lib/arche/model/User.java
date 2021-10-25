package com.lib.arche.model;

import java.sql.Date;

public class User {

	private String name;
	private String firstName;
	private String email;
	private String password;
	private String Adresse;
	private int CodePostale;
	private Date birthday;
	
	
	public User(String name, String firstName, String email, String password, String adresse, int codePostale,
			Date birthday) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		Adresse = adresse;
		CodePostale = codePostale;
		this.birthday = birthday;
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
	@Override
	public String toString() {
		return "User [name=" + name + ", firstName=" + firstName + ", email=" + email + ", password=" + password
				+ ", Adresse=" + Adresse + ", CodePostale=" + CodePostale + ", birthday=" + birthday + "]";
	}
	
	
	
	
	
	
	
	
	

}