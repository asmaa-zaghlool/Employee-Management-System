package com.example.Employee_Management_System.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PART_TIME")
public class PartTimeEmployee extends Employee {

    private double hourlyRate;

    private int hoursPerWeek;

    // getters and setters
}