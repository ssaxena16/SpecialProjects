package com.sachin.multithreading;

public class SyncronizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender = new Sender();
		MultiThrad t1 = new MultiThrad("Hi First", sender);
		MultiThrad t2 = new MultiThrad("Hi second msg", sender);
		t1.start();
		t2.start();
	}

}

class Sender {
	public void send(String msg) {
		System.out.println("Msg is " + msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Now i am relaxed");
	}
}

class MultiThrad extends Thread {
	String msg;
	Sender snd;

	MultiThrad(String msg, Sender snd) {
		this.msg = msg;
		this.snd = snd;
	}

	public void run() {
		synchronized (snd) {
			snd.send(msg);

		}
	}

}