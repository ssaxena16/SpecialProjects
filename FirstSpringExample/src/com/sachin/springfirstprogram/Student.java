package com.sachin.springfirstprogram;

import java.util.List;

public class Student {
	private int rollNo;
	private String name ;
	private String program;
	private List<Subject> subject;

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo()
	{
		System.out.println("Name and RollNo Of Student is === "+name+"    "+rollNo+"  prgram is == "+program);
		System.out.println("Subject an Books:");
		for(Subject subj : subject)
		{
			System.out.println(""+subj.getSubjectName()+" "+subj.getBookName());
		}
	}
}
