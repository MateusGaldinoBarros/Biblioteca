package com.biblioteca.Biblioteca.model;

import jakarta.persistence.*;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Entity
@Table(name = "Exemplar")
public class Exemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private Livro livro;

    @OneToMany(mappedBy = "exemplar")
    private List <Emprestimo> emprestimos;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "multa")
    private double multa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }


}
