package com.sachin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.beans.Employee;
import com.sachin.dao.EmployeeDao;

public class EditEmployee extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    try
	    {
	    Employee emp = EmployeeDao.getEmployee(Integer.parseInt(req.getParameter("employeeId")));
	    System.out.println("Emp id === "+emp.getId());
	    
	    
	    out.print("<body>"
				+"<h1>Edit Employee </h1>"
				+"<form action='edit-employeeBody' method = 'post'>"
				+"Name: <input type = 'text' name = 'employeeName' value = '"+emp.getEmployeeName()+"' ><br>"
				+"Password: <input type = 'text' name = 'employeePassword' value = '"+emp.getEmployeePassword()+"' ><br>"
				+"Email: <input type = 'text' name = 'employeeEmail' value = '"+emp.getEmployeeEmail()+"'><br>"
				+ "<input type = 'hidden' name = 'employeeId' value = '"+emp.getId()+"'>"
				+"country: <select name = 'country' style='width:150px'>"
		        +"+<option> India</option>"
				+"<option> USA</option>"
				+"<option> UK</option>"
				+"<option> France</option>"
				+"</select><br>"
				+"<input type = 'submit' value = 'EditAndSave'>"
				+"</form>"
);

	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		
	}
  
}
