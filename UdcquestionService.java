package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UdcquestionRepository;
import com.app.model.Udcquestion;

@Service
public class UdcquestionService {
	@Autowired
	private UdcquestionRepository udcquestionRepository;
	
	public Udcquestion saveUdcquestion(Udcquestion udcquestion) {
		return udcquestionRepository.save(udcquestion);
	}
	public Udcquestion updateUdcquestion(Udcquestion udcquestion) {
		return udcquestionRepository.save(udcquestion);
	}
	public List<Udcquestion> getAllUdcquestions() {
		return (List<Udcquestion>) udcquestionRepository.findAll();
	}
	public void deleteUdcquestion(int qid) {
		udcquestionRepository.deleteById(qid);
	}
	public Udcquestion findUdcquestionByQid(int qid) {
		return udcquestionRepository.findById(qid).get();
	}
}
