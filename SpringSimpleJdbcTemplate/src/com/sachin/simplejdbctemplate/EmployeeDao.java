package com.sachin.simplejdbctemplate;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class EmployeeDao {

	SimpleJdbcTemplate simpleJdbcTemplate;

	public EmployeeDao(SimpleJdbcTemplate simpleJdbcTemplate) {
		this.simpleJdbcTemplate = simpleJdbcTemplate;
	}

	public int updateEmployee(Employee e) {
		String sql = "update employee set name = ?,salary =? where id=  ?";
		return simpleJdbcTemplate.update(sql, e.getName(), e.getSalary(), e.getId());
	}
}
