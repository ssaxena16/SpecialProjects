package com.sachin.keywords;

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.display();

	}

}

class Parent {
	int value = 10;
	int a, b;

	Parent() {

	}

	Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void message() {
		System.out.println("Parent class");
	}

}

class Child extends Parent {
	int value = 9;
	int a;

	Child() {
		System.out.println("Child class constructor");
	}

	Child(int a, int b) {
		super(a, b);
	}

	public void display() {
		System.out.println("Value is == " + super.value);
		message();
		super.message();
	}

	public void message() {
		System.out.println("Child class");
	}

}