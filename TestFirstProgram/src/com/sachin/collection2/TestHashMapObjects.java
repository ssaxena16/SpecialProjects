package com.sachin.collection2;

import java.util.HashMap;
import java.util.Map;

class Book
{
	int id;
	String bookName;
	String authoeName;
	public Book(int id, String bookName, String authorName)
	{
		this.id = id;
		this.bookName = bookName;
		this.authoeName = authorName;
	}
	public String toString()
	{
		return (" "+id+"   "+bookName+ "   "+authoeName);
	}
}
public class TestHashMapObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(101, "FirstBook", "test1");
		Book book2 = new Book(102, "SecondBook", "test2");
		Book book3 = new Book(103, "ThirdBook", "test3");
		Book book4 = new Book(104, "FOurBook", "test4");
		
		Map<Integer, Book> map = new HashMap<Integer,Book>();
		map.put(1, book1);
		map.put(2, book2);
		map.put(3, book3);
		map.put(4, book4);
		for(Map.Entry book : map.entrySet())
		{
			
			System.out.println(""+book.getKey()+"   "+book.getValue());
		}
	}

}
