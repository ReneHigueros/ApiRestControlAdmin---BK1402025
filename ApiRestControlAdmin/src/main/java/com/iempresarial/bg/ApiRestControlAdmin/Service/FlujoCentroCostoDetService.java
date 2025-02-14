package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.FlujoCentroCostoDetDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;

public interface FlujoCentroCostoDetService {

    List<FlujoCentroCostoDetDTO> findByIdeflujoAndIdecentrocosto(Long ideflujo, Long idecentrocosto) throws MyAppException;

}
