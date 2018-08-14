package com.sachin.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagement {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		connection.setAutoCommit(false);
		PreparedStatement ps = connection.prepareStatement("insert into tk_user values (?,?,?)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter Id");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter name");
			String name = br.readLine();
			System.out.println("Enter password");
			String password = br.readLine();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.executeUpdate();

			System.out.println("Please input");
			String str = br.readLine();
			if ("commit".equals(str)) {
				connection.commit();
				break;
			} else if ("rollback".equals(str)) {
				connection.rollback();
				break;
			} else {
				continue;
			}

		}
		System.out.println("Transaction success");

	}

}
