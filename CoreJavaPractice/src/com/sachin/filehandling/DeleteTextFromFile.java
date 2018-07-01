package com.sachin.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteTextFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("");
		BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Programing\\filefolder\\object.txt")));

		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("F:\\Programing\\filefolder\\test.txt")));

		String str="";
		String line = "";
		while((str = br.readLine()) != null)
		{
			line = str;
			if(line.contains("citizen."))
			{
				//StringBuilder sb = new StringBuilder(line);
				String[] arr = line.split(" ");
				StringBuilder sb = new StringBuilder();
				

				for(int i = 0; i< arr.length ;i++)
				{
					if(arr[i].equals("citizen."))
					{
						sb.append(" ");
					}
					else
					{
						sb.append(arr[i]);
						sb.append(" ");

					}

					
				}
				line = sb.toString();
				
			}
			bw.write(line);
			
		}
		br.close();
		bw.close();
		

	}

}
