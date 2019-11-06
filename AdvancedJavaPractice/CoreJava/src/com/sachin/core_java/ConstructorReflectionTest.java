package com.sachin.core_java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorReflectionTest {
	public ConstructorReflectionTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Test Test");
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class aClass = Class.forName("com.sachin.core_java.ConstructorReflectionTest");
		Constructor<ConstructorReflectionTest> construct = aClass.getConstructor();
		aClass.newInstance();

		ConstructorReflectionTest ctest = construct.newInstance();

	}

}
