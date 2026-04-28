package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.model.Emprestimo;
import com.biblioteca.Biblioteca.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;

    @Autowired
    public EmprestimoService (EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public Emprestimo realizarEmprestimo (ExemplarDto exemplarDto) {
        return  
    }
}
