package com.sachin.collection;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueCustomizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueTest<Integer> queue = new QueueTest<Integer>();
		queue.add(5);
		queue.add(6);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		System.out.println("Before remove ");
		queue.display();
		System.out.println("First element " + queue.peek());
		queue.remove();
		queue.display();

	}

}

class QueueTest<E> {
	int size = 0;
	Object[] elementData;
	private static final int INITIAL_CAPACITY = 10;

	public QueueTest() {
		// TODO Auto-generated constructor stub
		elementData = new Object[INITIAL_CAPACITY];
	}

	public boolean add(E e) {
		elementData[size] = e;
		size = size + 1;
		return true;
	}

	public boolean remove() {
		if (size == 0) {
			return false;
		} else {
			for (int i = 0; i < size; i++) {
				elementData[i] = elementData[i + 1];

			}
			size = size - 1;
			return true;

		}
	}

	public void ensureCapacity() {
		if (size == elementData.length) {
			elementData = Arrays.copyOf(elementData, 2 * INITIAL_CAPACITY);
		}
	}

	public E peek() {
		if (size == 0 || size > elementData.length) {
			throw new NoSuchElementException("NO element foound");
		} else {
			E e = (E) elementData[0];
			return e;
		}
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(" " + elementData[i]);
		}

	}
}
