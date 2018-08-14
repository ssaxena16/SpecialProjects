package com.sachin.multithreading;

public class JoinMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiSecond second = new MultiSecond();
		MultiThird third = new MultiThird();
		second.start();
		try {
			second.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		third.start();

	}

}

class MultiSecond extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Second: " + i * 2);
		}
	}
}

class MultiThird extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Third: " + i * 3);
		}
	}
}