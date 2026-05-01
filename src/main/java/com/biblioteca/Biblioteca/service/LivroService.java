package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.exception.exceptions.LivroNaoCriadoException;
import com.biblioteca.Biblioteca.model.Livro;
import com.biblioteca.Biblioteca.dto.LivroDto;
import com.biblioteca.Biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro criarLivro(LivroDto dto, int quantidade) {
        try {
            Livro livro = new Livro();
            livro.setIsbn(dto.getIsbn());
            livro.setTitulo(dto.getTitulo());
            livro.setAutores(dto.getAutores());
            livro.setEditora(dto.getEditora());
            livro.setDataPublicacao(dto.getDataPublicacao());
            livro.setQuantidade(quantidade);
            
            return livroRepository.save(livro);
        } catch (Exception e) {
            throw new LivroNaoCriadoException("Erro ao salvar o livro: " + e.getMessage());
        }
    }
}
