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

import com.app.model.Lgdetails;
import com.app.service.LgdetailsService;

@RestController
@CrossOrigin("*")
public class LgdetailsController {
	@Autowired
	private LgdetailsService lgdetailsService;
	
	@PostMapping(value="postlgdetails")
	public List<Lgdetails> saveLgdetails(@RequestBody Lgdetails lgdetails){
		System.out.println("Lgdetails works");
		lgdetailsService.saveLgdetails(lgdetails);
		return lgdetailsService.getAllLgdetails();
	}
	@PutMapping(value="updatelgdetails")
	public List<Lgdetails> updateLgdetails(@RequestBody Lgdetails lgdetails){
		System.out.println("Lgdetails update works");
		lgdetailsService.updateLgdetails(lgdetails);
		return lgdetailsService.getAllLgdetails();
	}
	@GetMapping(value="getalllgdetails")
	public List<Lgdetails> getAllLgdetail(){
		return lgdetailsService.getAllLgdetails();
	}
	@DeleteMapping(value="deletelgdetailsbyid")
	public List<Lgdetails> deleteLgdetails(@RequestParam int lid){
		lgdetailsService.deleteLgdetails(lid);
		return lgdetailsService.getAllLgdetails();
	}
	@GetMapping(value="getlgdetailsbyid")
	public Lgdetails getLgdetailsById(@RequestParam int lid){
		return lgdetailsService.findLgdetailsByUid(lid);
	}

}
