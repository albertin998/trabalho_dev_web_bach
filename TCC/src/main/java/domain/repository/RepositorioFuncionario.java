package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comTCC.domain.model.Funcionario;

public class RepositorioFuncionario {
  @Repository
  public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {	
  }
}
