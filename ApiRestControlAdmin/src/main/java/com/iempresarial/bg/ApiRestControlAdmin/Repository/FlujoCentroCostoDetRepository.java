package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.FlujoCentroCostoDetDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.FlujoCentroCostoDet;


@Repository
public interface FlujoCentroCostoDetRepository extends JpaRepository<FlujoCentroCostoDet, Long>{

    public List<FlujoCentroCostoDetDTO> findByIdeflujoAndIdecentrocosto(Long ideflujo, Long idecentrocosto);

    
}
