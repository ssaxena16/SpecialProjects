package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseMetaDataTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(""+dbmd.getDriverName()+" Varsion "+dbmd.getDriverMajorVersion());
		String [] tables = {"TABLE"};
		ResultSet rs = dbmd.getTables(null, null, null, tables);
		while(rs.next())
		{
			System.out.println(" "+rs.getString(1));
		}

	}

}
