package com.sachin.collection2;

import java.util.TreeSet;

class Country implements Comparable<Country>
{
	String name;
	int countrypin;
	public Country(String name, int countrypin)
	{
		this.name = name;
		this.countrypin = countrypin;
	}
	
	public int compareTo(Country o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	public String toString()
	{
		return (""+name +"  "+countrypin);
	}
}
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country count1 = new Country("India", 91);
		Country count2 = new Country("USA", 01);
		Country count3 = new Country("UK", 05);
		Country count4 = new Country("PAK", 101);
		Country count5 = new Country("Rusia", 65);
		TreeSet<Country> ts  = new TreeSet<Country>();
		ts.add(count1);
		ts.add(count2);
		ts.add(count3);
		ts.add(count4);
		ts.add(count5);
		//ts.add("Rusia");
		for(Country str : ts)
		{
			System.out.println(""+str);
		}

	}

}
