package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.exception.exceptions.LivroNaoCriadoException;
import com.biblioteca.Biblioteca.model.Livro;
import com.biblioteca.Biblioteca.dto.LivroDto;
import com.biblioteca.Biblioteca.repository.LivroRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LivroServiceTest {

    @Mock
    private LivroRepository livroRepository;

    @InjectMocks
    private LivroService livroService;

    @Test
    @DisplayName("Deve criar um livro com sucesso")
    void deveCriarLivroComSucesso() {
        // Arrange
        int quantidade = 10;
        LivroDto dto = new LivroDto("123456", "Título Teste", List.of("Autor"), "Editora", LocalDate.now(), quantidade);
        
        Livro livroSalvo = new Livro();
        livroSalvo.setId(1L);
        livroSalvo.setIsbn(dto.getIsbn());
        livroSalvo.setTitulo(dto.getTitulo());
        livroSalvo.setAutores(dto.getAutores());
        livroSalvo.setEditora(dto.getEditora());
        livroSalvo.setDataPublicacao(dto.getDataPublicacao());
        livroSalvo.setQuantidade(dto.getQuantidade());

        when(livroRepository.save(any(Livro.class))).thenReturn(livroSalvo);

        // Act
        Livro resultado = livroService.criarLivro(dto);

        // Assert
        assertNotNull(resultado);
        assertEquals(dto.getIsbn(), resultado.getIsbn());
        assertEquals(quantidade, resultado.getQuantidade());
        verify(livroRepository, times(1)).save(any(Livro.class));
    }

    @Test
    @DisplayName("Deve lançar LivroNaoCriadoException quando o repositório falhar")
    void deveLancarExceptionQuandoFalhar() {
        // Arrange
        LivroDto dto = new LivroDto("123456", "Título Teste", List.of("Autor"), "Editora", LocalDate.now(), 5);

        when(livroRepository.save(any(Livro.class))).thenThrow(new RuntimeException("Erro de banco"));

        // Act & Assert
        assertThrows(LivroNaoCriadoException.class, () -> {
            livroService.criarLivro(dto);
        });
        
        verify(livroRepository, times(1)).save(any(Livro.class));
    }
}
