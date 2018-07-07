package com.sachin.interfaces;

public class AnonymousInterface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface t = new TestInterface() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("Test is done");
				
			}
		};
		t.m1();

	}

}

interface TestInterface
{
	public void m1();
}