package com.sachin.important_programs;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 3, 2, 4, 7, 8, 8, 9, 1 };
		seletionSort(arr);

	}

	public static void seletionSort(int[] arr) {
		int lowest;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			lowest = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (lowest > arr[j]) {
					lowest = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = lowest;
			arr[index] = temp;
		}
		for (int a : arr) {
			System.out.print(" " + a);
		}
	}
}
