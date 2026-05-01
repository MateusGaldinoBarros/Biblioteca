package com.biblioteca.Biblioteca.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String titulo;

    @ElementCollection
    @CollectionTable(name = "livro_autores", joinColumns = @JoinColumn(name = "livro_id"))
    @Column(name = "autor", nullable = false)
    private List<String> autores;

    private String editora;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    private Integer quantidade;

    public Livro() {
    }

    public Livro(Long id, String isbn, String titulo, List<String> autores, String editora, LocalDate dataPublicacao, Integer quantidade) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
