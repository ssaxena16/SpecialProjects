package com.sachin.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Book
{
	int book_no;
	String authorName;
	String bookName;
	public Book(int book_no, String authorName, String bookName)
	{
		this.book_no = book_no;
		this.authorName = authorName;
		this.bookName = bookName;
	}
	
	public String toString()
	{
		return (""+book_no+"  "+authorName+"  "+bookName);
	}
}

public class TestLikedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Book book = new Book(101, "Sachin Saxena", "Mountain oF Thoughts");
	Book book1 = new Book(102, "Bala", "TestBook");
	Book book2 =  new Book(103, "ishana", "NewEra");
	
	List<Book> linklist = new ArrayList<Book>();
	linklist.add(book);
	linklist.add(book1);
	linklist.add(book2);
	ListIterator<Book> listitr = linklist.listIterator();
	while(listitr.hasNext())
	{
		//System.out.println("hii");
		Book b = listitr.next();
		System.out.println(""+b);
	}
	while(listitr.hasPrevious())
	{
		System.out.println("hii");
		Book b = listitr.previous();
		System.out.println(""+b);
	}
	
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("first");
	list1.add("Second");
	list1.add("Third");
	ListIterator<String> listitr1 = list1.listIterator();
	while(listitr1.hasPrevious())
	{
		System.out.println(""+listitr1.previous());
	}
	
	while(listitr1.hasNext())
	{
		System.out.println(""+listitr1.next());
	}
	
	ArrayList<String> list2 = (ArrayList<String>)list1.clone();
	/*ArrayList<String> al=new ArrayList<String>();  
	al.add("Amit");  
	al.add("Vijay");  
	al.add("Kumar");  
	al.add(1,"Sachin");  
	System.out.println("element at 2nd position: "+al.get(2));  
	ListIterator<String> itr=al.listIterator();  
	System.out.println("traversing elements in forward direction...");  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	System.out.println("traversing elements in backward direction...");  
	while(itr.hasPrevious()){  
	System.out.println(itr.previous());  
	}  
	*/
	/*for(Book b : linklist)
	{
		System.out.println(""+b);
	}*/
	}

}
