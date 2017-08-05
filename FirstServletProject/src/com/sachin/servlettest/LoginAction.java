package com.sachin.servlettest;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
		String passWord = req.getParameter("passWord");
		String usernameDataBase = "";
		String passwordDatabase = "" ;
		Connection con = null;
		Statement smt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase", "root", "Sachin123$");
			
			smt = con.createStatement();
			
			String sql = "Select * from test_table";
			ResultSet rs  = smt.executeQuery(sql);
			if(rs.next())
			{
				usernameDataBase = rs.getString("name");
				passwordDatabase = rs.getString("value");
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(usernameDataBase.equals(userName) && passwordDatabase.equals(passWord))
		{
			resp.sendRedirect("success.html");
		}
		else
		{
			
			PrintWriter out = resp.getWriter();
			out.println("<font color=red>Either user name or password is wrongTestPlease TestHere.</font>");
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		
		
   }
}