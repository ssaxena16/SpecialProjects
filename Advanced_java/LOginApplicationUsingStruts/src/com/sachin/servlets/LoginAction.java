package com.sachin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.dao.UserDao;

public class LoginAction  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(UserDao.isAthuntication(req.getParameter("userName"), req.getParameter("password")))
		{
			out.print("<html><body");
			out.print("<h1>Login Sucessfully</h1>");
			out.print("<a href = 'index.html'> Back </a>");
			out.print("</body></html>");
		}
		else
		{
			out.println("Wrong User or Password");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			
		}
	}
	

}
