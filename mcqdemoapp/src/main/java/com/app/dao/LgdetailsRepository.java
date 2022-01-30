package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Lgdetails;

@Repository
public interface LgdetailsRepository extends CrudRepository<Lgdetails, Integer>{

}
