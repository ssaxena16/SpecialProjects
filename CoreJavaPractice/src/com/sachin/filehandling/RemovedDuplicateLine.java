package com.sachin.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class RemovedDuplicateLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Programing\\filefolder\\object.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("F:\\Programing\\filefolder\\test.txt")));

		/*
		 * String line1 = null; String line2 = null; String str = null; boolean
		 * flag = false; while ((str = br.readLine()) != null) { line1 = str; if
		 * (line1.equals(line2)) { flag = true; break; } if (!flag) {
		 * bw.write(line1); } line2 = line1;
		 * 
		 * }
		 */
		
		String str = null;
		HashSet<String> hs = new HashSet<>();
		while ((str = br.readLine()) != null) {
			if (hs.add(str)) {
				bw.write(str);

			} else {
				break;
			}

		}

		br.close();
		bw.close();

	}

}
