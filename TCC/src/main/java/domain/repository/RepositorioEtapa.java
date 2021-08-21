package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comTCC.domain.model.Etapa;

public class RepositorioEtapa {
  @Repository
  public interface EtapaRepository extends JpaRepository<Etapa, Long> {	
  }  
}
