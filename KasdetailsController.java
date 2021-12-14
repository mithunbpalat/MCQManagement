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

import com.app.model.Kasdetails;
import com.app.service.KasdetailsService;

@RestController
@CrossOrigin("*")
public class KasdetailsController {
	@Autowired
	private KasdetailsService kasdetailsService;
	
	@PostMapping(value="postkasdetails")
	public List<Kasdetails> saveKasdetails(@RequestBody Kasdetails kasdetails){
		System.out.println("Kasdetails works");
		kasdetailsService.saveKasdetails(kasdetails);
		return kasdetailsService.getAllKasdetails();
	}
	@PutMapping(value="updatekasdetails")
	public List<Kasdetails> updateKasdetails(@RequestBody Kasdetails kasdetails){
		System.out.println("Kasdetails update works");
		kasdetailsService.updateKasdetails(kasdetails);
		return kasdetailsService.getAllKasdetails();
	}
	@GetMapping(value="getallkasdetails")
	public List<Kasdetails> getAllKasdetail(){
		return kasdetailsService.getAllKasdetails();
	}
	@DeleteMapping(value="deletekasdetailsbyid")
	public List<Kasdetails> deleteKasdetails(@RequestParam int kid){
		kasdetailsService.deleteKasdetails(kid);
		return kasdetailsService.getAllKasdetails();
	}
	@GetMapping(value="getkasdetailsbyid")
	public Kasdetails getKasdetailsById(@RequestParam int kid){
		return kasdetailsService.findKasdetailsByKid(kid);
	}
}
