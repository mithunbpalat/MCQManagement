package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Kasquestion;

@Repository
public interface KasquestionRepository extends CrudRepository<Kasquestion, Integer>{

}
