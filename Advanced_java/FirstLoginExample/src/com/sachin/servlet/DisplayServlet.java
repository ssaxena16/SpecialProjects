package com.sachin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Test3" + req.getParameter("userName"));
		ServletContext context = getServletContext();
		System.out.println("Sevlet Context Param Display Servlet "+ context.getInitParameter("ContextParamFirst"));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello Servlet " + req.getParameter("userName") + "</h1>");
        out.print("</body></html>");

	}

}
