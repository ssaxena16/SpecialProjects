package com.sachin.core_java;

public class SumOfNoInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("  " + sumOfNoInExistingString("imn11ab12c4"));
	}

	public static int sumOfNoInExistingString(String str) // imn11ab12c4
	{
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int total = 0;
			int k = str.charAt(i);
			if (k > 48 && k < 58) {
				total = Integer.parseInt("" + str.charAt(i));

				int j = 0;
				for (j = i + 1; j < str.length(); j++) {
					k = str.charAt(j);
					if (k > 48 && k < 58) {
						total = total * 10 + Integer.parseInt("" + str.charAt(j));

					} else {
						i = j;
						break;
					}

				}
				sum = sum + total;

			}
		}
		return sum;

	}

}
