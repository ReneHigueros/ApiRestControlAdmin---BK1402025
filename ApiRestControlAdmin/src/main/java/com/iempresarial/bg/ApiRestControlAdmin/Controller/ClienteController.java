package com.iempresarial.bg.ApiRestControlAdmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.ClienteDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Cliente;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.ClienteService;


@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired

    ClienteService clienteService;

    @GetMapping("/findAll")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }


    @GetMapping("/getCliente")
    public ClienteDTO getClienteDTO(Long idecliente)  throws MyAppException{
        return clienteService.getClienteDTO(idecliente);
    }

    @GetMapping("/findByIdecliente")
    public ClienteDTO findByIdecliente(Long idecliente)  throws MyAppException{
        return clienteService.findByIdecliente(idecliente);
    }
}
