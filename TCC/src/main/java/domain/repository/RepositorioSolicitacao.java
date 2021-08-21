package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comTCC.domain.model.Solicitacao;

public class RepositorioSolicitacao {
  @Repository
  public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {	
  }
}
