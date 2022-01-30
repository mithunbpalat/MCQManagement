package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Kasdetails;

@Repository
public interface KasdetailsRepository extends CrudRepository<Kasdetails, Integer>{

}
