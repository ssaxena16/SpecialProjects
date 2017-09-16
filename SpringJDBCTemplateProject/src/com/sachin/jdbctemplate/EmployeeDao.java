package com.sachin.jdbctemplate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values ('" + e.getId() + "','" + e.getName() + "','" + e.getSalary()
				+ "')";

		return jdbcTemplate.update(query);
	}

	public int updateEmplyee(Employee e) {
		String query = "update employee set name = '" + e.getName() + "',salary ='" + e.getSalary() + "' where id = '"
				+ e.getId() + "'";

		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = " delete from employee where id = '" + e.getId() + "'";
		return jdbcTemplate.update(query);
	}

	public boolean saveEmployeeWithPreparedStatement(final Employee e) {
		String query = "insert into employee values (?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setInt(3, e.getSalary());

				return ps.execute();
			}

		});

	}

	public List<Employee> getEmployeesList() {
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Employee> list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setSalary(rs.getInt(3));
					list.add(employee);
				}
				return list;
			}

		});
	}

	public List<Employee> getEmployeesListWithRowMapper( ) {
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowcount) throws SQLException {
				// TODO Auto-generated method stub
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getInt(3));
				return employee;
			}

		});
	}
}
