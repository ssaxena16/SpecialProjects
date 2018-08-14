package com.sachin.multithreading;

public class InterCommunicationTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Producer producer = new Producer();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		Consumer consumer = new Consumer();
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
	}

}

class Producer {
	public void produce() throws InterruptedException {
		synchronized (this) {

			System.out.println("It is producing something..");
			wait();
			System.out.println("Again Producing something");
		}
	}

}

class Consumer {
	public void consume() throws InterruptedException {
		synchronized (this) {
			System.out.println("It is consume everything...");
			for (int i = 1; i < 4; i++) {
				System.out.println("Consume: " + i * 3);
			}
			notify();
			Thread.sleep(2000);

		}

	}

}