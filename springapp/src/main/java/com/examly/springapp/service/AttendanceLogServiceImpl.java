package com.examly.springapp.service;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.repository.AttendanceLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceLogServiceImpl implements AttendanceLogService {
    
    @Autowired
    private AttendanceLogRepository attendanceLogRepository;
    
    @Override
    public AttendanceLog save(AttendanceLog attendanceLog) {
        return attendanceLogRepository.save(attendanceLog);
    }
    
    @Override
    public List<AttendanceLog> findAll() {
        return attendanceLogRepository.findAll();
    }
}