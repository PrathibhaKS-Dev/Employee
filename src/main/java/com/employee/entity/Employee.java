package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    private int id;
    private String name;
    private String department;
    private Double salary;
    private String address;
    private Long phoneNumber;

}
