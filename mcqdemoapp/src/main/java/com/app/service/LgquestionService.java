package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.LgquestionRepository;
import com.app.model.Lgquestion;

@Service
public class LgquestionService {
	@Autowired
	private LgquestionRepository lgquestionRepository;
	
	public Lgquestion saveLgquestion(Lgquestion lgquestion) {
		return lgquestionRepository.save(lgquestion);
	}
	public Lgquestion updateLgquestion(Lgquestion lgquestion) {
		return lgquestionRepository.save(lgquestion);
	}
	public List<Lgquestion> getAllLgquestions() {
		return (List<Lgquestion>) lgquestionRepository.findAll();
	}
	public void deleteLgquestion(int qid) {
		lgquestionRepository.deleteById(qid);
	}
	public Lgquestion findLgquestionByQid(int qid) {
		return lgquestionRepository.findById(qid).get();
	}
}
