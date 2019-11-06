package com.sachin.logical_program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(new File(
				"F:\\Programing\\AdvancedJavaPractice\\CoreJava\\src\\com\\sachin\\logical_program\\read.txt"));
		int i;
		StringBuilder word = new StringBuilder("");

		while ((i = fis.read()) != -1) {
			char ch = (char) i;
			if (ch == ' ') {
				System.out.print(" " + word);
				word = new StringBuilder("");

			} else {
				word.append(ch);
   			}

		}

	}

}
