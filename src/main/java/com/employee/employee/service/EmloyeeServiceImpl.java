package com.employee.employee.service;

import com.employee.employee.model.Employee;
import com.employee.employee.repostory.EmployeeRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmloyeeServiceImpl implements  EmployeeService{
    @Autowired
    private EmployeeRepostory employeeRepostory;


    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepostory.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepostory.findAll();
    }

    @Override
    public List<Employee> getByMaNV(String maNV) {
        return employeeRepostory.findByMaNV(maNV);
    }

    @Override
    public Employee updateEmployee(String id, Employee employeeDetails) {
        Optional<Employee> employeeOptional = employeeRepostory.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setPass(employeeDetails.getPass());
            employee.setTenNV(employeeDetails.getTenNV());
            employee.setSoDT(employeeDetails.getSoDT());
            employee.setQuyen(employeeDetails.getQuyen());
            employee.setDiaChi(employeeDetails.getDiaChi());
            employee.setTenChucVu(employeeDetails.getTenChucVu());
            employee.setMucLuong(employeeDetails.getMucLuong());
            return employeeRepostory.save(employee);
        } else {
            throw new RuntimeException("Employee not found with id " + id);
        }
    }

    @Override
    public void deleteEmployee(String id) {
        if (employeeRepostory.existsById(id)) {
            employeeRepostory.deleteById(id);
        } else {
            throw new RuntimeException("Employee not found with id " + id);
        }
    }
}
