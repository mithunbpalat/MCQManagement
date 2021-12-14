package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.LgdetailsRepository;
import com.app.model.Lgdetails;

@Service
public class LgdetailsService {
	@Autowired
	private LgdetailsRepository lgdetailsRepository;
	
	public Lgdetails saveLgdetails(Lgdetails lgdetails) {
		return lgdetailsRepository.save(lgdetails);
	}
	public Lgdetails updateLgdetails(Lgdetails lgdetails) {
		return lgdetailsRepository.save(lgdetails);
	}
	public List<Lgdetails> getAllLgdetails() {
		return (List<Lgdetails>) lgdetailsRepository.findAll();
	}
	public void deleteLgdetails(int lid) {
		lgdetailsRepository.deleteById(lid);
	}
	public Lgdetails findLgdetailsByUid(int lid) {
		return lgdetailsRepository.findById(lid).get();
	}
}
