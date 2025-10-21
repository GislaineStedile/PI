package com.ia.terapia.service;

import com.ia.terapia.model.Paciente;
import com.ia.terapia.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository repo;

    public List<Paciente> listar() { return repo.findAll(); }
    public Paciente salvar(Paciente p) {
        return repo.save(p); }
    public Optional<Paciente> buscarPorId(Long id) { return repo.findById(id); }
}
