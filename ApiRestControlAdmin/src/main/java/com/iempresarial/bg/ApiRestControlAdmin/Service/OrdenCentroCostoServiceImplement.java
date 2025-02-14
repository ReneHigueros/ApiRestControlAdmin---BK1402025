package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenCentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenCentroCosto;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.OrdenCentroCostoRepository;

@Service
public class OrdenCentroCostoServiceImplement implements OrdenCentroCostoService{

    @Autowired
    OrdenCentroCostoRepository ordenCentroCostoRepository;

    public OrdenCentroCostoServiceImplement(OrdenCentroCostoRepository ordenCentroCostoRepository){
        this.ordenCentroCostoRepository = ordenCentroCostoRepository;
    }

    @Override
    public List<OrdenCentroCostoDTO> findByIdeordenprogra(Long ideordenprogra) throws MyAppException{

        final List<OrdenCentroCostoDTO> ordenCentroCosto;

        ordenCentroCosto = ordenCentroCostoRepository.findByIdeordenprogra(ideordenprogra);

        if (ObjectUtils.isEmpty(ordenCentroCosto)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro el historial del proceso de la orden de programacion", "error"));
        }

        return ordenCentroCosto;

    }

    @Override
    public OrdenCentroCostoDTO getCencosActual(Long ideordenprogra, String lovgrpproceso, String tipomov, String indicador) throws MyAppException {

        final OrdenCentroCostoDTO ordenCentroCosto;

        ordenCentroCosto = ordenCentroCostoRepository.getCencosActual(ideordenprogra, lovgrpproceso, tipomov,indicador);

        if (ObjectUtils.isEmpty(ordenCentroCosto)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro el centro de costo actual de la orden de programacion", "error"));
        }

        return ordenCentroCosto;
    }

    @Override
    public OrdenCentroCosto saveOrdencentrocosto(OrdenCentroCosto ordenCentroCosto) throws MyAppException{
        
        final OrdenCentroCosto ordenCentroCosto2;

        ordenCentroCosto2 = ordenCentroCostoRepository.save(ordenCentroCosto);

        if (ObjectUtils.isEmpty(ordenCentroCosto2)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("3001", "No se grabo el registro en orden_por_centro_costo", "error"));
        }

        return ordenCentroCosto2;
    }

}
