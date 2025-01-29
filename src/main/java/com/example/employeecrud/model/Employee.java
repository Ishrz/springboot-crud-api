package com.example.employeecrud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long eId;

    private String name;
    private int age;
      private String department;
}