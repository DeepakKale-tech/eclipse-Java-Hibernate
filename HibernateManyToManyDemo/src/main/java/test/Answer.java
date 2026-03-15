package test;

import java.util.List;

public class Answer {
	private int id;
	private String ansname;
	private String postby;
	private List<Question> question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnsname() {
		return ansname;
	}
	public void setAnsname(String ansname) {
		this.ansname = ansname;
	}
	public String getPostby() {
		return postby;
	}
	public void setPostby(String postby) {
		this.postby = postby;
	}
	public List<Question> getQuestion() {
		return question;
	}
	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	
	
}
