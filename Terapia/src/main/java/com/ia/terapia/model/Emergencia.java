package com.ia.terapia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Emergencia {
    @Id
    @GeneratedValue
    private Long id;
    private String recomendacao;
    private boolean contatoRealizado;

    @ManyToOne
    private Paciente paciente;
}
