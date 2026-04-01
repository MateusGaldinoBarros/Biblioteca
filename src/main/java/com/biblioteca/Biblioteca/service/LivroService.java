package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.exception.exceptions.LivroJaExisteException;
import com.biblioteca.Biblioteca.mapper.LivroMapper;
import com.biblioteca.Biblioteca.model.Livro;
import com.biblioteca.Biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LivroService {
    private final LivroRepository livroRepository;
    private final LivroMapper livroMapper;
    @Autowired
    public LivroService (LivroRepository livroRepository, LivroMapper livroMapper) {
        this.livroRepository = livroRepository;
        this.livroMapper = livroMapper;
    }

    public LivroDto salvarLivro(LivroDto dto) {
        if (livroRepository.existsByApi_external_id(dto.getApiExternalId())) {
            throw new LivroJaExisteException("LIVRO JÁ EXISTE NO ACERVO");
        }else {
            Livro dtoEntity = livroMapper.toEntity(dto);
            livroRepository.save(dtoEntity);
            return livroMapper.toDto(dtoEntity);
        }
    }

}
