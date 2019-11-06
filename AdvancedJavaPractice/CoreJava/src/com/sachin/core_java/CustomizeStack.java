package com.sachin.core_java;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomizeStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= 10; i++) {
			stack.push(i);

		}
		stack.pop();
		stack.pop();
		stack.push(89);
		stack.display();

	}

}

class Stack<E> {
	public Object[] elementData = null;
	int top = -1;
	public static final int INITIAL_CAPACITYT = 10;

	public Stack() {
		elementData = new Object[INITIAL_CAPACITYT];
	}

	public void push(E element) {
		ensureSize(top + 1);
		top = top + 1;
		elementData[top] = element;

	}

	public E pop() {
		if (top > elementData.length || top == -1) {
			throw new NoSuchElementException();
		} else {
			E e = (E) elementData[top];
			top--;
			return e;
		}
	}

	public void ensureSize(int stackSize) {
		if (stackSize > elementData.length) {
			growAbleSize(stackSize);
		}
	}

	public void growAbleSize(int stackSize) {

		elementData = Arrays.copyOf(elementData, stackSize + INITIAL_CAPACITYT);
	}

	public void display() {
		if (top == -1) {
			throw new NoSuchElementException();
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.print(" " + elementData[i]);
			}
		}
	}

}
