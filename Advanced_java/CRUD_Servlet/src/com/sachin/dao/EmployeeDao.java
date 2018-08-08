package com.sachin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sachin.beans.Employee;
import com.sachin.db.ConnectionUtil;

public class EmployeeDao {
	public static int addEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = (PreparedStatement) conn.prepareStatement(
					"insert into tk_employee(tk_employeename,tk_password,tk_email,tk_country) values (?,?,?,?)");
			ps.setString(1, emp.getEmployeeName());
			ps.setString(2, emp.getEmployeePassword());
			ps.setString(3, emp.getEmployeeEmail());
			ps.setString(4, emp.getCountry());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			conn.close();
		}

		return result;

	}

	public static java.util.List<Employee> getEmployees() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		java.util.List<Employee> list = new ArrayList<Employee>();
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) conn.prepareStatement("select * from tk_employee");
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setEmployeeName(rs.getString(2));
				employee.setEmployeePassword(rs.getString(3));
				employee.setEmployeeEmail(rs.getString(4));
				employee.setCountry(rs.getString(5));
				list.add(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return list;

	}

	public static Employee getEmployee(int id) throws ClassNotFoundException {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Employee employee = new Employee();
		try {
			ps = (PreparedStatement) conn.prepareStatement("select * from tk_employee where id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				employee.setId(rs.getInt(1));
				employee.setEmployeeName(rs.getString(2));
				employee.setEmployeePassword(rs.getString(3));
				employee.setEmployeeEmail(rs.getString(4));
				employee.setCountry(rs.getString(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;

	}

	public static int updateEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = (PreparedStatement) conn
					.prepareStatement("update tk_employee set tk_employeename = ?, tk_password = ?,"
							+ " tk_email = ? , tk_country = ?  where id = ?");
			ps.setString(1, emp.getEmployeeName());
			ps.setString(2, emp.getEmployeePassword());
			ps.setString(3, emp.getEmployeeEmail());
			ps.setString(4, emp.getCountry());
			ps.setInt(5, emp.getId());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			conn.close();

		}
		return result;

	}

	public static int deleteEmployee(int id) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = (PreparedStatement) conn.prepareStatement("delete from tk_employee where id = ?");
			ps.setInt(1, id);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			conn.close();
		}
		return result;

	}

}
