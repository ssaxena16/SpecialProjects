package com.sachin.iopackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("F:\\Programing\\object.txt"));
			bw = new BufferedWriter(new FileWriter("F:\\Programing\\abc.txt"));
			while (br.ready()) {
				System.out.println(br.readLine());

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
			bw.close();
		}

	}

}
