package com.sachin.listeners;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class LoginListener implements HttpSessionListener{
     static int userCount = 0;
	@Override
	public void sessionCreated(HttpSessionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("AAAAAAAAAAAAAAAAA");

		userCount++;
		HttpSession session = e.getSession();
		session.setAttribute("userCount", userCount);
		System.out.println("Count Value ===> "+userCount);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent e) {
		// TODO Auto-generated method stub
		HttpSession session = e.getSession();
		userCount--;
		session.setAttribute("userCount", userCount);
		
	}
	

}
