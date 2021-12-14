package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Udcdetails;
import com.app.service.UdcdetailsService;

@RestController
@CrossOrigin("*")
public class UdcdetailsController {
	@Autowired
	private UdcdetailsService udcdetailsService;
	
	@PostMapping(value="postudcdetails")
	public List<Udcdetails> saveUdcdetails(@RequestBody Udcdetails udcdetails){
		System.out.println("Udcdetails works");
		udcdetailsService.saveUdcdetails(udcdetails);
		return udcdetailsService.getAllUdcdetails();
	}
	@PutMapping(value="updateudcdetails")
	public List<Udcdetails> updateUdcdetails(@RequestBody Udcdetails udcdetails){
		System.out.println("Udcdetails update works");
		udcdetailsService.updateUdcdetails(udcdetails);
		return udcdetailsService.getAllUdcdetails();
	}
	@GetMapping(value="getalludcdetails")
	public List<Udcdetails> getAllUdcdetail(){
		return udcdetailsService.getAllUdcdetails();
	}
	@DeleteMapping(value="deleteudcdetailsbyid")
	public List<Udcdetails> deleteUdcdetails(@RequestParam int uid){
		udcdetailsService.deleteUdcdetails(uid);
		return udcdetailsService.getAllUdcdetails();
	}
	@GetMapping(value="getudcdetailsbyid")
	public Udcdetails getUdcdetailsById(@RequestParam int uid){
		return udcdetailsService.findUdcdetailsByUid(uid);
	}
	
}
