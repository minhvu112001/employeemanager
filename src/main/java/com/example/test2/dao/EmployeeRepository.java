package com.example.test2.dao;

import com.example.test2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //add a method to sort by lastname
    public List<Employee> findAllByOrderByLastNameAsc();


}