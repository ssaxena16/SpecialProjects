package com.sachin.collection;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Emp> queue = new PriorityQueue<Emp>();
		queue.add(new Emp(102, "Shyam") );
		queue.add(new Emp(103, "Ajay") );
		queue.add(new Emp(105, "Ariam") );
		queue.add(new Emp(141, "Ram") );
		queue.add(new Emp(101, "Ram1") );
		System.out.println(""+queue.peek());
		System.out.println(""+queue.poll());

		System.out.println(queue);

	}

}

class Emp implements Comparable<Emp>
{
	int empNo;
	String name;
	Emp(int empNo, String name)
	{
		this.empNo = empNo;
		this.name = name;
	}
	
	public String toString()
	{
		return empNo+"  "+name;
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return (this.empNo - o.empNo);
	}
}