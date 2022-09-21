package com.example.lab3gtics.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadosController {
    @GetMapping(value = "")
    public String(){
        return "";
    }
}
