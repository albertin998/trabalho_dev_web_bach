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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Tcc.domain.model.Solicitacao;
import com.Tcc.domain.repository.SolicitacaoRepository;

@RestController
public class SolicitacaoController {
  
  @Autowired
  private SolicitacaoRepository SolicitacaoRepository;
  
			
  @PostMapping("/Solicitacao")
  @ResponseStatus(HttpStatus.CREATED)
  public Solicitacao Adicionar(@RequestBody Solicitacao Solicitacao) {
    return SolicitacaoRepository.save(Solicitacao);    
  }	
  
					
  @GetMapping("/Solicitacaos")
  public List<Solicitacao> Listar(){	  				
    return SolicitacaoRepository.findAll();		
  }	
				
  @GetMapping("/BuscarTarefas")
  public ResponseEntity<Solicitacao> Buscar(
		  @RequestHeader("solicitacao_id") Integer Solicitacao_id) {
    Optional<Solicitacao> Solicitacao = SolicitacaoRepository.findById(Solicitacao_id);
				
    if (Solicitacao.isPresent()) {
	  return ResponseEntity.ok(Solicitacao.get());
	}
				
	return ResponseEntity.notFound().build(); 	
  }
				
  @PutMapping("/Solicitacaos/{Solicitacao_id}")
  public ResponseEntity<Solicitacao> Atualizar(@PathVariable Integer Solicitacao_id, @RequestBody Solicitacao Solicitacao){
			
    if (!SolicitacaoRepository.existsById(Solicitacao_id)) {
      return ResponseEntity.notFound().build();
    }
				
    Solicitacao.setSolicitacao_id(Solicitacao_id);
    Solicitacao = SolicitacaoRepository.save(Solicitacao);
				
    return ResponseEntity.ok(Solicitacao);
  }
  		
			
  @DeleteMapping("/Solicitacaos/{Solicitacao_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Integer Solicitacao_id){
    if (!SolicitacaoRepository.existsById(Solicitacao_id)) {
	  return ResponseEntity.notFound().build();
	}
				
	SolicitacaoRepository.deleteById(Solicitacao_id);
				
	return ResponseEntity.noContent().build();
  }
}
