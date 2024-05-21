package com.employee.employee.service;

import com.employee.employee.model.AttendanceSheet;
import com.employee.employee.repostory.AttendanceSheetRepostory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    @Override
    public List<AttendanceSheet> getAttendanceByMaNVAndDate(String maNV, String date) {
        return attendanceSheetRepostory.findByMaNVAndDate(maNV, date);
    }
    @Override
    public void deleteAttendanceSheetById(int id) {
        attendanceSheetRepostory.deleteById(id);
    }
}
