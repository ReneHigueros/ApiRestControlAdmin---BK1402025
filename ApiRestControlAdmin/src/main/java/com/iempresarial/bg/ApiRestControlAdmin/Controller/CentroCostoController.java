package com.iempresarial.bg.ApiRestControlAdmin.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.CentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.CentroCostoService;


@RestController
@RequestMapping("api/produccion")
public class CentroCostoController {

    @Autowired

    CentroCostoService centroCostoService;

    @GetMapping("/findAllCentrocosto")
    public List<CentroCostoDTO> findBy(){
        return centroCostoService.findBy();
    }
    
    @GetMapping("/finByIdecentrocosto")
    public CentroCostoDTO findByIdeCentroCosto(Long idecentrocosto) throws MyAppException{
        return centroCostoService.findByIdecentrocosto(idecentrocosto);
    }
}
