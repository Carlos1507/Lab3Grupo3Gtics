package com.example.lab3gtics.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class HistorialController {

    @Autowired
     ;

    @GetMapping(value = {"/list", ""})
    public String listarTransportistas(Model model) {

        List<> lista = .findAll();
        model.addAttribute("shipperList", lista);

        return "/list";
    }


}
