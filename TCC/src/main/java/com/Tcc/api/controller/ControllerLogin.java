package com.Tcc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.Tcc.domain.model.Usuario;
import com.Tcc.domain.repository.LoginRepository;
import java.util.List;

@RestController
public class ControllerLogin {
	
	  @Autowired
	  private LoginRepository LoginRepository;	

  @GetMapping("/ValidarUsuario")
  public List<Usuario> Validar(
		  @RequestHeader("Login") String login,
		  @RequestHeader("senha") String senha){	  
	  return LoginRepository.ValidarUsuario(login, senha);
		
  } 
  
  
  @GetMapping("/BuscarUsuarioLogado/{Usuario_id}")
  public Usuario BuscarUsuarioLogado(@PathVariable Integer usuario_id) {
	 return LoginRepository.BuscarUsuario(usuario_id); 
  }  
}
