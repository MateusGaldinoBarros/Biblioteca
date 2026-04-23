package com.biblioteca.Biblioteca;

import com.biblioteca.Biblioteca.mapper.ExemplarMapper;
import com.biblioteca.Biblioteca.repository.ExemplarRepository;
import com.biblioteca.Biblioteca.repository.LivroRepository;
import com.biblioteca.Biblioteca.service.ExemplarService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExemplarServiceTest {
    @Mock
    private ExemplarRepository exemplarRepositor;
    @Mock
    private LivroRepository livroRepository;
    @Mock
    private ExemplarMapper exemplarMapper;

    @InjectMocks
    public ExemplarService exemplarService;
}