package com.iempresarial.bg.ApiRestControlAdmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.PedidoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.Pedido;
import com.iempresarial.bg.ApiRestControlAdmin.Exceptions.MyAppException;
import com.iempresarial.bg.ApiRestControlAdmin.Service.PedidoService;

@RestController
@RequestMapping("api/pedido")
public class PedidoController {

    @Autowired

    PedidoService pedidoService;

    @GetMapping("/findAll")
    public List<Pedido> findAll(){
        return pedidoService.findAll();
    }

    @GetMapping("/getPedidoSerieNumero")
    public PedidoDTO findBySeriepedidoAndNumPedido(String seriepedido, Long numpedido) throws MyAppException{
        return pedidoService.findBySeriepedidoAndNumpedido(seriepedido, numpedido);
    }

}
