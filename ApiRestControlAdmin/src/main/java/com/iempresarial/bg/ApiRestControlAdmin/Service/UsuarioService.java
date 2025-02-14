package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.UsuarioDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Usuario;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;

public interface UsuarioService {

    List<Usuario> findAll();

    List<UsuarioDTO> findBy();

    UsuarioDTO findByName(String name) throws MyAppException;

    UsuarioDTO findByNamePasswordJPL(String name, String pass) throws  MyAppException;
    
    UsuarioDTO findByNameAndPasswordAndStatususer(String name, String pass, String statususer) throws MyAppException;

    

}
