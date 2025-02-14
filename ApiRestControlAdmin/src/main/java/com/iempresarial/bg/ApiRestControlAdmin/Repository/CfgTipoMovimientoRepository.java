package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.CfgTipoMovimientoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.CfgTipoMovimiento;


@Repository
public interface CfgTipoMovimientoRepository extends JpaRepository<CfgTipoMovimiento, Long>{

    public CfgTipoMovimientoDTO findByStsmovimientoAndTipomovimiento(String stsmovimiento, String tipomovimiento);

}
