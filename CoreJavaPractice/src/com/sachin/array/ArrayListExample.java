package com.sachin.array;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b= 8;
		int arr[] = new int[2];
		arr[0]= a;
		arr[1]= b;
		ArrayList list = new ArrayList();
		list.add(a);// compiler convert it into list.add(Integer.valueOf(1))
		list.add(b);
		list.add(3);
		list.add(4);
		
		Object[] elements = list.toArray();
		for(Object i : elements)
		{
			Integer k = (Integer)i; 
			System.out.println(""+k);
		}
		
		Integer[] moreElements = new Integer[list.size()];
		moreElements = (Integer[])list.toArray(moreElements);
		for(int element : moreElements)
		{
			System.out.println("000  "+element);
		}
		
		

	}

}
