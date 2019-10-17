package com.schoolback.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolback.dao.LectureDao;
import com.schoolback.model.Lecture;

@RestController
@RequestMapping("/lecture")
public class LectureControllerApi {

	@Autowired 
	LectureDao lecturedao; 
	
	@PostMapping
	public ResponseEntity<Lecture> create(@RequestBody Lecture l) {
		Lecture newlecture = lecturedao.save(l);
		
		return new ResponseEntity<Lecture>(newlecture, HttpStatus.CREATED);
	}
}
