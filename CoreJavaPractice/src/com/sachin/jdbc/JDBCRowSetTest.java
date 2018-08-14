package com.sachin.jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/ctools");
		rowSet.setUsername("root");
		rowSet.setPassword("Sachin123$");
		rowSet.setCommand("Select * from tk_user");
		rowSet.execute();
		while(rowSet.next())
		{
			System.out.println("  "+rowSet.getInt(1)+"  "+rowSet.getString(2)+"  "+rowSet.getString(3));
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
