package com.sachin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sachin.beans.Employee;

public class EmpDao {

	JdbcTemplate jdbcTemplate;

	public void setTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Employee e) {
		String sql = "insert into employee values ('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		return jdbcTemplate.update(sql);
	}

	public List<Employee> getEmployees() {
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				// TODO Auto-generated method stub
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getInt(3));
				System.out.println("list " + employee.getId());
				return employee;
			}

		});
	}

}
