package com.sachin.methods;

public class ObjectCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DemoCopy demoCopy = new DemoCopy(5, 8);
		DemoCopy copyAssignmentDemoCopy = demoCopy;
		demoCopy.a = 88;// Copy with assignment operator
		System.out.println("demoCopy " + demoCopy);
		System.out.println("copyAssignmentDemoCopy " + copyAssignmentDemoCopy);
		DemoCopy cloneDemoCopy = (DemoCopy) demoCopy.clone();// copy using clone
		demoCopy.a = 98;
		System.out.println("demoCopy " + demoCopy);
		System.out.println("cloneDemoCopy " + cloneDemoCopy);

	}

}

class DemoCopy implements Cloneable {
	int a;
	int b;

	DemoCopy(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return a + "  " + b;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}