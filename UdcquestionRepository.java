package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Udcquestion;
@Repository
public interface UdcquestionRepository extends CrudRepository<Udcquestion, Integer>{

}
