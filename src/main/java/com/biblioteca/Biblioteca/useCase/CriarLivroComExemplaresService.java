package com.biblioteca.Biblioteca.useCase;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.service.ExemplarService;
import com.biblioteca.Biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriarLivroComExemplaresService {
    private final LivroService livroService;
    private final ExemplarService exemplarService;

    @Autowired
    public CriarLivroComExemplaresService (LivroService livroService, ExemplarService exemplarService) {
        this.livroService = livroService;
        this.exemplarService = exemplarService;
    }

    public List<ExemplarDto> criarLivroComExemplares (LivroDto livroDto, int quantidade) {
        LivroDto livroNovo = livroService.salvarLivro(livroDto);
        long livroId = livroNovo.getId();
        List<ExemplarDto> exemplarDtoList = exemplarService.criarExemplares(livroId,quantidade);
        return exemplarDtoList;
    }
}
