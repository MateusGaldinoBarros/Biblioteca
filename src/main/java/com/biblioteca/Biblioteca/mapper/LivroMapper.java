package com.biblioteca.Biblioteca.mapper;

import com.biblioteca.Biblioteca.DTO.LivroDto;
import com.biblioteca.Biblioteca.model.Livro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    Livro toEntity(LivroDto livroDto);
    LivroDto toDto (Livro livro);
}
