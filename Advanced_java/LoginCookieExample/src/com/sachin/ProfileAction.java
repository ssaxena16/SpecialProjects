package com.sachin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileAction extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("link.html");
		rd.include(req, resp);
		String name = req.getCookies()[0].getValue();

		if (!name.equals("")) {
			out.print("<html><body>");
			out.print("<br>" + " Welcome To Profile Page " + name);
		} else

		{
			out.print("Wrong Data");
			rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);

		}

	}

}
