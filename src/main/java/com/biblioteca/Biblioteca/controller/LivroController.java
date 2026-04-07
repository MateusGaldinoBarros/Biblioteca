package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    @Autowired
    public LivroController (LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping()
    public ResponseEntity<LivroDto> criarlivro(@RequestBody LivroDto livroDto) {
        LivroDto livroCriado = livroService.salvarLivro(livroDto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(livroCriado.getId()).toUri();
        return ResponseEntity.created(location).body(livroCriado);
    }
}
