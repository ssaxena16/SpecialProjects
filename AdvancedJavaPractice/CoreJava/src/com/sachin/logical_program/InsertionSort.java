package com.sachin.logical_program;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 6, 21, 3, 1, 7, 4 };
		insertionSort(arr);

	}
	
	public static void insertionSort(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			int key = arr[i];
			int j =i-1;
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j] ;
				j =j -1;
			}
			
			arr[j+1] = key;
		}
		
		for(int a: arr)
		{
			System.out.print(" "+a);
		}
		
	}

}
