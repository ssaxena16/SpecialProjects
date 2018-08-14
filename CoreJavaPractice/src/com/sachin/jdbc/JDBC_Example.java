package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserName("Mohan");
		user.setPassword("mmm");
		// jDBC.insert_user(user.getUserName(), user.getPassword());
		// jDBC.update_user(user.getUserName(),"PPPP");
		// jDBC.delete_user(user.getUserName());
		jDBC.display_users();

	}

}

class User {
	String userName;
	String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

class jDBC {
	public static void insert_user(String userName, String password) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement smt = null;

		try {
			con = getConnection();
			smt = con.createStatement();
			int result = smt.executeUpdate(
					"insert into tk_user(tk_username,tk_password) values('" + userName + "','" + password + "')");
			if (result > 0) {
				System.out.println("Record is inserted");
			} else {
				throw new SQLException("Query not executed");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			smt.close();
			con.close();

		}
	}

	public static void update_user(String userName, String password) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement smt = null;

		try {
			con = getConnection();
			smt = con.createStatement();
			int result = smt.executeUpdate(
					"update tk_user set tk_password = '" + password + "' where tk_username = '" + userName + "'");
			if (result > 0) {
				System.out.println("Record is updated");
			} else {
				throw new SQLException("Query not executed");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			smt.close();
			con.close();

		}
	}

	public static void delete_user(String userName) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement smt = null;

		try {
			con = getConnection();
			smt = con.createStatement();
			int result = smt.executeUpdate("delete from tk_user  where tk_username = '" + userName + "'");
			if (result > 0) {
				System.out.println("Record is Deleted");
			} else {
				throw new SQLException("Query not executed");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			smt.close();
			con.close();

		}
	}

	public static void display_users() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement smt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			smt = con.createStatement();
			rs = smt.executeQuery("select * from tk_user");
			while (rs.next()) {
				System.out.println("  " + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			smt.close();
			con.close();
			rs.close();

		}
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
