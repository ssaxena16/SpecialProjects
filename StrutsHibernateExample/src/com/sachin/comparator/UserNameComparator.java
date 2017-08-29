package com.sachin.comparator;

import java.util.Comparator;

import com.sachin.persistence.User;

public class UserNameComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		// TODO Auto-generated method stub
		return (user1.getUsername().compareTo(user2.getUsername()));
	}

}
