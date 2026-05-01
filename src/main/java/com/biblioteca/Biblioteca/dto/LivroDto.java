package com.biblioteca.Biblioteca.dto;

import java.time.LocalDate;
import java.util.List;

public class LivroDto {
    private String isbn;
    private String titulo;
    private List<String> autores;
    private String editora;
    private LocalDate dataPublicacao;
    private Integer quantidade;

    public LivroDto() {
    }

    public LivroDto(String isbn, String titulo, List<String> autores, String editora, LocalDate dataPublicacao, Integer quantidade) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.quantidade = quantidade;
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
