package com.sahin.db;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConfigurationUtil {
	static Connection conn = null;

	public static void intialize(String driverUrl, String dbPath, String dbUserName, String dbPassword) {
		try {
			Class.forName(driverUrl);
			conn = (Connection) DriverManager.getConnection(dbPath, dbUserName, dbPassword);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getDbConnection() throws ClassNotFoundException, SQLException

	{
		return conn;

	}

}
