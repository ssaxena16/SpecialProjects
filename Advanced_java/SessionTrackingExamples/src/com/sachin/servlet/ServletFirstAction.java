package com.sachin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletFirstAction extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<a href = 'servlet2?uname= "+req.getParameter("userName")+"'>"+ "Link"+"</a>");
         
        String test = req.getParameter("userName");
        HttpSession session = req.getSession();
        
        session.setAttribute("first", req.getParameter("userName"));
        
        System.out.println("TT"+test);
        out.print("<html><body>");
        out.print("<form action= 'servlet2' method = 'get'");
        out.print("<input type='hidden' name='uname' value="+test+">");
        out.print("<input type = 'submit' value= 'go'"+">");
        out.print("</form></body></html>");
        out.close();
        
	}
	

}
