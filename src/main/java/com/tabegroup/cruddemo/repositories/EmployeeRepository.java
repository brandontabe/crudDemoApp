package com.tabegroup.cruddemo.repositories;

import com.tabegroup.cruddemo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
public interface EmployeeRepository
{
    Employee findEmployeeById(int id);
}
