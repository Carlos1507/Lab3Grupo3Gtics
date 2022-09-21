package com.example.lab3gtics.Repository;

import com.example.lab3gtics.DTO.DepartamentoLista;
import com.example.lab3gtics.DTO.EmpleadoLista;
import com.example.lab3gtics.Entity.Employees;
import com.example.lab3gtics.Entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DepartmentRepository {
    @Query(nativeQuery = true, value = "SELECT  d.department_name as 'Departamento', COUNT(*) as 'Cantidad de Empleados',  SUM(e.salary)\n" +
            "as ' Salario Total', TRUNCATE(AVG(e.salary),2) as 'Salario Promedio'  FROM  employees e \n" +
            "inner join departments d on (e.department_id = d.department_id) group by d.department_name order by COUNT(*) desc;")
    List<DepartamentoLista> listarDepartamentos(String filtro);
}
