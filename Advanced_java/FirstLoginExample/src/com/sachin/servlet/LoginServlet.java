package com.sachin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.database.QueryUtil;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ServletConfig config = getServletConfig();
		System.out.println("Get Param Info== " + config.getInitParameter("Test1"));
		Enumeration<String> enumeration = config.getInitParameterNames();

		while (enumeration.hasMoreElements()) {
			System.out.println("" + enumeration.nextElement());
		}
		ServletContext context = getServletContext();
		System.out.println("Sevlet Context Param " + context.getInitParameter("ContextParamFirst"));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		String password = req.getParameter("passWord");
		Cookie[] co = req.getCookies();
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < co.length; i++) {
			map.put(co[i].getName(), co[i].getValue());
		}

		QueryUtil query = QueryUtil.getQueryObject();
		try {
			if (query.isUserAuthorized(userName, password)
					|| query.isUserAuthorized(map.get("userName"), map.get(password))) {
				Cookie userNameCookie = new Cookie("userName", userName);
				Cookie passwordCookie = new Cookie("password", password);

				resp.addCookie(userNameCookie);
				resp.addCookie(passwordCookie);
				RequestDispatcher rd = req.getRequestDispatcher("DisplayServlet");
				rd.forward(req, resp);
			} else {
				out.print("Sorry Wrong User or Password");
				RequestDispatcher rd = req.getRequestDispatcher("/index.html");
				rd.include(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
