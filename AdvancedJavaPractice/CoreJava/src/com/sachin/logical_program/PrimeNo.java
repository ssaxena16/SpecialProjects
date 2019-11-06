package com.sachin.logical_program;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimeNos(100);

	}

	public static void printPrimeNos(int range) {
		for (int i = 1; i < range; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i == 2) {
					System.out.print(" " + i);
				} else if ( i % j == 0) {
					flag = false;
					break;
				} else {
					continue;
				}
			}

			if (flag && i !=1) {
				System.out.print(" " + i);
			}
		}
	}

}
