package com.example.lab3gtics.Repository;

import com.example.lab3gtics.Entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, String> {
}
