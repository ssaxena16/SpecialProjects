package com.sachin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.beans.Employee;
import com.sachin.dao.EmployeeDao;

public class ViewEmployees extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {

			int maxRecord = 2;
			int start = 1;

			if (req.getParameter("page") != null) {
				int pageId = Integer.parseInt(req.getParameter("page"));
				if (pageId == 1) {
					start = pageId;
				} else {
					pageId = pageId - 1;
					start = pageId * maxRecord + 1;
					maxRecord = pageId * maxRecord;
				}
			}

			List<Employee> employeeList = EmployeeDao.getEmployees(start, maxRecord);

			if (employeeList.size() > 0) {
				out.print("<h1>Employee Records</h1>");
				out.print("<html><body><table border='1' width='60%'>" + "<tr><th> EmpName </th>" + "<th> Password</th>"
						+ "<th> Email</th>" + "<th> Country</th>" + "<th> Edit</th>" + "<th> Delete</th>" + "</tr>");

				for (Employee employee : employeeList) {
					out.print("<tr>");
					out.print("<td>" + employee.getEmployeeName() + "</td>");
					out.print("<td>" + employee.getEmployeePassword() + "</td>");
					out.print("<td>" + employee.getEmployeeEmail() + "</td>");
					out.print("<td>" + employee.getCountry() + "</td>");
					out.print("<td>" + "<a href =" + "edit-employee?employeeId=" + employee.getId() + "> Edit </a>"
							+ "</td>");
					out.print("<td>" + "<a href =" + "delete-employee?employeeId=" + employee.getId() + "> Delete </a>"
							+ "</td>");

					out.print("</tr>");
				}
				out.print("</table");
				out.print("<br>");
				out.print("<div><a href ='index.html'> Back </a><br>");
				out.print("<a href = 'view-employess?page=1'>1</a>");
				out.print("<a href = 'view-employess?page=2'>2</a>");
				out.print("<a href = 'view-employess?page=3'>3</a></div>");
				out.print("</body></html>");
			} else {
				out.print("<html><body><h1>No Record has been found</h1></body></html>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
