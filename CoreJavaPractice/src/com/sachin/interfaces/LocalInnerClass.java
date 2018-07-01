package com.sachin.interfaces;

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main mainClass = new Main(88);
		mainClass.display();

	}

}

class Main
{
	int a ;
	Main(int a)
	{
		this.a = a;
	}
	public void display()
	{
		class LocalClass
		{
			int b ;

			LocalClass(int b)
			{
				this.b= b;
			}
			
			public void localDisplay()
			{
				System.out.println("Local Class data "+b);
			}
			
            			
		}
		LocalClass localClass = new LocalClass(a);
		localClass.localDisplay();

		
	}
}