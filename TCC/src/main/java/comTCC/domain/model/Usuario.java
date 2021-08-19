package comTCC.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Usuario {
	
  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private int usuario_id;	
	  
  private String nome;
  private String telefone;
  private String tipo_documento;
  private String documento; 
  private String email;
  private String sexo;
  private LocalDateTime data_cadastro;
  
public int getUsuario_id() {
  return usuario_id;
}
  
public void setUsuario_id(int usuario_id) {
  this.usuario_id = usuario_id;
}

public String getNome() {
  return nome;
}

public void setNome(String nome) {
  this.nome = nome;
}

public String getTelefone() {
  return telefone;
}

public void setTelefone(String telefone) {
  this.telefone = telefone;
}

public String getTipo_documento() {
  return tipo_documento;
}

public void setTipo_documento(String tipo_documento) {
  this.tipo_documento = tipo_documento;
}

public String getDocumento() {
  return documento;
}

public void setDocumento(String documento) {
  this.documento = documento;
}

public String getEmail() {
  return email;
}

public void setEmail(String email) {
  this.email = email;
}
public String getSexo() {
  return sexo;
}

public void setSexo(String sexo) {
  this.sexo = sexo;
}

public LocalDateTime getData_cadastro() {
  return data_cadastro;
}

public void setData_cadastro(LocalDateTime data_cadastro) {
  this.data_cadastro = data_cadastro;
}

public String getLogin() {
  return login;
}

public void setLogin(String login) {
  this.login = login;
}

public String getSenha() {
  return senha;
}

public void setSenha(String senha) {
  this.senha = senha;
}

private String login;
  private String senha;   
}

