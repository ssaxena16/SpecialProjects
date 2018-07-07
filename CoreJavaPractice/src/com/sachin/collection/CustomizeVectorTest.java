package com.sachin.collection;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomizeVectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizeVector<Integer> vector = new CustomizeVector<Integer>();
		vector.add(5);
		vector.add(8);
		vector.add(6);
		vector.add(11);
		vector.add(20);
		vector.remove(2);
		System.out.println(vector.get(2));
		
		vector.display();

	}

}

class CustomizeVector<E> {
	int size = 0;
	Object[] elementData;
	public static final int INTIAL_CAPACITY = 10;

	CustomizeVector() {
		elementData = new Object[INTIAL_CAPACITY];
	}

	public synchronized boolean add(E e) {
		ensureCapacity();
		elementData[size] = e;
		size = size + 1;
		return true;
	}

	public void ensureCapacity() {
		if (size == elementData.length) {
			elementData = Arrays.copyOf(elementData, 2 * INTIAL_CAPACITY);
		}
	}

	public synchronized E get(int index) {
		if (index < 0 || index >= size) {
			return (E) new NoSuchElementException("No element found");
		} else
			return (E) elementData[index];
	}

	public synchronized boolean remove(int index) {
		if (index < 0 || index >= size) {
			return false;
		} else {
			Object deletedObject = elementData[index];
			for (int i = index; i < size; i++) {
				elementData[i] = elementData[i + 1];
			}
			size--;
			return true;

		}

	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print("  " + elementData[i]);
		}
	}
}