package com.ia.terapia.service;

import com.ia.terapia.model.ProfissionalSaude;
import com.ia.terapia.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfissionalService {

    @Autowired
    private ProfissionalRepository repository;

    public List<ProfissionalSaude> listar() {
        return repository.findAll();
    }

    public ProfissionalSaude salvar(ProfissionalSaude profissional) {
        return repository.save(profissional);
    }

    public Optional<ProfissionalSaude> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
