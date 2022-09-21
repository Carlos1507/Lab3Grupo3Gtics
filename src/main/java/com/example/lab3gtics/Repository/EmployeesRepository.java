package com.example.lab3gtics.Repository;

import com.example.lab3gtics.DTO.EmpleadoLista;
import com.example.lab3gtics.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer> {
    @Query(nativeQuery = true, value = "")
    List<EmpleadoLista> buscarEmpleados(String a);
}
