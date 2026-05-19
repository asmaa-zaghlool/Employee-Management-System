package com.example.Employee_Management_System.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {

    private String id;
    private String employeeId;
    private LocalDate date;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private String status;


    public Object getEmployeeId() {
        return employeeId;
    }

    public String getId() {
        return id;
    }
}


