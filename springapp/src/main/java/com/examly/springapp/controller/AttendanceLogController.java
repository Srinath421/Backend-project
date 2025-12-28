package com.examly.springapp.controller;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.repository.AttendanceLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendancelogs")
public class AttendanceLogController {
    
    @Autowired
    private AttendanceLogRepository attendanceLogRepository;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AttendanceLog addAttendanceLog(@RequestBody AttendanceLog attendanceLog) {
        return attendanceLogRepository.save(attendanceLog);
    }
    
    @PutMapping("/{id}")
    public AttendanceLog updateAttendanceLog(@PathVariable Long id, @RequestBody AttendanceLog attendanceLog) {
        attendanceLog.setId(id);
        return attendanceLogRepository.save(attendanceLog);
    }
    
    @GetMapping
    public List<AttendanceLog> getAllAttendanceLogs() {
        return attendanceLogRepository.findAll();
    }
}