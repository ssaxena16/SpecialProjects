package com.sachin.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 9, 5, 7, 6, 21, 11, 21 };
		getSerachElementIndex(11, arr);

	}

	public static void getSerachElementIndex(int searchElement, int[] arr)
	{
		int first = 0;
		int last = arr.length-1;
		int mid = (first+last)/2;
		while(last>= first)
		{
			
			if(arr[mid] == searchElement)
			{
				System.out.println("Index: "+mid);
				break;
			}
			else if(arr[mid] < searchElement)
			{
				first = mid+1;
			}
			else
			{
				last = mid -1;
			}
			mid = (first+last)/2;
			
		}
	}

}
