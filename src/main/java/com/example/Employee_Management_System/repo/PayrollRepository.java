package com.example.Employee_Management_System.repo;

import com.example.Employee_Management_System.entity.Payroll;

import java.util.List;

public interface PayrollRepository  {

    List<Payroll> findByEmployeeId(String employeeId);

    List<Payroll> findByMonth(String month);

    Payroll save(Payroll payroll);

    List<Payroll> findAll();
}
