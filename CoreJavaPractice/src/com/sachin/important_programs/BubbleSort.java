package com.sachin.important_programs;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 3, 2, 4, 7, 8, 8, 9, 1 };
		bubbleSortArray(arr);

	}

	public static void bubbleSortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int a : arr) {
			System.out.print(" " + a);
		}
	}

}
