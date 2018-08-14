package com.sachin.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Semaphore sem = new Semaphore(1);
		MyThread thread1 = new MyThread("threadA", sem);
		MyThread thread2 = new MyThread("threadB", sem);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

	}

}

class Shared {
	public static int cout = 0;
}

class MyThread extends Thread {
	String threadName;
	Semaphore sem;

	MyThread(String threadName, Semaphore sem) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}

	public void run() {
		if (this.getName().equals("threadA")) {
			System.out.println("" + threadName + " is waiting..");
			try {
				sem.acquire();
				for (int i = 1; i <= 5; i++) {
					Shared.cout++;
					System.out.println("Thread " + Shared.cout);
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sem.release();
		} else {
			System.out.println("" + threadName + " is waiting..");
			try {
				sem.acquire();
				for (int i = 1; i <= 5; i++) {
					Shared.cout--;
					System.out.println("Thread " + Shared.cout);
					Thread.sleep(10);

				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sem.release();

		}
	}
}