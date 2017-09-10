package com.sachin.secondspringtest;

public class Address {
	private String streetNo;
	private String disticName;
	private String state;
	public Address()
	{
		
	}
	public Address(String streetNo, String disticName, String state)
	{
		this.streetNo = streetNo;
		this.disticName = disticName;
		this.state = state;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getDisticName() {
		return disticName;
	}
	public void setDisticName(String disticName) {
		this.disticName = disticName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String toString()
	{
		return (""+streetNo+"   "+disticName+"   "+state);
	}
}
