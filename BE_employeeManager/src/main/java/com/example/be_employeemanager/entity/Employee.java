package com.example.be_employeemanager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Employee{
    @Id
    @SequenceGenerator(
            name="employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "employee_sequence")
    @Column(name = "id_employee", nullable = false)
    private Long id;

    private String name;
    private String email;
    private String jobTitle;

    @Column(nullable = false, updatable = false)
    private String employeeCode;
}
