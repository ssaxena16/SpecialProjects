package com.sachin.persistent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {
	private int questionNo;
	private String question;
	private Set<String> answer;
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	

}
