package com.sachin.topic.staic_or_dynamic_binding;

public class StaticBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dogs();
		animal.eat(); // Static binding
		animal.tail(); // dynamic binding

	}

}

class Animal {
	static void eat() {
		System.out.println("Animal Eat");
	}

	public void tail() {
		System.out.println("Animal tail");
	}
}

class Dogs extends Animal {
	static void eat() {
		System.out.println("Dog eat");
	}

	public void tail() {
		System.out.println("Dog tail");
	}

}
