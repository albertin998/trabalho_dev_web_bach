package com.Tcc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tcc.domain.model.Etapa;

@Repository
public interface EtapaRepository extends JpaRepository<Etapa, Long> {	
}  
