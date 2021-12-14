package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UdcdetailsRepository;
import com.app.model.Udcdetails;

@Service
public class UdcdetailsService {
	@Autowired
	private UdcdetailsRepository udcdetailsRepository;
	
	public Udcdetails saveUdcdetails(Udcdetails udcdetails) {
		return udcdetailsRepository.save(udcdetails);
	}
	public Udcdetails updateUdcdetails(Udcdetails udcdetails) {
		return udcdetailsRepository.save(udcdetails);
	}
	public List<Udcdetails> getAllUdcdetails() {
		return (List<Udcdetails>) udcdetailsRepository.findAll();
	}
	public void deleteUdcdetails(int uid) {
		udcdetailsRepository.deleteById(uid);
	}
	public Udcdetails findUdcdetailsByUid(int uid) {
		return udcdetailsRepository.findById(uid).get();
	}
}
