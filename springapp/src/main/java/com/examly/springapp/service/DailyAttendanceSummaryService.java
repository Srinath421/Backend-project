package com.examly.springapp.service;

import com.examly.springapp.model.DailyAttendanceSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DailyAttendanceSummaryService {
    DailyAttendanceSummary save(DailyAttendanceSummary summary);
    Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetween(String employeeCode, String startDate, String endDate, Pageable pageable);
}