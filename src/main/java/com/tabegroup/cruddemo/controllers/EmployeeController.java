package com.tabegroup.cruddemo.controllers;

import com.tabegroup.cruddemo.models.Employee;
import com.tabegroup.cruddemo.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController
{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(path = "/retrieveEmployeeById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> retrieveEmployeeById(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            // Return a 404 Not Found status if the employee does not exist
            System.out.println("Error retrieving employee with id " + id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    }

