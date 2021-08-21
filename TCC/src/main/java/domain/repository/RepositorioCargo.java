package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comTCC.domain.model.Cargo;

public class RepositorioCargo {
  @Repository
  public interface CargoRepository extends JpaRepository<Cargo, Long> {	
		  
  }	

}
