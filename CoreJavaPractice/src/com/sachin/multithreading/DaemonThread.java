package com.sachin.multithreading;

public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDaemonThread thread1 = new MyDaemonThread();
		MyDaemonThread thread2 = new MyDaemonThread();

		thread1.setDaemon(true);

		thread1.start();
		thread2.start();

	}

}

class MyDaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Thread is Daemon: " + Thread.currentThread().getName());
		} else {
			System.out.println("Thread is Normal: " + Thread.currentThread().getName());
		}
	}
}