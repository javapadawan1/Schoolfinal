package com.schoolback.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolback.model.ClassRoom;


@Repository("classroomdao")
@Transactional
public interface ClassroomDao extends CrudRepository<ClassRoom, Integer> {

}
