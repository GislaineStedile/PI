package com.ia.terapia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Paciente {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String humorAtual;

    @OneToMany(mappedBy = "paciente")
    private List<Autoavaliacao> autoavaliacoes;

    @OneToMany(mappedBy = "paciente")
    private List<TCC> tccRecebidos;
}

