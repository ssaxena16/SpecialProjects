package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_PreparedStatement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		JDBCSingleton jdbcSingleton = JDBCSingleton.getInstance();
		// int result = jdbcSingleton.insert_user(101, "Yash", "Yash123");
		// if (result > 0) {
		// System.out.println("Record has been inserted");
		// } else {
		// System.out.println("Not inserted");
		// }
		/*
		 * if (jdbcSingleton.update_user(101, "TTTT", "T") > 0) {
		 * System.out.println("Record has been updated"); } else {
		 * System.out.println("Not updated"); }
		 */
//		if (jdbcSingleton.delete_user(101) > 0) {
//			System.out.println("Record has been deleted");
//		} else {
//			System.out.println("Not Deleted");
//		}
		
		jdbcSingleton.display_users();

	}

}

class JDBCSingleton {
	private static JDBCSingleton jdbcSingleton = null;

	private JDBCSingleton() {

	}

	public static JDBCSingleton getInstance() {
		if (jdbcSingleton == null) {
			jdbcSingleton = new JDBCSingleton();

		}
		return jdbcSingleton;
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		return con;
	}

	public int insert_user(int id, String name, String password) throws SQLException {
		Connection con = null;
		PreparedStatement smt = null;
		int result = 0;
		try {
			con = getConnection();
			smt = con.prepareStatement("insert into tk_user(id,tk_username,tk_password) values(?,?,?)");
			smt.setInt(1, id);
			smt.setString(2, name);
			smt.setString(3, password);
			result = smt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			smt.close();
			con.close();
		}

		return result;
	}

	public int update_user(int id, String newUsername, String newPassword) throws SQLException {
		Connection con = null;
		PreparedStatement smt = null;
		int result = 0;
		try {
			con = getConnection();
			smt = con.prepareStatement("update tk_user set tk_username = ? , tk_password = ? where id ='" + id + "'");
			smt.setString(1, newUsername);
			smt.setString(2, newPassword);
			result = smt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			smt.close();
			con.close();
		}

		return result;
	}

	public int delete_user(int id) throws SQLException {
		Connection con = null;
		PreparedStatement smt = null;
		int result = 0;
		try {
			con = getConnection();
			smt = con.prepareStatement("delete from tk_user where id ='" + id + "'");
			result = smt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			smt.close();
			con.close();
		}

		return result;
	}

	public void display_users() throws SQLException {
		Connection con = null;
		PreparedStatement smt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = getConnection();
			smt = con.prepareStatement("select * from tk_user");
			rs = smt.executeQuery();
			while (rs.next()) {
				System.out.println(" " + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			smt.close();
			con.close();
		}

	}
}
