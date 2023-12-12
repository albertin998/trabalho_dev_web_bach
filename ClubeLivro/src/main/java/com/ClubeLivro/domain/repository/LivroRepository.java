package com.ClubeLivro.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.ClubeLivro.domain.model.Livro;

  @Repository
  public interface LivroRepository extends JpaRepository<Livro, Long> {	
  }	

