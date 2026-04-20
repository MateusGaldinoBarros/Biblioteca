package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.exception.exceptions.LivroNaoEncontradoException;
import com.biblioteca.Biblioteca.mapper.ExemplarMapper;
import com.biblioteca.Biblioteca.model.Exemplar;
import com.biblioteca.Biblioteca.repository.ExemplarRepository;
import com.biblioteca.Biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<ExemplarDto> criarExemplares(ExemplarDto exemplarDto, int quantidade) {
        if (livroRepository.existsById(exemplarDto.getLivroId())) {
            List<ExemplarDto> exemplarDtoList = new ArrayList<>();
            for (int i = 0; i < quantidade ; i++) {
                Exemplar dtoEntity = exemplarMapper.toEntity(exemplarDto);
                dtoEntity.setStatus("DISPONIVEL");
                dtoEntity = exemplarRepository.save(dtoEntity);
                ExemplarDto exemplarMapperDto= exemplarMapper.toDto(dtoEntity);
                exemplarDtoList.add(exemplarMapperDto);
            }
            return exemplarDtoList;

        }else {
            throw new LivroNaoEncontradoException("LIVRO NÃO ENCONTRADO NO BANCO DE DADOS");
        }
    }


}
