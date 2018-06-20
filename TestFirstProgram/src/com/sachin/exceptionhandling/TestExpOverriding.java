package com.sachin.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Parent 
{
	public void test()  
	{
		
	}
}
class Child extends Parent
{
   public void test() throws ArithmeticException
   {
	   System.out.println("cdsf");
   }
}
public class TestExpOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
		child.test();
	}

}
