package com.sachin.collection;

public class StackInternal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(7);
		stack.push(5);
		stack.push(9);
		stack.push(88);
		stack.push(99);
		stack.push(100);
		stack.diplay();
		stack.pop();
		stack.diplay();

	}

}

class Stack {
	int size = 0;
	Object[] elementData;
	int index = -1;

	Stack(int n) {
		this.size = n;
		this.elementData = new Object[size];
	}

	public void push(Object element) {
		elementData[++index] = element;
		// size = size+1;

	}

	public boolean pop() {
		if (index == -1) {
			return false;
		} else {
			index = index - 1;

			return true;
		}
	}

	public void diplay() {
		if (index == -1) {
			System.out.println("No element present in Stack");
		} else {
			for (int i = 0; i <= index; i++) {
				System.out.println("" + elementData[i]);
			}
		}
	}
}