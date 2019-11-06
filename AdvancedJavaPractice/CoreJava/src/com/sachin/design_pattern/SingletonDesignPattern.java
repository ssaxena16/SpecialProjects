package com.sachin.design_pattern;

import java.sql.*;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton sinngleton = Singleton.getSingletonObject();
		try {
			sinngleton.getUserDetails();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Singleton {
	private static Singleton singletonObject = null;
	private Connection con = null;

	private Singleton() {
		try {
			this.con = this.getConnecton();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Singleton getSingletonObject() {
		if (singletonObject == null)
			return new Singleton();
		else
			return singletonObject;
	}

	public Connection getConnecton() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		return con;
	}

	public void getUserDetails() throws SQLException {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			psmt = con.prepareStatement("select * from tk_user");
			rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
