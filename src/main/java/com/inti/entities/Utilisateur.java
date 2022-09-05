package com.inti.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;







@Entity
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date date;
	private Long age;
	private long cin;
	private long tel;
	private String numPassport;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(Long id, String nom, String prenom, Date date, Long age, long cin, long tel,
			String numPassport) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.age = age;
		this.cin = cin;
		this.tel = tel;
		this.numPassport = numPassport;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getNumPassport() {
		return numPassport;
	}
	public void setNumPassport(String numPassport) {
		this.numPassport = numPassport;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", age=" + age
				+ ", cin=" + cin + ", tel=" + tel + ", numPassport=" + numPassport + "]";
	}
	
	
	
	

}
