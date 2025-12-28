package com.examly.springapp.controller;

import com.examly.springapp.model.AttendanceRecord;
import com.examly.springapp.repository.AttendanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attendance-records")
public class AttendanceRecordController {
    
    @Autowired
    private AttendanceRecordRepository attendanceRecordRepository;
    
    @PostMapping
    public AttendanceRecord addAttendanceRecord(@RequestBody AttendanceRecord attendanceRecord) {
        return attendanceRecordRepository.save(attendanceRecord);
    }
}