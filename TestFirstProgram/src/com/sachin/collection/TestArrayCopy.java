package com.sachin.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		Object arr1[] = new Object[5];
		
		List<Integer>  list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		arr1 = list.toArray();
		
		for(Object k : arr1)
		{
			System.out.println(""+k);
		}
		
		arr = Arrays.copyOf(arr, 8);
		
		for(int i : arr)
		{
			System.out.println(""+i);
		}

	}

}
