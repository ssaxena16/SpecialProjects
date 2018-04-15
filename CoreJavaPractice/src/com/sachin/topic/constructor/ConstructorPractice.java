package com.sachin.topic.constructor;

public class ConstructorPractice {
	private ConstructorPractice() {
		// TODO Auto-generated constructor stub
		System.out.println("Test private Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPractice constructorPractice = new ConstructorPractice();
		ConstructorTest constructorTest = new ConstructorTest(5, "test");
		System.out.println("-------------------------------");
		ConstructorTest childConstructor = new ChildConstructorTest(56, "MOhit", 28);
		System.out.println(childConstructor);

	}

}

class ConstructorTest {
	public int number;
	public String name;

	public ConstructorTest() {
		// TODO Auto-generated constructor stub
		System.out.println("No parametrized constructor");

	}

	public ConstructorTest(int number) {
		this();
		this.number = number;
		System.out.println("One argumant constructor");
	}

	public ConstructorTest(int number, String name) {
		this(number);
		// this.number = number;
		this.name = name;
		System.out.println("two argumant constructor");
		System.out.println("No is " + this.number);
		System.out.println("No is " + this.name);
	}

}

class ChildConstructorTest extends ConstructorTest {
	int age;

	public ChildConstructorTest(int number, String name, int age) {
		// TODO Auto-generated constructor stub
		super(number, name);
		this.age = age;
		System.out.println("Child class Constructor");
	}

	public String toString() {
		return "Number "+ number+" Name "+ name+" Age " + age;
	}
	public void getData()
	{
		System.out.println(""+super.number);
	}
}