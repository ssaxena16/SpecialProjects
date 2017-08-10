package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Note : For this jdbc connection you have to include a jar "C:\Program Files\Java\jre1.8.0_131\lib\ext\com.mysql.jdbc_5.1.5" in this location.
class User {
	private String userName;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void informationAbouUser() {
		System.out.println(" UserName is " + userName + "   Password is " + passWord);
	}

}

public class TestJdbcConnection {

	Connection conection = null;
	Statement smt = null;
	ResultSet rs = null;

	public void insertUserInformation(User user) throws ClassNotFoundException, SQLException {
		try {
			conection = getSQLConnection();
			smt = conection.createStatement();
			String userName = user.getUserName();
			String passWord = user.getPassWord();
			smt.executeUpdate(
					"insert into tk_user (tk_username,tk_password) values('" + userName + "','" + passWord + "')");
			System.out.println("Information About user is saved");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			smt.close();
			conection.close();
		}
	}

	public int updateUserInformation(User user) throws ClassNotFoundException, SQLException {
		int row = 0;
		try {
			conection = getSQLConnection();
			smt = conection.createStatement();
			String userName = user.getUserName();
			String passWord = user.getPassWord();
			row = smt.executeUpdate(
					"update tk_user set tk_password = '" + passWord + "' where tk_username = '" + userName + "'");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			smt.close();
			conection.close();
		}
		return row;
	}

	public int deleteUserInformation(User user) throws ClassNotFoundException, SQLException {
		int row = 0;
		try {
			conection = getSQLConnection();
			smt = conection.createStatement();
			String userName = user.getUserName();
			row = smt.executeUpdate("delete from tk_user where tk_username = '" + userName + "'");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			smt.close();
			conection.close();
		}
		return row;
	}

	public void getInformation() throws ClassNotFoundException, SQLException {
		try {
			conection = getSQLConnection();
			smt = conection.createStatement();
			rs = smt.executeQuery("select tk_username,tk_password from tk_user");
			while (rs.next()) {
				User user = new User();
				user.setUserName(rs.getString(1));
				user.setPassWord(rs.getString(2));
				user.informationAbouUser();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			smt.close();
			conection.close();
		}
	}

	// Main Method
	public static void main(String[] args) {

		TestJdbcConnection testconnection = new TestJdbcConnection();
		try {

			User user1 = new User();

			// update Statement for a user
			user1.setUserName("AkashS");
			user1.setPassWord("Akkkkkk21");
			int result = testconnection.updateUserInformation(user1);
			if (result > 0) {
				System.out.println("Information is updated");
			} else {
				System.out.println("Not Updated");
			}

			// Delete a particular user
			int deleteresult = testconnection.deleteUserInformation(user1);
			if (deleteresult > 0) {
				System.out.println("User is deleted from database");
			} else {
				System.out.println("No user is abilable so cant perform delete operation");
			}

			// Insert a user information
			// testconnection.insertUserInformation(user1);

			// Get the all users information
			System.out.println("Information About the Users");
			testconnection.getInformation();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getSQLConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
