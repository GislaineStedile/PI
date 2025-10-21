package com.ia.terapia.service;

import com.ia.terapia.model.Emergencia;
import com.ia.terapia.repository.EmergenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmergenciaService {

    @Autowired
    private EmergenciaRepository repository;

    public List<Emergencia> listar() {
        return repository.findAll();
    }

    public Emergencia salvar(Emergencia emergencia) {
        return repository.save(emergencia);
    }

    public Optional<Emergencia> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

