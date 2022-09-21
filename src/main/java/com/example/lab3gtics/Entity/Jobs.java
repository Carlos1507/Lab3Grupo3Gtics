package com.example.lab3gtics.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Jobs {
    @Id
    @Column(name = "job_id")
    private String jobId;
    @Basic
    @Column(name = "job_title")
    private String jobTitle;
    @Basic
    @Column(name = "min_salary")
    private Integer minSalary;
    @Basic
    @Column(name = "max_salary")
    private Integer maxSalary;
}
