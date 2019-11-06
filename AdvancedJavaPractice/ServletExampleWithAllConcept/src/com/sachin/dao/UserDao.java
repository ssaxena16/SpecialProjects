package com.sachin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sachin.entities.User;
import com.sahin.db.DBConfigurationUtil;

public class UserDao {
	public boolean isUserValid(User user) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement smt = null;
		ResultSet rs = null;
		Boolean isValid = false;
		try {
			conn = DBConfigurationUtil.getDbConnection();
			smt = (PreparedStatement) conn
					.prepareStatement("select * from tk_user where tk_username = ? and tk_password = ?");
			smt.setString(1, user.getUserName());
			smt.setString(2, user.getPassword());
			rs = smt.executeQuery();
			isValid = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			smt.close();
			conn.close();
		}
		return isValid;
	}

}
