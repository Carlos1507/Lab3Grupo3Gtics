package com.example.lab3gtics.Repository;

import com.example.lab3gtics.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {
}
