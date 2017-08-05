package com.sachin.innerclass;

class Test3 
{
	public void display()
	{
		 int data =50;
		class TestInnerLocal
		{
			
			public void msg()
			{
				System.out.println("Message"+data);
			}
		}
		TestInnerLocal testlocal = new TestInnerLocal();
		testlocal.msg();
	}
	
}
public class TestLocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 test3 = new Test3();
		test3.display();
	}

}
