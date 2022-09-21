package com.example.lab3gtics.Repository;

import com.example.lab3gtics.Entity.JobHistory;
import com.example.lab3gtics.Entity.JobHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepository extends JpaRepository<JobHistory, JobHistoryId> {
}
