package com.employee.employee.repostory;

import com.employee.employee.model.AttendanceSheet;
import com.employee.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceSheetRepostory extends JpaRepository<AttendanceSheet, Integer> {
    @Query("SELECT a FROM AttendanceSheet a WHERE a.maNV = :maNV AND a.date = :date")
    List<AttendanceSheet> findByMaNVAndDate(@Param("maNV") String maNV, @Param("date") String date);
}
