package com.biblioteca.Biblioteca.DTO;

public class ExemplarDto {
    private long id;
    private long livroId;
    private String status;


    public ExemplarDto(long id, long livroId, String status) {
        this.id = id;
        this.livroId = livroId;
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

    public long getLivroId() {
        return livroId;
    }

    public void setLivroId(long livroId) {
        this.livroId = livroId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
