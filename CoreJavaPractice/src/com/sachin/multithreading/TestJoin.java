package com.sachin.multithreading;

public class TestJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirstTest first = new FirstTest();
		SecondTest second = new SecondTest();
		Thread thread1 = new Thread(first);
		Thread thread2 = new Thread(second);
		// thread1.setPriority(Thread.MAX_PRIORITY);
		// thread2.setPriority(Thread.MIN_PRIORITY);

		thread2.start();
		thread2.join();
       System.out.println("Main...");
		thread1.start();
		// thread1.join();

	}

}

class FirstTest implements Runnable

{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("FirstTest: " + i);
		}

	}
}

class SecondTest implements Runnable

{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("SecondTest: " + i * 2);
		}

	}
}