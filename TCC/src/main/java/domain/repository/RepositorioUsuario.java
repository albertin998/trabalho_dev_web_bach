package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comTCC.domain.model.Usuario;

public class RepositorioUsuario {
  @Repository
  public interface UsuarioRepository extends JpaRepository<Usuario, Long> {	
	  
	  
  }
}
