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

public class EditEmployeeBody extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int result = 0;
		System.out.println("SSSSSSSSSSS" + req.getParameter("employeeId"));
		try {
			Employee employee = EmployeeDao.getEmployee(Integer.parseInt(req.getParameter("employeeId")));
			employee.setEmployeeName(req.getParameter("employeeName"));
			employee.setEmployeePassword(req.getParameter("employeePassword"));
			employee.setEmployeeEmail(req.getParameter("employeeEmail"));
			employee.setCountry(req.getParameter("country"));
			result = EmployeeDao.updateEmployee(employee);
			if (result > 0) {
				resp.sendRedirect("view-employess");
			} else {
				out.print("Please fill right info");
			}

		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
