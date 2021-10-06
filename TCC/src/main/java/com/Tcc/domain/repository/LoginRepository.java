package com.Tcc.domain.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.Tcc.domain.model.Tarefa;

import com.Tcc.domain.model.Usuario;
import java.util.List;

@Repository
public class LoginRepository {

    private final EntityManager em;

    public LoginRepository(EntityManager em) {
        this.em = em;
    }
    
   public List<Usuario> ValidarUsuario(String Login, String Senha) {

try {
	
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
        
        query += condicao + " U.status = :status ";

        var q = em.createQuery(query, Usuario.class);

        if(!Login.isEmpty()) {
            q.setParameter("Login", Login);
        }

        if(!Senha.isEmpty()) {
            q.setParameter("Senha", Senha);
        }
        
        q.setParameter("status", "A");

        return q.getResultList();
        
} catch (Exception e) {
	return null;
}    }    

public List<Tarefa> TarefasUsuarioLogado(Integer usuario_id) {

try {
	
  TypedQuery<Tarefa> q = em.createQuery("select  t  from Tarefa t  join t.solicitacao  where t.usuario_id = :usuario_id",Tarefa.class);  
                                                            
        q.setParameter("usuario_id", 1);
                
        
        return q.getResultList();
        
} catch (Exception e) {
	System.out.println(e.getMessage());
	return null;
}        

     
    }
   
   public Usuario BuscarUsuario(Integer usuario_id) {

		 try {
		 	
		         String query = "select u.*, c.* from usuario u inner join cargo c on c.CARGO_ID = u.cargo_id";		         		
		         String condicao = " where ";

		         if(!usuario_id.equals(0)) {
		             query += condicao + " u.USUARIO_ID = :usuario_id ";		             
		         }
		      		        		        

		         var q = em.createQuery(query, Usuario.class);

		         if(!usuario_id.equals(0)) {
		             q.setParameter("usuario_id", usuario_id);
		         }		        		         		      

		         return q.getSingleResult();
		         
		 } catch (Exception e) {
		 	return null;
		 }        	   
   }
}
