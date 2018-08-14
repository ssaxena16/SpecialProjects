package com.sachin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementInClause {
	public static final int PARAM_LEN = 6;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int[] ids = { 12, 19, 29, 30, 41, 42 };

		String query = createQuery(ids.length);
		System.out.println(" " + query);
		Connection connection = getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			int i = 0;
			ps = connection.prepareStatement(query);
			for (i = 1; i <= ids.length; i++) {
				ps.setInt(i, ids[i - 1]);
			}
			for (; i < PARAM_LEN; i++) {
				ps.setNull(i, java.sql.Types.INTEGER);
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctools", "root", "Sachin123$");
		return connection;
	}

	public static String createQuery(int length) {
		StringBuilder sb = new StringBuilder("select * from tk_user where id in  ");
		sb.append("( ");

		for (int i = 0; i < length; i++) {
			sb.append("? ");

			if (i != (length - 1)) {
				sb.append(", ");

			} else {
				sb.append(" )");
			}

		}
		return sb.toString();
	}

}
//
// 1 | mh | 12 |
// | 12 | sachins | sachin |
// | 19 | supadhayay | Sumit123$ |
// | 29 | steste | test |
// | 30 | ajay1 | aj1 |
// | 41 | nsingh | ni12 |
// | 42 | first | second |
// | 55 | stest | test |
// | 155 | rohit | rrrtt |
// | 555 | Raju | RR |
// | 557 | harshit | hr |
// | 666 | Ste
