package com.ia.terapia.controller;

import com.ia.terapia.model.Autoavaliacao;
import com.ia.terapia.service.AutoavaliacaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/autoavaliacoes")
public class AutoavaliacaoController {
    private final AutoavaliacaoService service;

    public AutoavaliacaoController(AutoavaliacaoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("autoavaliacoes", service.listar());
        return "autoavaliacoes";
    }

    @PostMapping
    public String salvar(@ModelAttribute Autoavaliacao auto) {
        service.salvar(auto);
        return "redirect:/autoavaliacoes";
    }
}
