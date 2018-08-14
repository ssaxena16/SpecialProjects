package com.sachin.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlInjectionInJDBC {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter USer name ");
		String userName = br.readLine();
		System.out.println("Enter Password");
		String password = br.readLine();
		getUserDetails(userName, password);
		
		
		
		

	}
	public static void getUserDetails(String userName, String password) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		Statement smt = null;
		ResultSet rs = null;
		try
		{
			smt = con.createStatement();
			rs = smt.executeQuery("select * from tk_user where tk_username = '"+userName+"' and tk_password = '"+password+"'");
			while(rs.next())
			{
				System.out.println(" "+rs.getInt(1)+"  "+rs.getString(2)+rs.getString(2));
				
			}
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			rs.close();
			smt.close();
			con.close();
		}
	}
		
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools","root","Sachin123$");
		return connection;
	}
	}

// If below input provide then will get proper result using sql injection

//
//Enter USer name 
//sachins' or '1' = '1
//Enter Password
//
// 12  sachinssachins


