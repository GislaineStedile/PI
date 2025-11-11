package com.ia.terapia.controller;

import com.ia.terapia.model.TCC;
import com.ia.terapia.service.TCCService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tcc")
public class TCCController {
    private final TCCService service;

    public TCCController(TCCService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tccs", service.listar());
        return "tcc";
    }

    @PostMapping
    public String salvar(@ModelAttribute TCC tcc) {
        service.salvar(tcc);
        return "redirect:/tcc";
    }
}
