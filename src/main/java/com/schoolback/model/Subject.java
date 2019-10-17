package com.schoolback.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSubject;
	
	@Enumerated(EnumType.STRING)
	private Color color;
	
	@OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
	Set<Lecture> lectures = new HashSet<Lecture>();
	
	
	private String nameSubject;
	public Subject() {
		super();
	}

	public Subject(Color color, String nameSubject) {
		super();
		this.color = color;
		this.nameSubject = nameSubject;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}

}
	
