package com.ia.terapia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Autoavaliacao {
    @Id @GeneratedValue
    private Long id;
    private String humor;
    private String observacoes;

    @ManyToOne
    private Paciente paciente;
}


