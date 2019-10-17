package com.schoolback.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolback.dao.ProfessorDao;
import com.schoolback.model.Lecture;
import com.schoolback.model.Professor;

@RestController
@RequestMapping("/professor")
public class ProfessorControllerApi {

	@Autowired 
	ProfessorDao professordao; 
	
	@PostMapping
	public ResponseEntity<Professor> create(@RequestBody Professor p) {
		Professor newprofessor = professordao.save(p);
		
		return new ResponseEntity<Professor>(newprofessor, HttpStatus.CREATED);
	}
}
