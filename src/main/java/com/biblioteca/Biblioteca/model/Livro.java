package com.biblioteca.Biblioteca.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany (mappedBy = "livro")
    private List<Exemplar> exemplares;

    @Column(name = "api_external_Id")
    private long apiExternalId;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @ElementCollection
    @CollectionTable(name = "autores")
    @Column(name = "nome")
    private List<String> autores;

    @Column(name = "capaId", nullable = false)
    private long capaId;

    public Livro(){
    }

    public Livro(String titulo, List autores, long capaId){
        this.titulo = titulo;
        this.autores = autores;
        this.capaId = capaId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutor() {
        return autores;
    }

    public void setAutores(List <String> autores) {
        this.autores = autores;
    }

    public long getCapaId() {
        return capaId;
    }

    public void setCapaId(long capaId) {
        this.capaId = capaId;
    }

    public long getApiExternalId() {
        return apiExternalId;
    }

    public void setApiExternalId(long apiExternalId) {
        this.apiExternalId = apiExternalId;
    }


}