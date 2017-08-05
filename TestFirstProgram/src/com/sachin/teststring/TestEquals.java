package com.sachin.teststring;
class Emp
{
	int id;
	String name;
	public Emp(int id , String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean flag = false;
		boolean flag1 = false;
		Emp emp = (Emp)obj;
		if(this.id == emp.id)
		{
			flag= true;
		}
		if(this.name.compareTo(emp.name)==0)
		{
			flag1 = true;
		}
		return flag && flag1;
	}
}
public class TestEquals {

	public static void main(String args[])
	{
		Emp emp1 = new Emp(20, "Akss");
		Emp emp2 = new Emp(20, "Akss");
	System.out.println(emp1.equals(emp2));
	System.out.println(emp2.hashCode());
	System.out.println(emp1.hashCode());
	}
}
