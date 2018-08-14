package com.sachin.multithreading;

public class ThreadPriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first = new First();
		Second second = new Second();
		Thread thread1 = new Thread(first);
		Thread thread2 = new Thread(second);
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();

	}

}

class First implements Runnable

{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	 for(int i =1;i<=10;i++)
	 {
		 System.out.println("First: "+i);
	 }
		
	}
}

class Second implements Runnable

{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	 for(int i =1;i<=10;i++)
	 {
		 System.out.println("Second: "+i*2);
	 }
		
}
}

	
