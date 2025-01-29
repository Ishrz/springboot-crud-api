package com.example.employeecrud.service;

import com.example.employeecrud.model.Employee;
import com.example.employeecrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
         return employeeRepository.save(employee);
     }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long eId) {
        return employeeRepository.findById(eId);
     }

    public Employee updateEmployee(Long eId, Employee updatedEmployee) {
        updatedEmployee.setEId(eId);
        return employeeRepository.save(updatedEmployee);
    }

      public void deleteEmployee(Long eId) {
        employeeRepository.deleteById(eId);
    }
}