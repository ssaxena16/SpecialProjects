package com.sachin.core_java;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomizeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<Integer>();
		for (int i = 1; i <= 8; i++) {
			queue.add(i);
		}
		queue.display();
		queue.remove();
		System.out.println();
		queue.display();

	}

}

class Queue<E> {
	public Object[] elementData = null;
	int rear = 0;
	int front = 0;
	public static final int INITIAL_CAPACITY = 10;

	public Queue() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	public void add(E element) {
		if (rear > elementData.length)
			throw new NoSuchElementException();
		else {
			ensureSize(rear + 1);
			elementData[rear] = element;
			rear = rear + 1;

		}

	}

	public void remove() {
		if (front == rear)
			throw new NoSuchElementException();
		else {
			front = front + 1;
		}
	}

	public void ensureSize(int stackSize) {
		if (stackSize > elementData.length) {
			growAbleSize(stackSize);
		}
	}

	public void growAbleSize(int stackSize) {

		elementData = Arrays.copyOf(elementData, stackSize + INITIAL_CAPACITY);
	}

	public void display() {
		if (front == rear)
			throw new NoSuchElementException();
		else {
			for (int i = front; i < rear; i++) {
				System.out.print(" " + elementData[i]);
			}
		}
	}

}