package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lgdetails",catalog="mcqdemodatabase")
public class Lgdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int lid;
	private String questionpapername;
	private String language;
	private String pattern;
	public Lgdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lgdetails(int lid, String questionpapername, String language, String pattern) {
		super();
		this.lid = lid;
		this.questionpapername = questionpapername;
		this.language = language;
		this.pattern = pattern;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getQuestionpapername() {
		return questionpapername;
	}
	public void setQuestionpapername(String questionpapername) {
		this.questionpapername = questionpapername;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
}
