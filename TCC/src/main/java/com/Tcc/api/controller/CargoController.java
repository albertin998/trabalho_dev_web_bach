package com.Tcc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.Tcc.domain.model.Cargo;
import com.Tcc.domain.repository.CargoRepository;

@RestController
public class CargoController {
	
  @Autowired
  private CargoRepository CargoRepository;
	
  @PostMapping("/Cargos")
  @ResponseStatus(HttpStatus.CREATED)
  public Cargo Adicionar(@RequestBody Cargo cargo) {
    return CargoRepository.save(cargo);    
  }	
	
	
  @GetMapping("/Cargos")
  public List<Cargo> Listar(){	  				
	return CargoRepository.findAll();		
  }	
		
  @GetMapping("/Cargos/{cargo_id}")
  public ResponseEntity<Cargo> Buscar(@PathVariable Long cargo_id) {
    Optional<Cargo> cargo = CargoRepository.findById(cargo_id);
		
	if (cargo.isPresent()) {
	  return ResponseEntity.ok(cargo.get());
	}
		
	return ResponseEntity.notFound().build(); 	
  }
	
	
  @PutMapping("/Cargos/{cargo_id}")
  public ResponseEntity<Cargo> Atualizar(@PathVariable Long cargo_id, @RequestBody Cargo cargo){
	
    if (!CargoRepository.existsById(cargo_id)) {
	  return ResponseEntity.notFound().build();
	}
		
	cargo.setCargo_id(cargo_id);
	cargo = CargoRepository.save(cargo);
		
	return ResponseEntity.ok(cargo);
  }
	
	
  @DeleteMapping("/Cargos/{cargo_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Long cargo_id){
    if (!CargoRepository.existsById(cargo_id)) {
      return ResponseEntity.notFound().build();
	}
		
	CargoRepository.deleteById(cargo_id);
		
	return ResponseEntity.noContent().build();
  }
}
