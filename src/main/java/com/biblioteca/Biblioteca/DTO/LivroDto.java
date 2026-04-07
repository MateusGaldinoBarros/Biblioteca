package com.biblioteca.Biblioteca.DTO;

import java.util.List;

public class LivroDto {
    private long id;

    private long apiExternalId;

    private String titulo;

    private List<String> autores;

    private long capaId;

    public LivroDto(long apiExternalId, String titulo, List<String> autores, long capaId) {
        this.apiExternalId = apiExternalId;
        this.titulo = titulo;
        this.autores = autores;
        this.capaId = capaId;
    }

    public LivroDto() {
    }

    public long getApiExternalId() {
        return apiExternalId;
    }

    public void setApiExternalId(long apiExternalId) {
        this.apiExternalId = apiExternalId;
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

    public long getCapaId() {
        return capaId;
    }

    public void setCapaId(long capaId) {
        this.capaId = capaId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
