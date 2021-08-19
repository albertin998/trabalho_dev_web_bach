package comTCC.domain.model;

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
  private int solicitacao_id;
  
  private int cliente_id;
  private LocalDateTime data_cadastro;
  private LocalDateTime data_entrega;
  private LocalTime tempo_gasto;
  
public int getSolicitacao_id() {
  return solicitacao_id;
}

public void setSolicitacao_id(int solicitacao_id) {
  this.solicitacao_id = solicitacao_id;
}

public int getCliente_id() {
  return cliente_id;
}

public void setCliente_id(int cliente_id) {
  this.cliente_id = cliente_id;
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
  
}

