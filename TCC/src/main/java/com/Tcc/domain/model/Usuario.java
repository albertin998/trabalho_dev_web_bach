package com.Tcc.domain.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "usuario")
public class Usuario {
	
  @EqualsAndHashCode.Include	
  @Id	
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private Integer usuario_id;	
	  
  private String nome;
  private String telefone;
  private String tipo_documento;
  private String documento; 
  private String email;
  private String sexo;
  private Date data_cadastro;
  private String Login;
  private String Senha;
  private String nome_empresa;
  private String status;
  private String cargo_id;
  private Boolean isFuncionario;
  private Boolean isCliente;  
  
  public String getNome_empresa() {
	return nome_empresa;
}

public void setNome_empresa(String nome_empresa) {
	this.nome_empresa = nome_empresa;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getCargo_id() {
	return cargo_id;
}

public void setCargo_id(String cargo_id) {
	this.cargo_id = cargo_id;
}

public Boolean getIsFuncionario() {
	return isFuncionario;
}

public void setIsFuncionario(Boolean isFuncionario) {
	this.isFuncionario = isFuncionario;
}

public Boolean getIsCliente() {
	return isCliente;
}

public void setIsCliente(Boolean isCliente) {
	this.isCliente = isCliente;
}
  
public Integer getUsuario_id() {
  return usuario_id;
}
  
public void setUsuario_id(Integer usuario_id) {
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

public Date getData_cadastro() {
  return data_cadastro;
}

public void setData_cadastro(Date data) {  
  this.data_cadastro = data;
}

public String getLogin() {
  return Login;
}

public void setLogin(String login) {
  this.Login = login;
}

public String getSenha() {
  return Senha;
}

public void setSenha(String senha) {
  this.Senha = senha;
}   
}

