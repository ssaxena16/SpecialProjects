package com.sachin.core_java;

public class StaticOverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.test();
		A a = new B();
		a.test();

	}

}

class A {

	public static void test() {
		System.out.println("A");
	}
}

class B extends A {
	public static void test() {
		System.out.println("B");
	}
}