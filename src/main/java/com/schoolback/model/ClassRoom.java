package com.schoolback.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity()
public class ClassRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClassRoom;
	
	@OneToMany(mappedBy = "classroom", fetch = FetchType.EAGER)
	Set<Lecture> lectures = new HashSet<Lecture>();
	
	private String nameClassRoom;
	private int capacityClassRoom;
	
	public ClassRoom(Set<Lecture> lectures, String nameClassRoom, int capacityClassRoom) {
		super();
		this.lectures = lectures;
		this.nameClassRoom = nameClassRoom;
		this.capacityClassRoom = capacityClassRoom;
	}

	public ClassRoom() {
		super();
	}

	public Set<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(Set<Lecture> lectures) {
		this.lectures = lectures;
	}

	public String getNameClassRoom() {
		return nameClassRoom;
	}

	public void setNameClassRoom(String nameClassRoom) {
		this.nameClassRoom = nameClassRoom;
	}

	public int getCapacityClassRoom() {
		return capacityClassRoom;
	}

	public void setCapacityClassRoom(int capacityClassRoom) {
		this.capacityClassRoom = capacityClassRoom;
	}
	
}
