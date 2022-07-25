package com.portfolioalbarracin.cristian.Repository;

import com.portfolioalbarracin.cristian.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
