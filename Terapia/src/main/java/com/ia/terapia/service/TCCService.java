package com.ia.terapia.service;

import com.ia.terapia.model.TCC;
import com.ia.terapia.repository.TCCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TCCService {

    @Autowired
    private TCCRepository repository;

    public List<TCC> listar() {
        return repository.findAll();
    }

    public TCC salvar(TCC tcc) {
        return repository.save(tcc);
    }

    public Optional<TCC> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
