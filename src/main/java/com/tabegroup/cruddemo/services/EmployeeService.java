package com.tabegroup.cruddemo.services;

import com.tabegroup.cruddemo.models.Employee;
import com.tabegroup.cruddemo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employee getEmployeeById(int id);
}