package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comTCC.domain.model.Tarefa;

public class RepositorioTarefa {
  @Repository
  public interface TarefaRepository extends JpaRepository<Tarefa, Long> {	
  }    
}
