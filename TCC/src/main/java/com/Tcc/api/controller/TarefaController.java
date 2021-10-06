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

import com.Tcc.domain.model.Tarefa;
import com.Tcc.domain.repository.TarefaRepository;

@RestController
public class TarefaController {
	 
  @Autowired
  private TarefaRepository TarefaRepository;
			
  @PostMapping("/Tarefas")
  @ResponseStatus(HttpStatus.CREATED)
  public Tarefa Adicionar(@RequestBody Tarefa Tarefa) {
    return TarefaRepository.save(Tarefa);    
  }	
					
  @GetMapping("/Tarefas")
  public List<Tarefa> Listar(){	  				
    return TarefaRepository.findAll();		
  }	
				
  @GetMapping("/Tarefas/{Tarefa_id}")
  public ResponseEntity<Tarefa> Buscar(@PathVariable Integer Tarefa_id) {
    Optional<Tarefa> Tarefa = TarefaRepository.findById(Tarefa_id);
				
     if (Tarefa.isPresent()) {
	  return ResponseEntity.ok(Tarefa.get());
	 }
				
	 return ResponseEntity.notFound().build(); 	
  }
				
  @PutMapping("/Tarefas/{Tarefa_id}")
  public ResponseEntity<Tarefa> Atualizar(@PathVariable Integer Tarefa_id, @RequestBody Tarefa Tarefa){
			
    if (!TarefaRepository.existsById(Tarefa_id)) {
	  return ResponseEntity.notFound().build();
	}
				
	Tarefa.setTarefa_id(Tarefa_id);
	Tarefa = TarefaRepository.save(Tarefa);
				
	return ResponseEntity.ok(Tarefa);
  }
			
			
  @DeleteMapping("/Tarefas/{Tarefa_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Integer Tarefa_id){
    if (!TarefaRepository.existsById(Tarefa_id)) {
      return ResponseEntity.notFound().build();
	}
				
	TarefaRepository.deleteById(Tarefa_id);
				
	return ResponseEntity.noContent().build();
  }
}
