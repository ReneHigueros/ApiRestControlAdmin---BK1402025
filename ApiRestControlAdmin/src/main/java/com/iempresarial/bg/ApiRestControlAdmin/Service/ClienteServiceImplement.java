package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.ClienteDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Cliente;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.ClienteRepository;


@Service
public class ClienteServiceImplement implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteServiceImplement(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    
    @Override
    public List<Cliente> findAll(){
        List<Cliente> list;
        
        list = clienteRepository.findAll();

        return list;
    }

    @Override
    public ClienteDTO getClienteDTO(Long idecliente) throws MyAppException{

        final ClienteDTO cliente;

        cliente = clienteRepository.getClienteDTO(idecliente);

        if (ObjectUtils.isEmpty(cliente)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro el cliente en la base de datos", "error"));
        }

        return cliente;
    }

    @Override
    public ClienteDTO findByIdecliente(Long idecliente) throws MyAppException{

        final ClienteDTO cliente;
        String nombreCompleto;

        cliente = clienteRepository.findByIdecliente(idecliente);

        if (ObjectUtils.isEmpty(cliente)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("2001", "No se encontro el cliente en la base de datos", "error"));
        }

        
        if (cliente.getPersona().getPrimernombre() != null) {
            nombreCompleto = cliente.getPersona().getPrimernombre();
        }
        
        if (cliente.getPersona().getSegundonombre() != null) {
            nombreCompleto =+ ' ' +cliente.getPersona().getSegundonombre();
        }

        if (cliente.getPersona().getPrimerapellido() != null) {
            nombreCompleto =+ ' ' +cliente.getPersona().getPrimerapellido();
        }

        if (cliente.getPersona().getSegundoapellido() != null) {
            nombreCompleto =+ ' ' +cliente.getPersona().getSegundoapellido();
        }

        return cliente;
    }

}
