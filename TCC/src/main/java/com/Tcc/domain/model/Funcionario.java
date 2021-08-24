package com.Tcc.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Funcionario {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long funcionario_id;
  
  private Long usuario_id;
  private Long cargo_id;
  private String status;
  
public Long getFuncionario_id() {
  return funcionario_id;
}

public void setFuncionario_id(Long funcionario_id) {
  this.funcionario_id = funcionario_id;
}

public Long getUsuario_id() {
  return usuario_id;
}

public void setUsuario_id(Long usuario_id) {
  this.usuario_id = usuario_id;
}

public Long getCargo_id() {
  return cargo_id;
}

public void setCargo_id(Long cargo_id) {
  this.cargo_id = cargo_id;
}

public String getStatus() {
  return status;
}

public void setStatus(String status) {
  this.status = status;
}
  
}
