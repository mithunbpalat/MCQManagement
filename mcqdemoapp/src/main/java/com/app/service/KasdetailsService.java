package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.KasdetailsRepository;
import com.app.model.Kasdetails;

@Service
public class KasdetailsService {
	@Autowired
	private KasdetailsRepository kasdetailsRepository;
	
	public Kasdetails saveKasdetails(Kasdetails kasdetails) {
		return kasdetailsRepository.save(kasdetails);
	}
	public Kasdetails updateKasdetails(Kasdetails kasdetails) {
		return kasdetailsRepository.save(kasdetails);
	}
	public List<Kasdetails> getAllKasdetails() {
		return (List<Kasdetails>) kasdetailsRepository.findAll();
	}
	public void deleteKasdetails(int kid) {
		kasdetailsRepository.deleteById(kid);
	}
	public Kasdetails findKasdetailsByKid(int kid) {
		return kasdetailsRepository.findById(kid).get();
	}
}
