package com.employee.employee.service;

import com.employee.employee.model.AttendanceSheet;
import com.employee.employee.repostory.AttendanceSheetRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceSheetServiceImpl implements AttendanceSheetService{
    @Autowired
    private AttendanceSheetRepostory attendanceSheetRepostory;


    @Override
    public AttendanceSheet addAttendanceSheet(AttendanceSheet attendanceSheet) {
        return attendanceSheetRepostory.save(attendanceSheet);
    }

    @Override
    public List<AttendanceSheet> getAllAttendanceSheet() {
        return attendanceSheetRepostory.findAll();
    }
}
