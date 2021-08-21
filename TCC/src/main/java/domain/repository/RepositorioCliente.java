package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comTCC.domain.model.Cliente;

public class RepositorioCliente {
  @Repository
  public interface ClienteRepository extends JpaRepository<Cliente, Long> {	
  }
}
