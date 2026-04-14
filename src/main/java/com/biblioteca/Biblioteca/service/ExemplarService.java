package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.exception.exceptions.LivroNaoEncontradoException;
import com.biblioteca.Biblioteca.mapper.ExemplarMapper;
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
    private final ExemplarMapper exemplarMapper;

    @Autowired
    public ExemplarService (ExemplarRepository exemplarRepository, LivroRepository livroRepository, ExemplarMapper exemplarMapper){
        this.exemplarRepository = exemplarRepository;
        this.livroRepository = livroRepository;
        this.exemplarMapper = exemplarMapper;
    }

    public ExemplarDto criarExemplar(ExemplarDto exemplarDto) {
        if (livroRepository.existsById(exemplarDto.getLivroId())) {
            Exemplar dtoEntity = exemplarMapper.toEntity(exemplarDto);
            dtoEntity.setStatus("DISPONIVEL");
            dtoEntity = exemplarRepository.save(dtoEntity);
            return exemplarMapper.toDto(dtoEntity);
        }else {
            throw new LivroNaoEncontradoException("LIVRO NÃO ENCONTRADO NO BANCO DE DADOS");
        }
    }


}
