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

import com.Tcc.domain.model.Usuario;
import com.Tcc.domain.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	  
  @Autowired
  private UsuarioRepository UsuarioRepository;
			
  @PostMapping("/Usuarios")
  @ResponseStatus(HttpStatus.CREATED)
  public Usuario Adicionar(@RequestBody Usuario Usuario) {	  
    return UsuarioRepository.save(Usuario);    
  }	
					
  @GetMapping("/Usuarios")
  public List<Usuario> Listar(){	  				
    return UsuarioRepository.findAll();		
  }	
				
  @GetMapping("/Usuarios/{Usuario_id}")
  public ResponseEntity<Usuario> Buscar(@PathVariable Integer Usuario_id) {
    Optional<Usuario> Usuario = UsuarioRepository.findById(Usuario_id);
				
    if (Usuario.isPresent()) {
	  return ResponseEntity.ok(Usuario.get());
	}
				
	return ResponseEntity.notFound().build(); 	
  }
				
  @PutMapping("/Usuarios/{Usuario_id}")
  public ResponseEntity<Usuario> Atualizar(@PathVariable Integer Usuario_id, @RequestBody Usuario Usuario){
			
    if (!UsuarioRepository.existsById(Usuario_id)) {
	  return ResponseEntity.notFound().build();
	}
				
    Usuario.setUsuario_id(Usuario_id);
	Usuario = UsuarioRepository.save(Usuario);
				
	return ResponseEntity.ok(Usuario);
  }
			
			
  @DeleteMapping("/Usuarios/{Usuario_id}")
  public ResponseEntity<Void> Deletar(@PathVariable Integer Usuario_id){
    if (!UsuarioRepository.existsById(Usuario_id)) {
	  return ResponseEntity.notFound().build();
	}
				
	UsuarioRepository.deleteById(Usuario_id);
				
	return ResponseEntity.noContent().build();
  }
}
