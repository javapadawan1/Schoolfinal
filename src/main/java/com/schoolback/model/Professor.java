package com.schoolback.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity 
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProfessor;
	
	@OneToOne
	private Classe varclass;
	
	@OneToMany(mappedBy = "professor", fetch = FetchType.EAGER)
	Set<Lecture> lectures = new HashSet<Lecture>();
	
	private String firtsNameProfessor;
	private String lastNameProfessor;
	private Date birthDateProfessor;
	
	public Professor() {
		super();
	}

	public Professor(Classe varclass, String firtsNameProfessor, String lastNameProfessor, Date birthDateProfessor) {
		super();
		this.varclass = varclass;
		this.firtsNameProfessor = firtsNameProfessor;
		this.lastNameProfessor = lastNameProfessor;
		this.birthDateProfessor = birthDateProfessor;
	}

	public Classe getVarclass() {
		return varclass;
	}

	public void setVarclass(Classe varclass) {
		this.varclass = varclass;
	}

	public String getFirtsNameProfessor() {
		return firtsNameProfessor;
	}

	public void setFirtsNameProfessor(String firtsNameProfessor) {
		this.firtsNameProfessor = firtsNameProfessor;
	}

	public String getLastNameProfessor() {
		return lastNameProfessor;
	}

	public void setLastNameProfessor(String lastNameProfessor) {
		this.lastNameProfessor = lastNameProfessor;
	}

	public Date getBirthDateProfessor() {
		return birthDateProfessor;
	}

	public void setBirthDateProfessor(Date birthDateProfessor) {
		this.birthDateProfessor = birthDateProfessor;
	}
	
	
}
