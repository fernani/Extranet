package com.okmobility.connection.dao;

import com.okmobility.connection.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
