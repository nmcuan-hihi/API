package com.employee.employee.controller;

import com.employee.employee.model.Employee;
import com.employee.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmloyeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getByMaNV/{maNV}")
     public List<Employee> getEmployeeByMaNV(@PathVariable String maNV) {
        return employeeService.getByMaNV(maNV);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllItem() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/add")
    public String add(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employee.toString();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String id, @RequestBody Employee employeeDetails) {
        try {
            Employee updatedEmployee = employeeService.updateEmployee(id, employeeDetails);
            return ResponseEntity.ok(updatedEmployee);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id) {
        try {
            employeeService.deleteEmployee(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
