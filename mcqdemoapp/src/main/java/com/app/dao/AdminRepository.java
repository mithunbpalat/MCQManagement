package com.app.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.app.model.Admin;
@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer>{
	 Admin findByUsername(String username);
}
