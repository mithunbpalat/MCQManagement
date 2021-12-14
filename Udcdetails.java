package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="udcdetails",catalog="mcqdemodatabase")
public class Udcdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	private String questionpapername;
	private String language;
	private String pattern;
	public Udcdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Udcdetails(int uid, String questionpapername, String language, String pattern) {
		super();
		this.uid = uid;
		this.questionpapername = questionpapername;
		this.language = language;
		this.pattern = pattern;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
