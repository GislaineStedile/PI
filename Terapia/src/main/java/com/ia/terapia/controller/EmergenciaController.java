package com.ia.terapia.controller;

import com.ia.terapia.model.Emergencia;
import com.ia.terapia.service.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emergencias")
public class EmergenciaController {

    @Autowired
    private EmergenciaService service;

    @GetMapping
    public List<Emergencia> listar() {
        return service.listar();
    }

    @PostMapping
    public Emergencia criar(@RequestBody Emergencia emergencia) {
        return service.salvar(emergencia);
    }

    @GetMapping("/{id}")
    public Optional<Emergencia> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emergencia> deletar(@PathVariable Long id) {
        service.deletar(id);
        return null;
    }
}
