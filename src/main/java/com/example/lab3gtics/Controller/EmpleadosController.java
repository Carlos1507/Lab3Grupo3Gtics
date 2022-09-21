package com.example.lab3gtics.Controller;

import com.example.lab3gtics.Entity.Employee;
import com.example.lab3gtics.Entity.Job;
import com.example.lab3gtics.DTO.EmpleadoLista;
import com.example.lab3gtics.Repository.EmployeesRepository;
import com.example.lab3gtics.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "")
public class EmpleadosController {
    @Autowired
    EmployeesRepository employeesRepository;
    @Autowired
    JobRepository jobRepository;

    @GetMapping(value = "")
    public String index(Model model){
        model.addAttribute("listaempleados", employeesRepository.findAll());
        return "principal";
    }

    @PostMapping(value = "busqueda")
    public String buscar(@RequestParam(value = "buscar") String buscar,
                         Model model){
        List<EmpleadoLista> lista= employeesRepository.buscarEmpleados(buscar);
        model.addAttribute("listaEmpleados", lista);
        return "principal";
    }

    @GetMapping(value = "usuario/nuevo")
    public String nuevoUsuario(Model model){
        Employee employee = new Employee();
        List<Job> puestos = jobRepository.findAll();
        model.addAttribute("listapuestos", puestos);
        model.addAttribute("usuario", employee);
        model.addAttribute("listajefes",employeesRepository.findAll());
        return "nuevoUsuario";
    }

    @PostMapping(value = "usuario/guardar")
    public String guardarUsuario(Employee employee){
        employeesRepository.save(employee);
        return "redirect:/";
    }

}
