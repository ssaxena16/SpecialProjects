package com.sachin.core_java;

public class TestConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.display();

	}

}

class Test {

	public int display(int a) {
		//test();
		//System.out.println("Display");
		return 1;
	}

	public float display() {
		//System.out.println("Test1");
		return (float)0.8;
	}

}


class BA
{
	public BA a()
	{
		return new BA();
	}
	
}

class Ch extends BA
{
	public Ch a()
	{
		return new Ch();
	}
}