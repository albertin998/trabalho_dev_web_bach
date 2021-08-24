package com.Tcc.api.controller;

import java.util.List;
import java.util.Optional;

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

import com.Tcc.domain.model.Funcionario;
import com.Tcc.domain.repository.FuncionarioRepository;

@RestController
public class FuncionarioController {
	  
  @Autowired
  private FuncionarioRepository FuncionarioRepository;
				
  @PostMapping("/Funcionarios")
  @ResponseStatus(HttpStatus.CREATED)
  public Funcionario Adicionar(@RequestBody Funcionario Funcionario) {
    return FuncionarioRepository.save(Funcionario);    
  }	
						
  @GetMapping("/Funcionarios")
  public List<Funcionario> Listar(){	  				
    return FuncionarioRepository.findAll();		
  }	
					
  @GetMapping("/Funcionarios/{Funcionario_id}")
  public ResponseEntity<Funcionario> Buscar(@PathVariable Long Funcionario_id) {
    Optional<Funcionario> Funcionario = FuncionarioRepository.findById(Funcionario_id);
					
	if (Funcionario.isPresent()) {
      return ResponseEntity.ok(Funcionario.get());
	}
					
	return ResponseEntity.notFound().build(); 	
  }
					
  @PutMapping("/Funcionarios/{Funcionario_id}")
  public ResponseEntity<Funcionario> Atualizar(@PathVariable Long Funcionario_id, @RequestBody Funcionario Funcionario){
				
    if (!FuncionarioRepository.existsById(Funcionario_id)) {
	  return ResponseEntity.notFound().build();
	}
					
	Funcionario.setFuncionario_id(Funcionario_id);
	Funcionario = FuncionarioRepository.save(Funcionario);
					
	return ResponseEntity.ok(Funcionario);
  }
				
				
  @DeleteMapping("/Funcionarios/{Funcionario_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Long Funcionario_id){
    if (!FuncionarioRepository.existsById(Funcionario_id)) {
	  return ResponseEntity.notFound().build();
	}
					
    FuncionarioRepository.deleteById(Funcionario_id);
					
	return ResponseEntity.noContent().build();
  }
}
