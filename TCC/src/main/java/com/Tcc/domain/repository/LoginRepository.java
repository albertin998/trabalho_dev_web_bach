package com.Tcc.domain.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.Tcc.domain.model.Usuario;

@Repository
public class LoginRepository {

    private final EntityManager em;

    public LoginRepository(EntityManager em) {
        this.em = em;
    }

    public Usuario ValidarUsuario(String Login, String Senha) {


        String query = "select U from Usuario as U  ";
        String condicao = " where ";

        if(!Login.isEmpty()) {
            query += condicao + " U.Login = :Login ";
            condicao = " and ";
        }

        if(!Senha.isEmpty()) {
            query += condicao + " U.Senha = :Senha ";
            condicao = " and ";
        }

        var q = em.createQuery(query);

        if(!Login.isEmpty()) {
            q.setParameter("Login", Login);
        }

        if(!Senha.isEmpty()) {
            q.setParameter("Senha", Senha);
        }

        return (Usuario) q.getSingleResult();

     
    }

}
