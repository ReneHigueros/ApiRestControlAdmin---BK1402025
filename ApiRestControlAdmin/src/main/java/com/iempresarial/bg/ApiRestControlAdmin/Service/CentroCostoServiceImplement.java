package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.CentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.CentroCostoRepository;

@Service
public class CentroCostoServiceImplement implements CentroCostoService{

    @Autowired
    CentroCostoRepository centroCostoRepository;

    public CentroCostoServiceImplement(CentroCostoRepository centroCostoRepository){
        this.centroCostoRepository = centroCostoRepository;
    }

    @Override
    public List<CentroCostoDTO> findBy(){
        List<CentroCostoDTO> list;

        list = centroCostoRepository.findBy();

        return list;
    }

    @Override
    public CentroCostoDTO findByIdecentrocosto(Long idecentrocosto) throws MyAppException{
        
        final CentroCostoDTO centrocostodto;

        centrocostodto = centroCostoRepository.findByIdecentrocosto(idecentrocosto);

        if (ObjectUtils.isEmpty(centrocostodto)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro el centro de costo en la base de datos", "error"));
        }

        return centrocostodto;

    }

}
