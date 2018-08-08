package com.sachin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.beans.Employee;
import com.sachin.dao.EmployeeDao;

public class AddEmployee extends HttpServlet {

	@SuppressWarnings("null")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
      Employee employee = new Employee() ;
      int result  = 0;
      try {
      employee.setEmployeeName(req.getParameter("employeeName"));
      employee.setEmployeePassword(req.getParameter("employeePassword"));
      employee.setEmployeeEmail(req.getParameter("employeeEmail"));
      employee.setCountry(req.getParameter("country"));
      
	  result = EmployeeDao.addEmployee(employee);
	  if(result> 0)
	  {
		  out.print("Record has been saved");
		  RequestDispatcher rd = req.getRequestDispatcher("index.html");
		  rd.include(req, resp);
	  }
	  else
	  {
		  out.print("Error");
		  RequestDispatcher rd = req.getRequestDispatcher("index.html");
		  rd.include(req, resp);
		  
	  }
	    
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
		
		
	}

	
}
