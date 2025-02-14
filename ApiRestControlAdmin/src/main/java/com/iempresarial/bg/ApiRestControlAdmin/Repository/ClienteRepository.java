package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.ClienteDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findAll();

    @Query(value="SELECT cli.idepersona, per.lovtipopersona, per.nit, "+
    "per.primernombre, per.segundonombre, per.primerapellido, per.segundoapellido, "+
    "cli.idecliente, cli.ideciaemisora, cli.stscliente, cli.codcliente "+
    " FROM per_cliente cli "+
    " INNER JOIN per_persona per ON cli.idepersona = per.idepersona "+
    " WHERE cli.idecliente = :idecliente", nativeQuery=true )
    
    public ClienteDTO getClienteDTO(@Param("idecliente") Long idecliente);

    public ClienteDTO findByIdecliente(Long idecliente);


}
