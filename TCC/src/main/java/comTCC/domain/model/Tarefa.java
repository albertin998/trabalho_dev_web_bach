package comTCC.domain.model;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Tarefa {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private int tarefa_id;
  
  private int funcionario_id;
  private LocalDateTime data_cadastro;
  private LocalDateTime data_entrega;
  private LocalTime tempo_gasto;
  private Blob texto;
  private int etapa_id;
  private int solicitacao_id;
  
public int getTarefa_id() {
  return tarefa_id;
}

public void setTarefa_id(int tarefa_id) {
  this.tarefa_id = tarefa_id;
}

public int getFuncionario_id() {
  return funcionario_id;
}

public void setFuncionario_id(int funcionario_id) {
  this.funcionario_id = funcionario_id;
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

public Blob getTexto() {
  return texto;
}

public void setTexto(Blob texto) {
  this.texto = texto;
}

public int getEtapa_id() {
  return etapa_id;
}

public void setEtapa_id(int etapa_id) {
  this.etapa_id = etapa_id;
}

public int getSolicitacao_id() {
  return solicitacao_id;
}

public void setSolicitacao_id(int solicitacao_id) {
  this.solicitacao_id = solicitacao_id;
}

}
