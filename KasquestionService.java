package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.KasquestionRepository;
import com.app.model.Kasquestion;

@Service
public class KasquestionService {
	@Autowired
	private KasquestionRepository kasquestionRepository;
	
	public Kasquestion saveKasquestion(Kasquestion kasquestion) {
		return kasquestionRepository.save(kasquestion);
	}
	public Kasquestion updateKasquestion(Kasquestion kasquestion) {
		return kasquestionRepository.save(kasquestion);
	}
	public List<Kasquestion> getAllKasquestions() {
		return (List<Kasquestion>) kasquestionRepository.findAll();
	}
	public void deleteKasquestion(int qid) {
		kasquestionRepository.deleteById(qid);
	}
	public Kasquestion findKasquestionByQid(int qid) {
		return kasquestionRepository.findById(qid).get();
	}
}
