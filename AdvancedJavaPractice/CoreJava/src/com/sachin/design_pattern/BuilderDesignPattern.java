package com.sachin.design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new Builder();
		builder.addCDInfo(new Sony());
		builder.getCDInfo();

	}

}

interface Packing {
	public String pack();
   
	public int price();
}

abstract class CD implements Packing {
	public abstract String pack();
}

abstract class Company extends CD {
	public abstract int price();
}

class Sony extends Company {

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Sony";
	}

}

class LG extends Company {

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "LG";
	}
}

class Builder {
	public List<Company> list = new ArrayList<Company>();

	public void addCDInfo(Company cmp) {
		list.add(cmp);

	}

	public void getCDInfo() {
		for (Company cmp : list) {
			System.out.println(" " + cmp.pack() + " " + cmp.price());
		}
	}
}    