package com.sachin.multithreading;

public class MainThreadDeadlock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t =  Thread.currentThread();
		System.out.println("TTT");
		try
		{
		t.join();
		System.out.println("Never execute");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
