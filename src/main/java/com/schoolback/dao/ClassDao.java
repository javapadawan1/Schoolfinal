package com.schoolback.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import  com.schoolback.model.Classe;

@Repository("classdao")
@Transactional
public interface ClassDao extends CrudRepository< Classe, Integer>{

	
	
	
}
