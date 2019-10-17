package com.schoolback.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolback.model.Professor;

@Repository("professordao")
@Transactional
public interface ProfessorDao extends CrudRepository<Professor, Integer> {

}
