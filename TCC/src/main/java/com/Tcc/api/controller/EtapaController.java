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

import com.Tcc.domain.model.Etapa;
import com.Tcc.domain.repository.EtapaRepository;

@RestController
public class EtapaController {
  
  @Autowired
  private EtapaRepository EtapaRepository;
			
  @PostMapping("/Etapas")
  @ResponseStatus(HttpStatus.CREATED)
  public Etapa Adicionar(@RequestBody Etapa Etapa) {
    return EtapaRepository.save(Etapa);    
  }	
					
  @GetMapping("/Etapas")
  public List<Etapa> Listar(){	  				
    return EtapaRepository.findAll();		
  }	
				
  @GetMapping("/Etapas/{Etapa_id}")
  public ResponseEntity<Etapa> Buscar(@PathVariable Long Etapa_id) {
    Optional<Etapa> Etapa = EtapaRepository.findById(Etapa_id);
				
    if (Etapa.isPresent()) {
	  return ResponseEntity.ok(Etapa.get());
	}
				
	return ResponseEntity.notFound().build(); 	
  }
				
  @PutMapping("/Etapas/{Etapa_id}")
  public ResponseEntity<Etapa> Atualizar(@PathVariable Long Etapa_id, @RequestBody Etapa Etapa){
			
    if (!EtapaRepository.existsById(Etapa_id)) {
      return ResponseEntity.notFound().build();
    }
				
    Etapa.setEtapa_id(Etapa_id);
    Etapa = EtapaRepository.save(Etapa);
				
    return ResponseEntity.ok(Etapa);
  }
			
			
  @DeleteMapping("/Etapas/{Etapa_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Long Etapa_id){
    if (!EtapaRepository.existsById(Etapa_id)) {
	  return ResponseEntity.notFound().build();
	}
				
	EtapaRepository.deleteById(Etapa_id);
				
	return ResponseEntity.noContent().build();
  }
}
