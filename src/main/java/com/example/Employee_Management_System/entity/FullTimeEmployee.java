package com.example.Employee_Management_System.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("FULL_TIME")
public class FullTimeEmployee extends Employee {

    private double salary;

    private String department;

    public void setId(long l) {
    }

    public void setName(String ahmed) {
    }

    public void setEmail(String mail) {
    }

    public void setSalary(double v) {
    }

    public String getName() {
        return null;
    }
    // getters and setters
}