package com.iempresarial.bg.ApiRestControlAdmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PersonaDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Persona;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.PersonaService;





@RestController
@RequestMapping("api/persona")
public class PersonaController {

    @Autowired

    PersonaService personaService;

    @GetMapping("/findAll")
    public List<Persona> findAll(){

        return personaService.findAll();
    }

    @GetMapping("/findByNit")
    public PersonaDTO findByNit(String nit) throws MyAppException{
        return personaService.findByNit(nit);
    }
    
    
  }
    

