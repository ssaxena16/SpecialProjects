package com.sachin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.dao.EmployeeDao;
import com.sun.org.apache.regexp.internal.recompile;

public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
           int id = Integer.parseInt(req.getParameter("employeeId"));
           int result=0;
           try {
			result = EmployeeDao.deleteEmployee(id);
			if(result> 0)
			{
				out.print("Record has been deleted");
				resp.sendRedirect("view-employess");
			}
			else
			{
				out.print("Not deleted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
