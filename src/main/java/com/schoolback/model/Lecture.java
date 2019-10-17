package com.schoolback.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lecture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLecture;
	
	@ManyToOne
	@JoinColumn(name="class_id")
	private Classe varclass;
	
	@ManyToOne
	@JoinColumn(name="classroom_id")
	private ClassRoom classroom;
	
	@ManyToOne
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	@ManyToOne
	@JoinColumn(name="professor_id")
	private Professor professor;
	
	private Date startLecture;
	private Date endLecture;

	@ManyToOne
	@JoinColumn(name="time_table_id")
	private TimeTableClass timetableclass;

	
	public Lecture(Classe varclass, ClassRoom classroom, Subject subject, Professor professor, Date startLecture,
			Date endLecture) {
		super();
		this.varclass = varclass;
		this.classroom = classroom;
		this.subject = subject;
		this.professor = professor;
		this.startLecture = startLecture;
		this.endLecture = endLecture;
	}


	public Lecture() {
		super();
	}


	public Classe getVarclass() {
		return varclass;
	}


	public void setVarclass(Classe varclass) {
		this.varclass = varclass;
	}


	public ClassRoom getClassroom() {
		return classroom;
	}


	public void setClassroom(ClassRoom classroom) {
		this.classroom = classroom;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public Date getStartLecture() {
		return startLecture;
	}


	public void setStartLecture(Date startLecture) {
		this.startLecture = startLecture;
	}


	public Date getEndLecture() {
		return endLecture;
	}


	public void setEndLecture(Date endLecture) {
		this.endLecture = endLecture;
	}
	
	
}
