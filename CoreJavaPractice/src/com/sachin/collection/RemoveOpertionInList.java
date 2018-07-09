package com.sachin.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveOpertionInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Four");
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			String str = (String)itr.next();
			if(str.equals("Second"))
				//list.remove(str);
				itr.remove();
			else
				System.out.println(""+str);
		}

	}

}
