package com.Tcc.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cliente {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private Long cliente_id;
  
  private Long usuario_id;
  private String nome_empresa;
  private String status;
  
public Long getCliente_id() {
  return cliente_id;
}

public void setCliente_id(Long cliente_id) {
  this.cliente_id = cliente_id;
}

public Long getUsuario_id() {
  return usuario_id;
}

public void setUsuario_id(Long usuario_id) {
  this.usuario_id = usuario_id;
}

public String getNome_empresa() {
  return nome_empresa;
}

public void setNome_empresa(String nome_empresa) {
  this.nome_empresa = nome_empresa;
}

public String getStatus() {
  return status;
}

public void setStatus(String status) {
  this.status = status;
}
    
}



