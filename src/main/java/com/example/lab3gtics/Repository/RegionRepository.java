package com.example.lab3gtics.Repository;

import com.example.lab3gtics.Entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface RegionRepository extends JpaRepository<Region,BigDecimal> {
}
