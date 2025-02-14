package com.iempresarial.bg.ApiRestControlAdmin.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PersonaDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Persona;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

    List<Persona> findAll();

    PersonaDTO findByNit(String nit);
}
