package com.example.lab3gtics.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "job_history", schema = "hr", catalog = "")

public class JobHistory{
    @EmbeddedId
    private JobHistoryPK id;

    @MapsId("jobHistoryId")
    @Column(name = "job_history_id")
    private int jobHistoryId;

    @MapsId("startDate")
    @Column(name = "start_date")
    private Timestamp startDate;

    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "employee_id")
    private Employees employee;

    @Column(name = "end_date")
    private Timestamp endDate;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs job;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department;
}
