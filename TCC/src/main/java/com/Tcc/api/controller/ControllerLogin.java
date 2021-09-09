package com.Tcc.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.Tcc.domain.model.Usuario;
import com.Tcc.domain.repository.LoginRepository;

@RestController
public class ControllerLogin {
	
	  @Autowired
	  private LoginRepository LoginRepository;	

  @GetMapping("/ValidarUsuario")
  public Usuario Validar(
		  @RequestHeader("usuario") String login,
		  @RequestHeader("senha") String senha){	 
	  return LoginRepository.ValidarUsuario(login, senha);		
  }	
}
