package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kasquestion",catalog="mcqdemodatabase")
public class Kasquestion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private String question;
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String correctcode;
	private String correctanswer;
	public Kasquestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kasquestion(int qid, String question, String a, String b, String c, String d, String e, String correctcode,
			String correctanswer) {
		super();
		this.qid = qid;
		this.question = question;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.correctcode = correctcode;
		this.correctanswer = correctanswer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public String getCorrectcode() {
		return correctcode;
	}
	public void setCorrectcode(String correctcode) {
		this.correctcode = correctcode;
	}
	public String getCorrectanswer() {
		return correctanswer;
	}
	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}
	
}
