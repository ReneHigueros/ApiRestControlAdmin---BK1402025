package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.UsuarioDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    List<UsuarioDTO> findBy();

    UsuarioDTO findByName(String name);


    @Query("Select u from Usuario u where u.name = :name and password = :pass ")

    UsuarioDTO findByNamePasswordJPL(String name, String pass);

    UsuarioDTO findByNameAndPasswordAndStatususer(String name, String pass, String statususer);

}
