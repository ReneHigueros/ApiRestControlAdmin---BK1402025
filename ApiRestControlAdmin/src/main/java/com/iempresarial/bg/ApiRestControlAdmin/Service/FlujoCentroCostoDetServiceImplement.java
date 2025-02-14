package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.FlujoCentroCostoDetDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.FlujoCentroCostoDetRepository;

@Service
public class FlujoCentroCostoDetServiceImplement implements FlujoCentroCostoDetService{

    @Autowired
    FlujoCentroCostoDetRepository flujoCentroCostoDetRepository;

    public FlujoCentroCostoDetServiceImplement(FlujoCentroCostoDetRepository flujoCentroCostoDetRepository){
        this.flujoCentroCostoDetRepository = flujoCentroCostoDetRepository;
    }

    @Override
    public List<FlujoCentroCostoDetDTO> findByIdeflujoAndIdecentrocosto(Long ideflujo, Long idecentrocosto) throws MyAppException{
       
        final List<FlujoCentroCostoDetDTO> flujoCentroCostoDet;

        flujoCentroCostoDet = flujoCentroCostoDetRepository.findByIdeflujoAndIdecentrocosto(ideflujo, idecentrocosto);

        if (ObjectUtils.isEmpty(flujoCentroCostoDet)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro el siguiente departamento de la orden de programacion", "error"));
        }

        return flujoCentroCostoDet;
    }

}
