package com.ia.terapia.controller;

import com.ia.terapia.model.TCC;
import com.ia.terapia.service.TCCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tccs")
public class TCCController {

    @Autowired
    private TCCService service;

    @GetMapping
    public List<TCC> listar() {
        return service.listar();
    }

    @PostMapping
    public TCC criar(@RequestBody TCC tcc) {
        return service.salvar(tcc);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TCC> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TCC> atualizar(@PathVariable Long id, @RequestBody TCC dados) {
        return service.buscarPorId(id)
                .map(t -> {
                    t.setTitulo(dados.getTitulo());
                    t.setConteudo(dados.getConteudo());
                    return ResponseEntity.ok(service.salvar(t));
                }).orElse(ResponseEntity.notFound().build());
    }
}

