package com.iempresarial.bg.ApiRestControlAdmin.Service;

import java.util.List;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PedidoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Pedido;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;

public interface PedidoService {

    List<Pedido> findAll();
    
    PedidoDTO findBySeriepedidoAndNumpedido(String seriepedido, Long numpedido) throws MyAppException;

}
