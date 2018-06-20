package com.sachin.io;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatterExample {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		double num = 123.56874;
		int a = 123456;
		System.out.printf("Data display with formating : %.2f", num); // print method get two arguments
		System.out.println("");
		DecimalFormat decimalFormat = new DecimalFormat("#,####");
		System.out.printf("fghh "+decimalFormat.format(a));
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Date is == "+formatter.format(date));
		
		String dateString = "12/06/2017";
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date dd = formatter.parse(dateString);
		System.out.println(dd);
		

	}

}
