package com.sachin.logical_program;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 6, 21, 3, 1, 7, 4 };
		bubbleSort(arr);

	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
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
