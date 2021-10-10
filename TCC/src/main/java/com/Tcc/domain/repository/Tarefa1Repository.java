package com.Tcc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tcc.domain.model.Tarefa1;

@Repository
public interface Tarefa1Repository extends JpaRepository<Tarefa1, Integer> {	
}    

