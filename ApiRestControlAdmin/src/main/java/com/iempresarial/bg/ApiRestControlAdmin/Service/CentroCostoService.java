package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.CentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;

public interface CentroCostoService {
    List<CentroCostoDTO> findBy();

    CentroCostoDTO findByIdecentrocosto(Long idecentrocosto) throws MyAppException;
}
