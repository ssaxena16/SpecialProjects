package com.sachin.collection2;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("First");
		linkedlist.add("Second");
		linkedlist.add("Third");
		linkedlist.add("Four");
		linkedlist.addFirst("Zero");
		linkedlist.add(2, "Thirs=d2");
		for(String str : linkedlist)
		{
			System.out.println(""+str);
			
		}
        System.out.println(""+linkedlist.getFirst() + "  middle "+ linkedlist.get(2)+"  "+linkedlist.getLast() );
	}

}
