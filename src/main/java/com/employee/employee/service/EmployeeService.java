package com.employee.employee.service;

import com.employee.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    List<Employee> getByMaNV(String maNV);

    Employee updateEmployee(String id, Employee employee);

    void deleteEmployee(String id);
}