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

import com.app.model.Lgquestion;
import com.app.service.LgquestionService;

@RestController
@CrossOrigin("*")
public class LgquestionController {
	@Autowired
	private LgquestionService lgquestionService;
	
	@PostMapping(value="postlgquestion")
	public List<Lgquestion> saveLgquestion(@RequestBody Lgquestion lgquestion){
		System.out.println("Lgquestion works");
		lgquestionService.saveLgquestion(lgquestion);
		return lgquestionService.getAllLgquestions();
	}
	@PutMapping(value="updatelgquestion")
	public List<Lgquestion> updateLgquestion(@RequestBody Lgquestion lgquestion){
		System.out.println("Lgquestion update works");
		lgquestionService.updateLgquestion(lgquestion);
		return lgquestionService.getAllLgquestions();
	}
	@GetMapping(value="getalllgquestions")
	public List<Lgquestion> getAllLgquestion(){
		return lgquestionService.getAllLgquestions();
	}
	@DeleteMapping(value="deletelgquestionbyid")
	public List<Lgquestion> deleteLgquestion(@RequestParam int qid){
		lgquestionService.deleteLgquestion(qid);
		return lgquestionService.getAllLgquestions();
	}
	@GetMapping(value="getlgquestionbyid")
	public Lgquestion getLgquestionById(@RequestParam int qid){
		return lgquestionService.findLgquestionByQid(qid);
	}
}
