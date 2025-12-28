package com.examly.springapp.service;

import com.examly.springapp.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee findById(Long id);
    List<Employee> findAll();
}