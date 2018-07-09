package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		list.add(new User(506,"aasingh"));
		list.add(new User(102,"nsaxena"));
		list.add(new User(101,"jiit"));
		list.add(new User(105,"pratap09"));
		list.add(new User(103,"llsin"));
		Collections.sort(list);
		for(User user : list)
		{
			System.out.println(user);
		}

	}

}

class User implements Comparable<User>
{
	int userId;
	String userName;
	User(int userId, String userName)
	{
		this.userId = userId;
		this.userName = userName;
	}
	public String toString()
	{
		return userId+"    "+userName;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.userId - o.userId;
	}
}