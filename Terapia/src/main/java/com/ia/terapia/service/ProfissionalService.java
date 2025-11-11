package com.ia.terapia.service;

import com.ia.terapia.model.ProfissionalSaude;
import com.ia.terapia.repository.ProfissionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfissionalService {

    private final ProfissionalRepository repository;

    public ProfissionalService(ProfissionalRepository repository) {
        this.repository = repository;
    }

    public List<ProfissionalSaude> listar() { return repository.findAll(); }
    public Optional<ProfissionalSaude> buscarPorId(Long id) { return repository.findById(id); }
    public ProfissionalSaude salvar(ProfissionalSaude p) { return repository.save(p); }
    public void deletar(Long id) {
        if (repository.existsById(id)) repository.deleteById(id);
        else throw new IllegalArgumentException("Profissional não encontrado");
    }
}
