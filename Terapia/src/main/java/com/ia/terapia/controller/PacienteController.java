package com.ia.terapia.controller;

import com.ia.terapia.model.Paciente;
import com.ia.terapia.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService service;

    @GetMapping
    public List<Paciente> listar() { return service.listar(); }

    @PostMapping
    public Paciente criar(@RequestBody Paciente paciente) {
        return service.salvar(paciente);
    }

    @PutMapping("/{id}")
    public Optional<Paciente> atualizar(@PathVariable Long id, @RequestBody Paciente dados) {
        return service.buscarPorId(id);
    }
}
