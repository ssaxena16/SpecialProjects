package com.sachin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("link.html");
		rd.include(req, resp);
		String userName = req.getParameter("userName");
		String passWord = req.getParameter("passWord");
		Cookie cookie = new Cookie("userName", userName);

		if ("sachin".equals(userName) && "admin23".equals(passWord)) {
			out.println("<html><body>");
			out.print("<h1>" + "Login with User " + userName + " " + "</h1>");
			resp.addCookie(cookie);

		} else {
			System.out.println("TestTest");
			

		}
	}

}
