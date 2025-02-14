package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.CentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.CentroCosto;

@Repository
public interface CentroCostoRepository extends JpaRepository<CentroCosto, Long>{

    List<CentroCostoDTO> findBy();

    public CentroCostoDTO  findByIdecentrocosto(Long idecentrocosto);
}
