package com.sachin.multithreading;

import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PC pc = new PC();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
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

	public static class PC {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int value = 0;
		final int CAPACITY = 2;

		public synchronized void produce() throws InterruptedException {
			while (true) {
				while (list.size() == CAPACITY)
					wait();
				list.add(value++);
				System.out.println("Producer" + value);
				notify();
				Thread.sleep(1000);
			}
		}

		public synchronized void consume() throws InterruptedException {
			while (true) {
				while (list.size() == 0)
					wait();
				int val = list.removeFirst();
				System.out.println("Consumer" + val);
				notify();
				Thread.sleep(1000);
			}
		}
	}

}
