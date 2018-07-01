package com.sachin.reflection;

public class instanceofAndisInstanceTest {

	static boolean foo(Object obj, String className) throws ClassNotFoundException {
		return (Class.forName(className).isInstance(obj));
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Integer i = 10;

		boolean b = foo(i, "java.lang.Integer");
		System.out.println(b);

		A test = new A();
		System.out.println(test instanceof A);

	}

}

class A {

}
