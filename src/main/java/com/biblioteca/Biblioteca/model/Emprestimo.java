package com.biblioteca.Biblioteca.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "exemplar_id", nullable = false)
    private Exemplar exemplar;

}
