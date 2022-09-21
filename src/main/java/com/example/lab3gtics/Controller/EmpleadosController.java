package com.example.lab3gtics.Controller;

import com.example.lab3gtics.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "")
public class EmpleadosController {
    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping(value = "")
    public String index(Model model){
        model.addAttribute("listaempleados", employeesRepository.findAll());
        return "empleados/principal";
    }

    @PostMapping(value = "busqueda")
    public String buscar(@RequestParam(value = "buscar") String buscar){

        return "empleados/principal";
    }
}
