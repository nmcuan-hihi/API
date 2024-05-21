package com.employee.employee.service;

import com.employee.employee.model.AttendanceSheet;
import com.employee.employee.model.Employee;

import java.util.List;

public interface AttendanceSheetService {
    public AttendanceSheet addAttendanceSheet(AttendanceSheet attendanceSheet) ;
    public List<AttendanceSheet> getAllAttendanceSheet();
}
