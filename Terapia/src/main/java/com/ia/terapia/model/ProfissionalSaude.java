package com.ia.terapia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class ProfissionalSaude {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String especialidade;

    @ManyToMany
    private List<Paciente> pacientes;
}
