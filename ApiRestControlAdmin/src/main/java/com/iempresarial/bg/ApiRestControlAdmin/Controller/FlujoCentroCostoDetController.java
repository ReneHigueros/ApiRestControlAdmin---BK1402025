package com.iempresarial.bg.ApiRestControlAdmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.FlujoCentroCostoDetDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.FlujoCentroCostoDetService;


@RestController
@RequestMapping("api/produccion")
public class FlujoCentroCostoDetController {

    @Autowired

    FlujoCentroCostoDetService flujoCentroCostoDetService;

    @GetMapping("/findSiguienteCentrocosto")
    public List<FlujoCentroCostoDetDTO> findByIdeFlujoAndCentrocosto(Long ideflujo, Long idecentrocosto) throws MyAppException{
        return flujoCentroCostoDetService.findByIdeflujoAndIdecentrocosto(ideflujo, idecentrocosto);
    }
    
    

}
