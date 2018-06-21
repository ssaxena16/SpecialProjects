package com.sachin.array;

import java.util.ArrayList;

public class CustomArrayList {

	int n = 4;
		class Data
		{
			int rollNo;
			String name;
			int marks;
			Data(int rollNo, String name, int marks)
			{
				this.rollNo = rollNo;
				this.name = name;
				this.marks = marks;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CustomArrayList customArrayList = new CustomArrayList();
			int rollNo[] = {1,2,3,4};
			String name[] = {"st1","st2","st3","st4"};
			int marks[] = {56,89,88,70};
			ArrayList<Data> list = new ArrayList<Data>();
			for(int i =0 ;i< customArrayList.n ; i++)
			{
				list.add(customArrayList.new Data(rollNo[i], name[i], marks[i]));
			}
			for(int i =0 ;i<customArrayList.n;i++)
			{
				Data data = list.get(i);
				System.out.println(data.rollNo+"  "+data.name+ " " +data.marks);
			}
			
		}
	
			
		
		

	

}
