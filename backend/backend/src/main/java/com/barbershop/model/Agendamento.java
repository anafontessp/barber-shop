package com.barbershop.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;
    private String cliente;
    private String servico;

    // Getters e setters
}
