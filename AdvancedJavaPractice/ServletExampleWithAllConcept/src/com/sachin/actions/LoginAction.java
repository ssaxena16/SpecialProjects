package com.sachin.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sachin.dao.UserDao;
import com.sachin.entities.User;

public class LoginAction extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		System.out.println("Login SuccessFull");
		PrintWriter out = resp.getWriter();
		User user = new User();
		user.setUserName(req.getParameter("userName"));
		user.setPassword(req.getParameter("password"));
		UserDao dao = new UserDao();
		try {
			if (dao.isUserValid(user)) {
				out.print("Login Successfull");
				RequestDispatcher rd = req.getRequestDispatcher("static_resources/login.jsp");
				rd.forward(req, resp);
			} else {
				out.print("Login not success Please try again");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
