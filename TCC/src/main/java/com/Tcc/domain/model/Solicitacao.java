package com.Tcc.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Solicitacao {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Integer solicitacao_id;                 
  private Integer usuario_id;
  private LocalDateTime data_cadastro;
  private LocalDate data_entrega;
  private LocalTime tempo_gasto;
  private String descricao;


public void setUsuario_id(Integer usuario_id) {
	this.usuario_id = usuario_id;
}

public Integer getSolicitacao_id() {
  return solicitacao_id;
}

public void setSolicitacao_id(Integer solicitacao_id) {
  this.solicitacao_id = solicitacao_id;
}

public Integer getUsuario_id() {
  return usuario_id;
}

public void setCliente_id(Integer usuario_id) {
  this.usuario_id = usuario_id;
}

public LocalDateTime getData_cadastro() {
  return data_cadastro;
}

public void setData_cadastro(LocalDateTime data_cadastro) {
  this.data_cadastro = data_cadastro;
}

public LocalDate getData_entrega() {
  return data_entrega;
}

public void setData_entrega(LocalDate data_entrega) {
  this.data_entrega = data_entrega;
}

public LocalTime getTempo_gasto() {
  return tempo_gasto;
}

public void setTempo_gasto(LocalTime tempo_gasto) {
  this.tempo_gasto = tempo_gasto;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}
  
}

