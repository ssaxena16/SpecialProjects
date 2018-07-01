package com.sachin.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.lang.AutoCloseable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFileTest {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		// Using BufferedReader
		BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Programing\\filefolder\\object.txt")));
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println("" + str);
		}

		// FileReader
		// FileReader fileReader = new FileReader(new
		// File("F:\\Programing\\filefolder\\object.txt"));

		FileReader fileReader = new FileReader("F:\\Programing\\filefolder\\object.txt");
		int ch;
		while ((ch = fileReader.read()) != -1) {
			System.out.print("" + (char) ch);
		}
		System.out.println("");
		// Scanner Class
		Scanner sc = new Scanner(new File("F:\\Programing\\filefolder\\object.txt"));
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());

		}
		// Scanner Delimeter

		// sc.useDelimiter("\\Z");
		// System.out.println(""+sc.next());

		// Read file using list

		List<String> lines = new ArrayList<String>();
		String pathName = "F:\\Programing\\filefolder\\object.txt";
		lines = Files.readAllLines(Paths.get(pathName), StandardCharsets.UTF_8);
		Iterator<String> itr = lines.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Read a file using readAllBytes as String

		byte[] strFileContent = Files.readAllBytes(Paths.get(pathName));
		System.out.println(new String(strFileContent));
	}
}
