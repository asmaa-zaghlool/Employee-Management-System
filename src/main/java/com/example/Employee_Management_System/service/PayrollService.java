package com.example.Employee_Management_System.service;

import com.example.Employee_Management_System.entity.Payroll;

import java.util.List;

public interface PayrollService {

    Payroll generatePayroll(String employeeId, double baseSalary, double bonus, double deductions, String month);

    List<Payroll> getEmployeePayroll(String employeeId);

    List<Payroll> getAllPayrolls();
}