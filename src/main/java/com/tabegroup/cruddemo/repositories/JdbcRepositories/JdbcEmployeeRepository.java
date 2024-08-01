package com.tabegroup.cruddemo.repositories.JdbcRepositories;

import com.tabegroup.cruddemo.models.Employee;
import com.tabegroup.cruddemo.repositories.EmployeeRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcEmployeeRepository implements EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcEmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SQL_SELECT_EMPLOYEE_BY_ID = "SELECT * FROM Employee WHERE employee_id = ?";

    @Override
    public Employee findEmployeeById(int id) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_EMPLOYEE_BY_ID, new Object[]{id}, new EmployeeRowMapper());
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return null;
        }
    }

    private static class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setEmployeeId(rs.getInt("employee_id"));
            employee.setFirstName(rs.getString("first_name"));
            employee.setLastName(rs.getString("last_name"));
            employee.setEmail(rs.getString("email"));
            employee.setPhone(rs.getString("phone_number"));
            return employee;
        }
    }
}
