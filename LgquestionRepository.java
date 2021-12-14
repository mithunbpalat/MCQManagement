package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Lgquestion;

@Repository
public interface LgquestionRepository extends CrudRepository<Lgquestion, Integer>{

}
