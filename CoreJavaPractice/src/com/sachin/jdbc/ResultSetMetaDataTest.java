package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from tk_user");
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(""+rsmd.getTableName(2));
		System.out.println(" "+rsmd.getColumnCount());

	}

}

