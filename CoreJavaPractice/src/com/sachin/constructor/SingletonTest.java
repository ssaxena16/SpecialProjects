package com.sachin.constructor;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singletonInstance = Singleton.getInstance();
		singletonInstance.setVaue(100);
		System.out.println("Value " + singletonInstance.getValue());
		singletonInstance.setVaue(99);
		Singleton singletonInstance1 = Singleton.getInstance();

		System.out.println("Change Value " + singletonInstance1.getValue());

	}

}

class Singleton {
	private static Singleton instance = null;
	private int value;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void setVaue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}