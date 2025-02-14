package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenProgramacionDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenProgramacion;


@Repository
public interface OrdenProgramacionRepository extends  JpaRepository<OrdenProgramacion, Long>{

    @Override
    List<OrdenProgramacion> findAll();
    
    public OrdenProgramacionDTO findByNumordenprogra(Long numordenprogra);

}
