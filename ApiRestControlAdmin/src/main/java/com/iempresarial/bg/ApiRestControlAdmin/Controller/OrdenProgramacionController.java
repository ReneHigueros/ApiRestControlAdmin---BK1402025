package com.iempresarial.bg.ApiRestControlAdmin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenProgramacionDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.OrdenProgramacionService;


@RestController
@RequestMapping("api/produccion")
public class OrdenProgramacionController {

    @Autowired

    OrdenProgramacionService ordenProgramacionService;

    @GetMapping("/findByNumordenprogra")
    public OrdenProgramacionDTO findbyNumordenprogra(Long numordenprogra) throws MyAppException{
        return ordenProgramacionService.findByNumordenprogra(numordenprogra);
    }
    
}
