package test;

import java.util.List;

public class Question {
	private int id;
	private String Qname;
	private List<String> answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return Qname;
	}
	public void setQname(String qname) {
		Qname = qname;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	
	
	
}
