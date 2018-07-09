package com.sachin.collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.addFirst(25);
		deque.add(25);
		deque.add(26);
		deque.offer(28);
		deque.offerFirst(21);
		deque.offer(5);
		deque.removeFirst();
		System.out.println(deque);

		Iterator<Integer> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println("" + itr.next());
		}

	}

}
