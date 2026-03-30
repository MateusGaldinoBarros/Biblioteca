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

    @Column(name = "api_external_id")
    private long api_external_id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "colum_url", nullable = false)
    private String colum_url;

    public Livro(){
    }

    public Livro(String titulo, String autor, String isbn, String colum_url){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.colum_url = colum_url;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getColum_url() {
        return colum_url;
    }

    public void setColum_url(String colum_url) {
        this.colum_url = colum_url;
    }
}
