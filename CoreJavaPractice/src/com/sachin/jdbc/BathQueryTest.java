package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BathQueryTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		PreparedStatement ps = null;

		try {
			ps = con.prepareStatement("insert into tk_user values (? ,?, ?)");
			for (int i = 0; i < 5; i++) {
				ps.setInt(1, i + 1005);
				ps.setString(2, "Test" + i);
				ps.setString(3, "TTT" + i);
				ps.addBatch();
			}
			ps.executeBatch();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}

	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		return connection;
	}

}
