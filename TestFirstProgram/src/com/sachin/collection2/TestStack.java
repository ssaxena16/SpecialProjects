package com.sachin.collection2;

class StackTest {
	public Object[] stack;
	int size;
	int index = -1;

	public StackTest(int size1) {
		this.size = size1;
		stack = new Object[size];
	}

	public void push(int element) {
		// int tempsize = size;
		if (index < size - 1) {
			index = index + 1;
			stack[index] = element;
		} else {
			System.out.println("Stack is overflow");
		}
	}

	public void pop() {
		if (index < 0) {
			System.out.println("Stack is underflow");
		} else {
			int element = (int) stack[index];
			System.out.println("Stack is removed " + element + "");
			index = index - 1;

		}
	}

	public void display() {
		for (int i = 0; i <= index; i++) {
			System.out.println("" + stack[i]);
		}
	}

}

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackTest stacktest = new StackTest(7);
		stacktest.push(10);
		stacktest.push(20);
		stacktest.push(30);
		stacktest.push(40);
		stacktest.push(50);
		stacktest.push(60);
		stacktest.push(60);
		// stacktest.push(60);
		stacktest.pop();
		stacktest.pop();
		stacktest.pop();
		stacktest.pop();
		stacktest.pop();
		stacktest.pop();
		stacktest.pop();
		stacktest.pop();
		stacktest.display();

	}

}
