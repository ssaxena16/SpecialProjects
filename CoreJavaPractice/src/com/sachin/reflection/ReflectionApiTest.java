package com.sachin.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApiTest {

	String str = "";

	public ReflectionApiTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
	}

	public void method1(int a) {
		System.out.println("method1 " + a);
	}

	public void method2() {
		System.out.println("method2 " + str);
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		ReflectionApiTest test = new ReflectionApiTest();
		Class cls = test.getClass();
		System.out.println("Class Name " + cls.getName());
		Constructor constructor = cls.getConstructor();
		System.out.println("Constructor Name " + constructor.getName());
		Method[] methods = cls.getMethods();
		for (Method m : methods) {
			System.out.println("Method  " + m.getName());
		}
		Method classDeclared = cls.getDeclaredMethod("method1", int.class);
		classDeclared.invoke(test, 18);

		Field field = cls.getDeclaredField("str");
		field.setAccessible(true);
		field.set(test, "TTTTT");
		Method delaedMethod2 = cls.getDeclaredMethod("method2");
		delaedMethod2.invoke(test);

	}

}
