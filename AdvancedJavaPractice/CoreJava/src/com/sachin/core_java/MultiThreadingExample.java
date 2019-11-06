package com.sachin.core_java;

public class MultiThreadingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TableFive five = new TableFive("table-five-thread");
		TableSix six = new TableSix("table-six-thread");
		five.start();
		six.setPriority(Thread.MAX_PRIORITY);
		five.yield();
		six.start();

	}

}

class TableFive extends Thread {
	public TableFive(String threadName) {
		super(threadName);
	}

	public void threadInfio() {
		System.out.println(" " + Thread.currentThread().getName());
		// System.out.println(" " + Thread.currentThread().getPriority());
	}

	public void run() {
		threadInfio();
		for (int i = 1; i <= 10; i++) {
			System.out.println(" " + i * 5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class TableSix extends Thread {
	public TableSix(String threadName) {
		super(threadName);
	}

	public void threadInfio() {
		System.out.println(" " + Thread.currentThread().getName());
		// System.out.println(" " + Thread.currentThread().getPriority());
	}

	public void run() {
		threadInfio();
		for (int i = 1; i <= 10; i++) {
			System.out.println(" " + i * 6);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}