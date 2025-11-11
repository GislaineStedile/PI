package com.ia.terapia.controller;

import com.ia.terapia.model.ProfissionalSaude;
import com.ia.terapia.service.ProfissionalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/profissionais")
public class ProfissionalSaudeController {
    private final ProfissionalService service;

    public ProfissionalSaudeController(ProfissionalService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("profissionais", service.listar());
        return "profissional";
    }

    @PostMapping
    public String salvar(@ModelAttribute ProfissionalSaude profissional) {
        service.salvar(profissional);
        return "redirect:/profissionais";
    }

    @GetMapping("/delete/{id}")
    public String deletar(@PathVariable Long id) {
        service.deletar(id);
        return "redirect:/profissionais";
    }
}
