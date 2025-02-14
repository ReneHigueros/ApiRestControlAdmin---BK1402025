package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.ClienteDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Cliente;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;

public interface ClienteService {

    List<Cliente> findAll();

    ClienteDTO getClienteDTO(Long idecliente) throws MyAppException;

    ClienteDTO findByIdecliente(Long idecliente) throws MyAppException;

}
