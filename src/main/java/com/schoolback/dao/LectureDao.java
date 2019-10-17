package com.schoolback.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolback.model.Lecture;

@Repository("lecturedao")
@Transactional
public interface LectureDao extends CrudRepository<Lecture, Integer> {

}
