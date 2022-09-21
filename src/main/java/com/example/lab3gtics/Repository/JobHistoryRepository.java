package com.example.lab3gtics.Repository;

import com.example.lab3gtics.Entity.JobHistory;
import com.example.lab3gtics.Entity.JobHistoryPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryPK> {
}
