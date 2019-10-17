package com.schoolback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Classe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClass;
	
//	@OneToMany(mappedBy = "class", fetch = FetchType.EAGER)
//	Set<Lecture> lectures = new HashSet<Lecture>(); unidirectionnalité 
	
	@OneToOne
	private TimeTableClass timetableclass;
	
	@OneToOne
	private Professor professeur;
	
	private String nameClass;

	public Classe( TimeTableClass timetableclass, Professor professeur, String nameClass) {
		super();
	
		this.timetableclass = timetableclass;
		this.professeur = professeur;
		this.nameClass = nameClass;
	}

	public Classe() {
		super();
	}



	public TimeTableClass getTimetableclass() {
		return timetableclass;
	}

	public void setTimetableclass(TimeTableClass timetableclass) {
		this.timetableclass = timetableclass;
	}

	public Professor getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professor professeur) {
		this.professeur = professeur;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
}
