package com.employee.employee.service;

import com.employee.employee.model.AttendanceSheet;
import com.employee.employee.model.Employee;

import java.util.List;

public interface AttendanceSheetService {
    public AttendanceSheet addAttendanceSheet(AttendanceSheet attendanceSheet) ;
    public List<AttendanceSheet> getAllAttendanceSheet();
    public List<AttendanceSheet> getAttendanceByMaNVAndDate(String maNV, String date);
    public void deleteAttendanceSheetById(int id);
}
