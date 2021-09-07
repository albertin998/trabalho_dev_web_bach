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

        String query = "select u.usuario_id, u.NOME, u.TELEFONE, u.TIPO_DOCUMENTO, u.DOCUMENTO, u.EMAIL, u.sexo, u.DATA_CADASTRO, u.LOGIN, u.SENHA from Usuario as U ";
        String condicao = "where";

        if(Login != null) {
            query += condicao + " u.Login = :login";
            condicao = " and ";
        }

        if(Senha != null) {
            query += condicao + " u.senha = :senha";
            condicao = " and ";
        }

        var q = em.createQuery(query, Usuario.class);

        if(Login != null) {
            q.setParameter("Login", Login);
        }

        if(Senha != null) {
            q.setParameter("Senha", Senha);
        }

        return q.getSingleResult();
    }

}
