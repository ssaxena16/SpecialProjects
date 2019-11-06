package com.sachin.core_java;

import java.util.LinkedList;

public class ProcedureConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				pc.producer();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				pc.consumer();

			}
		});
		t1.start();
		t2.start();

	}

}

class PC {
	public LinkedList<Integer> list = null;
	public final int CAPACITY = 5;
	public int value = 0;

	public PC() {
		list = new LinkedList<Integer>();
	}

	public synchronized void producer() {
		while (true) {
			while (list.size() == CAPACITY) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			list.add(value++);
			System.out.println(" " + value);
			notifyAll();
		}
	}

	public synchronized void consumer() {
		while (true) {
			while (list.size() == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			list.removeFirst();
			notifyAll();
		}
	}
}
