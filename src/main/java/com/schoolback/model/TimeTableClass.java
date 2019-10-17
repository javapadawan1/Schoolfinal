package com.schoolback.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name ="Timetable")
public class TimeTableClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTimeTableClass;
	
	@OneToMany
	(mappedBy = "timetableclass", fetch = FetchType.EAGER)
	Set<Lecture> lectures = new HashSet<Lecture>();
	
	@OneToOne
	private Classe varclass;

	public TimeTableClass() {
		super();
	}

	public TimeTableClass(Set<Lecture> lectures, Classe varclass) {
		super();
		this.lectures = lectures;
		this.varclass = varclass;
	}

	public Set<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(Set<Lecture> lectures) {
		this.lectures = lectures;
	}

	public Classe getVarclass() {
		return varclass;
	}

	public void setVarclass(Classe varclass) {
		this.varclass = varclass;
	}

}
