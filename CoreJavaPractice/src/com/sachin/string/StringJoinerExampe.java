
package com.sachin.string;

import java.util.StringJoiner;

public class StringJoinerExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sj = new StringJoiner(",");
		sj.setEmptyValue("empty string");
		System.out.println(sj);
		sj.add("Sachin").add("Saxena");
		System.out.println(sj);

	}

}
