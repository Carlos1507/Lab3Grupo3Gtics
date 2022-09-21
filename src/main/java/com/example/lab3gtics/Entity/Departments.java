package com.example.lab3gtics.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Departments {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "department_id")
    private int departmentId;
    @Basic
    @Column(name = "department_name")
    private String departmentName;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employees manager;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations location;
}
