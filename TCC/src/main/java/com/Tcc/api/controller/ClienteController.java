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

import com.Tcc.domain.model.Cliente;
import com.Tcc.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
  @Autowired
  private ClienteRepository ClienteRepository;
		
  @PostMapping("/Clientes")
  @ResponseStatus(HttpStatus.CREATED)
  public Cliente Adicionar(@RequestBody Cliente cliente) {
    return ClienteRepository.save(cliente);    
  }	
				
  @GetMapping("/Clientes")
  public List<Cliente> Listar(){	  				
    return ClienteRepository.findAll();		
  }	
			
  @GetMapping("/Clientes/{cliente_id}")
  public ResponseEntity<Cliente> Buscar(@PathVariable Long cliente_id) {
    Optional<Cliente> cliente = ClienteRepository.findById(cliente_id);
			
	if (cliente.isPresent()) {
	  return ResponseEntity.ok(cliente.get());
	}
			
	return ResponseEntity.notFound().build(); 	
  }
			
  @PutMapping("/Clientes/{cliente_id}")
  public ResponseEntity<Cliente> Atualizar(@PathVariable Long cliente_id, @RequestBody Cliente cliente){
		
    if (!ClienteRepository.existsById(cliente_id)) {
	  return ResponseEntity.notFound().build();
	}
			
	cliente.setCliente_id(cliente_id);
	cliente = ClienteRepository.save(cliente);
			
	return ResponseEntity.ok(cliente);
  }
		
		
  @DeleteMapping("/Clientes/{cliente_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Long cliente_id){
    if (!ClienteRepository.existsById(cliente_id)) {
	  return ResponseEntity.notFound().build();
	}
			
	ClienteRepository.deleteById(cliente_id);
			
	return ResponseEntity.noContent().build();
  }
}
