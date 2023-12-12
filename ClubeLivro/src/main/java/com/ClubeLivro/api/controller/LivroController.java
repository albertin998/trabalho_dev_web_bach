package com.ClubeLivro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import com.ClubeLivro.domain.model.Livro;
import com.ClubeLivro.domain.repository.LivroRepository;

@RestController
public class LivroController {
	
  @Autowired
  private LivroRepository LivroRepository;
	
  @CrossOrigin(origins = "http://localhost:3000")
  @PostMapping("/Livro")
  @ResponseStatus(HttpStatus.CREATED)
  public Livro Adicionar(@RequestBody Livro livro) {
    return LivroRepository.save(livro);    
  }	
	
	
  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/Livro")
  public List<Livro> Listar(){	  				
	return LivroRepository.findAll();		
  }		
  
  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/Livro/{livro_id}")
  public ResponseEntity<Livro> Buscar(@PathVariable Long livro_id) {
    Optional<Livro> livro = LivroRepository.findById(livro_id);
		
	if (livro.isPresent()) {
	  return ResponseEntity.ok(livro.get());
	}
		
	return ResponseEntity.notFound().build(); 	
  }  
	
  @CrossOrigin(origins = "http://localhost:3000")
  @PutMapping("/Livro/{livro_id}")
  public ResponseEntity<Livro> Atualizar(@PathVariable Long livro_id, @RequestBody Livro livro){
	
    if (!LivroRepository.existsById(livro_id)) {
	  return ResponseEntity.notFound().build();
	}
		
	livro.setLivro_id(livro_id);
	livro = LivroRepository.save(livro);
		
	return ResponseEntity.ok(livro);
  }
	
	
  @CrossOrigin(origins = "http://localhost:3000")
  @DeleteMapping("/Livro/{livro_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Long livro_id){
    if (!LivroRepository.existsById(livro_id)) {
      return ResponseEntity.notFound().build();
	}
		
    LivroRepository.deleteById(livro_id);
		
	return ResponseEntity.noContent().build();
  }
}
