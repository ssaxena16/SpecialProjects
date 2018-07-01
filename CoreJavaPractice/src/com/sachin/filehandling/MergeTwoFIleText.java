package com.sachin.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeTwoFIleText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Programing\\filefolder\\object.txt")));
		BufferedReader br1 = new BufferedReader(new FileReader(new File("F:\\Programing\\filefolder\\test.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("F:\\Programing\\filefolder\\test1.txt")));
		String str = null;
		String lineFile1 = null;
		String lineFinal2 = null;

		while ((str = br.readLine()) != null) {
			lineFile1 = str;
			lineFinal2 = br1.readLine();
			if (lineFile1 != null || lineFinal2 != null) {
				bw.write(lineFile1);
				bw.write(lineFinal2);
			}
		}
		br.close();
		br1.close();
		bw.close();

	}

}
