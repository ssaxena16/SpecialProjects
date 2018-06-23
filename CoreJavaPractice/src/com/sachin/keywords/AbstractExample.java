package com.sachin.keywords;

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Super su = new Super(); Can not instance Abstact
		Super su = new Sub(); 
		su.m1();
		su.display();

	}

}

abstract class Super {
	abstract public void m1();

	public void display() {
		System.out.println("Abstct class ");
	}
}

class Sub extends Super {
	public void m1() {
		System.out.println("Implemented Abstact method in Sub class");
	}

}