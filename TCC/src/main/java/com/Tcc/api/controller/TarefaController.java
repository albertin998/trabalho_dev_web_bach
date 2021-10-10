package com.Tcc.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Tcc.domain.model.Solicitacao;
import com.Tcc.domain.model.Tarefa;
import com.Tcc.domain.model.Tarefa1;
import com.Tcc.domain.repository.SolicitacaoRepository;
import com.Tcc.domain.repository.Tarefa1Repository;
import com.Tcc.domain.repository.TarefaRepository;

@RestController
public class TarefaController {
	 
  @Autowired
  private TarefaRepository TarefaRepository;
  @Autowired
  private SolicitacaoRepository SolicitacaoRepository;
  @Autowired
  private Tarefa1Repository Tarefa1Repository;
			
  @PostMapping("/Tarefas1")
  @ResponseStatus(HttpStatus.CREATED)
  public Tarefa1 Adicionar(@RequestBody Tarefa1 Tarefa) {
    return Tarefa1Repository.save(Tarefa);    
  }	
					
  @GetMapping("/Tarefas")
  public List<Tarefa> Listar(){	  				
    return TarefaRepository.findAll();		
  }	
				
  @GetMapping("/DadosTarefas")
  public ResponseEntity<Tarefa> Buscar(
    @RequestHeader("tarefa_id") Integer Tarefa_id) {
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
  
  @PatchMapping("/Tarefas")
  public ResponseEntity<Tarefa> AtualizarTexto(
		  @RequestHeader("tarefa_id") Integer tarefa_id, @RequestBody Tarefa Tarefa){
  
  if (!TarefaRepository.existsById(tarefa_id)) {
    return ResponseEntity.notFound().build();
  }
  
  Optional<Tarefa> tarefaAux = TarefaRepository.findById(tarefa_id);          
  
  tarefaAux.get().setTexto(Tarefa.getTexto());                 	  				  
  Tarefa = TarefaRepository.save(tarefaAux.get());
	  				
  return ResponseEntity.ok(tarefaAux.get());
  }
  
  @PatchMapping("/AtualizarTempoTarefa")
  public ResponseEntity<Tarefa> AtualizarTempoTarefa(
		  @RequestHeader("tarefa_id") Integer tarefa_id,
		  @RequestHeader("solicitacao_id") Integer solicitacao_id,
		  @RequestBody Tarefa Tarefa){
    
  if (!TarefaRepository.existsById(tarefa_id)) {
    return ResponseEntity.notFound().build();
  }
		  
  Optional<Tarefa> tarefaAux = TarefaRepository.findById(tarefa_id);          
		  
  tarefaAux.get().setTempo_gasto(tarefaAux.get().getTempo_gasto().plusSeconds(Tarefa.getTempo_gasto().getSecond()));                 	  				  
  Tarefa = TarefaRepository.save(tarefaAux.get());
  
  Optional<Solicitacao> SolicitacaoAux = SolicitacaoRepository.findById(solicitacao_id);          
  
  SolicitacaoAux.get().setTempo_gasto(SolicitacaoAux.get().getTempo_gasto().plusSeconds(Tarefa.getTempo_gasto().getSecond()));                 	  				  
  SolicitacaoRepository.save(SolicitacaoAux.get());  
			  				
  return ResponseEntity.ok(tarefaAux.get());
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
