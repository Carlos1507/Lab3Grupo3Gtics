/* package com.example.lab3gtics.Repository;

import com.example.lab3gtics.DTO.EmpleadoLista;
import com.example.lab3gtics.DTO.PuestoLista;
import com.example.lab3gtics.Entity.Employees;
import com.example.lab3gtics.Entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface JobRepository {
    @Query(nativeQuery = true, value = "SELECT  j.job_title as 'Puesto', CONCAT(\"$ \",j.max_salary) as 'Salario Máximo', CONCAT(\"$ \",j.min_salary) as 'Salario Mínimo' ,  CONCAT(\"$ \",SUM(e.salary))\n" +
            "as ' Salario Total', CONCAT(\"$ \",TRUNCATE(AVG(e.salary),2)) as 'Salario Promedio' FROM  employees e inner join jobs j on (e.job_id = j.job_id) group by j.job_id;")
    List<PuestoLista> listarPuestos(String filtro);
}
*/
