package com.sachin.important_programs;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 3, 2, 4, 7, 8, 8, 9, 1 };
		insertionSort(arr);

	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>-1 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}

		for (int a : arr) {
			System.out.print(" " + a);
		}
	}

}