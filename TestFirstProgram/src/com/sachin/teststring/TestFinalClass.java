package com.sachin.teststring;

final class Employee
{ 
	final String panno ;
	public Employee(String panno)
	{
		this.panno = panno;
	}
	public String getPanNo()
	{
		return panno;
	}
	/*
	 * Can not create a getter setter for this class
	 * public void setPanNo(String panno)
	{
		this.panno = panno;
	}*/
}

public class TestFinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("25kh568lj");
       System.out.println(""+emp.panno);
	}

}
