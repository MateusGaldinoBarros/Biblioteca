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

    @Column(name = "api_External_Id")
    private long api_External_Id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @ElementCollection
    @CollectionTable(name = "autores")
    @Column(name = "nome")
    private List<String> autores;

    @Column(name = "colum_url", nullable = false)
    private String colum_Url;

    public Livro(){
    }

    public Livro(String titulo, List autores, String colum_Url){
        this.titulo = titulo;
        this.autores = autores;
        this.colum_Url = colum_Url;
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
        this.autores = this.autores;
    }

    public String getColum_Url() {
        return colum_Url;
    }

    public void setColum_url(String colum_url) {
        this.colum_Url = colum_Url;
    }
}