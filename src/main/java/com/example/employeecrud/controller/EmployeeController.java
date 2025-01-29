package com.example.employeecrud.controller;

import com.example.employeecrud.model.Employee;
import com.example.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
     @Autowired
    private EmployeeService employeeService;

    @PostMapping
      public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{eId}")
     public ResponseEntity<Employee> getEmployeeById(@PathVariable Long eId) {
        Optional<Employee> employee = employeeService.getEmployeeById(eId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

      @PutMapping("/{eId}")
    public Employee updateEmployee(@PathVariable Long eId, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(eId, updatedEmployee);
    }

    @DeleteMapping("/{eId}")
     public void deleteEmployee(@PathVariable Long eId) {
        employeeService.deleteEmployee(eId);
    }
}