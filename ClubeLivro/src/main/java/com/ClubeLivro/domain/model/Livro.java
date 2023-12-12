package com.ClubeLivro.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Livro {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long livro_id;
  
  private String NOME_LIVRO;
  
  private String DESCRICAO;

public Long getlivro_id() {
  return livro_id;
}

public void setLivro_id(Long livro_id) {
  this.livro_id = livro_id;
}

public String getNome_livro() {
  return NOME_LIVRO;
}

public void setNome_livro(String nome_livro) {
  this.NOME_LIVRO = nome_livro;
}

public String getDescricao() {
	  return DESCRICAO;
	}

	public void setDescricao(String descricao) {
	  this.DESCRICAO = descricao;
	}
  
}
	        