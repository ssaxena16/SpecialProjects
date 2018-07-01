package com.sachin.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.sachin.collection.classTestcollection;

class JdbcSingleton {
	private static JdbcSingleton jbdcSingleton = null;

	private JdbcSingleton() {

	}

	public static JdbcSingleton getInstance() {
		if (jbdcSingleton == null) {
			jbdcSingleton = new JdbcSingleton();
		}
		return jbdcSingleton;
	}

	public int insertRecord(int id, String userName, String password) throws ClassNotFoundException, SQLException {
		Connection con = null;
		int countRow = 0;
		PreparedStatement preparedStatement;
		try {
			con = getConnection();
			preparedStatement = con.prepareStatement("insert into tk_user (id,tk_username,tk_password)values(?,?,?);");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, userName);
			preparedStatement.setString(3, password);
			countRow = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return countRow;
	}

	public int deleteRecord(String userName) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement preparedStstement;
		int deleterowCount = 0;
		try {
			con = getConnection();
			preparedStstement = con.prepareStatement("delete from tk_user where tk_username='" + userName + "'");
			deleterowCount = preparedStstement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return deleterowCount;
	}

	public void displayResults() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement preparedStatement;
		ResultSet rs = null;
		try {
			con = getConnection();
			preparedStatement = con.prepareStatement("select * from tk_user");
			rs = preparedStatement.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("No of colums == "+rsmd.getColumnCount());
			System.out.println("Column 1 name "+rsmd.getColumnName(1)+" Column 2 name "+rsmd.getTableName(2));
			while (rs.next()) {
				System.out.println("Username  ====  " + rs.getString(2) + "PassWord  ====== " + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			con.close();
		}
	}

	public int updateRecord(String userName, String newUserName) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement preparedStstement;
		int updaterowCount = 0;
		try {
			con = getConnection();
			preparedStstement = con
					.prepareStatement("update tk_user set tk_username = ? where tk_username= '" + userName + "'");
			preparedStstement.setString(1, newUserName);
			updaterowCount = preparedStstement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return updaterowCount;
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
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

public class JDBCSingletonDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JdbcSingleton jdbcSingleton = JdbcSingleton.getInstance();
		System.out.println("1 : Insert  Record");
		System.out.println("2 : Delete Record");
		System.out.println("3 : Update record");
		System.out.println("4 : Select the data");
		System.out.println("5 : Exit");
		System.out.println("Please choose a value for perform the db operation");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		do {
			System.out.println("Please choose a value for perform the db operation");

			String enteredChoice = br.readLine();
            if(enteredChoice.matches("-?\\d+"))
			{
			choice = Integer.parseInt(enteredChoice);
			}
			else
			{
              continue;
			}
			switch (choice) {
			case 1:
				try {
					System.out.println("please enter an id ");
					int id = Integer.parseInt(br.readLine());
					System.out.println("please enter a username");
					System.out.println("");
					String username = br.readLine();

					System.out.println("please enter a Password");
					System.out.println("");
					String password = br.readLine();

					int result = jdbcSingleton.insertRecord(id, username, password);
					if (result > 0) {
						System.out.println("New record has been inserted");
					}

					else {
						System.out.println("Can not inserted");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					System.out.println("Enter user name");
					String userName = br.readLine();
					int result = jdbcSingleton.deleteRecord(userName);
					if (result > 0) {
						System.out.println("Record has been deleted");
					}

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("Please enter old username");
					String userName = br.readLine();
					System.out.println("Please enter new username");
					String newuserName = br.readLine();
					int result = jdbcSingleton.updateRecord(userName, newuserName);
					if (result > 0) {
						System.out.println("Record has been Updated");
					}

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println("View Results");
					jdbcSingleton.displayResults();

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;

			default:
				return;

			}
			continue;

		} while (choice != 5);
	}

}
