package com.sachin.collection2;

class Queue {
	Object queue[];
	int size1;
	int font = -1;
	int rear = -1;

	public Queue(int size) {
		this.size1 = size;
		this.queue = new Object[size1];
	}

	public void push(int element) {
		if (rear == size1 - 1) {
			System.out.println("Queue is overflow");
		} else {
			if (font == -1 && rear == -1) {
				font = font + 1;
			}
			rear = rear + 1;
			queue[rear] = element;
		}
	}

	public void pop() {
		if (font == -1 && rear == -1) {
			System.out.println("Queue is underflow");
		} else if (font > rear) {
			System.out.println("Element can not deleted from queue");
		} else {
			System.out.println("Element " + queue[font] + " delete from queue");
			font = font + 1;

		}
		// return 0;
	}

	public void display() {
		if (font == -1 && rear == -1) {
			System.out.println("Queue is underflow");
		} else {
			for (int i = font; i <= rear; i++) {
				System.out.println("" + queue[i]);
			}
		}
	}
}

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue(4);
		queue.push(2);
		queue.push(4);
		queue.push(6);
		queue.push(8);
		queue.pop();
		queue.push(7);
		queue.push(9);
		queue.display();

	}

}
