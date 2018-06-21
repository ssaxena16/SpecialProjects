package com.sachin.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = i*5;
		}

		String[] str1 = {"first","second"};
		
		String[] copy = Arrays.copyOf(str1, 3);
		System.out.println("SSSS "+Arrays.toString(copy));


		String str = Arrays.toString(arr);
		System.out.println(""+str);
		int arr1[] = {1,8,6,9,5,7};
		Arrays.sort(arr1);
		System.out.println(""+Arrays.toString(arr1));
		System.out.println(""+Arrays.binarySearch(arr1,6));
		Arrays.fill(arr1, 5);
		System.out.println(""+Arrays.toString(arr1));
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(""+Arrays.toString(arr2));
		List<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("four");
		
		String[] stringArr = list.toArray(new String[list.size()]);
		for(String st : stringArr)
		{
			System.out.print("  "+st);
			
		}
		
		int arr3[][] = {{1,2},{3,4}};
		System.out.println(""+Arrays.deepToString(arr3));
		
		}

	
	}


