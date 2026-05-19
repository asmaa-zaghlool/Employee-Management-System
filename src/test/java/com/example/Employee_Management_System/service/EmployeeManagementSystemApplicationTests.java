package com.example.Employee_Management_System.service;

import com.example.Employee_Management_System.entity.FullTimeEmployee;
import com.example.Employee_Management_System.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private FullTimeEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new FullTimeEmployee();
        employee.setId(1L);
        employee.setName("Ahmed");
        employee.setEmail("ahmed@test.com");
        employee.setSalary(6000.0);
    }

    @Test
    void testSaveEmployee() {
        when(employeeRepository.save(employee)).thenReturn(employee);

        FullTimeEmployee result =
                (FullTimeEmployee) employeeService.saveEmployee(employee);

        assertNotNull(result);
        assertEquals("Ahmed", result.getName());
        verify(employeeRepository, times(1)).save(employee);
    }

    @Test
    void testGetAllEmployees() {
        when(employeeRepository.findAll()).thenReturn(List.of(employee));

        List<?> result = employeeService.getAllEmployees();

        assertEquals(1, result.size());
        verify(employeeRepository, times(1)).findAll();
    }


    @Test
    void testDeleteEmployee() {
        doNothing().when(employeeRepository).deleteById(1L);

        employeeService.deleteEmployee(1L);

        verify(employeeRepository, times(1)).deleteById(1L);
    }
}