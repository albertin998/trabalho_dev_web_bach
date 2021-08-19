package domain.repository;

import org.springframework.stereotype.Repository;
import comTCC.domain.model.Usuario;
import comTCC.domain.model.Cargo;
import comTCC.domain.model.Cliente;
import comTCC.domain.model.Etapa;
import comTCC.domain.model.Funcionario;
import comTCC.domain.model.Solicitacao;
import comTCC.domain.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public class RepositorioEntidades {
	
  @Repository
  public interface UsuarioRepository extends JpaRepository<Usuario, Long> {	
  }
  
  @Repository
  public interface CargoRepository extends JpaRepository<Cargo, Long> {	
  }
  
  @Repository
  public interface ClienteRepository extends JpaRepository<Cliente, Long> {	
  }  
  
  @Repository
  public interface EtapaRepository extends JpaRepository<Etapa, Long> {	
  }  
  
  @Repository
  public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {	
  }
  
  @Repository
  public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {	
  }
  
  @Repository
  public interface TarefaRepository extends JpaRepository<Tarefa, Long> {	
  }    
}
