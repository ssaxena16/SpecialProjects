package com.sachin.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class QueryUtil {

	public static QueryUtil queryUtil = null;

	private QueryUtil() {

	}

	public static QueryUtil getQueryObject() {
		if (queryUtil == null) {
			queryUtil = new QueryUtil();
		}
		return queryUtil;

	}

	public boolean isUserAuthorized(String userName, String password) throws SQLException {

		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from tk_user where tk_username =? and tk_password = ?");
			ps.setString(1, userName);
			ps.setString(2, password);
			rs = ps.executeQuery();
			result = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			ps.close();
			con.close();
		}
		return result;

	}

}
