package com.examly.springapp.service;

import com.examly.springapp.model.AttendanceLog;
import java.util.List;

public interface AttendanceLogService {
    AttendanceLog save(AttendanceLog attendanceLog);
    List<AttendanceLog> findAll();
}