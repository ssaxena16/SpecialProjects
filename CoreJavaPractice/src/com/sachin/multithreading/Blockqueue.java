package com.sachin.multithreading;

import java.util.LinkedList;

public class Blockqueue<E> {
	LinkedList<E> blockList = new LinkedList<E>();
	int limit;

	public Blockqueue(int limit) {
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	public synchronized void enqueue(E e) {
		while (blockList.size() == limit)
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		if (blockList.size() == 0) {
			notifyAll();
		}
		blockList.add(e);
	}

	public synchronized E deQueue(E e) throws InterruptedException {
		while (blockList.size() == 0)
			wait();
		if (blockList.size() == limit)
			notifyAll();
		return blockList.removeFirst();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Blockqueue<Integer> queue = new Blockqueue<Integer>(10);

	}

}
