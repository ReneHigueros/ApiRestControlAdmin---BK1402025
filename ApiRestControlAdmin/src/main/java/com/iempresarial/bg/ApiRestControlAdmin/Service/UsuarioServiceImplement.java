package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.UsuarioDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Usuario;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.ExcepcionDetails;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Repository.UsuarioRepository;

@Service

public class UsuarioServiceImplement implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {

        List<Usuario> list;
        list = usuarioRepository.findAll();

        return list;

    }

    @Override
    public List<UsuarioDTO> findBy() {

        List<UsuarioDTO> list;

        list = usuarioRepository.findBy();

        return list;

    }

    @Override
    public UsuarioDTO findByName(String name) throws MyAppException {

        final UsuarioDTO usuario;

        usuario = usuarioRepository.findByName(name);

        if (ObjectUtils.isEmpty(usuario)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("1001", "No se encontro el usuario en la base de datos", "error"));

        }

        return usuario;

    }

    @Override
    public UsuarioDTO findByNamePasswordJPL(String name, String pass) throws MyAppException {

        final UsuarioDTO usuario;

        usuario = usuarioRepository.findByNamePasswordJPL(name, pass);

        if (ObjectUtils.isEmpty(usuario)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("1002", "No se encontro el usuario en la base de datos o la contraseña es incorrecta", "error"));

        }

        return usuario;
    }

    @Override
    public UsuarioDTO findByNameAndPasswordAndStatususer(String name, String pass, String statususer) throws MyAppException {

        final UsuarioDTO usuario;

        usuario = usuarioRepository.findByNameAndPasswordAndStatususer(name, pass, statususer);

        if (ObjectUtils.isEmpty(usuario)) {
            throw new MyAppException("Error en la base de datos",
                    new ExcepcionDetails("1002", "No se encontro el usuario en la base de datos, la contraseña es incorrecta o el usuario esta INACTIVO", "error"));

        }

        return usuario;
    }
    
}
