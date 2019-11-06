package com.sachin.design_pattern;

public class PrototypeDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prototype prototype = new Student(101, "Rakesh");
		System.out.println(" " + prototype);
		System.out.println(" " + prototype.getClone());

	}

}

interface Prototype {
	public Prototype getClone();
}

class Student implements Prototype {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;

	}

	public Prototype getClone() {
		return new Student(rollNo, name);
	}

	public String toString() {
		return " " + rollNo + " " + name;
	}

}