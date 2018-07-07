package com.sachin.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		for(int i=1 ;i<=10 ;i++)
		{
			v.addElement(i);
		}
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(""+e.nextElement());
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i =1 ; i<=10;i++)
		{
			list.add(i);
		}
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			int i = (Integer)itr.next();
			if(i%2 == 0)
			{
				itr.remove();
			System.out.println(i);
	
			}
		}
		System.out.println(""+list);
		
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
		  System.out.println(""+listIterator.next());	
		}
		while(listIterator.hasPrevious())
		{
		  System.out.println(""+listIterator.previous());	
		}
		
		list.forEach(x -> System.out.println("xxx"+x));

	}

}
