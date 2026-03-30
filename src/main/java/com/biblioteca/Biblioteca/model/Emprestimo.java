package com.biblioteca.Biblioteca.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "exemplar_id", nullable = false)
    private Exemplar exemplar;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario_id;

    @Column(name = "data_emprestimo")
    private LocalDate data_emprestimo;

    @Column(name = "data_devolucao_prevista")
    private LocalDate data_devolucao_prevista;

    @Column(name = "data_devolucao_real")
    private LocalDate data_devolucao_real;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDate getData_devolucao_prevista() {
        return data_devolucao_prevista;
    }

    public void setData_devolucao_prevista(LocalDate data_devolucao_prevista) {
        this.data_devolucao_prevista = data_devolucao_prevista;
    }

    public LocalDate getData_devolucao_real() {
        return data_devolucao_real;
    }

    public void setData_devolucao_real(LocalDate data_devolucao_real) {
        this.data_devolucao_real = data_devolucao_real;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }
}
