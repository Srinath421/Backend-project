package com.examly.springapp.model;

import jakarta.persistence.*;

@Entity
public class DailyAttendanceSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeCode;
    private String date;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getEmployeeCode() { return employeeCode; }
    public void setEmployeeCode(String employeeCode) { this.employeeCode = employeeCode; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}