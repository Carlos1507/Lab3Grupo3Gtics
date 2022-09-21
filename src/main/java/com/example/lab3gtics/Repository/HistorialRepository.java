package com.example.lab3gtics.Repository;

import com.example.lab3gtics.DTO.Historial_lista;
import com.example.lab3gtics.Entity.JobHistory;
import com.example.lab3gtics.Entity.JobHistoryPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistorialRepository extends JpaRepository<JobHistory, Integer> {
@Query(value = "select e.employee_id ,e.first_name, e.last_name, d.department_name, m.employee_id ,m.first_name, m.last_name, j.job_history_id, j.start_date, j.end_date from employees e, departments d, employees m, job_history j where e.department_id = d.department_id and e.manager_id=m.employee_id and e.hire_date = j.start_date and e.job_id = j.job_id\n" +
        "order by j.start_date desc", nativeQuery = true)
List<Historial_lista> obtenerHistorial();
}
