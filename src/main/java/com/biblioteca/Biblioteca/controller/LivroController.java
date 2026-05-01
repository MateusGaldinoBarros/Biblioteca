package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.dto.LivroDto;
import com.biblioteca.Biblioteca.model.Livro;
import com.biblioteca.Biblioteca.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public ResponseEntity<Livro> criarLivro(@RequestBody LivroDto livroDto) {
        Livro novoLivro = livroService.criarLivro(livroDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
    }
}
