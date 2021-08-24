package com.Tcc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tcc.domain.model.Cargo;

  @Repository
  public interface CargoRepository extends JpaRepository<Cargo, Long> {	
		  
  }	

