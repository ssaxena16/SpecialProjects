package com.sachin.innerclass;

abstract class FirstTest
{
	abstract public void test();
	
}

class Test
{
	FirstTest firsttest = new FirstTest() {
		
		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("Testing for anony");
		}
	
	};
}
public class TestinnerAnony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();
		test.firsttest.test();
		
	}

}
