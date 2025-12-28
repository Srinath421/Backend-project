package com.examly.springapp.controller;

import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.repository.DailyAttendanceSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/daily-summary")
public class DailyAttendanceSummaryController {
    
    @Autowired
    private DailyAttendanceSummaryRepository dailyAttendanceSummaryRepository;
    
    @PostMapping("/create")
    public DailyAttendanceSummary createSummary(@RequestBody DailyAttendanceSummary summary) {
        return dailyAttendanceSummaryRepository.save(summary);
    }
    
    @GetMapping("/employee/{id}")
    public Page<DailyAttendanceSummary> getSummaryByEmployeeId(@PathVariable Long id,
                                                               @RequestParam(defaultValue = "0") int page,
                                                               @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return dailyAttendanceSummaryRepository.findAll(pageable);
    }
    
    @GetMapping("/employee/code/{employeeCode}")
    public Page<DailyAttendanceSummary> getSummaryByEmployeeCodeAndDateRange(
            @PathVariable String employeeCode,
            @RequestParam String startDate,
            @RequestParam String endDate,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return dailyAttendanceSummaryRepository.findByEmployeeCodeAndDateBetween(employeeCode, startDate, endDate, pageable);
    }
}