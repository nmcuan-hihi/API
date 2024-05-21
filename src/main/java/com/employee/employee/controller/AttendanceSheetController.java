package com.employee.employee.controller;

import com.employee.employee.model.AttendanceSheet;
import com.employee.employee.model.Employee;
import com.employee.employee.service.AttendanceSheetService;
import com.employee.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendanceSheet")
@CrossOrigin
public class AttendanceSheetController {
    @Autowired
    private AttendanceSheetService attendanceSheetService;

    @GetMapping("/getAll")
    public List<AttendanceSheet> getAllItem() {
        return attendanceSheetService.getAllAttendanceSheet();
    }

    @PostMapping("/add")
    public String add(@RequestBody AttendanceSheet attendanceSheet) {
        attendanceSheetService.addAttendanceSheet(attendanceSheet);
        return attendanceSheet.toString();
    }
}
