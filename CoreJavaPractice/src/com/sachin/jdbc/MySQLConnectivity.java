package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectivity {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement smt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
			//jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$"
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from tk_user");
			while (rs.next()) {
				//System.out.println(" " + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				System.out.println(" "+rs.getInt("id")+" "+rs.getString("tk_username")+" "+rs.getString("tk_password"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			smt.close();
			con.close();
		}

	}

}
