package com.sachin.logical_program;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 6, 21, 3, 1, 7, 4 };
		Arrays.sort(arr);
		binarySearch(arr, 21);

	}

	public static void binarySearch(int arr[], int element) {
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] == element) {
				System.out.println("Element find at index " + mid);
				break;
			} else if (arr[mid] <  element) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element not found");
		}
	}

}
