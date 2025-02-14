package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenProgramacionDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenProgramacion;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;

public interface OrdenProgramacionService {

    List<OrdenProgramacion> findAll();

    OrdenProgramacionDTO findByNumordenprogra(Long numordenprogra) throws MyAppException;
}
