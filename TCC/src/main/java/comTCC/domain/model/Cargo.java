package comTCC.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cargo {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long cargo_id;
  
  private String descricao;

public Long getCargo_id() {
  return cargo_id;
}

public void setCargo_id(Long cargo_id) {
  this.cargo_id = cargo_id;
}

public String getDescricao() {
  return descricao;
}

public void setDescricao(String descricao) {
  this.descricao = descricao;
}
  
}
	        