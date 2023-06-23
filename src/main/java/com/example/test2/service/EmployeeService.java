package com.example.test2.service;

import com.example.test2.entity.Employee;
import java.util.List;
public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);
}