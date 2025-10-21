package com.ia.terapia.service;

import com.ia.terapia.model.Autoavaliacao;
import com.ia.terapia.repository.AutoavaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoavaliacaoService {

    @Autowired
    private AutoavaliacaoRepository repository;

    public List<Autoavaliacao> listar() {
        return repository.findAll();
    }

    public Autoavaliacao salvar(Autoavaliacao autoavaliacao) {
        return repository.save(autoavaliacao);
    }

    public Optional<Autoavaliacao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public ResponseEntity<Void> deletar(Long id) {
        repository.deleteById(id);
        return null;
    }
}
