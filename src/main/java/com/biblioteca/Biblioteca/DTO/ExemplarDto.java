package com.biblioteca.Biblioteca.DTO;

public class ExemplarDto {
    private long id;
    private long livro_id;
    private String status;


    public ExemplarDto(long id, long livro_id, String status) {
        this.id = id;
        this.livro_id = livro_id;
        this.status = status;
    }

    public ExemplarDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(long livro_id) {
        this.livro_id = livro_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
