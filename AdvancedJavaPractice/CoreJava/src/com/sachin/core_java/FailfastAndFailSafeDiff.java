package com.sachin.core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;;

public class FailfastAndFailSafeDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new CopyOnWriteArrayList<Integer>();
		
		for(int i =1;i<10;i++)
		{
			list.add(i);
			list1.add(i);
		}
		
		Iterator< Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			int i = itr.next();
			if(i== 5)
			{
				//list.remove(i-1); // Fail Fast ConcurrentmOdificationException
				itr.remove();;
			}
			else
			{
				System.out.print("   "+i);
			}
		}
		
		Iterator<Integer> itr1 = list1.iterator();
		while(itr1.hasNext())
		{
			int i = itr1.next();
			if(i==5)
			{
				list1.remove(i-1);
			}
			else {
				System.out.print("  "+i);
			}
		}

	}

}
