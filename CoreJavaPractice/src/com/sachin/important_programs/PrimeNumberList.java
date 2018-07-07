package com.sachin.important_programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		boolean flag = false;

		for (int i = 1; i < 50; i++) {
			flag = false;
			if (i == 1 || i == 2) {
				list.add(i);
				continue;
			}
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				list.add(i);
				continue;
			}
		}
		System.out.println(list);

	}

}
