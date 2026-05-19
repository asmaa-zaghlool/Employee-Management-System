package com.example.Employee_Management_System.controller;

import com.example.Employee_Management_System.entity.Payroll;
import com.example.Employee_Management_System.service.PayrollService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {

    private final PayrollService service;

    public PayrollController(PayrollService service) {
        this.service = service;
    }

    // CREATE PAYROLL
    @PostMapping("/generate")
    public Payroll generatePayroll(
            @RequestParam String employeeId,
            @RequestParam double baseSalary,
            @RequestParam double bonus,
            @RequestParam double deductions,
            @RequestParam String month
    ) {
        return service.generatePayroll(employeeId, baseSalary, bonus, deductions, month);
    }

    // GET EMPLOYEE PAYROLL
    @GetMapping("/{employeeId}")
    public List<Payroll> getEmployeePayroll(@PathVariable String employeeId) {
        return service.getEmployeePayroll(employeeId);
    }

    // GET ALL PAYROLLS
    @GetMapping
    public List<Payroll> getAllPayrolls() {
        return service.getAllPayrolls();
    }
}