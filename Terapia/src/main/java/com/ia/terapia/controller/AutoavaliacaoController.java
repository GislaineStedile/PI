package com.ia.terapia.controller;

import com.ia.terapia.model.Autoavaliacao;
import com.ia.terapia.service.AutoavaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autoavaliacoes")
public class AutoavaliacaoController {

    @Autowired
    private AutoavaliacaoService service;

    @GetMapping
    public List<Autoavaliacao> listar() {
        return service.listar();
    }

    @PostMapping
    public Autoavaliacao criar(@RequestBody Autoavaliacao autoavaliacao) {
        return service.salvar(autoavaliacao);
    }

    @GetMapping("/{id}")
    public Optional<Autoavaliacao> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (service.buscarPorId(id).isPresent()) {
            return service.deletar(id);
        }
        return ResponseEntity.notFound().build();
    }
}

