package com.sachin.methods;

public class VarargsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first = new First();
		first.getNumbers(1, 2, 3, 4, 5, 8, 9);
		first.getOtherInfo(101, "first", 'a', 'b', 'c', 'd', 'e');

	}

}

class First {
	public void getNumbers(int... a) {
		for (int i : a) {
			System.out.println("" + i);
		}

	}

	public void getOtherInfo(int a, String name, char... d) {
		System.out.println("" + a);
		System.out.println("" + name);
		for (char ch : d) {
			System.out.println(ch);
		}
	}
}