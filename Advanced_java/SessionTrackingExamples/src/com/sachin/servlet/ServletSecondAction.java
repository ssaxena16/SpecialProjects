package com.sachin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletSecondAction  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		String firstName = (String) session.getAttribute("first");
		String name = req.getParameter("uname");
		System.out.println("PPP "+name);
		out.print("<html><body>");
		out.print("<h1>" + "Welcome to servlet " + firstName + "</h1>");
	}

	
}
