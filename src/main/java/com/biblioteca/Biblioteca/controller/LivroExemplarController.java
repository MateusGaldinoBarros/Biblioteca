package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.useCase.CriarLivroComExemplaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/livros")
@RestController
public class LivroExemplarController {
    private final CriarLivroComExemplaresService criarLivroComExemplaresService;


    @Autowired
    public LivroExemplarController (CriarLivroComExemplaresService criarLivroComExemplaresService) {
        this.criarLivroComExemplaresService = criarLivroComExemplaresService;
    }

    @PostMapping("/exemplar")
    public ResponseEntity<List<ExemplarDto>> criarExemplares(@RequestParam int quantidade, @RequestBody LivroDto livroDto) {
        List<ExemplarDto> exemplaresCriados = criarLivroComExemplaresService.criarLivroComExemplares(livroDto, quantidade);

        return ResponseEntity.ok(exemplaresCriados);
    }
}
