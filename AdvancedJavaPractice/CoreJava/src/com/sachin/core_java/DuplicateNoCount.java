package com.sachin.core_java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,4,5};
		
		System.out.println(" "+get(arr, 4));

	}
	
	public static int get(int[] input, Integer number)
	{
		Integer sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<input.length;i++)
		{
			if(map.containsKey(input[i]))
			{
				map.put(input[i], map.get(input[i])+1);
				
			}
			else
			{
				map.put(input[i], 1);
			}
			
			sum = sum+input[i];
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			int key = entry.getKey();
			int value = entry.getValue();
			if(key== number )
			{
				if(value>= input.length/2)
				{	
				return 1;
				}
				else
				{
					return -1;
				}
			}
			
			
		}
		return 0;
	}

}
