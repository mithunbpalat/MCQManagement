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

import com.app.model.Kasquestion;
import com.app.service.KasquestionService;

@RestController
@CrossOrigin("*")
public class KasquestionController {
	@Autowired
	private KasquestionService kasquestionService;
	
	@PostMapping(value="postkasquestion")
	public List<Kasquestion> saveKasquestion(@RequestBody Kasquestion kasquestion){
		System.out.println("Kasquestion works");
		kasquestionService.saveKasquestion(kasquestion);
		return kasquestionService.getAllKasquestions();
	}
	@PutMapping(value="updatekasquestion")
	public List<Kasquestion> updateKasquestion(@RequestBody Kasquestion kasquestion){
		System.out.println("Kasquestion update works");
		kasquestionService.updateKasquestion(kasquestion);
		return kasquestionService.getAllKasquestions();
	}
	@GetMapping(value="getallkasquestions")
	public List<Kasquestion> getAllKasquestion(){
		return kasquestionService.getAllKasquestions();
	}
	@DeleteMapping(value="deletekasquestionbyid")
	public List<Kasquestion> deleteKasquestion(@RequestParam int qid){
		kasquestionService.deleteKasquestion(qid);
		return kasquestionService.getAllKasquestions();
	}
	@GetMapping(value="getkasquestionbyid")
	public Kasquestion getKasquestionById(@RequestParam int qid){
		return kasquestionService.findKasquestionByQid(qid);
	}
}
