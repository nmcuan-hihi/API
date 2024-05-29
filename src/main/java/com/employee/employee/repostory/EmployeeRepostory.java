package com.employee.employee.repostory;

import com.employee.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EmployeeRepostory extends JpaRepository<Employee, String> {
    List<Employee> findByMaNV(String maNV);
}


