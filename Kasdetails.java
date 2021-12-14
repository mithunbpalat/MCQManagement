package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kasdetails",catalog="mcqdemodatabase")
public class Kasdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int kid;
	private String questionpapername;
	private String language;
	private String pattern;
	public Kasdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kasdetails(int kid, String questionpapername, String language, String pattern) {
		super();
		this.kid = kid;
		this.questionpapername = questionpapername;
		this.language = language;
		this.pattern = pattern;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
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
