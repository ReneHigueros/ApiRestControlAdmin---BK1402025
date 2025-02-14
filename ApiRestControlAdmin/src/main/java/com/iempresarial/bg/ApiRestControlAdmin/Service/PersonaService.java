package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PersonaDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Persona;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;

public interface PersonaService {

    List<Persona> findAll();

    PersonaDTO findByNit(String nit) throws MyAppException;

}
