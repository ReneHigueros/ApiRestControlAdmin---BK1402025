package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenCentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenCentroCosto;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;


public interface OrdenCentroCostoService {

    List<OrdenCentroCostoDTO> findByIdeordenprogra(Long ideordenprogra) throws MyAppException;

    OrdenCentroCostoDTO getCencosActual(Long ideordenprogra, String lovgrpproceso, String tipomov, String indicador) throws MyAppException;

    OrdenCentroCosto saveOrdencentrocosto(OrdenCentroCosto ordenCentroCosto) throws MyAppException;

}
