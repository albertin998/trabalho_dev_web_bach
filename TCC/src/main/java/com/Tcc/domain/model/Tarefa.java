package com.Tcc.domain.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tarefa")
public class Tarefa {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Integer tarefa_id;
  
  private Integer usuario_id;
  private LocalDate data_cadastro;
  private LocalDate data_entrega;
  private LocalTime tempo_gasto;
  private String texto; 

@ManyToOne
@JoinColumn(name="solicitacao_id")
  private Solicitacao solicitacao;

@ManyToOne
@JoinColumn(name="etapa_id")
private Etapa etapa;
  

public Etapa getEtapa() {
	return etapa;
}

public void setEtapa(Etapa etapa) {
	this.etapa = etapa;
}

public Solicitacao getSolicitacao() {
	return solicitacao;
}

public void setSolicitacao(Solicitacao solicitacao) {
	this.solicitacao = solicitacao;
}

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

public LocalDate getData_cadastro() {
  return data_cadastro;
}

public void setData_cadastro(LocalDate data_cadastro) {
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

public String getTexto() {
  return texto;
}

public void setTexto(String texto) {
  this.texto = texto;
}



}
