package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    boolean existsByApi_external_id(long Api_external_id);
}
