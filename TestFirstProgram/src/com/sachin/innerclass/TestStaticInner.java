package com.sachin.innerclass;

class TestStaticIn
{
	static int data = 56;
	static class StaticInner
	{
		public static void msg()
		{
			System.out.println("Message "+data);
		}
	}
}
public class TestStaticInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestStaticIn.StaticInner.msg();
	}

}
