package com.sachin.core_java;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomizeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
		for (int i = 0; i < 55; i++) {
			list.add(i);
		}

		list.remove(48);

		for (int i = 0; i < list.size; i++) {
			System.out.print(" " + list.get(i));

		}

		CustomArrayList<String> list1 = new CustomArrayList<String>();
		for (int i = 0; i < 8; i++) {
			list1.add("ABC" + i);
		}
		for (int i = 0; i < list1.size; i++) {
			System.out.print("  " + list1.get(i));
		}

	}

}

class CustomArrayList<E> {
	int size = 0;
	public static final int INITIAL_CAPACITY = 10;
	public Object[] elementData = null;

	public CustomArrayList() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	public Boolean add(E element) {
		ensureSizeOfArrayList(size + 1);
		elementData[size++] = element;
		return true;
	}

	public void ensureSizeOfArrayList(int arrayListSize) {
		if (arrayListSize > elementData.length) {
			growArrayListSize(arrayListSize);
		}

	}

	public void growArrayListSize(int arrayListSize) {
		elementData = Arrays.copyOf(elementData, (arrayListSize + INITIAL_CAPACITY / 2));
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index > size) {
			throw new NoSuchElementException();
		} else {
			Object obj = elementData[index];
			return (E) obj;
		}
	}

	public Boolean remove(int index) {
		if (index > size) {
			throw new NoSuchElementException();
		} else {

			for (int i = index; i <= size - 1; i++) {
				elementData[i] = elementData[i + 1];
			}
			size--;
			return true;
		}
	}

}