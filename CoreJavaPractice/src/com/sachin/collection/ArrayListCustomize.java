package com.sachin.collection;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayListCustomize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizeArrayList<Integer> list = new CustomizeArrayList<Integer>();
		list.add(5);
		list.add(8);
		list.add(6);
		list.add(11);
		list.add(20);
		list.remove(2);
		System.out.println(list.get(2));

		list.display();

	}

}

class CustomizeArrayList<E> {
	int size = 0;
	Object[] elementData;
	public static final int INTIAL_CAPACITY = 10;

	CustomizeArrayList() {
		elementData = new Object[INTIAL_CAPACITY];
	}

	public  boolean add(E e) {
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

	public  E get(int index) {
		if (index < 0 || index >= size) {
			return (E) new NoSuchElementException("No element found");
		} else
			return (E) elementData[index];
	}

	public  boolean remove(int index) {
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