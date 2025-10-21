package com.ia.terapia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String index() {
        return "index"; // busca index.html em templates
    }

    @GetMapping("/paciente")
    public String paciente() {
        return "paciente";
    }

    @GetMapping("/profissional")
    public String profissional() {
        return "profissional";
    }

    @GetMapping("/sistemaia")
    public String sistemaia() {
        return "sistemaia";
    }

    @GetMapping("/emergencia")
    public String emergencia() {
        return "emergencia";
    }
}
