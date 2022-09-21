package com.example.lab3gtics.Controller;

import com.example.lab3gtics.Entity.JobHistory;
import com.example.lab3gtics.Repository.HistorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class HistorialController {

    @Autowired
    HistorialRepository historialRepository;

    @GetMapping(value = {"/list", ""})
    public String listarTransportistas(Model model) {

        List<JobHistory> lista = historialRepository.findAll();
        model.addAttribute("historial_list", lista);

        return "lista_historial";
    }




}
