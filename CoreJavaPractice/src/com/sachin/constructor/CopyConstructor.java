package com.sachin.constructor;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first = new First(7,8);
		First firstCopy = new First(first);
		System.out.println(first);
		System.out.println("Copy Object "+firstCopy);

	}

}

class First 
{
	int a,b;
	First(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	First(First f)
	{
		a=f.a;
		b=f.b;
	}
	public String toString()
	{
		return a+"  "+b;
	}
}