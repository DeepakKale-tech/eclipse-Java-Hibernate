package test;

import java.util.List;

public class Question {
	private int id;
	private String qname;
	private List<Answer> answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
}
