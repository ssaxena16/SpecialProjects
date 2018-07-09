package com.sachin.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInerfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i =0;i<5;i++)
		{
			queue.add(i);
		}
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		for(Integer a: queue)
		{
			System.out.println(a);
		}

	}

}
