package com.sachin.multithreading;

public class YieldMethodTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiplyFive five = new MultiplyFive();
		MultiplySix six = new MultiplySix();
		Thread thread1 = new Thread(five);
		Thread thread2 = new Thread(six);
		thread1.setPriority(1);
		thread2.setPriority(10);
		thread1.start();
		//thread2.join();
		thread2.start();

	}

}

class MultiplyFive implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(" five: " + i * 5);
			Thread.yield();
		}

	}

}

class MultiplySix implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(" six: " + i * 6);
			Thread.yield();

		}

	}

}