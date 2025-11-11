package com.ia.terapia.service;

import com.ia.terapia.model.Paciente;
import com.ia.terapia.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listar() { return repository.findAll(); }
    public Optional<Paciente> buscarPorId(Long id) { return repository.findById(id); }
    public Paciente salvar(Paciente p) { return repository.save(p); }
    public void deletar(Long id) {
        if (repository.existsById(id)) repository.deleteById(id);
        else throw new IllegalArgumentException("Paciente não encontrado");
    }
}

