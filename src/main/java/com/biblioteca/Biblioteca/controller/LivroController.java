package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    @Autowired
    public LivroController (LivroService livroService) {
        this.livroService = livroService;
    }

    public LivroService getLivroService() {
        return livroService;
    }

    @PostMapping()
    public LivroDto livroDto(@RequestBody LivroDto livroDto) {

    }
}
