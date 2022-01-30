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

import com.app.model.Udcquestion;
import com.app.service.UdcquestionService;

@RestController
@CrossOrigin("*")
public class UdcquestionController {
	@Autowired
	private UdcquestionService udcquestionService;
	
	@PostMapping(value="postudcquestion")
	public List<Udcquestion> saveUdcquestion(@RequestBody Udcquestion udcquestion){
		System.out.println("Udcquestion works");
		udcquestionService.saveUdcquestion(udcquestion);
		return udcquestionService.getAllUdcquestions();
	}
	@PutMapping(value="updateudcquestion")
	public List<Udcquestion> updateUdcquestion(@RequestBody Udcquestion udcquestion){
		System.out.println("Udcquestion update works");
		udcquestionService.updateUdcquestion(udcquestion);
		return udcquestionService.getAllUdcquestions();
	}
	@GetMapping(value="getalludcquestions")
	public List<Udcquestion> getAllUdcquestion(){
		return udcquestionService.getAllUdcquestions();
	}
	@DeleteMapping(value="deleteudcquestionbyid")
	public List<Udcquestion> deleteUdcquestion(@RequestParam int qid){
		udcquestionService.deleteUdcquestion(qid);
		return udcquestionService.getAllUdcquestions();
	}
	@GetMapping(value="getudcquestionbyid")
	public Udcquestion getUdcquestionById(@RequestParam int qid){
		return udcquestionService.findUdcquestionByQid(qid);
	}
}
