package com.sachin.multithreading;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared1 shared1 = new Shared1();
		Shared2 shared2 = new Shared2();
		Thread1 thread1 = new Thread1(shared1,shared2);
		Thread2 thread2 = new Thread2(shared1, shared2);
		thread1.start();
		thread2.start();

	}

}

class Shared1 {
	public synchronized void test1(Shared2 s2) {
		System.out.println("Shared1 Calling...");
		s2.test2(this);

	}

}

class Shared2 {
	public synchronized void test2(Shared1 s1) {
		System.out.println("Shared2 calling...");
		s1.test1(this);
	}

}

class Thread1 extends Thread {
	Shared1 s1;
	Shared2 s2;

	public Thread1(Shared1 s1, Shared2 s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s1.test1(s2);
	}
}

class Thread2 extends Thread {
	Shared1 s1;
	Shared2 s2;

	public Thread2(Shared1 s1, Shared2 s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s2.test2(s1);
	}
}