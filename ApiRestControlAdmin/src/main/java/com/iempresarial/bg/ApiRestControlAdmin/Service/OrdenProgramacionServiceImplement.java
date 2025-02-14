package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenProgramacionDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenProgramacion;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.OrdenProgramacionRepository;

@Service
public class OrdenProgramacionServiceImplement implements OrdenProgramacionService{

    @Autowired
    OrdenProgramacionRepository ordenProgramacionRepository;

    public OrdenProgramacionServiceImplement(OrdenProgramacionRepository ordenProgramacionRepository ){
        this.ordenProgramacionRepository = ordenProgramacionRepository;
    }

    @Override
    public List<OrdenProgramacion> findAll(){
        List<OrdenProgramacion> list;

        list = ordenProgramacionRepository.findAll();

        return list;
    }
    
    @Override
    public OrdenProgramacionDTO findByNumordenprogra(Long numordenprogra) throws MyAppException{

        final OrdenProgramacionDTO ordenProgramacion;

        ordenProgramacion = ordenProgramacionRepository.findByNumordenprogra(numordenprogra);

        if (ObjectUtils.isEmpty(ordenProgramacion)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro la orden de programacion en la base de datos", "error"));
        }

        return ordenProgramacion;
    }

}
