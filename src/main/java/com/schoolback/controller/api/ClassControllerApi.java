package com.schoolback.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolback.dao.ClassDao;
import com.schoolback.model.Classe;


@RestController
@RequestMapping("/class")
public class ClassControllerApi {

	@Autowired 
	ClassDao classdao; 
	
	@PostMapping
	public ResponseEntity<Classe> create(@RequestBody Classe c) {
		Classe newclass = classdao.save(c);
		
		return new ResponseEntity<Classe>(newclass, HttpStatus.CREATED);
		
	}
}