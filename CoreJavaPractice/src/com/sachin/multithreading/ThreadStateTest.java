package com.sachin.multithreading;

public class ThreadStateTest implements Runnable {
     public static TestFirst threadFirst ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadFirst = new TestFirst();
		Thread thread = new Thread(threadFirst);
		System.out.println("Thread State1: "+thread.getState());
		thread.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name2: "+Thread.currentThread().getName());
		
		
	}

}

class TestFirst implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name1: "+ Thread.currentThread().getName());
		ThreadStateTest threadStateTest = new ThreadStateTest();
		Thread t = new Thread(threadStateTest);
		t.start();
		System.out.println("Thread State2:"+ t.getState());
		try
		{
			Thread.sleep(2000);
			System.out.println("Thread State2:"+ t.getState());

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}