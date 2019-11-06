package com.sachin.core_java;

public class Covarient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class P {

}

class Q extends P {

}

class Parent {
	public P test() {
		return new P();
	}

}

class Child extends Parent { // Child class Method return type should be subtype
								// of it's parent class return type.
	public Q test() {
		return new Q();
	}

}