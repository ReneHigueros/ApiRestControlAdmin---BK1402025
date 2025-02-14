package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PedidoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,  Long >{

@Override
List<Pedido> findAll();

public PedidoDTO findBySeriepedidoAndNumpedido(String seriepedido, long numpedido);



}
