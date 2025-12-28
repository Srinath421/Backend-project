package com.examly.springapp.repository;

import com.examly.springapp.model.DailyAttendanceSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyAttendanceSummaryRepository extends JpaRepository<DailyAttendanceSummary, Long> {
    @Query("SELECT d FROM DailyAttendanceSummary d WHERE d.employeeCode = ?1 AND d.date BETWEEN ?2 AND ?3")
    Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetween(String employeeCode, String startDate, String endDate, Pageable pageable);
}