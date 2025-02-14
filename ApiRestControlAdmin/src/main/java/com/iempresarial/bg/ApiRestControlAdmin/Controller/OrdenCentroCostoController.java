package com.iempresarial.bg.ApiRestControlAdmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenCentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenCentroCosto;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.OrdenCentroCostoService;




@RestController
@RequestMapping("api/produccion")
public class OrdenCentroCostoController {

    @Autowired

    OrdenCentroCostoService ordenCentroCostoService;

    @GetMapping("/findHistorialPrograma")
    public List<OrdenCentroCostoDTO> findByIdeordenprogra(Long ideordenprogra) throws MyAppException{
        return ordenCentroCostoService.findByIdeordenprogra(ideordenprogra);
    }

    @GetMapping("/findCencosActual")
    public OrdenCentroCostoDTO getCencosActual(Long ideordenprogra, String lovgrpproceso, String tipomov, String indicador) throws MyAppException{
        return ordenCentroCostoService.getCencosActual(ideordenprogra, lovgrpproceso, tipomov, indicador);
    }
    
    @PostMapping("/saveOrdenCentroCosto")
    public OrdenCentroCosto saveOrdencentrocosto(@RequestBody OrdenCentroCosto ordenCentroCosto) throws MyAppException{
        return ordenCentroCostoService.saveOrdencentrocosto(ordenCentroCosto);
    }
    
    @PutMapping("/updateOrdenCentroCosto")
    public OrdenCentroCosto updateOrdencentrocosto(@RequestBody OrdenCentroCosto ordenCentroCosto) throws MyAppException{
        return ordenCentroCostoService.saveOrdencentrocosto(ordenCentroCosto);
    }
    
}
