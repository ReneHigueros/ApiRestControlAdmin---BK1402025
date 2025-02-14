package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PersonaDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Persona;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.PersonaRepository;

@Service
public class PersonaServiceImplement implements PersonaService{

    @Autowired
    PersonaRepository personaRepository;

    @Override

    public List<Persona> findAll() {
        List<Persona> list;

        list = personaRepository.findAll();

        return list;
    }

    @Override
    public PersonaDTO findByNit(String nit) throws MyAppException {

        final PersonaDTO persona;

        persona = personaRepository.findByNit(nit);

        if (ObjectUtils.isEmpty(persona)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro la persona en la base de datos", "error"));
        }

        return persona;

    }

}


