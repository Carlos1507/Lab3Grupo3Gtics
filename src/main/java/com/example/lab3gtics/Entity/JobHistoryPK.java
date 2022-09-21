package com.example.lab3gtics.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class JobHistoryPK implements Serializable {
    @Column(name = "job_history_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobHistoryId;

    @Column(name = "start_date")
    private Timestamp startDate;
}
