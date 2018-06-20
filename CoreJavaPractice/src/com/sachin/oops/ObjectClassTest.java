package com.sachin.oops;

public class ObjectClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp(101,"Ajay");
		Emp emp2 = new Emp(101,"Ajay");
		if (emp1.equals(emp2))

		{
			System.out.println("emp1 and emp2 Object are same");
		}
		else 
		{
			System.out.println("Not same");
		}
		emp1.mehodValue();
		emp1 = null;
		emp2 = null;
		System.gc();
		
	}

}

class Emp
{
	
	int empNo;
	String name;
	static int code = 45784;
	private int value = 10;
	Emp(int empNo, String name)
	{
		this.empNo = empNo;
		this.name = name ;
		code++;
		
	}
	public void mehodValue()
	{
		int value = 50;
		System.out.println("Value from local"+value);
		System.out.println("Instance value"+this.value);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Emp obj1 = (Emp)obj;
		return (this.empNo == obj1.empNo && this.name.equals(obj1.name));
	}
	  @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return code;
	}
	  
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize method is call");
	}  
}