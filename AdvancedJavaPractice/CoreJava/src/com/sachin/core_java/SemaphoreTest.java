package com.sachin.core_java;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore sem = new Semaphore(1);
		Thread t1 = new Thread(new MyThread(sem));
		Thread t2 = new Thread(new MyThread(sem));
		t1.start();
		t2.start();

	}

}

class Shared {
	public static int count = 0;
}

class MyThread implements Runnable {
	Semaphore sem;

	public MyThread(Semaphore sem) {
		// TODO Auto-generated constructor stub
		this.sem = sem;
	}

	public void run() {
		if (Thread.currentThread().getName().equals("mythread-1")) {
			try {
				sem.acquire();
				Shared.count++;
				System.out.println(Thread.currentThread().getName() + "  " + Shared.count);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				sem.acquire();

				Shared.count--;
				System.out.println(Thread.currentThread().getName() + "  " + Shared.count);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
