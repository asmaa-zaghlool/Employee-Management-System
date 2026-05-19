package com.example.Employee_Management_System.entity;

import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payroll {

    @Id
    private String id;

    private String employeeId;

    private double baseSalary;

    private double bonus;

    private double deductions;

    private double finalSalary;

    private String month; // مثال: "2026-05"
}
