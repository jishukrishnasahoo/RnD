package com.edu.orderms.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aindex;
    private String name;
    private String department;
    private Long salary;

}