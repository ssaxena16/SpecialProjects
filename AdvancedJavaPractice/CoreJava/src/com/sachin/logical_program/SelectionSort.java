package com.sachin.logical_program;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 6, 21, 3, 1, 7, 4 };
		getSelectionSort(arr);
		System.out.println("_________________________________");
		for (int a : arr) {
			System.out.print(" " + a);
		}

	}

	public static void getSelectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					int temp = min;
					min = arr[j];
					arr[j] = temp;
				}
			}
			arr[i] = min;

		}

		for (int a : arr) {
			System.out.print(" " + a);
		}

	}

}
