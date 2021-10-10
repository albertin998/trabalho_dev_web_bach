package com.Tcc.domain.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tarefa")
public class Tarefa1 {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Integer tarefa_id;
  
  private Integer usuario_id;
  public Integer getSolicitacao_id() {
	return solicitacao_id;
}

public void setSolicitacao_id(Integer solicitacao_id) {
	this.solicitacao_id = solicitacao_id;
}

public Integer getEtapa_id() {
	return etapa_id;
}

public void setEtapa_id(Integer etapa_id) {
	this.etapa_id = etapa_id;
}

private LocalDateTime data_cadastro;
  private LocalDateTime data_entrega;
  private LocalTime tempo_gasto;
  private String texto;
  private Integer solicitacao_id;
  private Integer etapa_id;


public Integer getTarefa_id() {
  return tarefa_id;
}

public void setTarefa_id(Integer tarefa_id) {
  this.tarefa_id = tarefa_id;
}

public Integer getUsuario_id() {
  return usuario_id;
}

public void setUsuario_id(Integer usuario_id) {
  this.usuario_id = usuario_id;
}

public LocalDateTime getData_cadastro() {
  return data_cadastro;
}

public void setData_cadastro(LocalDateTime data_cadastro) {
  this.data_cadastro = data_cadastro;
}

public LocalDateTime getData_entrega() {
  return data_entrega;
}

public void setData_entrega(LocalDateTime data_entrega) {
  this.data_entrega = data_entrega;
}

public LocalTime getTempo_gasto() {
  return tempo_gasto;
}

public void setTempo_gasto(LocalTime tempo_gasto) {
  this.tempo_gasto = tempo_gasto;
}

public String getTexto() {
  return texto;
}

public void setTexto(String texto) {
  this.texto = texto;
}



}
