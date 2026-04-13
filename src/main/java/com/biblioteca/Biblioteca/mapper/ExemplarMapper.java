package com.biblioteca.Biblioteca.mapper;

import com.biblioteca.Biblioteca.DTO.ExemplarDto;
import com.biblioteca.Biblioteca.model.Exemplar;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExemplarMapper {
    ExemplarMapper INSTANCE = Mappers.getMapper(ExemplarMapper.class);

    Exemplar toEntity(ExemplarDto exemplarDto);
    ExemplarDto toDto (Exemplar exemplar);
}
