package com.sachin.topic.static_java; // Static Order based on the program which you mentioned in program

public class StaticOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StaticTest staticTest = new StaticTest();
		System.out.println(StaticTest.a);

	}

}

class StaticTest {
	static int a = staticMethod();

	static {
		System.out.println("Static Block");
	}

	static int staticMethod() {
		System.out.println("Static Method");
		return 5;
	}
}
