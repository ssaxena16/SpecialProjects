package com.sachin.multithreading;

public class MainThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("ThreadName: " + t.getName());
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("" + t.getPriority());
		for (int i = 0; i < 5; i++) {
			System.out.println("MainThread");
		}
		ChildThread ct = new ChildThread();
		ct.setPriority(Thread.MIN_PRIORITY);
		System.out.println(ct.getPriority());
		ct.start();

	}

}

class ChildThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("ChildThread");
		}
	}
}