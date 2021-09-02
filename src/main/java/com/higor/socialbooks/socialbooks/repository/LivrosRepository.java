package com.higor.socialbooks.socialbooks.repository;

import com.higor.socialbooks.socialbooks.domain.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livro, Long>{
    
}
