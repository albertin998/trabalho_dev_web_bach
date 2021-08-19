package comTCC.domain.model;

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
  private int funcionario_id;
  
  private int usuario_id;
  private int cargo_id;
  private String status;
  
public int getFuncionario_id() {
  return funcionario_id;
}

public void setFuncionario_id(int funcionario_id) {
  this.funcionario_id = funcionario_id;
}

public int getUsuario_id() {
  return usuario_id;
}

public void setUsuario_id(int usuario_id) {
  this.usuario_id = usuario_id;
}

public int getCargo_id() {
  return cargo_id;
}

public void setCargo_id(int cargo_id) {
  this.cargo_id = cargo_id;
}

public String getStatus() {
  return status;
}

public void setStatus(String status) {
  this.status = status;
}
  
}
