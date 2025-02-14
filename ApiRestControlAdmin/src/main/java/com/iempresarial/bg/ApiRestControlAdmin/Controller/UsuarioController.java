package com.iempresarial.bg.ApiRestControlAdmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.UsuarioDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Usuario;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.UsuarioService;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/findAll")
    public List<Usuario> findAll() {
        return usuarioService.findAll();

    }

    @GetMapping("/findBy")
    public List<UsuarioDTO> findBy() {
        return usuarioService.findBy();
    }

    @GetMapping("/findByName")
    public UsuarioDTO findByName(String name) throws MyAppException {
        return usuarioService.findByName(name);
    }

    @GetMapping("/findByNamePassword")
    public UsuarioDTO findByNamePasswordJPL(String name, String pass) throws MyAppException {
        return usuarioService.findByNamePasswordJPL(name, pass);
    }
    
    @GetMapping("/findByNamePasswordStatusUser")
    public UsuarioDTO findByNameAndPasswordAndStatususer(String name, String pass, String statususer) throws MyAppException {
        return usuarioService.findByNameAndPasswordAndStatususer(name, pass, statususer);
        
    }
}
