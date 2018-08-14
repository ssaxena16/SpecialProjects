package com.sachin.multithreading;

public class SleepMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyNine nine = new MultiplyNine();
		nine.start();

	}

}
class MultiplyNine extends Thread
{
	public  void run()
	{
		for(int i =1;i<=10;i++)
		{
			try
			{
				System.out.println(" "+i*10);
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}