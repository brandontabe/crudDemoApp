package com.tabegroup.cruddemo.services.serviceImpl;

import com.tabegroup.cruddemo.models.Employee;
import com.tabegroup.cruddemo.repositories.EmployeeRepository;
import com.tabegroup.cruddemo.services.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findEmployeeById(id);
    }
}
