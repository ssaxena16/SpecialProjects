package com.sachin.important_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5,6,7};
		List<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
		/*list = Arrays.asList(arr);
		
		Collections.reverse(list);
*/		System.out.println(arr[arr.length-3]);

	}

}
