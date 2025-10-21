package com.ia.terapia.controller;

import com.ia.terapia.model.ProfissionalSaude;
import com.ia.terapia.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalSaudeController {

    @Autowired
    private ProfissionalService service;

    @GetMapping
    public List<ProfissionalSaude> listar() {
        return service.listar();
    }

    @PostMapping
    public ProfissionalSaude criar(@RequestBody ProfissionalSaude profissional) {
        return service.salvar(profissional);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfissionalSaude> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public Optional<ProfissionalSaude> atualizar(@PathVariable Long id, @RequestBody ProfissionalSaude saude) {
        return service.buscarPorId(id);
    }
}

