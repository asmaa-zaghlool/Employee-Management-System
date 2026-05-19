package com.example.Employee_Management_System.service;

import com.example.Employee_Management_System.entity.Payroll;
import com.example.Employee_Management_System.repo.PayrollRepository;
import com.example.Employee_Management_System.service.PayrollService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PayrollServiceImpl implements PayrollService {

    private final PayrollRepository repository;

    public PayrollServiceImpl(PayrollRepository repository) {
        this.repository = repository;
    }

    @Override
    public Payroll generatePayroll(String employeeId,
                                   double baseSalary,
                                   double bonus,
                                   double deductions,
                                   String month) {

        Payroll payroll = new Payroll();

        payroll.setId(UUID.randomUUID().toString());
        payroll.setEmployeeId(employeeId);
        payroll.setBaseSalary(baseSalary);
        payroll.setBonus(bonus);
        payroll.setDeductions(deductions);
        payroll.setMonth(month);

        // 🧠 BUSINESS LOGIC
        double finalSalary = baseSalary + bonus - deductions;
        payroll.setFinalSalary(finalSalary);

        return repository.save(payroll);
    }

    @Override
    public List<Payroll> getEmployeePayroll(String employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    @Override
    public List<Payroll> getAllPayrolls() {
        return repository.findAll();
    }
}