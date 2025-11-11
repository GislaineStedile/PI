package com.ia.terapia.controller;

import com.ia.terapia.model.Paciente;
import com.ia.terapia.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pacientes", service.listar());
        return "paciente";
    }

    @PostMapping
    public String salvar(@ModelAttribute Paciente paciente) {
        service.salvar(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/delete/{id}")
    public String deletar(@PathVariable Long id) {
        service.deletar(id);
        return "redirect:/pacientes";
    }
}
