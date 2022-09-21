package com.example.lab3gtics.Repository;

import com.example.lab3gtics.DTO.EmpleadoLista;
import com.example.lab3gtics.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee,Integer> {
    @Query(nativeQuery = true, value = "select e.first_name, e.last_name,j.job_title,d.department_name, l.city from employees e " +
            "inner join departments d on e.department_id = d.department_id " +
            "inner join locations l on d.location_id = l.location_id " +
            "inner join jobs j on j.job_id=e.job_id " +
            "where (e.first_name like %?1% or e.last_name like %?1% or " +
            "       j.job_title like %?1% or d.department_name like %?1% or l.city like %?1%)")
    List<EmpleadoLista> buscarEmpleados(String filtro);
}
