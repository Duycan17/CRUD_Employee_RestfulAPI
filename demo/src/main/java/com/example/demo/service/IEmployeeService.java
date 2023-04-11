package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
public interface IEmployeeService {
    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(long id, Employee employee);

    public boolean deleteEmployee(long id);

    public List<Employee> getAllEmployee();

    public Employee getOneEmployee(long id);
}
