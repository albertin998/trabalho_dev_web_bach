package comTCC.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Etapa {

  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long etapa_id;
  
  private String descricao;

public Long getEtapa_id() {
  return etapa_id;
}

public void setEtapa_id(Long etapa_id) {
  this.etapa_id = etapa_id;
}

public String getDescricao() {
  return descricao;
}

public void setDescricao(String descricao) {
  this.descricao = descricao;
}
 
  
}