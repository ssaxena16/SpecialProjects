package com.sachin.core_java;

public class DoubleLockingSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton singleton = Singleton.getInstance();
		singleton.getDisplay();

	}

}

class Singleton {
	private static volatile Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
				return instance;
			}
		}

		return instance;
	}

	public void getDisplay() {
		System.out.println(" TTTTTTTTTTT  ");
	}
}