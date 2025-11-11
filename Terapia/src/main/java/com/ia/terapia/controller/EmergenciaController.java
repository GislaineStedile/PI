package com.ia.terapia.controller;

import com.ia.terapia.service.EmergenciaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/emergencias")
public class EmergenciaController {
    private final EmergenciaService service;

    public EmergenciaController(EmergenciaService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("emergencias", service.listar());
        return "emergencia";
    }
}

