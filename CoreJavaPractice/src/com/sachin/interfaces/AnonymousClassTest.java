package com.sachin.interfaces;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test anonymousClass = 
						new Test()
						{
					     public void display()
					     {
					    	 System.out.println("Anonymous class ");
					     }
						};
				
				anonymousClass.display();

	}

}

class Test
{
	public void display()
	{
		System.out.println("dispaly");
	}
}