package com.sachin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ServletPage extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		ServletContext context = getServletContext();
		Connection conn = (Connection) context.getAttribute("my_con");
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) conn.prepareStatement("select * from tk_user");
			rs = ps.executeQuery();
			while (rs.next()) {
				out.print("<br>" + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}

		} catch (Exception e) {
			try {
				rs.close();
				ps.close();
				conn.close();
				out.close();

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

}
