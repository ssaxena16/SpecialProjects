package com.sachin.servletexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userName = req.getParameter("userName");
		String password = req.getParameter("passWord");
		String action = req.getParameter("action");

		TestAction test = new TestAction();
		if ("login".equals(action)) {
			test.testAction(userName, password);
		} else {
			test.testAction("Hello", "World");
		}
		System.out.println("" + getServletContext().getRealPath(""));

		if ("test".equals(userName) && "test".equals(password)) {
			resp.sendRedirect("success.html");
		} else {
			PrintWriter out = resp.getWriter();
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.html");
			rd.include(req, resp);
		}

	}

}
