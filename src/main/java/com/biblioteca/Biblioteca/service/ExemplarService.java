package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.model.Exemplar;
import com.biblioteca.Biblioteca.model.Livro;
import com.biblioteca.Biblioteca.repository.ExemplarRepository;
import com.biblioteca.Biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExemplarService {
    private final ExemplarRepository exemplarRepository;
    private final LivroRepository livroRepository;

    @Autowired
    public ExemplarService (ExemplarRepository exemplarRepository, LivroRepository livroRepository){
        this.exemplarRepository = exemplarRepository;
        this.livroRepository = livroRepository;
    }

    public ExemplarDto criarExemplar(ExemplarDto exemplarDto, Livro livro) {
        if (livroRepository.existsById(Livro.getId())) {




        }
        return exemplarDto;
    }


}
